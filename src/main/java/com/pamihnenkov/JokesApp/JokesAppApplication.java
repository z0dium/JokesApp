package com.pamihnenkov.JokesApp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesAppApplication.class, args);
	}

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes(){
		return new ChuckNorrisQuotes();
	}
}



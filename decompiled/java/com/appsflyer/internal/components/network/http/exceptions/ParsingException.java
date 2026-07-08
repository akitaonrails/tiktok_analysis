package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1jSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes31.dex */
public class ParsingException extends IOException {
    public final AFe1jSDK<String> AFKeystoreWrapper;

    public AFe1jSDK<String> getRawResponse() {
        return this.AFKeystoreWrapper;
    }

    public ParsingException(String str, Throwable th, AFe1jSDK<String> aFe1jSDK) {
        super(str, th);
        this.AFKeystoreWrapper = aFe1jSDK;
    }
}

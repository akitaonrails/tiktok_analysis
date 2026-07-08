package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1mSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes31.dex */
public class HttpException extends IOException {
    public final AFe1mSDK valueOf;

    public AFe1mSDK getMetrics() {
        return this.valueOf;
    }

    public HttpException(Throwable th, AFe1mSDK aFe1mSDK) {
        super(th.getMessage(), th);
        this.valueOf = aFe1mSDK;
    }
}

package com.appsflyer.internal.components.network.http;

import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface ResponseNetwork<Body> {
    Body getBody();

    List<String> getHeaderField(String str);

    int getStatusCode();

    boolean isSuccessful();
}

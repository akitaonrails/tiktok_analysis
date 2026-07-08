package com.bef.effectsdk.message;

import android.os.Message;

/* JADX INFO: loaded from: classes20.dex */
public interface MessageInterceptor {
    void destroy();

    boolean intercept(Message message);
}

package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes31.dex */
public final class AFj1mSDK {
    public final WeakReference<Context> AFInAppEventType;
    public String AFKeystoreWrapper;

    public AFj1mSDK(Context context) {
        this.AFInAppEventType = new WeakReference<>(context);
    }
}

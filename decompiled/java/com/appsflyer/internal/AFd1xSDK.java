package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes31.dex */
public interface AFd1xSDK {
    public static final AFa1uSDK AFa1uSDK = AFa1uSDK.AFInAppEventType;

    public interface AFa1zSDK {
        void valueOf();

        void values(AFh1xSDK aFh1xSDK);
    }

    void AFInAppEventType();

    void AFInAppEventType(Context context, AFa1zSDK aFa1zSDK);

    boolean values();

    public static final class AFa1uSDK {
        public static final /* synthetic */ AFa1uSDK AFInAppEventType = new AFa1uSDK();
        public static long AFKeystoreWrapper = 500;

        public static long AFInAppEventParameterName() {
            return AFKeystoreWrapper;
        }
    }
}

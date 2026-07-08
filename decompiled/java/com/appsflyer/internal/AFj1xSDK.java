package com.appsflyer.internal;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFj1xSDK {
    public static final String AFInAppEventParameterName;
    public static final String AFLogger;
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    public static final String d;
    public static final String e;
    public static final String registerClient;
    public static String unregisterClient;
    public static final String valueOf;
    public static final String values;
    public static final String w;
    public final AFd1sSDK AFInAppEventType;
    public final AFj1uSDK AFKeystoreWrapper;

    public static final class AFa1tSDK {
        public AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFj1xSDK(AFd1sSDK aFd1sSDK) {
        this(aFd1sSDK, null, 2, 0 == true ? 1 : 0);
    }

    public static String valueOf() {
        return "https://aps-webhandler.appsflyer.com/api/trigger";
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = AFb1vSDK.AFInAppEventParameterName;
        sb.append(str);
        sb.append("/androidevent?app_id=");
        String string = sb.toString();
        w = string;
        values = "https://%sattr.%s/api/v" + string;
        AFInAppEventParameterName = "https://%sadrevenue.%s/api/v2/generic/v6.14.0/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.14.0/android?app_id=";
        AFLogger = "https://%sconversions.%s/api/v" + string;
        e = "https://%slaunches.%s/api/v" + string;
        registerClient = "https://%sinapps.%s/api/v" + string;
        d = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        unregisterClient = "https://%svalidate.%s/api/v" + str + "/androidevent?buildnumber=6.14.0&app_id=";
    }

    public final String AFInAppEventParameterName(AFh1kSDK aFh1kSDK) {
        if (aFh1kSDK instanceof AFh1nSDK) {
            return this.AFKeystoreWrapper.AFInAppEventParameterName("https://%ssdk-services.%s/validate-android-signature");
        }
        if (aFh1kSDK instanceof AFh1lSDK) {
            return this.AFKeystoreWrapper.AFInAppEventParameterName(unregisterClient) + this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
        }
        throw new UnsupportedOperationException();
    }

    public final String valueOf(String str) {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String strD = this.AFInAppEventType.d();
        if (strD == null || (strConcat = "&channel=".concat(strD)) == null) {
            strConcat = "";
        }
        sb.append(strConcat);
        return sb.toString();
    }

    public AFj1xSDK(AFd1sSDK aFd1sSDK, AFj1uSDK aFj1uSDK) {
        this.AFInAppEventType = aFd1sSDK;
        this.AFKeystoreWrapper = aFj1uSDK;
    }

    public static String AFInAppEventType(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!z) {
            str2 = "&buildnumber=6.14.0";
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static Uri.Builder AFInAppEventParameterName(Uri.Builder builder, String str, String str2) {
        if (str != null && str2 != null) {
            builder.appendQueryParameter("af_sig", AFb1lSDK.AFKeystoreWrapper(str2.concat(str), str));
        }
        return builder;
    }

    public /* synthetic */ AFj1xSDK(AFd1sSDK aFd1sSDK, AFj1uSDK aFj1uSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, (i & 2) != 0 ? new AFj1tSDK() : aFj1uSDK);
    }
}

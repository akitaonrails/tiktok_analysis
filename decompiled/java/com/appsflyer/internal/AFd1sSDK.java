package com.appsflyer.internal;

import X.C786410Ut5;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;

/* JADX INFO: loaded from: classes31.dex */
public final class AFd1sSDK {
    public static String values = "288";
    public Bundle AFInAppEventParameterName;
    public final AFd1pSDK AFInAppEventType;
    public final AFd1qSDK AFKeystoreWrapper;
    public final AFd1lSDK valueOf;

    public static String AFInAppEventType() {
        return "6.14.0";
    }

    public static String registerClient() {
        return "version: 6.14.0 (build " + values + ")";
    }

    public static String values() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public final String AFKeystoreWrapper() {
        AFh1uSDK aFh1uSDK = this.AFInAppEventType.AFLogger;
        if (aFh1uSDK != null) {
            return new AFb1zSDK(aFh1uSDK.AFKeystoreWrapper, aFh1uSDK.AFInAppEventParameterName).AFInAppEventParameterName;
        }
        return null;
    }

    public final boolean unregisterClient() {
        return !this.AFInAppEventType.valueOf();
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString("AppUserId");
    }

    public static String valueOf() {
        return UUID.randomUUID().toString();
    }

    public final String d() {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null && (string = AFInAppEventType("CHANNEL")) == null) {
            return string;
        }
        if (string.equals("")) {
            return null;
        }
        return string;
    }

    public final boolean AFInAppEventParameterName(String str) {
        String strAFInAppEventType = AFInAppEventType(str);
        if (strAFInAppEventType != null) {
            return Boolean.parseBoolean(strAFInAppEventType);
        }
        return false;
    }

    public final String AFInAppEventType(String str) {
        Object objINVOKEVIRTUAL_com_appsflyer_internal_AFd1sSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) C786410Ut5.V3(this.valueOf.AFKeystoreWrapper.getPackageManager(), this.valueOf.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (objINVOKEVIRTUAL_com_appsflyer_internal_AFd1sSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_appsflyer_internal_AFd1sSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
                return null;
            }
            return objINVOKEVIRTUAL_com_appsflyer_internal_AFd1sSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_get.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final String AFKeystoreWrapper(String str) {
        try {
            int iN3 = C786410Ut5.n3(this.valueOf.AFKeystoreWrapper.getResources(), str, "string", this.valueOf.AFKeystoreWrapper.getPackageName());
            if (iN3 != 0) {
                return this.valueOf.AFKeystoreWrapper.getString(iN3);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object INVOKEVIRTUAL_com_appsflyer_internal_AFd1sSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public AFd1sSDK(AFd1lSDK aFd1lSDK, AFd1qSDK aFd1qSDK, AFd1pSDK aFd1pSDK) {
        this.valueOf = aFd1lSDK;
        this.AFKeystoreWrapper = aFd1qSDK;
        this.AFInAppEventType = aFd1pSDK;
    }
}

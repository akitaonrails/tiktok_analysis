package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1nSDK {
    public static String valueOf = "https://%sregister.%s/api/v" + AFb1vSDK.valueOf;
    public final AFd1qSDK values;

    public final AFg1oSDK valueOf() {
        String string;
        String string2;
        String strAFKeystoreWrapper = this.values.AFKeystoreWrapper("afUninstallToken", (String) null);
        long jValues = this.values.values("afUninstallToken_received_time", 0L);
        boolean zAFInAppEventType = this.values.AFInAppEventType("afUninstallToken_queued");
        this.values.valueOf("afUninstallToken_queued", false);
        if (strAFKeystoreWrapper == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            strAFKeystoreWrapper = string2.split(",")[r6.length - 1];
        }
        if (jValues == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length >= 2) {
                try {
                    jValues = CastLongProtector.parseLong(strArrSplit[strArrSplit.length - 2]);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (strAFKeystoreWrapper != null) {
            return new AFg1oSDK(strAFKeystoreWrapper, jValues, zAFInAppEventType);
        }
        return null;
    }

    public AFg1nSDK(Context context) {
        this.values = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName(context);
    }

    public static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.INSTANCE.e(AFg1aSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
        if (!AFb1uSDK.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
            return false;
        }
        return true;
    }

    public static boolean valueOf(AFd1qSDK aFd1qSDK) {
        return aFd1qSDK.AFInAppEventType("sentRegisterRequestToAF");
    }

    public static void values(String str) {
        AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        AFf1dSDK aFf1dSDK = new AFf1dSDK(str, aFd1kSDKAFInAppEventParameterName);
        AFe1cSDK aFe1cSDKAfInfoLog = aFd1kSDKAFInAppEventParameterName.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFf1dSDK));
    }
}

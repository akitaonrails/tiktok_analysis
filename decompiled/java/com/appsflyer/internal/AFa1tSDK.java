package com.appsflyer.internal;

import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes31.dex */
public final class AFa1tSDK implements AFd1vSDK {
    public static IntentFilter AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFd1vSDK
    public final AFd1vSDK.AFa1uSDK AFInAppEventParameterName(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent intentLJIJJ = C786410Ut5.LJIJJ(context, null, AFInAppEventParameterName);
            if (intentLJIJJ != null) {
                if (2 == intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1)) {
                    int intExtra = intentLJIJJ.getIntExtra("plugged", -1);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra == 4) {
                                str = "wireless";
                            } else {
                                str = "other";
                            }
                        } else {
                            str = "usb";
                        }
                    } else {
                        str = "ac";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = intentLJIJJ.getIntExtra("level", -1);
                int intExtra3 = intentLJIJJ.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFd1vSDK.AFa1uSDK(f, str);
    }
}

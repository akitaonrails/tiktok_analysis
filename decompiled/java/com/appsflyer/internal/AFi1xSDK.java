package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AFi1xSDK {
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    public final TelephonyManager AFInAppEventParameterName;
    public ConnectivityManager AFInAppEventType;

    public static final class AFa1uSDK {
        public AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract String valueOf();

    public abstract boolean values();

    public final AFi1wSDK AFInAppEventType() {
        String str;
        String strLLILII;
        String strLLIIL = null;
        try {
            TelephonyManager telephonyManager = this.AFInAppEventParameterName;
            if (telephonyManager != null) {
                strLLILII = C2204961BRm.LLILII(telephonyManager, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxscOleyw==", new String[]{"01c45"}));
                try {
                    strLLIIL = C2204961BRm.LLIIL(telephonyManager, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxscOleyw==", new String[]{"01c45"}));
                    if (strLLIIL == null || strLLIIL.length() == 0) {
                        if (C2204961BRm.LLIILZL(telephonyManager, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bxscOleyw==", new String[]{"01c45"})) == 2) {
                            strLLIIL = "CDMA";
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    str = strLLIIL;
                    strLLIIL = strLLILII;
                    TryCatchGuardChecker.doCheck(th);
                    strLLILII = strLLIIL;
                    strLLIIL = str;
                }
            } else {
                strLLILII = null;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        return new AFi1wSDK(valueOf(), strLLIIL, strLLILII, values());
    }

    public AFi1xSDK(Context context) {
        ConnectivityManager connectivityManager;
        Object objH2 = C786410Ut5.H2(context, "connectivity");
        if (objH2 instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) objH2;
        } else {
            connectivityManager = null;
        }
        this.AFInAppEventType = connectivityManager;
        Object objH22 = C786410Ut5.H2(context, "phone");
        this.AFInAppEventParameterName = objH22 instanceof TelephonyManager ? (TelephonyManager) objH22 : null;
    }

    public static boolean AFInAppEventParameterName(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }
}

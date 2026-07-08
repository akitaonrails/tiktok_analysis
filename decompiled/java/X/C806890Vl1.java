package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806890Vl1 {
    public static int LIZ(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (!C804370Vgx.LIZ.getAndSet(true)) {
                C804370Vgx.LIZ().LIZIZ();
            }
            int iLIZ = C804370Vgx.LIZ().LIZ();
            if (!C804370Vgx.LIZJ && iLIZ == -1) {
                return 0;
            }
            return iLIZ;
        }
        return C2204961BRm.LLIILII(telephonyManager, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6urZ0ODyQS8INHkD+ZAwhwr/yW8=", null));
    }

    public static EnumC806900Vl2 LIZIZ(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
                int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6urZ0ODyQS8INHkD+ZAwhwr/yW8=", null));
                if (1 == iLJLLILLLL) {
                    return EnumC806900Vl2.WIFI;
                }
                if (iLJLLILLLL == 0) {
                    TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(context, "phone");
                    if (telephonyManager == null) {
                        return EnumC806900Vl2.MOBILE;
                    }
                    if (LIZ(telephonyManager) != 3 && LIZ(telephonyManager) != 5 && LIZ(telephonyManager) != 6 && LIZ(telephonyManager) != 8 && LIZ(telephonyManager) != 9 && LIZ(telephonyManager) != 10 && LIZ(telephonyManager) != 12 && LIZ(telephonyManager) != 14 && LIZ(telephonyManager) != 15) {
                        if (LIZ(telephonyManager) == 13) {
                            return EnumC806900Vl2.MOBILE_4G;
                        }
                        return EnumC806900Vl2.MOBILE;
                    }
                    return EnumC806900Vl2.MOBILE_3G;
                }
                return EnumC806900Vl2.MOBILE;
            }
            return EnumC806900Vl2.NONE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return EnumC806900Vl2.MOBILE;
        }
    }

    public static boolean LIZJ(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null) {
                return false;
            }
            if (!networkInfoLJIJ.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}

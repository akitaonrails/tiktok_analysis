package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VFU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFU {
    public static final boolean LIZ(Context context) {
        Object objH2;
        int simState;
        TelephonyManager telephonyManager = null;
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "phone");
        } else {
            objH2 = null;
        }
        if (objH2 instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) objH2;
        }
        if (telephonyManager == null) {
            return false;
        }
        try {
            simState = telephonyManager.getSimState();
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (simState == 0 || simState == 1) {
            return false;
        }
        return true;
    }
}

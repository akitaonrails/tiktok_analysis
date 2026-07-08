package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783470UoL {
    public static BatteryManager LIZ;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static BatteryManager LIZ(Context context) {
        if (LIZ == null) {
            synchronized (C783470UoL.class) {
                try {
                    if (LIZ == null) {
                        LIZ = (BatteryManager) C786410Ut5.H2(context, "batterymanager");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static double LIZIZ(Context context) {
        if (context != null && LIZ(context) != null) {
            return (C2204961BRm.LLD(LIZ(context), 5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZejxryDkQp6L+zWPsvK", null)) * 1.0d) / 1000000.0d;
        }
        return -1.0d;
    }

    public static float LIZJ(Context context) {
        if (context != null && LIZ(context) != null) {
            return C2204961BRm.LLD(LIZ(context), 3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZejxryDkQp6L+zWPsvK", null)) / 1000.0f;
        }
        return -1.0f;
    }

    public static float LIZLLL(Context context) {
        if (context != null && LIZ(context) != null) {
            return C2204961BRm.LLD(LIZ(context), 2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZejxryDkQp6L+zWPsvK", null)) / 1000.0f;
        }
        return -1.0f;
    }
}

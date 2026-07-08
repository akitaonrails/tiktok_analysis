package X;

import android.content.Context;
import android.os.BatteryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0NwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609970NwB {
    public static BatteryManager LIZ;

    public static BatteryManager LIZ(Context context) {
        if (LIZ == null) {
            synchronized (C609970NwB.class) {
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
}

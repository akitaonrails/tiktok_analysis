package X;

import android.content.Context;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0oJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468330oJT {
    public static Class<?> LIZ;
    public static Class<?> LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static Class<?> LJI;
    public static Method LJII;

    public static int LIZ(Context context) {
        int iLL = 0;
        if (context == null) {
            return 0;
        }
        try {
            BatteryManager batteryManager = (BatteryManager) C786410Ut5.H2(context, "batterymanager");
            if (batteryManager != null) {
                iLL = C2204961BRm.LL(batteryManager, 4, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFuc2P23i1QDEGcMp86xjxbz7iczQlmA==", null));
                return iLL;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return iLL;
    }

    public static int LIZIZ(Context context) {
        if (context != null) {
            try {
                PowerManager powerManager = (PowerManager) C786410Ut5.H2(context, "power");
                if (powerManager != null) {
                    return powerManager.isPowerSaveMode() ? 1 : 0;
                }
                return -1;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isPowerSaveMode:");
                sbLIZ.append(e);
                TTVideoEngineLog.d("DeviceMonitorUtils", C2188811AlT.LIZIZ(sbLIZ));
                return -1;
            }
        }
        return -1;
    }
}

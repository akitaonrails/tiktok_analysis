package X;

import android.content.Context;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0UyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789740UyS {
    public static final WeakHashMap<PowerManager.WakeLock, String> LIZ;

    static {
        C0VI8.LIZIZ("WakeLocks");
        LIZ = new WeakHashMap<>();
    }

    public static PowerManager.WakeLock LIZ(Context context, String str) {
        PowerManager powerManager = (PowerManager) C786410Ut5.H2(C786410Ut5.N3(context), "power");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkManager: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strLIZIZ);
        synchronized (LIZ) {
            try {
                LIZ.put(wakeLockNewWakeLock, strLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return wakeLockNewWakeLock;
    }
}

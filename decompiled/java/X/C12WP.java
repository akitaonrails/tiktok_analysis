package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12WP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12WP {
    public static final ThreadLocal<Boolean> LIZ = new ThreadLocal<>();

    public static boolean LIZIZ() {
        ThreadLocal<Boolean> threadLocal = LIZ;
        Boolean bool = threadLocal.get();
        if (bool == Boolean.TRUE) {
            return true;
        }
        if (bool == null) {
            Looper mainLooper = Looper.getMainLooper();
            boolean z = mainLooper == Looper.myLooper() && mainLooper.getThread() == C786410Ut5.u3();
            threadLocal.set(Boolean.valueOf(z));
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ() {
        if (C665300Q7s.LIZ() || LIZIZ()) {
            return;
        }
        C0T3U.LIZ(new Runnable() { // from class: X.0tKp
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("ThreadUtility@3163.checkUIThread$1");
                try {
                    throw new IllegalStateException("This method must call on main thread");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                    C1C7U.LIZIZ("ThreadUtility@3163.checkUIThread$1");
                }
            }
        });
    }
}

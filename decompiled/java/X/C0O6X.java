package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0O6X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6X {
    public static void LIZ() {
        Runnable runnable;
        if (C613950O6f.LJFF == null) {
            return;
        }
        synchronized (C613950O6f.class) {
            try {
                runnable = C613950O6f.LJFF;
                C613950O6f.LJFF = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}

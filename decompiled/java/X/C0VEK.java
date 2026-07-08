package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VEK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VEK {
    public static C0VEK LIZIZ;
    public volatile boolean LIZ;

    public static C0VEK LIZ() {
        if (LIZIZ == null) {
            synchronized (C0VEK.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0VEK();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}

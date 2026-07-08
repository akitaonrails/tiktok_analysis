package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723670uxJ {
    public static final C1723670uxJ LIZ = new C1723670uxJ();
    public static volatile boolean LIZIZ;

    public final void LIZ() {
        if (LIZIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (!LIZIZ) {
                    C1543490qGh.LIZIZ(C1724420uyW.class, null, 6);
                    C1543490qGh.LIZIZ(C2413509cz.class, null, 6);
                    LIZIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

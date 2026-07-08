package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QT6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QT6 {
    public static final C0QT6 LIZ = new C0QT6();
    public static long LIZIZ;
    public static long LIZJ;

    public final long LIZIZ() {
        long jMax;
        synchronized (this) {
            try {
                jMax = Math.max(LIZIZ, LIZJ);
                LIZIZ = 1 + jMax;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jMax;
    }

    public final long LIZ(boolean z) {
        long j;
        if (z) {
            synchronized (this) {
                try {
                    j = LIZJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return j;
        }
        C0QTB.LJJLIIIJJIZ.getClass();
        return C0QTH.LIZJ;
    }
}

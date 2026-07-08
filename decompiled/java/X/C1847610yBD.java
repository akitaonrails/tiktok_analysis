package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0yBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847610yBD {
    public static final C1847610yBD LIZ = new C1847610yBD();
    public static int LIZIZ;

    public final int LIZ() {
        int i;
        synchronized (this) {
            try {
                i = LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public final int LIZIZ() {
        int i;
        synchronized (this) {
            try {
                i = LIZIZ + 1;
                LIZIZ = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }
}

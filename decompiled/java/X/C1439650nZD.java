package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439650nZD {
    public static final C1439650nZD LIZ = new C1439650nZD();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static int LJ;
    public static boolean LJFF;
    public static boolean LJI;

    public static int LIZ() {
        if (LJ > 0) {
            return 1;
        }
        if (LIZJ) {
            return 3;
        }
        return LJFF ? 2 : 0;
    }

    public static boolean LIZIZ() {
        return ((Boolean) C2547209yY.LIZLLL.getValue()).booleanValue() || (((Boolean) C2547209yY.LJ.getValue()).booleanValue() && LJ > 0);
    }

    public final void LIZJ(boolean z) {
        synchronized (this) {
            try {
                if (z) {
                    LJ++;
                } else {
                    int i = LJ;
                    if (i > 0) {
                        LJ = i - 1;
                    } else {
                        LJ = 0;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512310pSP {
    public static boolean LIZIZ;
    public static C1512310pSP LIZJ;
    public C1512240pSI LIZ;

    public static C1512310pSP LIZ() {
        if (LIZJ == null) {
            synchronized (C1512310pSP.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1512310pSP();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}

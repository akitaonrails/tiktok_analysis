package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ceP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020030ceP {
    public static C1020020ceO LIZ;

    public static C1020020ceO LIZ() {
        C1020020ceO c1020020ceO;
        synchronized (C1020030ceP.class) {
            try {
                c1020020ceO = LIZ;
                if (c1020020ceO != null) {
                    LIZ = null;
                } else {
                    c1020020ceO = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1020020ceO == null) {
            return new C1020020ceO();
        }
        c1020020ceO.LIZ = null;
        c1020020ceO.LIZIZ = null;
        c1020020ceO.LIZJ = null;
        c1020020ceO.LIZLLL = null;
        c1020020ceO.LJ.LIZ = null;
        return c1020020ceO;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511670pRN {
    public static final boolean LIZ;
    public static C1511660pRM LIZIZ;

    static {
        InterfaceC1511680pRO interfaceC1511680pRO = C1510910pQ9.LIZ;
        if (interfaceC1511680pRO != null) {
            interfaceC1511680pRO.LIZIZ();
        }
        LIZ = false;
        LIZIZ = null;
    }

    public static C1511660pRM LIZIZ() {
        C1511660pRM c1511660pRM = LIZIZ;
        if (c1511660pRM != null) {
            return c1511660pRM;
        }
        if (C1510910pQ9.LIZ == null) {
            return C1511730pRT.LIZ;
        }
        synchronized (C1511670pRN.class) {
            try {
                if (LIZIZ == null) {
                    C1510900pQ8 logger = C1510910pQ9.LIZ.getLogger();
                    LIZIZ = logger;
                    if (logger == null) {
                        LIZIZ = C1511730pRT.LIZ;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LIZIZ;
    }

    public static void LIZ(String str, String str2) {
        LIZIZ().LIZ();
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        LIZIZ().LIZJ();
    }
}

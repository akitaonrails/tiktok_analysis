package X;

/* JADX INFO: renamed from: X.13Q5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Q5 {
    public static C20005413Pg LIZ() {
        C20005413Pg c20005413Pg = C20005413Pg.LJIIIIZZ;
        if (c20005413Pg != null) {
            return c20005413Pg;
        }
        throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
    }

    public static boolean LIZJ() {
        return C20005413Pg.LJIIIIZZ != null;
    }

    public final synchronized void LIZIZ(C13RD c13rd) {
        if (C20005413Pg.LJIIIIZZ != null) {
            return;
        }
        C20005413Pg.LJIIIIZZ = new C20005413Pg(c13rd);
    }
}

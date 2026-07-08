package X;

/* JADX INFO: renamed from: X.13TZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TZ {
    public final C20592084w<C13TY, String> LIZ = new C20592084w<>();
    public final C20015413Tc LIZIZ = new C20015413Tc(new C1085640eME(10), new InterfaceC20015813Tg<C20015313Tb>() { // from class: X.13Ta
    });

    public final String LIZ(C13TX c13tx) {
        String strLIZIZ;
        synchronized (this.LIZ) {
            try {
                strLIZIZ = (String) this.LIZ.LIZIZ(c13tx);
            } finally {
            }
        }
        if (strLIZIZ == null) {
            C20015313Tb c20015313Tb = (C20015313Tb) this.LIZIZ.LIZIZ();
            try {
                c13tx.LIZ(c20015313Tb.LIZ);
                strLIZIZ = C08IG.LIZIZ(c20015313Tb.LIZ.digest());
                this.LIZIZ.LIZ(c20015313Tb);
            } catch (Throwable th) {
                this.LIZIZ.LIZ(c20015313Tb);
                throw th;
            }
        }
        synchronized (this.LIZ) {
            try {
                this.LIZ.LIZJ(c13tx, strLIZIZ);
            } finally {
            }
        }
        return strLIZIZ;
    }
}

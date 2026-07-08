package X;

/* JADX INFO: renamed from: X.0Qag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673080Qag {
    public static volatile boolean LIZ;

    public static boolean LIZ() {
        if (C1255704vj.LIZ().LIZ()) {
            return true;
        }
        if (!LIZ) {
            LIZ = true;
            if (C1248104uV.LIZ()) {
                C673090Qah.LIZIZ.LJ();
            } else {
                C673090Qah.LIZIZ.LJFF(null, "visualsearch", false);
            }
        }
        return false;
    }

    public static boolean LIZIZ() {
        if (C1255704vj.LIZ().LIZ()) {
            return true;
        }
        if (C1248104uV.LIZ()) {
            if (C1255704vj.LIZ().LIZ()) {
                return true;
            }
            C673090Qah c673090Qah = C673090Qah.LIZIZ;
            if (c673090Qah.LIZIZ()) {
                return true;
            }
            if (!LIZ && C0CN5.LJII()) {
                LIZ = true;
                c673090Qah.LJ();
            }
        } else if (C0CN5.LJII() && !LIZ) {
            LIZ = true;
            C673090Qah.LIZIZ.LJFF(null, "visualsearch", false);
        }
        return false;
    }
}

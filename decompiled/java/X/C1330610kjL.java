package X;

/* JADX INFO: renamed from: X.0kjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330610kjL {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C1330610kjL(C1330670kjR c1330670kjR) {
        boolean z = c1330670kjR.LIZ;
        this.LIZ = z;
        boolean z2 = c1330670kjR.LIZIZ;
        this.LIZIZ = z2;
        boolean z3 = c1330670kjR.LIZJ;
        this.LIZJ = z3;
        this.LIZLLL = LIZ(c1330670kjR.LIZLLL, z);
        this.LJ = LIZ(c1330670kjR.LJ, z2);
        this.LJFF = LIZ(c1330670kjR.LJFF, z3);
    }

    public static boolean LIZ(float f, boolean z) {
        if (!z || f <= 0.0f) {
            return false;
        }
        if (f < 1.0f && Math.random() > f) {
            return false;
        }
        return true;
    }
}

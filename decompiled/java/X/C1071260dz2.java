package X;

/* JADX INFO: renamed from: X.0dz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071260dz2 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public /* synthetic */ C1071260dz2(boolean z, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, false);
    }

    public static C1071260dz2 LIZ(C1071260dz2 c1071260dz2, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4 = false;
        if ((i & 1) != 0) {
            z3 = c1071260dz2.LIZ;
        } else {
            z3 = false;
        }
        if ((i & 2) != 0) {
            z4 = c1071260dz2.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c1071260dz2.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c1071260dz2.LIZLLL;
        }
        c1071260dz2.getClass();
        return new C1071260dz2(z3, z4, z, z2);
    }

    public C1071260dz2(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}

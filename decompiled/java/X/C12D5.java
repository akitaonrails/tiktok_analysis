package X;

/* JADX INFO: renamed from: X.12D5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12D5 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C12D5() {
        this(0);
    }

    public /* synthetic */ C12D5(int i) {
        this(true, 0, 1, false, false);
    }

    public C12D5(boolean z, int i, int i2, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z2;
        this.LJ = z3;
    }

    public static C12D5 LIZ(C12D5 c12d5, boolean z, int i, int i2, boolean z2, boolean z3, int i3) {
        boolean z4 = z3;
        boolean z5 = z2;
        int i4 = i2;
        int i5 = i;
        boolean z6 = z;
        if ((i3 & 1) != 0) {
            z6 = c12d5.LIZ;
        }
        if ((i3 & 2) != 0) {
            i5 = c12d5.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i4 = c12d5.LIZJ;
        }
        if ((i3 & 8) != 0) {
            z5 = c12d5.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            z4 = c12d5.LJ;
        }
        c12d5.getClass();
        return new C12D5(z6, i5, i4, z5, z4);
    }
}

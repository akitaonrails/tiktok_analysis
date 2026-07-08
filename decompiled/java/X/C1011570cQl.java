package X;

/* JADX INFO: renamed from: X.0cQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011570cQl {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final C0Q1G LJI;

    public C1011570cQl() {
        this(127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1011570cQl)) {
            return false;
        }
        C1011570cQl c1011570cQl = (C1011570cQl) obj;
        return this.LIZ == c1011570cQl.LIZ && this.LIZIZ == c1011570cQl.LIZIZ && this.LIZJ == c1011570cQl.LIZJ && this.LIZLLL == c1011570cQl.LIZLLL && this.LJ == c1011570cQl.LJ && this.LJFF == c1011570cQl.LJFF && this.LJI == c1011570cQl.LJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1011570cQl(int i) {
        int i2;
        C0Q1G c0q1g;
        if ((i & 32) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            c0q1g = C0Q1G.OTHER;
        } else {
            c0q1g = null;
        }
        this(false, 0, false, 0, false, i2, c0q1g);
    }

    public static C1011570cQl LIZ(C1011570cQl c1011570cQl, boolean z, int i, int i2, int i3) {
        boolean z2;
        int i4;
        boolean z3;
        C0Q1G c0q1g;
        int i5 = i2;
        int i6 = i;
        boolean z4 = z;
        if ((i3 & 1) != 0) {
            z4 = c1011570cQl.LIZ;
        }
        if ((i3 & 2) != 0) {
            i6 = c1011570cQl.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z2 = c1011570cQl.LIZJ;
        } else {
            z2 = false;
        }
        if ((i3 & 8) != 0) {
            i4 = c1011570cQl.LIZLLL;
        } else {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            z3 = c1011570cQl.LJ;
        } else {
            z3 = false;
        }
        if ((i3 & 32) != 0) {
            i5 = c1011570cQl.LJFF;
        }
        if ((i3 & 64) != 0) {
            c0q1g = c1011570cQl.LJI;
        } else {
            c0q1g = null;
        }
        c1011570cQl.getClass();
        return new C1011570cQl(z4, i6, z2, i4, z3, i5, c0q1g);
    }

    public C1011570cQl(boolean z, int i, boolean z2, int i2, boolean z3, int i3, C0Q1G c0q1g) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = z2;
        this.LIZLLL = i2;
        this.LJ = z3;
        this.LJFF = i3;
        this.LJI = c0q1g;
    }
}

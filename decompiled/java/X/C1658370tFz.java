package X;

/* JADX INFO: renamed from: X.0tFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658370tFz {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C1658370tFz() {
        this(false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1658370tFz)) {
            return false;
        }
        C1658370tFz c1658370tFz = (C1658370tFz) obj;
        return this.LIZ == c1658370tFz.LIZ && this.LIZIZ == c1658370tFz.LIZIZ && this.LIZJ == c1658370tFz.LIZJ && this.LIZLLL == c1658370tFz.LIZLLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1658370tFz(boolean z, int i) {
        boolean z2;
        boolean z3;
        z = (i & 1) != 0 ? true : z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(z, z2, z3, (i & 8) != 0);
    }

    public C1658370tFz(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }

    public static C1658370tFz LIZ(C1658370tFz c1658370tFz, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = c1658370tFz.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c1658370tFz.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c1658370tFz.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c1658370tFz.LIZLLL;
        }
        c1658370tFz.getClass();
        return new C1658370tFz(z, z2, z3, z4);
    }
}

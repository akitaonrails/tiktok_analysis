package X;

/* JADX INFO: renamed from: X.0tzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686720tzi {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1686720tzi)) {
            return false;
        }
        C1686720tzi c1686720tzi = (C1686720tzi) obj;
        if (this.LIZ == c1686720tzi.LIZ && this.LIZIZ == c1686720tzi.LIZIZ && this.LIZJ == c1686720tzi.LIZJ && this.LIZLLL == c1686720tzi.LIZLLL && this.LJ == c1686720tzi.LJ && this.LJFF == c1686720tzi.LJFF) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1686720tzi(boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = (i & 1) != 0 ? false : z;
        z6 = (i & 2) != 0 ? true : z6;
        z5 = (i & 4) != 0 ? true : z5;
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this(z7, z6, z5, EnumC1686780tzo.Inherit, true, z4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1686720tzi(boolean z, boolean z2, boolean z3, int i, int i2) {
        EnumC1686780tzo enumC1686780tzo;
        boolean z4;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = (i & 1) != 0 ? false : z;
        z6 = (i & 2) != 0 ? true : z6;
        z5 = (i & 4) != 0 ? true : z5;
        if ((i & 8) != 0) {
            enumC1686780tzo = EnumC1686780tzo.Inherit;
        } else {
            enumC1686780tzo = null;
        }
        if ((i & 32) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this(z7, z6, z5, enumC1686780tzo, true, z4);
    }

    public C1686720tzi(boolean z, boolean z2, boolean z3, EnumC1686780tzo enumC1686780tzo, boolean z4, boolean z5) {
        int i;
        boolean z6;
        if (!z) {
            i = 262152;
        } else {
            i = 262144;
        }
        i = enumC1686780tzo == EnumC1686780tzo.SecureOn ? i | 8192 : i;
        i = z5 ? i : i | 512;
        if (enumC1686780tzo == EnumC1686780tzo.Inherit) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.LIZ = i;
        this.LIZIZ = z6;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = false;
    }
}

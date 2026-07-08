package X;

/* JADX INFO: renamed from: X.0tzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686740tzk {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC1686780tzo LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1686740tzk() {
        boolean z = false;
        this(z, z, z, z, 31);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1686740tzk)) {
            return false;
        }
        C1686740tzk c1686740tzk = (C1686740tzk) obj;
        if (this.LIZ == c1686740tzk.LIZ && this.LIZIZ == c1686740tzk.LIZIZ && this.LIZJ == c1686740tzk.LIZJ && this.LIZLLL == c1686740tzk.LIZLLL && this.LJ == c1686740tzk.LJ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1686740tzk(boolean z, int i) {
        boolean z2;
        boolean z3;
        boolean z4 = (i & 1) != 0 ? true : z;
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
        this(z4, z2, EnumC1686780tzo.Inherit, z3, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1686740tzk(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        EnumC1686780tzo enumC1686780tzo;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = (i & 1) != 0 ? true : z;
        z7 = (i & 2) != 0 ? true : z7;
        if ((i & 4) != 0) {
            enumC1686780tzo = EnumC1686780tzo.Inherit;
        } else {
            enumC1686780tzo = null;
        }
        this(z8, z7, enumC1686780tzo, (i & 8) != 0 ? true : z6, (i & 16) != 0 ? true : z5);
    }

    public C1686740tzk(boolean z, boolean z2, EnumC1686780tzo enumC1686780tzo, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = enumC1686780tzo;
        this.LIZLLL = z3;
        this.LJ = z4;
    }
}

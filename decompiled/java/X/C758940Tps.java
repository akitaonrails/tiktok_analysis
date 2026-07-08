package X;

/* JADX INFO: renamed from: X.0Tps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758940Tps {
    public int LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;

    public C758940Tps() {
        this(0);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZJ) * 31) + this.LJ) * 31) + this.LJIIIIZZ;
    }

    public /* synthetic */ C758940Tps(int i) {
        this(false, 3, 3, 3, 3, 3, false, false, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C758940Tps)) {
            return false;
        }
        C758940Tps c758940Tps = (C758940Tps) obj;
        if (this.LIZ != c758940Tps.LIZ || this.LIZJ != c758940Tps.LIZJ || this.LJ != c758940Tps.LJ || this.LJIIIIZZ != c758940Tps.LJIIIIZZ) {
            return false;
        }
        return true;
    }

    public C758940Tps(boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z4) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = i2;
        this.LIZLLL = z2;
        this.LJ = i3;
        this.LJFF = z3;
        this.LJI = i4;
        this.LJII = z4;
        this.LJIIIIZZ = i5;
    }
}

package X;

/* JADX INFO: renamed from: X.14S0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14S0 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14S0)) {
            return false;
        }
        C14S0 c14s0 = (C14S0) obj;
        return this.LIZ == c14s0.LIZ && this.LIZIZ == c14s0.LIZIZ && this.LIZJ == c14s0.LIZJ && this.LIZLLL == c14s0.LIZLLL && this.LJ == c14s0.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public /* synthetic */ C14S0(int i, int i2) {
        this(i, i2, 0, true, false);
    }

    public C14S0(int i, int i2, int i3, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}

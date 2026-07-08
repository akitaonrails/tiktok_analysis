package X;

/* JADX INFO: renamed from: X.0j1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265190j1p extends C1761680vwc {
    public final long LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;

    public C1265190j1p() {
        this(false, 0, 0L, false, 0, 0, false, 255);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1265190j1p(boolean z, int i, long j, boolean z2, int i2, int i3, boolean z3, int i4) {
        z = (i4 & 1) != 0 ? true : z;
        i = (i4 & 2) != 0 ? 0 : i;
        j = (i4 & 4) != 0 ? 0L : j;
        z2 = (i4 & 8) != 0 ? true : z2;
        i2 = (i4 & 16) != 0 ? 0 : i2;
        i3 = (i4 & 32) != 0 ? 0 : i3;
        z3 = (i4 & 64) != 0 ? false : z3;
        int i5 = i4 & 128;
        super(z, i);
        this.LIZJ = j;
        this.LIZLLL = z2;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = z3;
    }
}

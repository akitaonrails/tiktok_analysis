package X;

/* JADX INFO: renamed from: X.0mRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396730mRz {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;

    public C1396730mRz() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cacheHit:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cacheMiss:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cacheCompleteReuse:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cacheOnScreen:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", drawCacheMiss:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxFrameMiss:");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cacheScreenRate: ");
        sbLIZ.append(this.LIZLLL / ((this.LIZ + this.LIZIZ) + this.LIZJ));
        sbLIZ.append(' ');
        sbLIZ.append(", cacheFault:");
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1396730mRz(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
    }
}

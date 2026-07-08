package X;

/* JADX INFO: renamed from: X.147x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202151147x {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final double LJI;
    public final double LJII;
    public final double LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C202151147x)) {
            return false;
        }
        C202151147x c202151147x = (C202151147x) obj;
        return Double.compare(this.LIZ, c202151147x.LIZ) == 0 && Double.compare(this.LIZIZ, c202151147x.LIZIZ) == 0 && Double.compare(this.LIZJ, c202151147x.LIZJ) == 0 && Double.compare(this.LIZLLL, c202151147x.LIZLLL) == 0 && Double.compare(this.LJ, c202151147x.LJ) == 0 && Double.compare(this.LJFF, c202151147x.LJFF) == 0 && Double.compare(this.LJI, c202151147x.LJI) == 0 && Double.compare(this.LJII, c202151147x.LJII) == 0 && Double.compare(this.LJIIIIZZ, c202151147x.LJIIIIZZ) == 0;
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.X2(this.LIZ) * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ)) * 31) + C786410Ut5.X2(this.LIZLLL)) * 31) + C786410Ut5.X2(this.LJ)) * 31) + C786410Ut5.X2(this.LJFF)) * 31) + C786410Ut5.X2(this.LJI)) * 31) + C786410Ut5.X2(this.LJII)) * 31) + C786410Ut5.X2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Snapshot(xMin=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", xMax=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", xJitterRate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", yMin=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", yMax=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", yJitterRate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", zMin=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", zMax=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", zJitterRate=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C202151147x(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
        this.LJ = d5;
        this.LJFF = d6;
        this.LJI = d7;
        this.LJII = d8;
        this.LJIIIIZZ = d9;
    }
}

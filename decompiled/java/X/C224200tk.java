package X;

/* JADX INFO: renamed from: X.00tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C224200tk {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final EnumC240800wQ LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C224200tk)) {
            return false;
        }
        C224200tk c224200tk = (C224200tk) obj;
        return Double.compare(this.LIZ, c224200tk.LIZ) == 0 && Double.compare(this.LIZIZ, c224200tk.LIZIZ) == 0 && Double.compare(this.LIZJ, c224200tk.LIZJ) == 0 && Double.compare(this.LIZLLL, c224200tk.LIZLLL) == 0 && this.LJ == c224200tk.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.X2(this.LIZ) * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ)) * 31) + C786410Ut5.X2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownSample(normalizedX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", normalizedY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickProb=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", swipeProb=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", predictedLabel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C224200tk(double d, double d2, double d3, double d4, EnumC240800wQ enumC240800wQ) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
        this.LJ = enumC240800wQ;
    }
}

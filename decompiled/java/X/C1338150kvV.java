package X;

/* JADX INFO: renamed from: X.0kvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338150kvV {
    public final double LIZ;
    public final double LIZIZ = 0.0d;
    public final double LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1338150kvV)) {
            return false;
        }
        C1338150kvV c1338150kvV = (C1338150kvV) obj;
        return Double.compare(this.LIZ, c1338150kvV.LIZ) == 0 && Double.compare(this.LIZIZ, c1338150kvV.LIZIZ) == 0 && Double.compare(this.LIZJ, c1338150kvV.LIZJ) == 0 && Double.compare(this.LIZLLL, c1338150kvV.LIZLLL) == 0;
    }

    public final int hashCode() {
        return (((((C786410Ut5.X2(this.LIZ) * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ)) * 31) + C786410Ut5.X2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CubicBezier(x1=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y1=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", x2=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", y2=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1338150kvV(double d, double d2, double d3) {
        this.LIZ = d;
        this.LIZJ = d2;
        this.LIZLLL = d3;
    }
}

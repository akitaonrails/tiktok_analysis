package X;

/* JADX INFO: renamed from: X.07dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1909807dw {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1909807dw)) {
            return false;
        }
        C1909807dw c1909807dw = (C1909807dw) obj;
        return Double.compare(this.LIZ, c1909807dw.LIZ) == 0 && Double.compare(this.LIZIZ, c1909807dw.LIZIZ) == 0 && Double.compare(this.LIZJ, c1909807dw.LIZJ) == 0;
    }

    public final int hashCode() {
        return (((C786410Ut5.X2(this.LIZ) * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Snapshot(luxMin=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", luxMax=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", luxJitterRate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1909807dw(double d, double d2, double d3) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
    }
}

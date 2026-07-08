package X;

/* JADX INFO: renamed from: X.0l1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341730l1H {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341730l1H)) {
            return false;
        }
        C1341730l1H c1341730l1H = (C1341730l1H) obj;
        return this.LIZ == c1341730l1H.LIZ && this.LIZIZ == c1341730l1H.LIZIZ && Double.compare(this.LIZJ, c1341730l1H.LIZJ) == 0 && Double.compare(this.LIZLLL, c1341730l1H.LIZLLL) == 0;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ)) * 31) + C786410Ut5.X2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InferOutcome(shouldShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inferSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inferScore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scoreThreshold=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1341730l1H(double d, double d2, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = d;
        this.LIZLLL = d2;
    }
}

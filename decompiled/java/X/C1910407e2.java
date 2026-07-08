package X;

/* JADX INFO: renamed from: X.07e2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1910407e2 {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1910407e2)) {
            return false;
        }
        C1910407e2 c1910407e2 = (C1910407e2) obj;
        return Double.compare(this.LIZ, c1910407e2.LIZ) == 0 && Double.compare(this.LIZIZ, c1910407e2.LIZIZ) == 0 && Double.compare(this.LIZJ, c1910407e2.LIZJ) == 0 && Double.compare(this.LIZLLL, c1910407e2.LIZLLL) == 0;
    }

    public final int hashCode() {
        return (((((C786410Ut5.X2(this.LIZ) * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ)) * 31) + C786410Ut5.X2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultSampleRateConfig(monitorNormal=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", monitorError=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", interceptError=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", localSampleRate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1910407e2() {
        this(0.0d, 0.01d, 1.0d, 1.0d);
    }

    public C1910407e2(double d, double d2, double d3, double d4) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
    }
}

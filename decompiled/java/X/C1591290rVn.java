package X;

/* JADX INFO: renamed from: X.0rVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591290rVn {
    public int LIZ;
    public double LIZIZ;
    public int LIZJ;

    public C1591290rVn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1591290rVn)) {
            return false;
        }
        C1591290rVn c1591290rVn = (C1591290rVn) obj;
        return this.LIZ == c1591290rVn.LIZ && Double.compare(this.LIZIZ, c1591290rVn.LIZIZ) == 0 && this.LIZJ == c1591290rVn.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.X2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EwmaDebounceConfig(freezeSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hysteresisRatio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dwellSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1591290rVn(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0.0d;
        this.LIZJ = 0;
    }
}

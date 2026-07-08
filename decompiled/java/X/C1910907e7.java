package X;

/* JADX INFO: renamed from: X.07e7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1910907e7 {
    public double LIZ;
    public double LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1910907e7)) {
            return false;
        }
        C1910907e7 c1910907e7 = (C1910907e7) obj;
        return Double.compare(this.LIZ, c1910907e7.LIZ) == 0 && Double.compare(this.LIZIZ, c1910907e7.LIZIZ) == 0;
    }

    public final int hashCode() {
        return (C786410Ut5.X2(this.LIZ) * 31) + C786410Ut5.X2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TouchIntentRuntimeState(m2X=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", m2Y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1910907e7(double d, double d2) {
        this.LIZ = d;
        this.LIZIZ = d2;
    }
}

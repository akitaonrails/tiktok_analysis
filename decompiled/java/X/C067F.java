package X;

/* JADX INFO: renamed from: X.067F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C067F {
    public final int LIZ;
    public final long LIZIZ;
    public final double LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C067F)) {
            return false;
        }
        C067F c067f = (C067F) obj;
        return this.LIZ == c067f.LIZ && this.LIZIZ == c067f.LIZIZ && Double.compare(this.LIZJ, c067f.LIZJ) == 0;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetryConfig(maxRetryCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", baseDelayMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exponentialFactor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C067F(double d, int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = d;
    }
}

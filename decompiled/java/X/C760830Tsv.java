package X;

/* JADX INFO: renamed from: X.0Tsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760830Tsv {
    public long LIZ;
    public int LIZIZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C760830Tsv)) {
            return false;
        }
        C760830Tsv c760830Tsv = (C760830Tsv) obj;
        return this.LIZ == c760830Tsv.LIZ && this.LIZIZ == c760830Tsv.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Record(createTimeStamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C760830Tsv(long j) {
        this.LIZ = j;
    }
}

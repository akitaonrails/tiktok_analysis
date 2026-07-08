package X;

/* JADX INFO: renamed from: X.0pID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505990pID {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1505990pID)) {
            return false;
        }
        C1505990pID c1505990pID = (C1505990pID) obj;
        return this.LIZ == c1505990pID.LIZ && this.LIZIZ == c1505990pID.LIZIZ && this.LIZJ == c1505990pID.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecisionMetrics(imgTputMetric=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", apiTtfbMetric=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pendingMetric=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1505990pID(long j, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
    }
}

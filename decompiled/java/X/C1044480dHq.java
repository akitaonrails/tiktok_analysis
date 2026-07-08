package X;

/* JADX INFO: renamed from: X.0dHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044480dHq {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044480dHq)) {
            return false;
        }
        C1044480dHq c1044480dHq = (C1044480dHq) obj;
        return this.LIZ == c1044480dHq.LIZ && this.LIZIZ == c1044480dHq.LIZIZ && this.LIZJ == c1044480dHq.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayCountSummary(regularBarrageShowCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sellingPointsShowCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aiHintsShowCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1044480dHq(long j, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
    }
}

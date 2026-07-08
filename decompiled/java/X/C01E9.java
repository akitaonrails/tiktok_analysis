package X;

/* JADX INFO: renamed from: X.01E9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01E9 {
    public final long LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownFanTicketData(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", countdownId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetScore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", completionProgressPercent=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01E9(long j, long j2, long j3, long j4, int i, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = i;
    }
}

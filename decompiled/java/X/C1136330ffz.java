package X;

/* JADX INFO: renamed from: X.0ffz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136330ffz {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DurationCommonResult(sendTs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", receiveTs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dequeueTs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sendReceivedDuration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", createReceivedDuration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sendEnqueueDuration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", receivedEnqueueDuration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enqueueDequeueDuration=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1136330ffz(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
        this.LJI = j7;
        this.LJII = j8;
    }
}

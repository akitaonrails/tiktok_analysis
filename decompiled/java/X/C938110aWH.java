package X;

/* JADX INFO: renamed from: X.0aWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938110aWH {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowCountDownEventData(totalTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C938110aWH(int i, long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}

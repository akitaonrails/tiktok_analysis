package X;

/* JADX INFO: renamed from: X.0Djm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347480Djm {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public C347480Djm() {
        this("", 0L, 0L, 0L, 0L);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraAuditVideoInfo(path='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', startTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeClipStart=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timeClipEnd=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C347480Djm(String str, long j, long j2, long j3, long j4) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
    }
}

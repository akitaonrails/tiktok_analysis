package X;

/* JADX INFO: renamed from: X.0KwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533710KwT {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRecordingsContent(fragmentId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", localFilePath='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C533710KwT(long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
    }
}

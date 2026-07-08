package X;

/* JADX INFO: renamed from: X.0LMR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LMR {
    public final C0LBD LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final long LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C0LMR() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 63);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadInfo(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", downloadPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", totalSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LMR(C0LBD c0lbd, int i, String str, Integer num, String str2, long j) {
        this.LIZ = c0lbd;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = j;
    }

    public /* synthetic */ C0LMR(C0LBD c0lbd, int i, String str, Integer num, String str2, long j, int i2) {
        this((i2 & 1) != 0 ? C0LBD.DEFAULT : c0lbd, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? null : num, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? 0L : j);
    }
}

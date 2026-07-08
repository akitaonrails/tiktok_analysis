package X;

/* JADX INFO: renamed from: X.0D22, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D22 {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadResult(successCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D22(int i, int i2, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = str;
    }
}

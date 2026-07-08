package X;

/* JADX INFO: renamed from: X.0KpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529210KpD {
    public final boolean LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCheckInfo(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", checkerType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", costTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fileSuffix=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C529210KpD(int i, String str, long j, String str2, String str3, boolean z) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = str3;
    }
}

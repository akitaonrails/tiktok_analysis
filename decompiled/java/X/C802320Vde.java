package X;

/* JADX INFO: renamed from: X.0Vde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802320Vde {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadLimitConfig{crashLimitIssue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", crashLimitAll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exceptionAllLimit=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", exceptionMsgLimit=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", exceptionStackLimit=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isNoLimit=");
        sbLIZ.append(false);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C802320Vde(int i, int i2, int i3, int i4, int i5) {
        this.LIZ = 50;
        this.LIZIZ = 100;
        this.LIZJ = 100;
        this.LIZLLL = 5;
        this.LJ = 2;
        if (i > 0) {
            this.LIZ = i;
        }
        if (i2 > 0) {
            this.LIZIZ = i2;
        }
        if (i3 > 0) {
            this.LIZJ = i3;
        }
        if (i4 > 0) {
            this.LIZLLL = i4;
        }
        if (i5 > 0) {
            this.LJ = i5;
        }
    }
}

package X;

/* JADX INFO: renamed from: X.0bGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966980bGq {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicError(errCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", prompts=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", alert=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1CMV LIZ() {
        return new C1CMV(Long.valueOf(this.LIZ), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C966980bGq(long j, String str, String str2, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}

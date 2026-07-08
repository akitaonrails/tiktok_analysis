package X;

/* JADX INFO: renamed from: X.0wqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796560wqs {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public C1796560wqs() {
        this(0, null, null, null, false, 31);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PayResultInfo(productId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", successBeforeRetry=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1796560wqs(int i, String str, String str2, String str3, boolean z, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        i = (i2 & 4) != 0 ? 0 : i;
        str3 = (i2 & 8) != 0 ? null : str3;
        z = (i2 & 16) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}

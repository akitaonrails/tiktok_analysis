package X;

/* JADX INFO: renamed from: X.0lPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357010lPv {
    public final String LIZ;
    public final boolean LIZIZ;
    public final EnumC1356970lPr LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request{aid:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRefresh:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scenario:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1357010lPv(String str, boolean z, String str2, int i) {
        EnumC1356970lPr enumC1356970lPr;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            enumC1356970lPr = EnumC1356970lPr.NORMAL;
        } else {
            enumC1356970lPr = null;
        }
        int i2 = (i & 8) != 0 ? 20 : 0;
        str2 = (i & 16) != 0 ? null : str2;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = enumC1356970lPr;
        this.LIZLLL = i2;
        this.LJ = str2;
    }
}

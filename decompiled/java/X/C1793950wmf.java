package X;

/* JADX INFO: renamed from: X.0wmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793950wmf {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public String LJFF;

    public C1793950wmf() {
        this.LJ = 1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderInfo{mProductId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mOrderId='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mUserId='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mExtraPayload='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1793950wmf(C1794480wnW c1794480wnW) {
        this.LJ = 1;
        this.LIZ = c1794480wnW.LIZJ;
        this.LIZIZ = c1794480wnW.LIZLLL();
        this.LIZLLL = c1794480wnW.LIZLLL;
        this.LJFF = c1794480wnW.LIZ.LJIIJ;
        AbstractC1794600wni abstractC1794600wni = c1794480wnW.LJIIJ;
        if (abstractC1794600wni != null) {
            this.LJ = abstractC1794600wni.LIZLLL;
            this.LIZJ = abstractC1794600wni.LJFF;
        }
    }
}

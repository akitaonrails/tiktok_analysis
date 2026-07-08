package X;

/* JADX INFO: renamed from: X.0iBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232850iBf {
    public int LIZ;
    public String LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;
    public final String LJ;
    public final EnumC1236600iHi LJFF;
    public final EnumC21632119lH LJI;
    public final EnumC19415410xc LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MonitorErrorCodeScene(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", innerErrorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", innerErrorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", businessCategory=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", businessPart=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", sourceType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        int i = this.LIZ;
        if (i == 0) {
            return String.valueOf(i);
        }
        EnumC1236600iHi enumC1236600iHi = this.LJFF;
        EnumC21632119lH enumC21632119lH = this.LJI;
        EnumC19415410xc enumC19415410xc = this.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1236600iHi.getValue());
        sbLIZ.append(enumC21632119lH.getValue());
        sbLIZ.append(enumC19415410xc.getValue());
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1232850iBf(int i, String str, Integer num, String str2, String str3, EnumC1236600iHi enumC1236600iHi, EnumC21632119lH enumC21632119lH, EnumC19415410xc enumC19415410xc) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = enumC1236600iHi;
        this.LJI = enumC21632119lH;
        this.LJII = enumC19415410xc;
    }
}

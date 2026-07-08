package X;

/* JADX INFO: renamed from: X.183j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212225183j {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPriceSplitInfo(currency=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currencyPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", integerPart=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", decimalPart=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", decimalPointSymbol=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        String str = this.LIZLLL;
        return !(str == null || str.length() == 0);
    }

    public C212225183j(String str, int i, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}

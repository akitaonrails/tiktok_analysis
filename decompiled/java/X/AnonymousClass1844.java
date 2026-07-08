package X;

/* JADX INFO: renamed from: X.1844, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1844 {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceSplitInfo(currency=");
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

    public final boolean LIZIZ() {
        String str = this.LIZLLL;
        return !(str == null || str.length() == 0);
    }

    public static AnonymousClass1844 LIZ(AnonymousClass1844 anonymousClass1844, String str, String str2, String str3, int i) {
        String str4;
        int i2;
        String str5 = str3;
        String str6 = str2;
        String str7 = str;
        String str8 = null;
        if ((i & 1) != 0) {
            str4 = anonymousClass1844.LIZ;
        } else {
            str4 = null;
        }
        if ((i & 2) != 0) {
            i2 = anonymousClass1844.LIZIZ;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            str7 = anonymousClass1844.LIZJ;
        }
        if ((i & 8) != 0) {
            str6 = anonymousClass1844.LIZLLL;
        }
        if ((i & 16) != 0) {
            str5 = anonymousClass1844.LJ;
        }
        if ((i & 32) != 0) {
            str8 = anonymousClass1844.LJFF;
        }
        return new AnonymousClass1844(str4, i2, str7, str6, str5, str8);
    }

    public AnonymousClass1844(String str, int i, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}

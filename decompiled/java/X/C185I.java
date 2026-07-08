package X;

/* JADX INFO: renamed from: X.185I, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185I {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final AnonymousClass1844 LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Integer LJIIIIZZ;
    public final String LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceInfo(formatOriginPrice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", formatAvailablePrice=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pricePrefix=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", discountPrice=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", splitPrice=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isFlashSale=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", shouldShowCreatorExclusivePreHeatText=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", priceDisplayMode=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", priceHideText=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C185I(String str, String str2, String str3, String str4, String str5, AnonymousClass1844 anonymousClass1844, boolean z, Integer num, String str6, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : anonymousClass1844, (i & 64) != 0 ? false : z, false, (i & 256) != 0 ? 0 : num, (i & 512) == 0 ? str6 : null);
    }

    public C185I(String str, String str2, String str3, String str4, String str5, AnonymousClass1844 anonymousClass1844, boolean z, boolean z2, Integer num, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = anonymousClass1844;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = num;
        this.LJIIIZ = str6;
    }
}

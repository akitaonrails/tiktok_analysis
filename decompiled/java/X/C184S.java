package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.DepositPrice;

/* JADX INFO: renamed from: X.184S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C184S {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C212225183j LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Integer LJII;
    public final String LJIIIIZZ;
    public final DepositPrice LJIIIZ;
    public final String LJIIJ;

    public final String toString() {
        return "UsPriceInfo(formatOriginPrice=" + this.LIZ + ", formatAvailablePrice=" + this.LIZIZ + ", price=, pricePrefix=" + this.LIZJ + ", discountPrice=" + this.LIZLLL + ", splitPrice=" + this.LJ + ", isFlashSale=" + this.LJFF + ", shouldShowCreatorExclusivePreHeatText=" + this.LJI + ", priceDisplayMode=" + this.LJII + ", priceHideText=" + this.LJIIIIZZ + ", depositPrice=" + this.LJIIIZ + ", afterCouponPrice=" + this.LJIIJ + ')';
    }

    public C184S(String str, String str2, String str3, String str4, C212225183j c212225183j, boolean z, boolean z2, Integer num, String str5, DepositPrice depositPrice, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = c212225183j;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = num;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = depositPrice;
        this.LJIIJ = str6;
    }
}

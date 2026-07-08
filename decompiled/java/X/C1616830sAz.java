package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616830sAz {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;
    public final Boolean LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1616830sAz)) {
            return false;
        }
        C1616830sAz c1616830sAz = (C1616830sAz) obj;
        return this.LIZ == c1616830sAz.LIZ && Intrinsics.LJFF(this.LIZIZ, c1616830sAz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1616830sAz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1616830sAz.LIZLLL) && Intrinsics.LJFF(this.LJ, c1616830sAz.LJ) && Intrinsics.LJFF(this.LJFF, c1616830sAz.LJFF) && Intrinsics.LJFF(this.LJI, c1616830sAz.LJI) && Intrinsics.LJFF(this.LJII, c1616830sAz.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1616830sAz.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1616830sAz.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1616830sAz.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1616830sAz.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1616830sAz.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJII;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.LJIIJJI;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJIIL;
        return iHashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PgcPaymentMarketplacePrice(optionType=" + this.LIZ + ", iapId=" + this.LIZIZ + ", discountIapId=" + this.LIZJ + ", localPriceAmount=" + this.LIZLLL + ", discountedLocalPriceAmount=" + this.LJ + ", currencyCode=" + this.LJFF + ", currencySymbol=" + this.LJI + ", clientParam=" + this.LJII + ", offerToken=" + this.LJIIIIZZ + ", basePlanId=" + this.LJIIIZ + ", offerId=" + this.LJIIJ + ", cycleType=" + this.LJIIJJI + ", isAutoRenew=" + this.LJIIL + ')';
    }

    public /* synthetic */ C1616830sAz(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2) {
        this(i, str, str2, str3, str4, str5, str6, str7, null, (i2 & 512) != 0 ? null : str8, (i2 & 1024) != 0 ? null : str9, null, null);
    }

    public C1616830sAz(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Boolean bool) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = num;
        this.LJIIL = bool;
    }
}

package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionCycleType;
import com.ss.android.ugc.aweme.model.VipSubscriptionPrice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612820s4W {
    public final String LIZ;
    public final String LIZIZ;
    public final VipSubscriptionPrice LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final Boolean LJI;
    public final Boolean LJII;
    public final VipSubscriptionCycleType LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612820s4W)) {
            return false;
        }
        C1612820s4W c1612820s4W = (C1612820s4W) obj;
        return Intrinsics.LJFF(this.LIZ, c1612820s4W.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1612820s4W.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1612820s4W.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1612820s4W.LIZLLL) && Intrinsics.LJFF(this.LJ, c1612820s4W.LJ) && this.LJFF == c1612820s4W.LJFF && Intrinsics.LJFF(this.LJI, c1612820s4W.LJI) && Intrinsics.LJFF(this.LJII, c1612820s4W.LJII) && this.LJIIIIZZ == c1612820s4W.LJIIIIZZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        VipSubscriptionPrice vipSubscriptionPrice = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (vipSubscriptionPrice == null ? 0 : vipSubscriptionPrice.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LJFF) * 31;
        Boolean bool = this.LJI;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJII;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VipSubscriptionCycleType vipSubscriptionCycleType = this.LJIIIIZZ;
        return iHashCode7 + (vipSubscriptionCycleType != null ? vipSubscriptionCycleType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipMarketplaceSubscriptionOption(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", localPriceAmountDisplay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", localDiscountPriceAmountDisplay=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", discountPercentage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isBest=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isAutoRenew=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", cycleType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1612820s4W(String str, String str2, VipSubscriptionPrice vipSubscriptionPrice, String str3, String str4, int i, Boolean bool, Boolean bool2, VipSubscriptionCycleType vipSubscriptionCycleType) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = vipSubscriptionPrice;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = i;
        this.LJI = bool;
        this.LJII = bool2;
        this.LJIIIIZZ = vipSubscriptionCycleType;
    }
}

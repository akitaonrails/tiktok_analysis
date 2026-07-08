package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DealLabel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HighLightPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformDiscountBrief;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionCouponModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionDiscountBrief;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionTagStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherBackInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C720002rW extends AbstractC756202xM {
    public final String LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;
    public final List<C562702Hh> LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final Integer LLJILJILJ;
    public final String LLJILLL;
    public final PromotionTagStyle LLJJ;
    public final HighLightPromotionInfo LLJJI;
    public final List<PromotionDiscountBrief> LLJJIII;
    public final BonusInfo LLJJIJI;
    public final String LLJJIJIIJIL;
    public final PromotionBanner LLJJIJIL;
    public final Boolean LLJJJ;
    public final Boolean LLJJJIL;
    public final VoucherBackInfo LLJJJJ;
    public final List<String> LLJJJJJIL;
    public final Integer LLJJJJLIIL;
    public final List<DealLabel> LLJJL;
    public final PromotionCouponModule LLJJLIIIJLLLLLLLZ;
    public final Icon LLJL;
    public final Integer LLJLIL;
    public final String LLJLILLLLZIIL;
    public final List<PromotionSellingPoint> LLJLL;
    public final boolean LLJLLIL;
    public final PlatformDiscountBrief LLJLLL;
    public final Integer LLJZ;
    public final String LLJZIJLIL;
    public final String LLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C720002rW)) {
            return false;
        }
        C720002rW c720002rW = (C720002rW) obj;
        return Intrinsics.LJFF(this.LLILZLL, c720002rW.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c720002rW.LLIZ) && this.LLIZLLLIL == c720002rW.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c720002rW.LLJ) && Intrinsics.LJFF(this.LLJI, c720002rW.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c720002rW.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c720002rW.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c720002rW.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c720002rW.LLJILLL) && this.LLJJ == c720002rW.LLJJ && Intrinsics.LJFF(this.LLJJI, c720002rW.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c720002rW.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c720002rW.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c720002rW.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c720002rW.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c720002rW.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c720002rW.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c720002rW.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c720002rW.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c720002rW.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c720002rW.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c720002rW.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c720002rW.LLJL) && Intrinsics.LJFF(this.LLJLIL, c720002rW.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c720002rW.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c720002rW.LLJLL) && this.LLJLLIL == c720002rW.LLJLLIL && Intrinsics.LJFF(this.LLJLLL, c720002rW.LLJLLL) && Intrinsics.LJFF(this.LLJZ, c720002rW.LLJZ);
    }

    public final int hashCode() {
        String str = this.LLILZLL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLIZ;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        String str3 = this.LLJ;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJI.hashCode()) * 31;
        String str4 = this.LLJIJIL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLJILJIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.LLJILJILJ;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.LLJILLL;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PromotionTagStyle promotionTagStyle = this.LLJJ;
        int iHashCode8 = (iHashCode7 + (promotionTagStyle == null ? 0 : promotionTagStyle.hashCode())) * 31;
        HighLightPromotionInfo highLightPromotionInfo = this.LLJJI;
        int iHashCode9 = (iHashCode8 + (highLightPromotionInfo == null ? 0 : highLightPromotionInfo.hashCode())) * 31;
        List<PromotionDiscountBrief> list = this.LLJJIII;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        BonusInfo bonusInfo = this.LLJJIJI;
        int iHashCode11 = (iHashCode10 + (bonusInfo == null ? 0 : bonusInfo.hashCode())) * 31;
        String str7 = this.LLJJIJIIJIL;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PromotionBanner promotionBanner = this.LLJJIJIL;
        int iHashCode13 = (iHashCode12 + (promotionBanner == null ? 0 : promotionBanner.hashCode())) * 31;
        Boolean bool = this.LLJJJ;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJJJIL;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VoucherBackInfo voucherBackInfo = this.LLJJJJ;
        int iHashCode16 = (iHashCode15 + (voucherBackInfo == null ? 0 : voucherBackInfo.hashCode())) * 31;
        List<String> list2 = this.LLJJJJJIL;
        int iHashCode17 = (iHashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.LLJJJJLIIL;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<DealLabel> list3 = this.LLJJL;
        int iHashCode19 = (iHashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        PromotionCouponModule promotionCouponModule = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode20 = (iHashCode19 + (promotionCouponModule == null ? 0 : promotionCouponModule.hashCode())) * 31;
        Icon icon = this.LLJL;
        int iHashCode21 = (iHashCode20 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num3 = this.LLJLIL;
        int iHashCode22 = (iHashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.LLJLILLLLZIIL;
        int iHashCode23 = (iHashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<PromotionSellingPoint> list4 = this.LLJLL;
        int iHashCode24 = (((iHashCode23 + (list4 == null ? 0 : list4.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLLIL)) * 31;
        PlatformDiscountBrief platformDiscountBrief = this.LLJLLL;
        int iHashCode25 = (iHashCode24 + (platformDiscountBrief == null ? 0 : platformDiscountBrief.hashCode())) * 31;
        Integer num4 = this.LLJZ;
        return iHashCode25 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformDiscountsVO(totalDiscounts=" + this.LLILZLL + ", platformCouponCacheKey=" + this.LLIZ + ", selectShippingVoucher=" + this.LLIZLLLIL + ", couponSchema=" + this.LLJ + ", voucherList=" + this.LLJI + ", couponStatus=" + this.LLJIJIL + ", title=" + this.LLJILJIL + ", unusedCouponCount=" + this.LLJILJILJ + ", promotionTagText=" + this.LLJILLL + ", promotionTagStyle=" + this.LLJJ + ", highLightInfo=" + this.LLJJI + ", discountList=" + this.LLJJIII + ", bonusInfo=" + this.LLJJIJI + ", daInfo=" + this.LLJJIJIIJIL + ", promotionBanner=" + this.LLJJIJIL + ", isUseSkeleton=" + this.LLJJJ + ", isPreHandle=" + this.LLJJJIL + ", voucherBack=" + this.LLJJJJ + ", discountLabels=" + this.LLJJJJJIL + ", discountBriefStyle=" + this.LLJJJJLIIL + ", dealLabels=" + this.LLJJL + ", promotionCouponModule=" + this.LLJJLIIIJLLLLLLLZ + ", titleIcon=" + this.LLJL + ", titleIconStyle=" + this.LLJLIL + ", entranceTitle=" + this.LLJLILLLLZIIL + ", promotionSellingPoint=" + this.LLJLL + ", titleSmallStyle=" + this.LLJLLIL + ", platformDiscountBrief=" + this.LLJLLL + ", discountBriefWidthStyle=" + this.LLJZ + ')';
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJZIJLIL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C720002rW.class, interfaceC1891350zJl.getClass());
    }

    public /* synthetic */ C720002rW(C13BV c13bv, Boolean bool, Boolean bool2, int i) {
        this(null, null, false, null, c13bv, null, null, null, null, null, null, null, null, null, null, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : bool2, null, null, null, null, null, null, null, null, null, false, null, null);
    }

    public C720002rW(String str, String str2, boolean z, String str3, List<C562702Hh> list, String str4, String str5, Integer num, String str6, PromotionTagStyle promotionTagStyle, HighLightPromotionInfo highLightPromotionInfo, List<PromotionDiscountBrief> list2, BonusInfo bonusInfo, String str7, PromotionBanner promotionBanner, Boolean bool, Boolean bool2, VoucherBackInfo voucherBackInfo, List<String> list3, Integer num2, List<DealLabel> list4, PromotionCouponModule promotionCouponModule, Icon icon, Integer num3, String str8, List<PromotionSellingPoint> list5, boolean z2, PlatformDiscountBrief platformDiscountBrief, Integer num4) {
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = z;
        this.LLJ = str3;
        this.LLJI = list;
        this.LLJIJIL = str4;
        this.LLJILJIL = str5;
        this.LLJILJILJ = num;
        this.LLJILLL = str6;
        this.LLJJ = promotionTagStyle;
        this.LLJJI = highLightPromotionInfo;
        this.LLJJIII = list2;
        this.LLJJIJI = bonusInfo;
        this.LLJJIJIIJIL = str7;
        this.LLJJIJIL = promotionBanner;
        this.LLJJJ = bool;
        this.LLJJJIL = bool2;
        this.LLJJJJ = voucherBackInfo;
        this.LLJJJJJIL = list3;
        this.LLJJJJLIIL = num2;
        this.LLJJL = list4;
        this.LLJJLIIIJLLLLLLLZ = promotionCouponModule;
        this.LLJL = icon;
        this.LLJLIL = num3;
        this.LLJLILLLLZIIL = str8;
        this.LLJLL = list5;
        this.LLJLLIL = z2;
        this.LLJLLL = platformDiscountBrief;
        this.LLJZ = num4;
        this.LLJZIJLIL = "platform_promotion";
        this.LLL = "platform_promotion_item";
    }
}

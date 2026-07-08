package X;

import com.ss.android.ugc.aweme.ecommerce.model.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.model.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.model.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ShowTextInfo;
import com.ss.android.ugc.aweme.ecommerce.model.SimplePrice;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionInfo;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21271018Ma {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final PromotionInfo LJI;
    public final SimplePrice LJII;
    public final List<PromotionLogo> LJIIIIZZ;
    public final Map<String, Object> LJIIIZ;
    public final AddToCartButton LJIIJ;
    public final Float LJIIJJI;
    public final Integer LJIIL;
    public final ShowTextInfo LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final VideoProductDaInfo LJIILLIIL;
    public final EnhancedBrandLogo LJIIZILJ;
    public final SellerInfo LJIJ;
    public final List<SkuItem> LJIJI;
    public final CartEntry LJIJJ;
    public final String LJIJJLI;
    public final long LJIL;
    public final long LJJ;
    public final boolean LJJI;
    public final Map<String, String> LJJIFFI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21271018Ma)) {
            return false;
        }
        C21271018Ma c21271018Ma = (C21271018Ma) obj;
        return this.LIZ == c21271018Ma.LIZ && Intrinsics.LJFF(this.LIZIZ, c21271018Ma.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c21271018Ma.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c21271018Ma.LIZLLL) && Intrinsics.LJFF(this.LJ, c21271018Ma.LJ) && Intrinsics.LJFF(this.LJFF, c21271018Ma.LJFF) && Intrinsics.LJFF(this.LJI, c21271018Ma.LJI) && Intrinsics.LJFF(this.LJII, c21271018Ma.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c21271018Ma.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c21271018Ma.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c21271018Ma.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c21271018Ma.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c21271018Ma.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c21271018Ma.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c21271018Ma.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c21271018Ma.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c21271018Ma.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c21271018Ma.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c21271018Ma.LJIJ) && Intrinsics.LJFF(this.LJIJI, c21271018Ma.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c21271018Ma.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c21271018Ma.LJIJJLI) && this.LJIL == c21271018Ma.LJIL && this.LJJ == c21271018Ma.LJJ && this.LJJI == c21271018Ma.LJJI && Intrinsics.LJFF(this.LJJIFFI, c21271018Ma.LJJIFFI);
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
        PromotionInfo promotionInfo = this.LJI;
        int iHashCode6 = (iHashCode5 + (promotionInfo == null ? 0 : promotionInfo.hashCode())) * 31;
        SimplePrice simplePrice = this.LJII;
        int iHashCode7 = (iHashCode6 + (simplePrice == null ? 0 : simplePrice.hashCode())) * 31;
        List<PromotionLogo> list = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        AddToCartButton addToCartButton = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
        Float f = this.LJIIJJI;
        int iHashCode11 = (iHashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.LJIIL;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        ShowTextInfo showTextInfo = this.LJIILIIL;
        int iHashCode13 = (iHashCode12 + (showTextInfo == null ? 0 : showTextInfo.hashCode())) * 31;
        String str5 = this.LJIILJJIL;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIILL;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        VideoProductDaInfo videoProductDaInfo = this.LJIILLIIL;
        int iHashCode16 = (iHashCode15 + (videoProductDaInfo == null ? 0 : videoProductDaInfo.hashCode())) * 31;
        EnhancedBrandLogo enhancedBrandLogo = this.LJIIZILJ;
        int iHashCode17 = (iHashCode16 + (enhancedBrandLogo == null ? 0 : enhancedBrandLogo.hashCode())) * 31;
        SellerInfo sellerInfo = this.LJIJ;
        int iHashCode18 = (iHashCode17 + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        List<SkuItem> list2 = this.LJIJI;
        int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CartEntry cartEntry = this.LJIJJ;
        int iHashCode20 = (iHashCode19 + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        String str7 = this.LJIJJLI;
        int iHashCode21 = (((((((iHashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Y2(this.LJIL)) * 31) + C786410Ut5.Y2(this.LJJ)) * 31) + C786410Ut5.Z2(this.LJJI)) * 31;
        Map<String, String> map2 = this.LJJIFFI;
        return iHashCode21 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "PanelProductCardUiModel(position=" + this.LIZ + ", productId=" + this.LIZIZ + ", salePriceText=" + this.LIZJ + ", pricePrefixText=" + this.LIZLLL + ", originPriceTextFromMap=" + this.LJ + ", discountTextFromMap=" + this.LJFF + ", promotionInfo=" + this.LJI + ", depositInfo=" + this.LJII + ", promotionLogos=" + this.LJIIIIZZ + ", promotionLogExtraInfo=" + this.LJIIIZ + ", addToCartButton=" + this.LJIIJ + ", rating=" + this.LJIIJJI + ", soldCount=" + this.LJIIL + ", soldCountTextInfo=" + this.LJIILIIL + ", shopEntranceSchema=" + this.LJIILJJIL + ", chatSchema=" + this.LJIILL + ", commonDaInfo=" + this.LJIILLIIL + ", enhancedBrandLogo=" + this.LJIIZILJ + ", sellerInfo=" + this.LJIJ + ", skusFromServer=" + this.LJIJI + ", cartEntry=" + this.LJIJJ + ", sellerId=" + this.LJIJJLI + ", serverTime=" + this.LJIL + ", createTime=" + this.LJJ + ", hasComplianceSlotInRow=" + this.LJJI + ", itemDaInfo=" + this.LJJIFFI + ')';
    }

    public C21271018Ma(int i, String str, String str2, String str3, String str4, String str5, PromotionInfo promotionInfo, SimplePrice simplePrice, List<PromotionLogo> list, Map<String, ? extends Object> map, AddToCartButton addToCartButton, Float f, Integer num, ShowTextInfo showTextInfo, String str6, String str7, VideoProductDaInfo videoProductDaInfo, EnhancedBrandLogo enhancedBrandLogo, SellerInfo sellerInfo, List<SkuItem> list2, CartEntry cartEntry, String str8, long j, long j2, boolean z, Map<String, String> map2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = promotionInfo;
        this.LJII = simplePrice;
        this.LJIIIIZZ = list;
        this.LJIIIZ = map;
        this.LJIIJ = addToCartButton;
        this.LJIIJJI = f;
        this.LJIIL = num;
        this.LJIILIIL = showTextInfo;
        this.LJIILJJIL = str6;
        this.LJIILL = str7;
        this.LJIILLIIL = videoProductDaInfo;
        this.LJIIZILJ = enhancedBrandLogo;
        this.LJIJ = sellerInfo;
        this.LJIJI = list2;
        this.LJIJJ = cartEntry;
        this.LJIJJLI = str8;
        this.LJIL = j;
        this.LJJ = j2;
        this.LJJI = z;
        this.LJJIFFI = map2;
    }
}

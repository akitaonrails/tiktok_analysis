package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03wx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1008503wx {
    public final String LIZ;
    public final CombinedSalesVolume LIZIZ;
    public final ProductDetailReview LIZJ;
    public final PickTag LIZLLL;
    public final List<PromotionLogo> LJ;
    public final Boolean LJFF;
    public final Boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final PdpPaymentModule LJIIIZ;
    public final SEACCIPaymentModule LJIIJ;
    public final PromotionLabelVO LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008503wx)) {
            return false;
        }
        C1008503wx c1008503wx = (C1008503wx) obj;
        return Intrinsics.LJFF(this.LIZ, c1008503wx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1008503wx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1008503wx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1008503wx.LIZLLL) && Intrinsics.LJFF(this.LJ, c1008503wx.LJ) && Intrinsics.LJFF(this.LJFF, c1008503wx.LJFF) && Intrinsics.LJFF(this.LJI, c1008503wx.LJI) && this.LJII == c1008503wx.LJII && this.LJIIIIZZ == c1008503wx.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1008503wx.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1008503wx.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1008503wx.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        CombinedSalesVolume combinedSalesVolume = this.LIZIZ;
        int iHashCode2 = (iHashCode + (combinedSalesVolume == null ? 0 : combinedSalesVolume.hashCode())) * 31;
        ProductDetailReview productDetailReview = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (productDetailReview == null ? 0 : productDetailReview.hashCode())) * 31;
        PickTag pickTag = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (pickTag == null ? 0 : pickTag.hashCode())) * 31;
        List<PromotionLogo> list = this.LJ;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.LJFF;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJI;
        int iHashCode7 = (((((iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        PdpPaymentModule pdpPaymentModule = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (pdpPaymentModule == null ? 0 : pdpPaymentModule.hashCode())) * 31;
        SEACCIPaymentModule sEACCIPaymentModule = this.LJIIJ;
        int iHashCode9 = (iHashCode8 + (sEACCIPaymentModule == null ? 0 : sEACCIPaymentModule.hashCode())) * 31;
        PromotionLabelVO promotionLabelVO = this.LJIIJJI;
        return iHashCode9 + (promotionLabelVO != null ? promotionLabelVO.hashCode() : 0);
    }

    public final String toString() {
        return "ProductInfoVO(title=" + this.LIZ + ", combinedSalesVolume=" + this.LIZIZ + ", review=" + this.LIZJ + ", activityInfo=" + this.LIZLLL + ", promotionLogos=" + this.LJ + ", isLoading=" + this.LJFF + ", isFavorite=" + this.LJI + ", needDivider=" + this.LJII + ", removePrice=" + this.LJIIIIZZ + ", pdpPaymentModule=" + this.LJIIIZ + ", cciPaymentModule=" + this.LJIIJ + ", pdpDealsModule=" + this.LJIIJJI + ')';
    }

    public C1008503wx(String str, CombinedSalesVolume combinedSalesVolume, ProductDetailReview productDetailReview, PickTag pickTag, List<PromotionLogo> list, Boolean bool, Boolean bool2, boolean z, boolean z2, PdpPaymentModule pdpPaymentModule, SEACCIPaymentModule sEACCIPaymentModule, PromotionLabelVO promotionLabelVO) {
        this.LIZ = str;
        this.LIZIZ = combinedSalesVolume;
        this.LIZJ = productDetailReview;
        this.LIZLLL = pickTag;
        this.LJ = list;
        this.LJFF = bool;
        this.LJI = bool2;
        this.LJII = z;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = pdpPaymentModule;
        this.LJIIJ = sEACCIPaymentModule;
        this.LJIIJJI = promotionLabelVO;
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CreatorVideoModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoSticker;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762020vxA implements InterfaceC997603vC, InterfaceC1755330vmN, InterfaceC746802vq, C14NM, C04DW {
    public final List<Image> LL;
    public final int LLILLJJLI;
    public final List<ProductBannerLabel> LLILLL;
    public final Boolean LLILZ;
    public final DynamicSellingPointsBase LLILZIL;
    public final SellingPointGroup LLILZLL;
    public final GlobalWaistBanner LLIZ;
    public final PromotionWaist LLIZLLLIL;
    public final List<MediaItem> LLJ;
    public final Integer LLJI;
    public final EntranceBubble LLJIJIL;
    public final Boolean LLJILJIL;
    public final TryOnData LLJILJILJ;
    public final int LLJILLL;
    public final boolean LLJJ;
    public final ECRichText LLJJI;
    public final CreatorVideoModel LLJJIII;
    public final boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final PromoSticker LLJJIJIL;
    public final boolean LLJJJ;
    public String LLJJJIL = "undefined";
    public final int LLJJJJ = EnumC1752690vi7.HEADER.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1762020vxA)) {
            return false;
        }
        C1762020vxA c1762020vxA = (C1762020vxA) obj;
        return Intrinsics.LJFF(this.LL, c1762020vxA.LL) && this.LLILLJJLI == c1762020vxA.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1762020vxA.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1762020vxA.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1762020vxA.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1762020vxA.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1762020vxA.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1762020vxA.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1762020vxA.LLJ) && Intrinsics.LJFF(this.LLJI, c1762020vxA.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1762020vxA.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1762020vxA.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1762020vxA.LLJILJILJ) && this.LLJILLL == c1762020vxA.LLJILLL && this.LLJJ == c1762020vxA.LLJJ && Intrinsics.LJFF(this.LLJJI, c1762020vxA.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1762020vxA.LLJJIII) && this.LLJJIJI == c1762020vxA.LLJJIJI && this.LLJJIJIIJIL == c1762020vxA.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c1762020vxA.LLJJIJIL) && this.LLJJJ == c1762020vxA.LLJJJ;
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31;
        Boolean bool = this.LLILZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DynamicSellingPointsBase dynamicSellingPointsBase = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (dynamicSellingPointsBase == null ? 0 : dynamicSellingPointsBase.hashCode())) * 31;
        SellingPointGroup sellingPointGroup = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (sellingPointGroup == null ? 0 : sellingPointGroup.hashCode())) * 31;
        GlobalWaistBanner globalWaistBanner = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (globalWaistBanner == null ? 0 : globalWaistBanner.hashCode())) * 31;
        PromotionWaist promotionWaist = this.LLIZLLLIL;
        int iHashCode6 = (((iHashCode5 + (promotionWaist == null ? 0 : promotionWaist.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        Integer num = this.LLJI;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        EntranceBubble entranceBubble = this.LLJIJIL;
        int iHashCode8 = (iHashCode7 + (entranceBubble == null ? 0 : entranceBubble.hashCode())) * 31;
        Boolean bool2 = this.LLJILJIL;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        TryOnData tryOnData = this.LLJILJILJ;
        int iHashCode10 = (((((iHashCode9 + (tryOnData == null ? 0 : tryOnData.hashCode())) * 31) + this.LLJILLL) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        ECRichText eCRichText = this.LLJJI;
        int iHashCode11 = (iHashCode10 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        CreatorVideoModel creatorVideoModel = this.LLJJIII;
        int iHashCode12 = (((((iHashCode11 + (creatorVideoModel == null ? 0 : creatorVideoModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31;
        PromoSticker promoSticker = this.LLJJIJIL;
        return ((iHashCode12 + (promoSticker != null ? promoSticker.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJJ);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        return "GlobalHeaderVO(images=" + this.LL + ", skuImageCount=" + this.LLILLJJLI + ", labels=" + this.LLILLL + ", isFavorite=" + this.LLILZ + ", dynamicSellingPointsBase=" + this.LLILZIL + ", headerSellingPoints=" + this.LLILZLL + ", globalWaistBanner=" + this.LLIZ + ", universalPromotionWaist=" + this.LLIZLLLIL + ", mediaItems=" + this.LLJ + ", selectedIndex=" + this.LLJI + ", entranceBubble=" + this.LLJIJIL + ", enableHeaderMirrorBg=" + this.LLJILJIL + ", tryOnData=" + this.LLJILJILJ + ", tryOnModelImageCount=" + this.LLJILLL + ", previewMode=" + this.LLJJ + ", creatorVideoEntrance=" + this.LLJJI + ", creatorVideoModel=" + this.LLJJIII + ", hasReceivedCreatorVideoResponse=" + this.LLJJIJI + ", isFromCache=" + this.LLJJIJIIJIL + ", promoSticker=" + this.LLJJIJIL + ", isFromFullRequest=" + this.LLJJJ + ')';
    }

    @Override // X.C14NM
    public final int getContentType() {
        return this.LLJJ ? 55004 : 55005;
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJJJJ;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1755330vmN
    public final List<Image> getImages() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLJJJIL = str;
    }

    public C1762020vxA(List<Image> list, int i, List<ProductBannerLabel> list2, Boolean bool, DynamicSellingPointsBase dynamicSellingPointsBase, SellingPointGroup sellingPointGroup, GlobalWaistBanner globalWaistBanner, PromotionWaist promotionWaist, List<MediaItem> list3, Integer num, EntranceBubble entranceBubble, Boolean bool2, TryOnData tryOnData, int i2, boolean z, ECRichText eCRichText, CreatorVideoModel creatorVideoModel, boolean z2, boolean z3, PromoSticker promoSticker, boolean z4) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = list2;
        this.LLILZ = bool;
        this.LLILZIL = dynamicSellingPointsBase;
        this.LLILZLL = sellingPointGroup;
        this.LLIZ = globalWaistBanner;
        this.LLIZLLLIL = promotionWaist;
        this.LLJ = list3;
        this.LLJI = num;
        this.LLJIJIL = entranceBubble;
        this.LLJILJIL = bool2;
        this.LLJILJILJ = tryOnData;
        this.LLJILLL = i2;
        this.LLJJ = z;
        this.LLJJI = eCRichText;
        this.LLJJIII = creatorVideoModel;
        this.LLJJIJI = z2;
        this.LLJJIJIIJIL = z3;
        this.LLJJIJIL = promoSticker;
        this.LLJJJ = z4;
    }
}

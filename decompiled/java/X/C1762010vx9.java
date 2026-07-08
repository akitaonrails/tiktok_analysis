package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CreatorVideoModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762010vx9 implements InterfaceC1762080vxG, InterfaceC746802vq, C14NM, C04DW {
    public final List<CarouselElement> LL;
    public final List<Image> LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final Map<String, CarouselWidget> LLILZIL;
    public final Boolean LLILZLL;
    public final PromotionWaist LLIZ;
    public final TryOnData LLIZLLLIL;
    public final ECRichText LLJ;
    public final CreatorVideoModel LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final String LLJJ;
    public String LLJJI = "undefined";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1762010vx9)) {
            return false;
        }
        C1762010vx9 c1762010vx9 = (C1762010vx9) obj;
        return Intrinsics.LJFF(this.LL, c1762010vx9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1762010vx9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1762010vx9.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1762010vx9.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1762010vx9.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1762010vx9.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1762010vx9.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1762010vx9.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1762010vx9.LLJ) && Intrinsics.LJFF(this.LLJI, c1762010vx9.LLJI) && this.LLJIJIL == c1762010vx9.LLJIJIL && this.LLJILJIL == c1762010vx9.LLJILJIL && this.LLJILJILJ == c1762010vx9.LLJILJILJ && this.LLJILLL == c1762010vx9.LLJILLL && Intrinsics.LJFF(this.LLJJ, c1762010vx9.LLJJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.C14NM
    public final int getContentType() {
        return 55006;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Integer num = this.LLILLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, CarouselWidget> map = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        PromotionWaist promotionWaist = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (promotionWaist == null ? 0 : promotionWaist.hashCode())) * 31;
        TryOnData tryOnData = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (tryOnData == null ? 0 : tryOnData.hashCode())) * 31;
        ECRichText eCRichText = this.LLJ;
        int iHashCode8 = (iHashCode7 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        CreatorVideoModel creatorVideoModel = this.LLJI;
        int iHashCode9 = (((((((((iHashCode8 + (creatorVideoModel == null ? 0 : creatorVideoModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31;
        String str2 = this.LLJJ;
        return iHashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        return "PdpCarouselItemVO(carouselElements=" + this.LL + ", images=" + this.LLILLJJLI + ", selectedIndex=" + this.LLILLL + ", selectedElementId=" + this.LLILZ + ", carouselWidgetDataMap=" + this.LLILZIL + ", enableHeaderMirrorBg=" + this.LLILZLL + ", promotionWaist=" + this.LLIZ + ", tryOnData=" + this.LLIZLLLIL + ", creatorVideoEntrance=" + this.LLJ + ", creatorVideoModel=" + this.LLJI + ", hasReceivedCreatorVideoResponse=" + this.LLJIJIL + ", isFromCache=" + this.LLJILJIL + ", firstScreenLazyLoad=" + this.LLJILJILJ + ", isInFullScreen=" + this.LLJILLL + ", lynxOverlaySchema=" + this.LLJJ + ')';
    }

    @Override // X.InterfaceC1762080vxG
    public final String LIZ() {
        return this.LLJJ;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLJJI;
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
        this.LLJJI = str;
    }

    public C1762010vx9(List<CarouselElement> list, List<Image> list2, Integer num, String str, Map<String, CarouselWidget> map, Boolean bool, PromotionWaist promotionWaist, TryOnData tryOnData, ECRichText eCRichText, CreatorVideoModel creatorVideoModel, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = bool;
        this.LLIZ = promotionWaist;
        this.LLIZLLLIL = tryOnData;
        this.LLJ = eCRichText;
        this.LLJI = creatorVideoModel;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
        this.LLJILJILJ = z3;
        this.LLJILLL = z4;
        this.LLJJ = str2;
    }
}

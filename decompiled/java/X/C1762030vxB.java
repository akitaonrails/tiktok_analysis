package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBubble;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762030vxB implements InterfaceC997603vC, InterfaceC1755330vmN {
    public final List<Image> LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final List<ProductBannerLabel> LLILZ;
    public final DynamicSellingPointsBase LLILZIL;
    public final List<MediaItem> LLILZLL;
    public final Integer LLIZ;
    public final EntranceBubble LLIZLLLIL;
    public final Boolean LLJ;
    public final SeaPdpSellingPointsGroup LLJI;
    public final int LLJIJIL = EnumC1752690vi7.HEADER.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1762030vxB)) {
            return false;
        }
        C1762030vxB c1762030vxB = (C1762030vxB) obj;
        return Intrinsics.LJFF(this.LL, c1762030vxB.LL) && this.LLILLJJLI == c1762030vxB.LLILLJJLI && this.LLILLL == c1762030vxB.LLILLL && Intrinsics.LJFF(this.LLILZ, c1762030vxB.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1762030vxB.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1762030vxB.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1762030vxB.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1762030vxB.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1762030vxB.LLJ) && Intrinsics.LJFF(this.LLJI, c1762030vxB.LLJI);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31;
        DynamicSellingPointsBase dynamicSellingPointsBase = this.LLILZIL;
        int iHashCode2 = (((iHashCode + (dynamicSellingPointsBase == null ? 0 : dynamicSellingPointsBase.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        Integer num = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        EntranceBubble entranceBubble = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (entranceBubble == null ? 0 : entranceBubble.hashCode())) * 31;
        Boolean bool = this.LLJ;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = this.LLJI;
        return iHashCode5 + (seaPdpSellingPointsGroup != null ? seaPdpSellingPointsGroup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderBannerVO(images=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skuImageCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasSizeChart=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", labels=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", dynamicSellingPointsBase=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", mediaItems=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", selectedIndex=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", entranceBubble=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isPreview=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", sellingPointsHeaderBubble=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1755330vmN
    public final List<Image> getImages() {
        return this.LL;
    }

    public C1762030vxB(List<Image> list, int i, boolean z, List<ProductBannerLabel> list2, DynamicSellingPointsBase dynamicSellingPointsBase, List<MediaItem> list3, Integer num, EntranceBubble entranceBubble, Boolean bool, SeaPdpSellingPointsGroup seaPdpSellingPointsGroup) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = list2;
        this.LLILZIL = dynamicSellingPointsBase;
        this.LLILZLL = list3;
        this.LLIZ = num;
        this.LLIZLLLIL = entranceBubble;
        this.LLJ = bool;
        this.LLJI = seaPdpSellingPointsGroup;
    }
}

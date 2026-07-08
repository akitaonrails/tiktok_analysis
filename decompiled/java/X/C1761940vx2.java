package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761940vx2 implements InterfaceC0148002o {
    public final List<CarouselElement> LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final boolean LLILZ;
    public final PromotionWaist LLILZIL;
    public final int LLILZLL;
    public final C291001Au<Integer> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1761940vx2)) {
            return false;
        }
        C1761940vx2 c1761940vx2 = (C1761940vx2) obj;
        return Intrinsics.LJFF(this.LL, c1761940vx2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1761940vx2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1761940vx2.LLILLL) && this.LLILZ == c1761940vx2.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1761940vx2.LLILZIL) && this.LLILZLL == c1761940vx2.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1761940vx2.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        PromotionWaist promotionWaist = this.LLILZIL;
        int iHashCode4 = (((iHashCode3 + (promotionWaist == null ? 0 : promotionWaist.hashCode())) * 31) + this.LLILZLL) * 31;
        C291001Au<Integer> c291001Au = this.LLIZ;
        return iHashCode4 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpCarouselState(carouselElements=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", defaultSelectedElementId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", defaultSelectedIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInFullScreen=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", promotionWaist=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", currentCarouselPosition=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onPageSelected=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1761940vx2(List<CarouselElement> list, String str, Integer num, boolean z, PromotionWaist promotionWaist, int i, C291001Au<Integer> c291001Au) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = z;
        this.LLILZIL = promotionWaist;
        this.LLILZLL = i;
        this.LLIZ = c291001Au;
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C703402oq {
    public final C953503o5 LIZ;
    public final PromotionLabelVO LIZIZ;
    public final SeaSkuPanelWaistBanner LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C703402oq() {
        this((C953503o5) null, (PromotionLabelVO) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703402oq)) {
            return false;
        }
        C703402oq c703402oq = (C703402oq) obj;
        return Intrinsics.LJFF(this.LIZ, c703402oq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c703402oq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c703402oq.LIZJ);
    }

    public final int hashCode() {
        C953503o5 c953503o5 = this.LIZ;
        int iHashCode = (c953503o5 == null ? 0 : c953503o5.hashCode()) * 31;
        PromotionLabelVO promotionLabelVO = this.LIZIZ;
        int iHashCode2 = (iHashCode + (promotionLabelVO == null ? 0 : promotionLabelVO.hashCode())) * 31;
        SeaSkuPanelWaistBanner seaSkuPanelWaistBanner = this.LIZJ;
        return iHashCode2 + (seaSkuPanelWaistBanner != null ? seaSkuPanelWaistBanner.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaOneStepProductInfo(priceData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", promotionLabelInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", skuPanelWaistBanner=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C703402oq(C953503o5 c953503o5, PromotionLabelVO promotionLabelVO, int i) {
        this((i & 1) != 0 ? null : c953503o5, (i & 2) != 0 ? null : promotionLabelVO, (SeaSkuPanelWaistBanner) null);
    }

    public C703402oq(C953503o5 c953503o5, PromotionLabelVO promotionLabelVO, SeaSkuPanelWaistBanner seaSkuPanelWaistBanner) {
        this.LIZ = c953503o5;
        this.LIZIZ = promotionLabelVO;
        this.LIZJ = seaSkuPanelWaistBanner;
    }
}

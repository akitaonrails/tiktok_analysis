package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;

/* JADX INFO: renamed from: X.03ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C952803ny {
    public final SeaPdpViewModel LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Integer LIZ() {
        String[] strArr;
        PdpShipping pdpShipping;
        List<LogisticDTO> list;
        LogisticDTO logisticDTO;
        Boolean bool;
        Integer num;
        List<SkuItem> list2;
        SkuPanelState skuPanelState = this.LIZ.LLJILJIL;
        ?? BooleanValue = 0;
        BooleanValue = 0;
        BooleanValue = 0;
        BooleanValue = 0;
        BooleanValue = 0;
        if (skuPanelState == null || (strArr = skuPanelState.checkedSkuIds) == null) {
            return 0;
        }
        String strLIZ = C036I.LIZ(strArr);
        ProductPackStruct productPackStruct = this.LIZ.LLJIJIL;
        SkuItem skuItemLIZJ = (productPackStruct == null || (list2 = productPackStruct.skus) == null) ? null : C731902tR.LIZJ(strLIZ, list2);
        SkuPanelState skuPanelState2 = this.LIZ.LLJILJIL;
        C10380044c c10380044cLIZ = this.LIZ.LLLJ.LIZ(C03KN.LIZ(Integer.valueOf((skuPanelState2 == null || (num = skuPanelState2.productQuantity) == null) ? 1 : num.intValue()), skuItemLIZJ != null ? skuItemLIZJ.skuId : null, this.LIZ.RH2()));
        if (c10380044cLIZ != null && (pdpShipping = c10380044cLIZ.LIZJ) != null && (list = pdpShipping.logistics) != null && (logisticDTO = (LogisticDTO) C13LP.LJJJLL(list)) != null && (bool = logisticDTO.freeShipping) != null) {
            BooleanValue = bool.booleanValue();
        }
        return Integer.valueOf((int) BooleanValue);
    }

    public C952803ny(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public final void LIZIZ(Context context, String str) {
        if (context == null) {
            C1AF0.LIZJ("Open shipping failed. Context is NULL");
            return;
        }
        SeaPdpViewModel seaPdpViewModel = this.LIZ;
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        seaPdpViewModel.LLJJJJ = C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C952703nx(this, context, str, null), 2);
    }

    public final void LIZJ(int i, String str) {
        if (str != null && str.length() != 0) {
            DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.LIZ.LLJILLL;
            if (packedDeliverySelectResult == null) {
                packedDeliverySelectResult = new DeliveryPanelStarter.PackedDeliverySelectResult(null, null, null, null, null, null, Boolean.FALSE, null, null);
            }
            this.LIZ.LLJILLL = DeliveryPanelStarter.PackedDeliverySelectResult.LIZ(packedDeliverySelectResult, str);
            C973303rH c973303rH = C973303rH.LL;
            Integer numValueOf = Integer.valueOf(i);
            c973303rH.getClass();
            C973303rH.LJIIIIZZ(numValueOf, str);
        }
    }
}

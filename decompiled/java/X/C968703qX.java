package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.List;

/* JADX INFO: renamed from: X.03qX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C968703qX {
    public final PdpViewModel LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final Integer LIZ() {
        String[] strArr;
        PdpShipping pdpShipping;
        List<LogisticDTO> list;
        LogisticDTO logisticDTO;
        Boolean bool;
        Integer num;
        List<SkuItem> list2;
        SkuPanelState skuPanelStatePv0 = this.LIZ.Pv0();
        ?? BooleanValue = 0;
        BooleanValue = 0;
        BooleanValue = 0;
        BooleanValue = 0;
        BooleanValue = 0;
        if (skuPanelStatePv0 == null || (strArr = skuPanelStatePv0.checkedSkuIds) == null) {
            return 0;
        }
        String strLIZ = C968903qZ.LIZ(strArr);
        ProductPackStruct productPackStruct = this.LIZ.LLJILLL;
        SkuItem skuItem = (productPackStruct == null || (list2 = productPackStruct.skus) == null) ? null : (SkuItem) C04AW.LJ(strLIZ, list2);
        SkuPanelState skuPanelStatePv02 = this.LIZ.Pv0();
        int iIntValue = (skuPanelStatePv02 == null || (num = skuPanelStatePv02.productQuantity) == null) ? 1 : num.intValue();
        C996403v0 c996403v0 = C043B.LJJ;
        SkuPanelState skuPanelStatePv03 = this.LIZ.Pv0();
        ProductPackStruct productPackStruct2 = this.LIZ.LLJILLL;
        c996403v0.getClass();
        C996103ux c996103uxLIZ = this.LIZ.LLLIZZ.LIZ(C968803qY.LIZ(Integer.valueOf(iIntValue), Integer.valueOf(C996403v0.LIZ(productPackStruct2, skuPanelStatePv03)), skuItem != null ? skuItem.skuId : null, this.LIZ.RH2()));
        if (c996103uxLIZ != null && (pdpShipping = c996103uxLIZ.LIZJ) != null && (list = pdpShipping.logistics) != null && (logisticDTO = (LogisticDTO) C13LP.LJJJLL(list)) != null && (bool = logisticDTO.freeShipping) != null) {
            BooleanValue = bool.booleanValue();
        }
        return Integer.valueOf((int) BooleanValue);
    }

    public C968703qX(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LIZIZ(Context context, String str, String str2) {
        if (context == null) {
            C1AF0.LIZJ("Open shipping failed. Context is NULL");
            return;
        }
        PdpViewModel pdpViewModel = this.LIZ;
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        pdpViewModel.LLJJL = C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C968303qT(this, str2, context, str, null), 2);
    }
}

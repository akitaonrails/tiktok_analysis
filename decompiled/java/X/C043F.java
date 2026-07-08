package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.PreAddCartItemData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.List;

/* JADX INFO: renamed from: X.043F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043F {
    public static final GetPreloadCartInfoRequest LIZ(PdpViewModel pdpViewModel) {
        String str;
        String strLIZ;
        List<NextRequestScene> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        SkuPanelState skuPanelStatePv0 = pdpViewModel.Pv0();
        String strLJIIIIZZ = null;
        if (skuPanelStatePv0 != null) {
            str = skuPanelStatePv0.skuId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer numValueOf = Integer.valueOf(C043M.PDP.getValue());
        ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
        if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
            strLIZ = C043O.LIZ(list, C0NL6.PRE_CART_INFO);
        } else {
            strLIZ = null;
        }
        PreAddCartItemData preAddCartItemData = new PreAddCartItemData(AnonymousClass0435.LIZ(pdpViewModel, null), strLIZ);
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        if (pageSourceInfoLJ != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
        }
        return new GetPreloadCartInfoRequest(numValueOf, preAddCartItemData, strLJIIIIZZ, 25, pdpViewModel.RH2(), strLIZIZ);
    }
}

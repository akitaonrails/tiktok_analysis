package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.PreAddCartItemData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0436, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0436 {
    public static final GetPreloadCartInfoRequest LIZIZ(SeaPdpViewModel seaPdpViewModel) {
        String strLIZ;
        List<NextRequestScene> list;
        Integer numValueOf = Integer.valueOf(C043M.PDP.getValue());
        ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
        String strLJIIIIZZ = null;
        if (productPackStruct != null && (list = productPackStruct.nextRequestScenes) != null) {
            C10481047z c10481047z = C10478047w.LIZ;
            strLIZ = C10478047w.LIZ(list, C0NL6.PRE_CART_INFO);
        } else {
            strLIZ = null;
        }
        PreAddCartItemData preAddCartItemData = new PreAddCartItemData(LIZ(null, seaPdpViewModel), strLIZ);
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        if (pageSourceInfoLJ != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
        }
        return new GetPreloadCartInfoRequest(numValueOf, preAddCartItemData, strLJIIIIZZ, 25, seaPdpViewModel.RH2(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest LIZ(android.view.View r42, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r43) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0436.LIZ(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel):com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest");
    }
}

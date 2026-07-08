package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C953003o0 {
    public static Integer LIZ(SkuPanelState skuPanelState, String str, int i, Function0 function0) {
        SkuVoucher skuVoucher = null;
        Integer numLJIIIIZZ = C928203k0.LIZ.LJIIIIZZ(str, i, 0, function0, 0, null, 0);
        if (C953203o2.LIZIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_pdp_to_osp_preload_full_data", true, false) && numLJIIIIZZ == null) {
            SkuVoucher skuVoucher2 = null;
            if (skuPanelState != null) {
                skuVoucher = skuPanelState.voucherInfo;
            }
            List listLIZ = C732802ta.LIZ(skuVoucher);
            if (listLIZ == null || listLIZ.isEmpty()) {
                if (skuPanelState != null) {
                    skuVoucher2 = skuPanelState.voucherInfo;
                }
                List listLIZIZ = C732802ta.LIZIZ(skuVoucher2);
                if (listLIZIZ == null || listLIZIZ.isEmpty()) {
                    return 1;
                }
            }
        }
        return C953203o2.LIZLLL().preloadType;
    }
}

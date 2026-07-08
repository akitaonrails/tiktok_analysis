package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.043g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10358043g {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C044M c044m) {
        String str;
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelBaseReusedAssem) c044m).getViewModel().LLJI;
        if (skuEnterParams == null || (str = skuEnterParams.productId) == null) {
            str = "";
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_sku_panel_operated", C1741890vQh.LJIIIIZZ(new SkuPanelStarter.SkuOperationParams(str, 1)));
    }
}

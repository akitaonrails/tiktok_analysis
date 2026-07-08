package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;

/* JADX INFO: renamed from: X.03v0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C996403v0 {
    public static final /* synthetic */ C996403v0 LIZ = new C996403v0();

    public static int LIZ(ProductPackStruct productPackStruct, SkuPanelState skuPanelState) {
        ProductBase productBase;
        Integer num;
        Integer num2;
        if (skuPanelState != null && (num2 = skuPanelState.purchaseMethod) != null) {
            return num2.intValue();
        }
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (num = productBase.defaultSelectedPurchaseType) != null) {
            return num.intValue();
        }
        return 0;
    }
}

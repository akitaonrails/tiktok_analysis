package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0veO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1750380veO extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "product_info", nestedClassType = InterfaceC1750350veL.class, required = true)
    InterfaceC1750350veL getProductInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "seller_info", nestedClassType = InterfaceC1750390veP.class, required = true)
    InterfaceC1750390veP getSellerInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "share_deeplink", required = true)
    String getShareDeeplink();
}

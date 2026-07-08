package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.03Qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC840903Qh extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "currency", required = false)
    String getCurrency();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "price", required = false)
    String getPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", required = false)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "selectedSkuInfo", nestedClassType = InterfaceC841203Qk.class, required = false)
    InterfaceC841203Qk getSelectedSkuInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sellerId", required = false)
    String getSellerId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "currency", required = false)
    void setCurrency(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "price", required = false)
    void setPrice(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "productId", required = false)
    void setProductId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "selectedSkuInfo", nestedClassType = InterfaceC841203Qk.class, required = false)
    void setSelectedSkuInfo(InterfaceC841203Qk interfaceC841203Qk);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sellerId", required = false)
    void setSellerId(String str);
}

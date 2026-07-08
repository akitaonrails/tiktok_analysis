package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.03Qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC841203Qk extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "skuAmount", required = false)
    String getSkuAmount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "skuCurrency", required = false)
    String getSkuCurrency();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "skuId", required = false)
    String getSkuId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "skuPrice", required = false)
    String getSkuPrice();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "skuAmount", required = false)
    void setSkuAmount(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "skuCurrency", required = false)
    void setSkuCurrency(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "skuId", required = false)
    void setSkuId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "skuPrice", required = false)
    void setSkuPrice(String str);
}

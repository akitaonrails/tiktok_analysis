package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0x4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1804960x4Q extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "currency", required = false)
    String getCurrency();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "diamondCount", required = false)
    Number getDiamondCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "diamondId", required = false)
    Number getDiamondId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "givingCount", required = false)
    Number getGivingCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "iapId", required = false)
    String getIapId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "multiCurrencyPrice", required = false)
    String getMultiCurrencyPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "originalPrice", required = false)
    Number getOriginalPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "price", required = false)
    String getPrice();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "currency", required = false)
    void setCurrency(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "diamondCount", required = false)
    void setDiamondCount(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "diamondId", required = false)
    void setDiamondId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "givingCount", required = false)
    void setGivingCount(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "iapId", required = false)
    void setIapId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "multiCurrencyPrice", required = false)
    void setMultiCurrencyPrice(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "originalPrice", required = false)
    void setOriginalPrice(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "price", required = false)
    void setPrice(String str);
}

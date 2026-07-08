package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1791330wiR extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "price", required = true)
    String getPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "priceAmountMicros", required = true)
    Number getPriceAmountMicros();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "priceCurrencyCode", required = true)
    String getPriceCurrencyCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "recurrenceMode", required = true)
    Number getRecurrenceMode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "price", required = true)
    void setPrice(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "priceAmountMicros", required = true)
    void setPriceAmountMicros(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "priceCurrencyCode", required = true)
    void setPriceCurrencyCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "recurrenceMode", required = true)
    void setRecurrenceMode(Number number);
}

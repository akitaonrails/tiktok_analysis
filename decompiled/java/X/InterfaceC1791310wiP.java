package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1791310wiP extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "basePlanId", required = false)
    String getBasePlanId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientPayload", required = true)
    String getClientPayload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "countryCode", required = true)
    String getCountryCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "description", required = true)
    String getDescription();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "offerId", required = false)
    String getOfferId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "offerToken", required = false)
    String getOfferToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prices", nestedClassType = InterfaceC1791330wiR.class, required = true)
    List<InterfaceC1791330wiR> getPrices();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", required = true)
    String getProductId();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "productType", required = true)
    @InterfaceC1909307dr(option = {"inapp", "subs"})
    String getProductType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "purchaseOptionId", required = false)
    String getPurchaseOptionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "basePlanId", required = false)
    void setBasePlanId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientPayload", required = true)
    void setClientPayload(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "countryCode", required = true)
    void setCountryCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "description", required = true)
    void setDescription(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "offerId", required = false)
    void setOfferId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "offerToken", required = false)
    void setOfferToken(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "prices", nestedClassType = InterfaceC1791330wiR.class, required = true)
    void setPrices(List<? extends InterfaceC1791330wiR> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "productId", required = true)
    void setProductId(String str);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "productType", required = true)
    @InterfaceC1909307dr(option = {"inapp", "subs"})
    void setProductType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "purchaseOptionId", required = false)
    void setPurchaseOptionId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "title", required = true)
    void setTitle(String str);
}

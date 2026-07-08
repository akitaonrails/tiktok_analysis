package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1AWC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface C1AWC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "campaignInfo", required = false)
    String getCampaignInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "chargeReason", required = false)
    String getChargeReason();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFromMerge", required = false)
    String getEnterFromMerge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "exchangeParams", nestedClassType = C1AWE.class, required = false)
    C1AWE getExchangeParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftEnterFrom", required = false)
    String getGiftEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "notificationType", required = false)
    String getNotificationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "profilePosition", required = false)
    String getProfilePosition();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "recommendationPage", required = false)
    Boolean getRecommendationPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestPage", required = false)
    String getRequestPage();
}

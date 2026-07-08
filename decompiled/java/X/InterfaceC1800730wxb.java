package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1800730wxb extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "campaignInfo", required = true)
    String getCampaignInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "deliverableId", required = true)
    String getDeliverableId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sparkAdsAuth", required = false)
    String getSparkAdsAuth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "submitText", nestedClassType = InterfaceC1800720wxa.class, required = false)
    InterfaceC1800720wxa getSubmitText();
}

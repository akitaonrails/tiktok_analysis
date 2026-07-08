package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1Aws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2195881Aws extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "subscription_id", required = false)
    String getSubscriptionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trade_order_id", required = false)
    String getTradeOrderId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "subscription_id", required = false)
    void setSubscriptionId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "trade_order_id", required = false)
    void setTradeOrderId(String str);
}

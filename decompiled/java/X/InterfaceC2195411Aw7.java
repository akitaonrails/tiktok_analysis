package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1Aw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2195411Aw7 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tier_id", required = true)
    String getTierId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trade_order_id", required = true)
    String getTradeOrderId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tier_id", required = true)
    void setTierId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "trade_order_id", required = true)
    void setTradeOrderId(String str);
}

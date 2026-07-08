package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1791440wic extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "iapErrorCode", required = false)
    Number getIapErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "iapErrorMessage", required = false)
    String getIapErrorMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "orderId", required = false)
    String getOrderId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", required = false)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "resultState", required = true)
    Number getResultState();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "iapErrorCode", required = false)
    void setIapErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "iapErrorMessage", required = false)
    void setIapErrorMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orderId", required = false)
    void setOrderId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "productId", required = false)
    void setProductId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "resultState", required = true)
    void setResultState(Number number);
}

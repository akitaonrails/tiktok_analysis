package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1791970wjT extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = InterfaceC1791990wjV.class, required = false)
    InterfaceC1791990wjV getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "orderId", required = false)
    String getOrderId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = InterfaceC1791990wjV.class, required = false)
    void setError(InterfaceC1791990wjV interfaceC1791990wjV);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orderId", required = false)
    void setOrderId(String str);
}

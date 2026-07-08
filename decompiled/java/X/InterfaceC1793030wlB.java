package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1793030wlB extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorInfo", nestedClassType = InterfaceC1793040wlC.class, required = false)
    InterfaceC1793040wlC getErrorInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "inAppClientData", nestedClassType = InterfaceC1793050wlD.class, required = false)
    InterfaceC1793050wlD getInAppClientData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "products", required = false)
    Object getProducts();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorInfo", nestedClassType = InterfaceC1793040wlC.class, required = false)
    void setErrorInfo(InterfaceC1793040wlC interfaceC1793040wlC);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "inAppClientData", nestedClassType = InterfaceC1793050wlD.class, required = false)
    void setInAppClientData(InterfaceC1793050wlD interfaceC1793050wlD);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "products", required = false)
    void setProducts(Object obj);
}

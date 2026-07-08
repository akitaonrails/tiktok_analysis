package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1791890wjL extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorInfo", nestedClassType = InterfaceC1791900wjM.class, required = false)
    InterfaceC1791900wjM getErrorInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "orderID", required = false)
    String getOrderID();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorInfo", nestedClassType = InterfaceC1791900wjM.class, required = false)
    void setErrorInfo(InterfaceC1791900wjM interfaceC1791900wjM);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orderID", required = false)
    void setOrderID(String str);
}

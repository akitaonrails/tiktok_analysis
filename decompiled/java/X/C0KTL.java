package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.0KTL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0KTL extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "allowedPath", primitiveClassType = Number.class, required = false)
    List<Number> getAllowedPath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "entitlementState", required = false)
    Number getEntitlementState();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = false)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "precheckStatus", required = false)
    Number getPrecheckStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productID", required = false)
    String getProductID();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "allowedPath", primitiveClassType = Number.class, required = false)
    void setAllowedPath(List<? extends Number> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "entitlementState", required = false)
    void setEntitlementState(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "message", required = false)
    void setMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "precheckStatus", required = false)
    void setPrecheckStatus(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "productID", required = false)
    void setProductID(String str);
}

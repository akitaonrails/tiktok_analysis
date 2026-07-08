package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1791360wiU extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "basePlanId", required = false)
    String getBasePlanId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = true)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "preCheckResult", required = true)
    Number getPreCheckResult();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", required = false)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subAllowPath", primitiveClassType = Number.class, required = false)
    List<Number> getSubAllowPath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subState", required = false)
    Number getSubState();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "basePlanId", required = false)
    void setBasePlanId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "message", required = true)
    void setMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "preCheckResult", required = true)
    void setPreCheckResult(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "productId", required = false)
    void setProductId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "subAllowPath", primitiveClassType = Number.class, required = false)
    void setSubAllowPath(List<? extends Number> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "subState", required = false)
    void setSubState(Number number);
}

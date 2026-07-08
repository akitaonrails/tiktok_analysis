package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0e7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040E
public interface InterfaceC1076740e7s extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "orderAttribute", required = true)
    Map<String, Object> getOrderAttribute();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "orderAttributeDebugInfo", required = true)
    Map<String, Object> getOrderAttributeDebugInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orderAttribute", required = true)
    void setOrderAttribute(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orderAttributeDebugInfo", required = true)
    void setOrderAttributeDebugInfo(Map<String, ? extends Object> map);
}

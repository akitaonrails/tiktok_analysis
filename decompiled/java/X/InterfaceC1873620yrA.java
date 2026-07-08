package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1873620yrA extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "displayStatusMap", required = false)
    Map<String, Object> getDisplayStatusMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", nestedClassType = InterfaceC1873610yr9.class, required = true)
    InterfaceC1873610yr9 getResponse();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "displayStatusMap", required = false)
    void setDisplayStatusMap(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", nestedClassType = InterfaceC1873610yr9.class, required = true)
    void setResponse(InterfaceC1873610yr9 interfaceC1873610yr9);
}

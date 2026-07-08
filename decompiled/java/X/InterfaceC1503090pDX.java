package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1503090pDX extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientCode", required = false)
    Number getClientCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePath", required = true)
    String getFilePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "httpCode", required = true)
    Number getHttpCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", required = false)
    Map<String, Object> getResponse();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientCode", required = false)
    void setClientCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "filePath", required = true)
    void setFilePath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "header", required = false)
    void setHeader(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "httpCode", required = true)
    void setHttpCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", required = false)
    void setResponse(Map<String, ? extends Object> map);
}

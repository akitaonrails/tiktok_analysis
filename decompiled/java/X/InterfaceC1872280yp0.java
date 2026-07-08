package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1872280yp0 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientCode", required = false)
    Number getClientCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "httpCode", required = true)
    Number getHttpCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rawResponse", required = false)
    String getRawResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", required = true)
    Object getResponse();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "responseType", required = false)
    @InterfaceC1909307dr(option = {"arraybuffer", "base64"})
    String getResponseType();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientCode", required = false)
    void setClientCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "header", required = false)
    void setHeader(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "httpCode", required = true)
    void setHttpCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "rawResponse", required = false)
    void setRawResponse(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", required = true)
    void setResponse(Object obj);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "responseType", required = false)
    @InterfaceC1909307dr(option = {"arraybuffer", "base64"})
    void setResponseType(String str);
}

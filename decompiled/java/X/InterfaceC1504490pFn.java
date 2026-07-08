package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1504490pFn extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = true)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "httpCode", required = true)
    Number getHttpCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", required = true)
    Map<String, Object> getResponse();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "header", required = true)
    void setHeader(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "httpCode", required = true)
    void setHttpCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", required = true)
    void setResponse(Map<String, ? extends Object> map);
}

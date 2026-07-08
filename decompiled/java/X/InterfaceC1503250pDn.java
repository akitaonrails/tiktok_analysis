package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1503250pDn extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientCode", required = false)
    Number getClientCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", required = false)
    Map<String, Object> getResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientCode", required = false)
    void setClientCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", required = false)
    void setResponse(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uri", required = false)
    void setUri(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "url", required = false)
    void setUrl(String str);
}

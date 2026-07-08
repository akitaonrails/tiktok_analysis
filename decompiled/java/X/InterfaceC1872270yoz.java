package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0yoz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1872270yoz extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "body", required = false)
    Object getBody();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "bodyType", required = false)
    @InterfaceC1909307dr(option = {"base64"})
    String getBodyType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "disableRedirect", required = false)
    Boolean getDisableRedirect();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "jsonFormatOption", required = false)
    Number getJsonFormatOption();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "method", required = true)
    @InterfaceC1909307dr(option = {"GET", "POST"})
    String getMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}

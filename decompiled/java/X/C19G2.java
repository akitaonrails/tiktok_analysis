package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.19G2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C040E
public interface C19G2 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFilePath", required = false)
    String getTempFilePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFilePath", required = false)
    void setTempFilePath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uri", required = false)
    void setUri(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "url", required = false)
    void setUrl(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.167Z, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public interface C167Z extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = true)
    String getPath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    String getSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uri", required = true)
    String getUri();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "path", required = true)
    void setPath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = true)
    void setSize(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uri", required = true)
    void setUri(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "url", required = true)
    void setUrl(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.14WN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public interface C14WN extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "base64Data", required = true)
    String getBase64Data();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mediaType", required = true)
    String getMediaType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mimeType", required = true)
    String getMimeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    Number getSize();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "base64Data", required = true)
    void setBase64Data(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "mediaType", required = true)
    void setMediaType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "mimeType", required = true)
    void setMimeType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = true)
    void setSize(Number number);
}

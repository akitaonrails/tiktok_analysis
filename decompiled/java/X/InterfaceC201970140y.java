package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.140y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public interface InterfaceC201970140y extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "base64Data", required = false)
    String getBase64Data();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePath", required = false)
    String getFilePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "identifier", required = false)
    String getIdentifier();

    @InterfaceC1909207dq(option = {1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "mediaType", required = false)
    Number getMediaType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mimeType", required = false)
    String getMimeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = false)
    Number getSize();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "base64Data", required = false)
    void setBase64Data(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "filePath", required = false)
    void setFilePath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "identifier", required = false)
    void setIdentifier(String str);

    @InterfaceC1909207dq(option = {1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "mediaType", required = false)
    void setMediaType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "mimeType", required = false)
    void setMimeType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = false)
    void setSize(Number number);
}

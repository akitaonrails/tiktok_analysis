package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.14UR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public interface C14UR extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "base64Data", required = false)
    String getBase64Data();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "mediaType", required = true)
    @InterfaceC1909307dr(option = {"image", "video"})
    String getMediaType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mimeType", required = false)
    String getMimeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    Number getSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFileAbsolutePath", required = false)
    String getTempFileAbsolutePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFilePath", required = true)
    String getTempFilePath();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "base64Data", required = false)
    void setBase64Data(String str);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "mediaType", required = true)
    @InterfaceC1909307dr(option = {"image", "video"})
    void setMediaType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "mimeType", required = false)
    void setMimeType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = true)
    void setSize(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFileAbsolutePath", required = false)
    void setTempFileAbsolutePath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFilePath", required = true)
    void setTempFilePath(String str);
}

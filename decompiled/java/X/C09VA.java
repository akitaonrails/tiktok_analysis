package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.09VA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public interface C09VA extends XBaseModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "mediaSource", required = true)
    @InterfaceC1909307dr(option = {"album", "camera"})
    String getMediaSource();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "mediaType", required = true)
    @InterfaceC1909307dr(option = {"image", "video"})
    String getMediaType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mimeType", required = false)
    String getMimeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    Number getSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "techParams", required = false)
    String getTechParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFileAbsolutePath", required = false)
    String getTempFileAbsolutePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFilePath", required = true)
    String getTempFilePath();

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "mediaSource", required = true)
    @InterfaceC1909307dr(option = {"album", "camera"})
    void setMediaSource(String str);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "mediaType", required = true)
    @InterfaceC1909307dr(option = {"image", "video"})
    void setMediaType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "mimeType", required = false)
    void setMimeType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = true)
    void setSize(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "techParams", required = false)
    void setTechParams(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFileAbsolutePath", required = false)
    void setTempFileAbsolutePath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFilePath", required = true)
    void setTempFilePath(String str);
}

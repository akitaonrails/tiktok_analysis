package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.14VC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface C14VC extends XBaseParamModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "cameraType", required = false)
    @InterfaceC1909307dr(option = {"front", "back"})
    String getCameraType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "compressConfig", required = false)
    String getCompressConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "compressHeight", required = false)
    Number getCompressHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "compressWidth", required = false)
    Number getCompressWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxCount", required = false)
    Number getMaxCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mediaTypes", primitiveClassType = String.class, required = false)
    List<String> getMediaTypes();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "saveToPhotoAlbum", required = false)
    Boolean getSaveToPhotoAlbum();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourceType", primitiveClassType = String.class, required = false)
    List<String> getSourceType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = false)
    String getTrackParams();
}

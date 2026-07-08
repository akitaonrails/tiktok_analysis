package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.14Uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface InterfaceC20273314Uh extends XBaseParamModel {
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "", type = DefaultType.STRING), isEnum = true, isGetter = true, keyPath = "cameraType", required = false)
    @InterfaceC1909307dr(option = {"", "back", "front"})
    String getCameraType();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "compressHeight", required = false)
    Number getCompressHeight();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "compressImage", required = false)
    boolean getCompressImage();

    @InterfaceC1909207dq(option = {0, 1, 2, 3, 4})
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "compressOption", required = false)
    Number getCompressOption();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 100, type = DefaultType.INT), isGetter = true, keyPath = "compressQuality", required = false)
    Number getCompressQuality();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "compressWidth", required = false)
    Number getCompressWidth();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "cropRatioHeight", required = false)
    Number getCropRatioHeight();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "cropRatioWidth", required = false)
    Number getCropRatioWidth();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 1, type = DefaultType.INT), isGetter = true, keyPath = "maxCount", required = false)
    Number getMaxCount();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "mediaTypes", primitiveClassType = String.class, required = true)
    @InterfaceC1909307dr(option = {"image", "video"})
    List<String> getMediaTypes();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "needBase64Data", required = false)
    boolean getNeedBase64Data();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "permissionDenyAction", required = false)
    Number getPermissionDenyAction();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "saveToPhotoAlbum", required = false)
    boolean getSaveToPhotoAlbum();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shouldKeepOriginalFormat", required = false)
    Boolean getShouldKeepOriginalFormat();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "sourceType", required = true)
    @InterfaceC1909307dr(option = {"album", "camera"})
    String getSourceType();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "useNewCompressSolution", required = false)
    boolean getUseNewCompressSolution();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "isMultiSelect", required = false)
    boolean isMultiSelect();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "isNeedCut", required = false)
    boolean isNeedCut();
}

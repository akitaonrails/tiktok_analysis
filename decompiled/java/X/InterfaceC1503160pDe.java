package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1503160pDe extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "dataURL", required = true)
    String getDataURL();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "enableOverwrite", required = false)
    Number getEnableOverwrite();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extension", required = true)
    String getExtension();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filename", required = true)
    String getFilename();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "saveToAlbum", required = false)
    String getSaveToAlbum();
}

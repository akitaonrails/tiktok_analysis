package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.14WK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface C14WK extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cameraType", required = false)
    String getCameraType();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(intValue = 100, type = DefaultType.INT), isGetter = true, keyPath = "compressQuality", required = false)
    Number getCompressQuality();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nestedHost", required = true)
    boolean getNestedHost();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = false, type = DefaultType.BOOL), isGetter = true, keyPath = "isNeedPreview", required = false)
    boolean isNeedPreview();
}

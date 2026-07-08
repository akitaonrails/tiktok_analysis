package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1801690wz9 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cameraParams", nestedClassType = InterfaceC1801660wz6.class, required = false)
    InterfaceC1801660wz6 getCameraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "compressionQuality", required = false)
    Number getCompressionQuality();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourceType", required = true)
    String getSourceType();
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1B1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2198251B1r extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authConfig", nestedClassType = InterfaceC2198211B1n.class, required = true)
    InterfaceC2198211B1n getAuthConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePath", required = true)
    String getFilePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uploadConfig", nestedClassType = InterfaceC2198271B1t.class, required = false)
    InterfaceC2198271B1t getUploadConfig();
}

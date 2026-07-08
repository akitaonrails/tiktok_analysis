package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.1B1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2198111B1d extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authConfig", nestedClassType = InterfaceC2198201B1m.class, required = true)
    InterfaceC2198201B1m getAuthConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "currentUniqueId", required = true)
    String getCurrentUniqueId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePaths", primitiveClassType = String.class, required = true)
    List<String> getFilePaths();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uploadConfig", nestedClassType = InterfaceC2198181B1k.class, required = false)
    InterfaceC2198181B1k getUploadConfig();
}

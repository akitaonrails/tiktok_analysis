package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.1B1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2198101B1c extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authConfig", nestedClassType = InterfaceC2198191B1l.class, required = true)
    InterfaceC2198191B1l getAuthConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePaths", primitiveClassType = String.class, required = true)
    List<String> getFilePaths();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uploadConfig", nestedClassType = InterfaceC2198171B1j.class, required = false)
    InterfaceC2198171B1j getUploadConfig();
}

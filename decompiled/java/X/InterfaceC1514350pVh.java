package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1514350pVh extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "parameters", required = false)
    Map<String, Object> getParameters();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = true)
    String getPath();
}

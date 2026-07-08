package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC602770NkZ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "method", required = false)
    String getMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = true)
    String getPath();
}

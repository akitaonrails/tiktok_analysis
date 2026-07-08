package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1873420yqq extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "protocols", primitiveClassType = String.class, required = false)
    List<String> getProtocols();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}

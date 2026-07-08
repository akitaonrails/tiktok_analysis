package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Kb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface InterfaceC520480Kb8 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraPBConfig", nestedClassType = InterfaceC520630KbN.class, required = false)
    InterfaceC520630KbN getExtraPBConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "headers", required = false)
    Map<String, Object> getHeaders();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "method", required = true)
    String getMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(stringValue = "Json", type = DefaultType.STRING), isEnum = true, isGetter = true, keyPath = "preferredContentType", required = false)
    @InterfaceC1909307dr(option = {"Json", "Protobuf"})
    String getPreferredContentType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}

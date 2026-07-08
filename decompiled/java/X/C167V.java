package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.167V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface C167V extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imageList", primitiveClassType = String.class, required = true)
    List<String> getImageList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"base64", "path"})
    String getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09V9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface C09V9 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "header", required = false)
    Map<String, Object> getHeader();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "method", required = false)
    String getMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = false)
    String getPath();
}

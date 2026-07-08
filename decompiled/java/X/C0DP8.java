package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0DP8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C040E
public interface C0DP8 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", required = true)
    Map<String, Object> getResponse();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", required = true)
    void setResponse(Map<String, ? extends Object> map);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09VC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040E
public interface C09VC extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "response", required = false)
    Map<String, Object> getResponse();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "response", required = false)
    void setResponse(Map<String, ? extends Object> map);
}

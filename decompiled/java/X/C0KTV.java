package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KTV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KTV extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorInfo", required = false)
    Map<String, Object> getErrorInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorInfo", required = false)
    void setErrorInfo(Map<String, ? extends Object> map);
}

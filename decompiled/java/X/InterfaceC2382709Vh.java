package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09Vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C040E
public interface InterfaceC2382709Vh extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "result", required = true)
    Map<String, Object> getResult();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "result", required = true)
    void setResult(Map<String, ? extends Object> map);
}

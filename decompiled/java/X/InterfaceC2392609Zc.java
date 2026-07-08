package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09Zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C040E
public interface InterfaceC2392609Zc extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "originalResult", required = true)
    Map<String, Object> getOriginalResult();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "originalResult", required = true)
    void setOriginalResult(Map<String, ? extends Object> map);
}

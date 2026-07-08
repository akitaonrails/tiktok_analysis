package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Tke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C040E
public interface InterfaceC755700Tke extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "features", required = true)
    Map<String, Object> getFeatures();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "features", required = true)
    void setFeatures(Map<String, ? extends Object> map);
}

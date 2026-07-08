package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1800800wxi extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "local_service_passthrough_params", required = false)
    Map<String, Object> getLocalServicePassthroughParams();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "local_service_passthrough_params", required = false)
    void setLocalServicePassthroughParams(Map<String, ? extends Object> map);
}

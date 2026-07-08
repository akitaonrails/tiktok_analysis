package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0grv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040E
public interface InterfaceC1182170grv extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "queryMap", required = false)
    Map<String, Object> getQueryMap();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "queryMap", required = false)
    void setQueryMap(Map<String, ? extends Object> map);
}

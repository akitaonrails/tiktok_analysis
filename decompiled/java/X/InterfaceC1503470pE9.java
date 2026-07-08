package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1503470pE9 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "applist", required = true)
    Map<String, Object> getApplist();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_supported", required = true)
    Boolean isSupported();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "applist", required = true)
    void setApplist(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_supported", required = true)
    void setSupported(Boolean bool);
}

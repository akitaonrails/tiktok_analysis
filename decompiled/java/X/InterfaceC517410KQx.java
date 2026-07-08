package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface InterfaceC517410KQx extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "permissions", required = true)
    Map<String, Object> getPermissions();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAdmin", required = true)
    Boolean isAdmin();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isAdmin", required = true)
    void setAdmin(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "permissions", required = true)
    void setPermissions(Map<String, ? extends Object> map);
}

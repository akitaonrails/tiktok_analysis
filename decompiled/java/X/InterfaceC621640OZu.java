package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0OZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC621640OZu extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeItems", required = true)
    Map<String, Object> getAwemeItems();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "awemeItems", required = true)
    void setAwemeItems(Map<String, ? extends Object> map);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.05oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1465005oO extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "query_items", required = false)
    Map<String, Object> getQueryItems();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "query_items", required = false)
    void setQueryItems(Map<String, ? extends Object> map);
}

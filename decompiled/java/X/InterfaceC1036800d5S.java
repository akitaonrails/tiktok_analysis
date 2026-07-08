package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0d5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040E
public interface InterfaceC1036800d5S extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "item_id", required = false)
    String getItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "map_anchor_extra", required = false)
    String getMapAnchorExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "organic_log_extra", required = false)
    String getOrganicLogExtra();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "item_id", required = false)
    void setItemId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "map_anchor_extra", required = false)
    void setMapAnchorExtra(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "organic_log_extra", required = false)
    void setOrganicLogExtra(String str);
}

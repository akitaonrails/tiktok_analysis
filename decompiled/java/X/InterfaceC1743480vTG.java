package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0vTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1743480vTG extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "distance", required = true)
    Number getDistance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_bottom", required = true)
    Boolean is_bottom();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "distance", required = true)
    void setDistance(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_bottom", required = true)
    void set_bottom(Boolean bool);
}

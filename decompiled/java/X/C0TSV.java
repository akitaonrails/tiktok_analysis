package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0TSV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040E
public interface C0TSV extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enable_location", required = false)
    Number getEnableLocation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "inapp_is_precise", required = false)
    Number getInappIsPrecise();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "system_is_precise", required = false)
    Number getSystemIsPrecise();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_location_system_permission", required = false)
    Number isLocationSystemPermission();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enable_location", required = false)
    void setEnableLocation(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "inapp_is_precise", required = false)
    void setInappIsPrecise(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_location_system_permission", required = false)
    void setLocationSystemPermission(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "system_is_precise", required = false)
    void setSystemIsPrecise(Number number);
}

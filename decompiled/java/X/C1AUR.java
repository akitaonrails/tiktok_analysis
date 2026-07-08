package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1AUR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040E
public interface C1AUR extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "denied", nestedClassType = C1AUV.class, required = false)
    C1AUV getDenied();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enableLocation", required = false)
    Boolean getEnableLocation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "granted", nestedClassType = C1AUW.class, required = false)
    C1AUW getGranted();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "denied", nestedClassType = C1AUV.class, required = false)
    void setDenied(C1AUV c1auv);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enableLocation", required = false)
    void setEnableLocation(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "granted", nestedClassType = C1AUW.class, required = false)
    void setGranted(C1AUW c1auw);
}

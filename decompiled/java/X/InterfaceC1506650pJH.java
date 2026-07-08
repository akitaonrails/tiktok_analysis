package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1506650pJH extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "granted", required = false)
    Boolean getGranted();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userDetermined", required = false)
    Boolean getUserDetermined();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "granted", required = false)
    void setGranted(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userDetermined", required = false)
    void setUserDetermined(Boolean bool);
}

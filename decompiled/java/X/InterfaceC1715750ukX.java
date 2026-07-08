package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ukX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1715750ukX extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "biometricType", required = false)
    String getBiometricType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientBiometryDataTag", required = false)
    String getClientBiometryDataTag();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isDeviceReady", required = true)
    Boolean isDeviceReady();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isSettingReady", required = true)
    Boolean isSettingReady();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "biometricType", required = false)
    void setBiometricType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientBiometryDataTag", required = false)
    void setClientBiometryDataTag(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isDeviceReady", required = true)
    void setDeviceReady(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isSettingReady", required = true)
    void setSettingReady(Boolean bool);
}

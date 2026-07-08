package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0qUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1552150qUf extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "aid", required = true)
    Number getAid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_name", required = true)
    String getAppName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_version", required = true)
    String getAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "device_id", required = true)
    String getDeviceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "device_model", required = true)
    String getDeviceModel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "device_platform", required = true)
    String getDevicePlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "os", required = true)
    Number getOs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "os_version", required = true)
    String getOsVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "region", required = true)
    String getRegion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sdk_version", required = true)
    String getSdkVersion();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "aid", required = true)
    void setAid(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "app_name", required = true)
    void setAppName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "app_version", required = true)
    void setAppVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "device_id", required = true)
    void setDeviceId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "device_model", required = true)
    void setDeviceModel(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "device_platform", required = true)
    void setDevicePlatform(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "os", required = true)
    void setOs(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "os_version", required = true)
    void setOsVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "region", required = true)
    void setRegion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sdk_version", required = true)
    void setSdkVersion(String str);
}

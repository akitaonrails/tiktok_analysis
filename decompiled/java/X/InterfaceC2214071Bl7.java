package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1Bl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface InterfaceC2214071Bl7 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "appID", required = true)
    String getAppID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appName", required = true)
    String getAppName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appTheme", required = true)
    String getAppTheme();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appVersion", required = true)
    String getAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "carrier", required = true)
    String getCarrier();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channel", required = true)
    String getChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "deviceID", required = true)
    String getDeviceID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "deviceModel", required = true)
    String getDeviceModel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "devicePlatform", required = true)
    String getDevicePlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "exactAppID", required = true)
    String getExactAppID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "fullLanguage", required = true)
    String getFullLanguage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "idfa", required = false)
    String getIdfa();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "installID", required = true)
    String getInstallID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "language", required = true)
    String getLanguage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "netType", required = true)
    String getNetType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "networkType", required = true)
    String getNetworkType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "osVersion", required = true)
    String getOsVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "safeArea", nestedClassType = InterfaceC2214091Bl9.class, required = false)
    InterfaceC2214091Bl9 getSafeArea();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "screenHeight", required = true)
    Number getScreenHeight();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "screenOrientation", required = true)
    @InterfaceC1909307dr(option = {"landscape", "portrait"})
    String getScreenOrientation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "screenWidth", required = true)
    Number getScreenWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusBarHeight", required = true)
    Number getStatusBarHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "updateVersionCode", required = true)
    String getUpdateVersionCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is32Bit", required = true)
    Boolean is32Bit();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isTeenMode", required = true)
    Boolean isTeenMode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is32Bit", required = true)
    void set32Bit(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appID", required = true)
    void setAppID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appName", required = true)
    void setAppName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appTheme", required = true)
    void setAppTheme(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appVersion", required = true)
    void setAppVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "carrier", required = true)
    void setCarrier(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "channel", required = true)
    void setChannel(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "deviceID", required = true)
    void setDeviceID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "deviceModel", required = true)
    void setDeviceModel(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "devicePlatform", required = true)
    void setDevicePlatform(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "exactAppID", required = true)
    void setExactAppID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "fullLanguage", required = true)
    void setFullLanguage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "idfa", required = false)
    void setIdfa(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "installID", required = true)
    void setInstallID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "language", required = true)
    void setLanguage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "netType", required = true)
    void setNetType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "networkType", required = true)
    void setNetworkType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "osVersion", required = true)
    void setOsVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "safeArea", nestedClassType = InterfaceC2214091Bl9.class, required = false)
    void setSafeArea(InterfaceC2214091Bl9 interfaceC2214091Bl9);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "screenHeight", required = true)
    void setScreenHeight(Number number);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "screenOrientation", required = true)
    @InterfaceC1909307dr(option = {"landscape", "portrait"})
    void setScreenOrientation(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "screenWidth", required = true)
    void setScreenWidth(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusBarHeight", required = true)
    void setStatusBarHeight(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isTeenMode", required = true)
    void setTeenMode(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "updateVersionCode", required = true)
    void setUpdateVersionCode(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.1AQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040E
public interface C1AQ1 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "ac", required = false)
    String getAc();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "aid", required = true)
    String getAid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appName", required = true)
    String getAppName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appVersion", required = true)
    String getAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channel", required = false)
    String getChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = false)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "device_id", required = true)
    String getDeviceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "device_platform", required = false)
    String getDevicePlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "device_type", required = false)
    String getDeviceType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "idfa", required = false)
    String getIdfa();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ironManSupported", required = false)
    Number getIronManSupported();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "netType", required = true)
    String getNetType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "orientation", required = true)
    String getOrientation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "os_version", required = false)
    String getOsVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ret", required = false)
    String getRet();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "screenHeight", required = true)
    Number getScreenHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "screenWidth", required = true)
    Number getScreenWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sec_user_id", required = false)
    String getSecUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "supportList", primitiveClassType = String.class, required = false)
    List<String> getSupportList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "updateVersionCode", required = false)
    String getUpdateVersionCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user_id", required = true)
    String getUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "version_code", required = false)
    String getVersionCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAppBackground", required = true)
    Boolean isAppBackground();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isLowPowerMode", required = true)
    Boolean isLowPowerMode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ac", required = false)
    void setAc(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "aid", required = true)
    void setAid(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isAppBackground", required = true)
    void setAppBackground(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appName", required = true)
    void setAppName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appVersion", required = true)
    void setAppVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "channel", required = false)
    void setChannel(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = false)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "device_id", required = true)
    void setDeviceId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "device_platform", required = false)
    void setDevicePlatform(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "device_type", required = false)
    void setDeviceType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "idfa", required = false)
    void setIdfa(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ironManSupported", required = false)
    void setIronManSupported(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isLowPowerMode", required = true)
    void setLowPowerMode(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "netType", required = true)
    void setNetType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orientation", required = true)
    void setOrientation(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "os_version", required = false)
    void setOsVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ret", required = false)
    void setRet(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "screenHeight", required = true)
    void setScreenHeight(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "screenWidth", required = true)
    void setScreenWidth(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sec_user_id", required = false)
    void setSecUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "supportList", primitiveClassType = String.class, required = false)
    void setSupportList(List<String> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "updateVersionCode", required = false)
    void setUpdateVersionCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "user_id", required = true)
    void setUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "version_code", required = false)
    void setVersionCode(String str);
}

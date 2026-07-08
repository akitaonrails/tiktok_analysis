package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0dpm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040E
public interface InterfaceC1065520dpm extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "access_token", required = false)
    String getAccessToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "access_token_secret", required = false)
    String getAccessTokenSecret();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = false)
    String getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "platform", required = false)
    String getPlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "platform_app_id", required = false)
    String getPlatformAppId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "access_token", required = false)
    void setAccessToken(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "access_token_secret", required = false)
    void setAccessTokenSecret(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = false)
    void setCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "platform", required = false)
    void setPlatform(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "platform_app_id", required = false)
    void setPlatformAppId(String str);
}

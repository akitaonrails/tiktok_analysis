package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.1B1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface InterfaceC2198321B1y extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accessToken", required = false)
    String getAccessToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientId", required = true)
    String getClientId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = false)
    String getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "expried", required = false)
    String getExpried();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refreshToken", required = false)
    String getRefreshToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refreshTokenType", required = false)
    String getRefreshTokenType();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"cancel", "error", "success"})
    String getStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "accessToken", required = false)
    void setAccessToken(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientId", required = true)
    void setClientId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = false)
    void setCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "expried", required = false)
    void setExpried(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "refreshToken", required = false)
    void setRefreshToken(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "refreshTokenType", required = false)
    void setRefreshTokenType(String str);

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, required = true)
    @InterfaceC1909307dr(option = {"cancel", "error", "success"})
    void setStatus(String str);
}

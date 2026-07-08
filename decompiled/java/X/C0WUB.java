package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0WUB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C040E
public interface C0WUB extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authCode", required = true)
    String getAuthCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errCode", required = true)
    String getErrCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errMsg", required = true)
    String getErrMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "verifyCode", required = true)
    String getVerifyCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "authCode", required = true)
    void setAuthCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errCode", required = true)
    void setErrCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errMsg", required = true)
    void setErrMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "verifyCode", required = true)
    void setVerifyCode(String str);
}

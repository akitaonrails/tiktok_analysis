package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1E9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C040E
public interface InterfaceC2276761E9q extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionId", required = true)
    String getSessionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "settings", required = true)
    String getSettings();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sessionId", required = true)
    void setSessionId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "settings", required = true)
    void setSettings(String str);
}

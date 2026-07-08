package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0fAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1117080fAw extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = true)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sec_user_id", required = true)
    String getSecUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user_id", required = true)
    String getUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_login", required = true)
    Boolean isLogin();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_silent", required = true)
    Number isSilent();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = true)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_login", required = true)
    void setLogin(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sec_user_id", required = true)
    void setSecUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_silent", required = true)
    void setSilent(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "user_id", required = true)
    void setUserId(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ysr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1874670ysr extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasLoggedIn", required = true)
    Boolean getHasLoggedIn();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userInfo", nestedClassType = InterfaceC1874700ysu.class, required = false)
    InterfaceC1874700ysu getUserInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isLogin", required = true)
    Boolean isLogin();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "hasLoggedIn", required = true)
    void setHasLoggedIn(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isLogin", required = true)
    void setLogin(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userInfo", nestedClassType = InterfaceC1874700ysu.class, required = false)
    void setUserInfo(InterfaceC1874700ysu interfaceC1874700ysu);
}

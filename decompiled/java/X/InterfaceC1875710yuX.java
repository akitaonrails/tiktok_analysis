package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1875710yuX extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = true)
    String getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isLogin", required = true)
    Number isLogin();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isSuccess", required = true)
    Number isSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = true)
    void setData(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isLogin", required = true)
    void setLogin(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isSuccess", required = true)
    void setSuccess(Number number);
}

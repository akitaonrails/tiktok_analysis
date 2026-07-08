package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1791900wjM extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorDetailCode", required = true)
    Number getErrorDetailCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = true)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = true)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorDetailCode", required = true)
    void setErrorDetailCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = true)
    void setErrorMsg(String str);
}

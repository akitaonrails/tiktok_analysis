package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1799310wvJ extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorDomain", required = true)
    String getErrorDomain();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = true)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = true)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorDomain", required = true)
    void setErrorDomain(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = true)
    void setErrorMsg(String str);
}

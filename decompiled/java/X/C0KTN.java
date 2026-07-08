package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0KTN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0KTN extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMessage", required = false)
    String getErrorMessage();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMessage", required = false)
    void setErrorMessage(String str);
}

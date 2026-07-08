package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1B1T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1B1T extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMessage", required = false)
    String getErrorMessage();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMessage", required = false)
    void setErrorMessage(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0zBW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1886240zBW extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", required = true)
    String getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorDescription", required = true)
    String getErrorDescription();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", required = true)
    void setError(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = true)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorDescription", required = true)
    void setErrorDescription(String str);
}

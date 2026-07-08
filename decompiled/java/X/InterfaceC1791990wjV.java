package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1791990wjV extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = true)
    String getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = true)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = true)
    void setErrorCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = true)
    void setErrorMsg(String str);
}

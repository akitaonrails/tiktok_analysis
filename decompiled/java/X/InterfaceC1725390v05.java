package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0v05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1725390v05 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorReason", required = false)
    String getErrorReason();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = true)
    Boolean getSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorReason", required = false)
    void setErrorReason(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "success", required = true)
    void setSuccess(Boolean bool);
}

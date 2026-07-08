package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0v2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1726890v2V extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = true)
    String getSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "success", required = true)
    void setSuccess(String str);
}

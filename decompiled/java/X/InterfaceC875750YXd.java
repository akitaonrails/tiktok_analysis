package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0YXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040E
public interface InterfaceC875750YXd extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "checkCode", required = false)
    String getCheckCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "checkMsg", required = false)
    String getCheckMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraMsg", required = false)
    String getExtraMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logId", required = false)
    String getLogId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = false)
    String getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = true)
    Boolean getSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "checkCode", required = false)
    void setCheckCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "checkMsg", required = false)
    void setCheckMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "extraMsg", required = false)
    void setExtraMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "logId", required = false)
    void setLogId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = false)
    void setStatusCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "success", required = true)
    void setSuccess(Boolean bool);
}

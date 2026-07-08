package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0YXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040E
public interface InterfaceC875780YXg extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "checkCode", required = false)
    String getCheckCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "checkMsg", required = false)
    String getCheckMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = false)
    String getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logId", required = false)
    String getLogId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", nestedClassType = C0YYC.class, required = false)
    C0YYC getMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = false)
    String getStatusCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "checkCode", required = false)
    void setCheckCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "checkMsg", required = false)
    void setCheckMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "logId", required = false)
    void setLogId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", nestedClassType = C0YYC.class, required = false)
    void setMsg(C0YYC c0yyc);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = false)
    void setStatusCode(String str);
}

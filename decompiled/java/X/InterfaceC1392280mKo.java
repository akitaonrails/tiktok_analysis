package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0mKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040E
public interface InterfaceC1392280mKo extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "canReceiveReward", required = false)
    Boolean getCanReceiveReward();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "error_code", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "error_msg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_success", required = false)
    Boolean isSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "canReceiveReward", required = false)
    void setCanReceiveReward(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error_code", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error_msg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_success", required = false)
    void setSuccess(Boolean bool);
}

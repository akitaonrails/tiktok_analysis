package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1797480wsM extends XBaseResultModel {
    @InterfaceC1909207dq(option = {1, 0, -1, -2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "code", required = false)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isTransactionSettingOpen", required = false)
    Boolean isTransactionSettingOpen();

    @InterfaceC1909207dq(option = {1, 0, -1, -2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "code", required = false)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isTransactionSettingOpen", required = false)
    void setTransactionSettingOpen(Boolean bool);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.09VB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040E
public interface C09VB extends XBaseResultModel {
    @InterfaceC1909207dq(option = {1, 0, -1, -2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "code", required = true)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC1909207dq(option = {1, 0, -1, -2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "code", required = true)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);
}

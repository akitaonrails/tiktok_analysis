package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1879040yzu extends XBaseResultModel {
    @InterfaceC1909207dq(option = {1, 0})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "code", required = true)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = true)
    String getMsg();

    @InterfaceC1909207dq(option = {1, 0})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "code", required = true)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", required = true)
    void setMsg(String str);
}

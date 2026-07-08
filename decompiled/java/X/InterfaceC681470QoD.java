package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0QoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040E
public interface InterfaceC681470QoD extends XBaseResultModel {
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

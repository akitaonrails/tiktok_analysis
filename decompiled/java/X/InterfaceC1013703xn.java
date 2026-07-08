package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.03xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C040E
public interface InterfaceC1013703xn extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = false)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = false)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);
}

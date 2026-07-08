package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0lye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040E
public interface InterfaceC1378540lye extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "button", required = false)
    String getButton();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "share_code", required = false)
    Number getShareCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "button", required = false)
    void setButton(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "share_code", required = false)
    void setShareCode(Number number);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.06Ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1568606Ce extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cid", required = true)
    String getCid();

    @InterfaceC1909207dq(option = {1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "clickType", required = true)
    Number getClickType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "serverStatusCode", required = false)
    Number getServerStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "serverStatusMsg", required = false)
    String getServerStatusMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cid", required = true)
    void setCid(String str);

    @InterfaceC1909207dq(option = {1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "clickType", required = true)
    void setClickType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "serverStatusCode", required = false)
    void setServerStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "serverStatusMsg", required = false)
    void setServerStatusMsg(String str);
}

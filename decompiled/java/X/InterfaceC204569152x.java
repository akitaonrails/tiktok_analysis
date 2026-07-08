package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.152x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC204569152x extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errCode", required = true)
    Number getErrCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errMsg", required = true)
    String getErrMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errCode", required = true)
    void setErrCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errMsg", required = true)
    void setErrMsg(String str);
}

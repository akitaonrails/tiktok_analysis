package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.06fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1667706fz extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accountType", required = false)
    String getAccountType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "inboxMode", required = true)
    Number getInboxMode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "accountType", required = false)
    void setAccountType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "inboxMode", required = true)
    void setInboxMode(Number number);
}

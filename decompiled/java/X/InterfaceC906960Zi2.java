package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0Zi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040E
public interface InterfaceC906960Zi2 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "status_code", required = true)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "status_msg", required = true)
    String getStatusMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "status_code", required = true)
    void setStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "status_msg", required = true)
    void setStatusMsg(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.06DY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface C06DY extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = true)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusMsg", required = true)
    String getStatusMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = true)
    void setStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusMsg", required = true)
    void setStatusMsg(String str);
}

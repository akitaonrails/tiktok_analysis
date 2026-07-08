package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0Nix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC601770Nix extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "rawData", required = false)
    String getRawData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = false)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusMsg", required = false)
    String getStatusMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "rawData", required = false)
    void setRawData(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = false)
    void setStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusMsg", required = false)
    void setStatusMsg(String str);
}

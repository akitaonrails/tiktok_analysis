package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0g1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1149650g1T extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "orderID", required = false)
    String getOrderID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "penaltyWarningSkip", required = false)
    String getPenaltyWarningSkip();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "result", required = true)
    String getResult();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orderID", required = false)
    void setOrderID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "penaltyWarningSkip", required = false)
    void setPenaltyWarningSkip(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "result", required = true)
    void setResult(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0sBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C040E
public interface InterfaceC1617310sBl extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enableWebPayment", required = true)
    Boolean getEnableWebPayment();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "priceRegion", required = true)
    String getPriceRegion();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enableWebPayment", required = true)
    void setEnableWebPayment(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "priceRegion", required = true)
    void setPriceRegion(String str);
}

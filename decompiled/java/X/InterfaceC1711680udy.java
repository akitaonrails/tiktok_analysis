package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0udy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1711680udy extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardNumber", required = true)
    String getCardNumber();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "expirationDate", required = true)
    String getExpirationDate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "holderName", required = true)
    String getHolderName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cardNumber", required = true)
    void setCardNumber(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "expirationDate", required = true)
    void setExpirationDate(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "holderName", required = true)
    void setHolderName(String str);
}

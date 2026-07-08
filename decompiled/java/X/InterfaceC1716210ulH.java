package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ulH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1716210ulH extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "backCard", nestedClassType = InterfaceC1716170ulD.class, required = false)
    InterfaceC1716170ulD getBackCard();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardNumber", required = false)
    String getCardNumber();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardholderName", required = false)
    String getCardholderName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "expireDate", required = false)
    String getExpireDate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frontCard", nestedClassType = InterfaceC1716180ulE.class, required = false)
    InterfaceC1716180ulE getFrontCard();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "outcome", required = true)
    String getOutcome();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "backCard", nestedClassType = InterfaceC1716170ulD.class, required = false)
    void setBackCard(InterfaceC1716170ulD interfaceC1716170ulD);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cardNumber", required = false)
    void setCardNumber(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cardholderName", required = false)
    void setCardholderName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "expireDate", required = false)
    void setExpireDate(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "frontCard", nestedClassType = InterfaceC1716180ulE.class, required = false)
    void setFrontCard(InterfaceC1716180ulE interfaceC1716180ulE);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "outcome", required = true)
    void setOutcome(String str);
}

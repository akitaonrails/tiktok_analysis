package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0fco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1134360fco extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftCoins", required = true)
    Number getGiftCoins();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftName", required = true)
    String getGiftName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftPrice", required = true)
    String getGiftPrice();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "giftCoins", required = true)
    void setGiftCoins(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "giftName", required = true)
    void setGiftName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "giftPrice", required = true)
    void setGiftPrice(String str);
}

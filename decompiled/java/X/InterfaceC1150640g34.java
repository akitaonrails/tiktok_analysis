package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0g34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1150640g34 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "expireTimestamp", required = true)
    Number getExpireTimestamp();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftPrice", required = true)
    Number getGiftPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "image", required = true)
    String getImage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "magicOptionId", required = true)
    String getMagicOptionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "magicResultId", required = true)
    String getMagicResultId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "responseExtra", required = false)
    String getResponseExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isContrast", required = false)
    Boolean isContrast();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isContrast", required = false)
    void setContrast(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "expireTimestamp", required = true)
    void setExpireTimestamp(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "giftPrice", required = true)
    void setGiftPrice(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "image", required = true)
    void setImage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "magicOptionId", required = true)
    void setMagicOptionId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "magicResultId", required = true)
    void setMagicResultId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "responseExtra", required = false)
    void setResponseExtra(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0fm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1140060fm0 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardId", required = true)
    String getCardId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftId", required = true)
    String getGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "senderId", required = true)
    String getSenderId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "unlockResult", required = true)
    Number getUnlockResult();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "unlockToken", required = false)
    String getUnlockToken();
}

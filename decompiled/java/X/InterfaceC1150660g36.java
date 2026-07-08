package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0g36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1150660g36 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftId", required = true)
    Number getGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "magicGiftId", required = true)
    Number getMagicGiftId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestExtra", required = false)
    String getRequestExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "specificMagicResultId", required = false)
    String getSpecificMagicResultId();
}

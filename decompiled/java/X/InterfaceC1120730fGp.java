package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0fGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1120730fGp extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "available", required = false)
    Number getAvailable();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "giftEnterFrom", required = false)
    String getGiftEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "itemID", required = false)
    Number getItemID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "itemType", required = true)
    Number getItemType();
}

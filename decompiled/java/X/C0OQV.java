package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0OQV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OQV extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "business_type", required = false)
    String getBusinessType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "card_info", nestedClassType = C0OQX.class, required = false)
    C0OQX getCardInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "card_type", required = false)
    String getCardType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "item_type", required = false)
    Number getItemType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "style_struct", required = false)
    String getStyleStruct();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "text", required = false)
    String getText();
}

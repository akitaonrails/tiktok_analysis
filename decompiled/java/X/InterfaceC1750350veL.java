package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0veL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1750350veL extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cover", nestedClassType = InterfaceC1750370veN.class, required = true)
    InterfaceC1750370veN getCover();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "price", required = true)
    String getPrice();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "product_id", required = true)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sold_count", required = true)
    String getSoldCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();
}

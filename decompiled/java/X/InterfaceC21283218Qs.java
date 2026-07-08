package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.18Qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21283218Qs extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "addCount", required = true)
    Number getAddCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "addItemSourcePage", required = true)
    Number getAddItemSourcePage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "chainKey", required = false)
    String getChainKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "entranceInfo", required = false)
    String getEntranceInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "otherParams", required = false)
    Map<String, Object> getOtherParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageSourceInfo", required = false)
    String getPageSourceInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "platformLinkBasedItem", nestedClassType = C18R0.class, required = false)
    C18R0 getPlatformLinkBasedItem();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", required = true)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sellerId", required = true)
    String getSellerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "skuId", required = false)
    String getSkuId();
}

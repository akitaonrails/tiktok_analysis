package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KJN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface C0KJN extends XBaseParamModel {
    @InterfaceC1909207dq(option = {1, 2, 3, 4, 5})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "action", required = false)
    Number getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "allow_cache", required = false)
    Number getAllowCache();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchor_name", required = false)
    String getAnchorName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "create_contract_intent", required = false)
    Number getCreateContractIntent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_log_pb", required = false)
    Map<String, Object> getExtraLogPb();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "from_id", required = false)
    String getFromId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "iap_id", required = false)
    String getIapId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "need_open_onboarding", required = false)
    Boolean getNeedOpenOnboarding();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "offer_id", required = false)
    String getOfferId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "offer_token", required = false)
    String getOfferToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "order_source", required = false)
    String getOrderSource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "package_id", required = false)
    String getPackageId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "product_id", required = false)
    String getProductId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = false)
    Number getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sku_name", required = false)
    String getSkuName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sub_circle", required = false)
    Number getSubCircle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subscribe_type", required = false)
    String getSubscribeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "to_uid", required = false)
    String getToUid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "track_info", required = false)
    Map<String, Object> getTrackInfo();
}

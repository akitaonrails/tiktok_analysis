package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KTT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface C0KTT extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizLine", required = true)
    Number getBizLine();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "collection_detail_model", required = false)
    Map<String, Object> getCollectionDetailModel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "create_order_params", required = true)
    Map<String, Object> getCreateOrderParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "iap_tracking_data", required = true)
    Map<String, Object> getIapTrackingData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mode", required = false)
    Number getMode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mp_params", required = false)
    Map<String, Object> getMpParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "optionType", required = true)
    Number getOptionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "purchase_option", required = false)
    Map<String, Object> getPurchaseOption();
}

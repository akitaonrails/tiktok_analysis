package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.18Qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21283118Qr extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bcm", required = false)
    String getBcm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "biz_type", required = false)
    Number getBizType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "btm", required = false)
    String getBtm();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "need_request", required = false)
    Boolean getNeedRequest();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "other_params", required = false)
    Map<String, Object> getOtherParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sku_type", required = false)
    Number getSkuType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = false)
    String getTrackParams();
}

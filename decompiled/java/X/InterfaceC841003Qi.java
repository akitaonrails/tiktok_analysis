package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.03Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC841003Qi extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "activity_id", required = false)
    String getActivityId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "fulfillment_type", required = false)
    Number getFulfillmentType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "seller_id", required = false)
    String getSellerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "threshold_diff", required = false)
    String getThresholdDiff();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "activity_id", required = false)
    void setActivityId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "fulfillment_type", required = false)
    void setFulfillmentType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "seller_id", required = false)
    void setSellerId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "threshold_diff", required = false)
    void setThresholdDiff(String str);
}

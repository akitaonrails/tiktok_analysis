package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0NkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC602730NkV extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", nestedClassType = InterfaceC602700NkS.class, required = false)
    InterfaceC602700NkS getExtraParams();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"OrderReward", "ListCard", "VoucherPendant", "ProgressPendant", "CouponBanner", "MarketingPendant", "CrackEgg", "ExclusiveCouponBanner"})
    String getType();
}

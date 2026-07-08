package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0x1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1803380x1s extends XBaseParamModel {
    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "cancel_entrance", required = true)
    Number getCancelEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "customized_content", required = false)
    String getCustomizedContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dialog_type", required = true)
    String getDialogType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "et_params", required = true)
    Object getEtParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gift_name", required = false)
    String getGiftName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "package_coins", required = true)
    Number getPackageCoins();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "payment_amount", required = false)
    String getPaymentAmount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "recharge_entrance", required = true)
    String getRechargeEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "retry_create_order_params", required = false)
    Object getRetryCreateOrderParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "short_coins", required = false)
    Number getShortCoins();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "show_duration_start_anchor", required = true)
    Number getShowDurationStartAnchor();
}

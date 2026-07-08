package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TVY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface C0TVY extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cancel_frequency_config", required = false)
    String getCancelFrequencyConfig();

    @InterfaceC1909207dq(option = {0, 1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "dialog_action", required = true)
    Number getDialogAction();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "dialog_id", required = false)
    @InterfaceC1909307dr(option = {"recharge_cancel_retention_dialog", "recharge_v3_retention_dialog"})
    String getDialogId();
}

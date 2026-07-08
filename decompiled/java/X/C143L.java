package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.143L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface C143L extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantId", required = false)
    String getMerchantId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantUid", required = false)
    String getMerchantUid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestId", required = true)
    String getRequestId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showInAppPopupIfUndecided", required = false)
    Boolean getShowInAppPopupIfUndecided();
}

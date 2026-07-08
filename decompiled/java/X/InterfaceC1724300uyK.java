package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0uyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1724300uyK extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchant_id", required = false)
    String getMerchantId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchant_user_id", required = false)
    String getMerchantUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nonce", required = false)
    String getNonce();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ocr_mode", required = false)
    Integer getOcrMode();
}

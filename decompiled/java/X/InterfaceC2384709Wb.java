package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.09Wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C040E
public interface InterfaceC2384709Wb extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantId", required = true)
    String getMerchantId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantUserId", required = true)
    String getMerchantUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nonce", required = true)
    String getNonce();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "merchantId", required = true)
    void setMerchantId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "merchantUserId", required = true)
    void setMerchantUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "nonce", required = true)
    void setNonce(String str);
}

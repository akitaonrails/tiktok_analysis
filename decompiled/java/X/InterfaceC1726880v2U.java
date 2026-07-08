package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0v2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1726880v2U extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantID", required = true)
    String getMerchantID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantUID", required = true)
    String getMerchantUID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "signingPayload", required = true)
    String getSigningPayload();
}

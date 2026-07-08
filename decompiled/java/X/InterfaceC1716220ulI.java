package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ulI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1716220ulI extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "backCardImage", required = true)
    String getBackCardImage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frontCardImage", required = true)
    String getFrontCardImage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantID", required = true)
    String getMerchantID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantUserID", required = true)
    String getMerchantUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isLazyOCR", required = false)
    Boolean isLazyOCR();
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ul7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1716110ul7 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "category", required = false)
    String getCategory();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "galleryUpload", required = false)
    Boolean getGalleryUpload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantID", required = true)
    String getMerchantID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantUserID", required = true)
    String getMerchantUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageTheme", required = false)
    String getPageTheme();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scanScope", required = false)
    String getScanScope();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showSecurityTips", required = false)
    Boolean getShowSecurityTips();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timeout", required = false)
    Number getTimeout();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isLazyOCR", required = false)
    Boolean isLazyOCR();
}

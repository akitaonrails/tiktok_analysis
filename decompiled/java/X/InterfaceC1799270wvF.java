package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1799270wvF extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "countryCode", required = false)
    String getCountryCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "currencyCode", required = true)
    String getCurrencyCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "countryCode", required = false)
    void setCountryCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "currencyCode", required = true)
    void setCurrencyCode(String str);
}

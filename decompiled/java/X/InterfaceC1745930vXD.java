package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0vXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1745930vXD extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "countryCode", required = true)
    String getCountryCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "phoneCode", required = true)
    String getPhoneCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "countryCode", required = true)
    void setCountryCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "phoneCode", required = true)
    void setPhoneCode(String str);
}

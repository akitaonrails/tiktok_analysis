package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1AQC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040E
public interface C1AQC extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "phoneCode", required = true)
    String getPhoneCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortCountryName", required = true)
    String getShortCountryName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "phoneCode", required = true)
    void setPhoneCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "shortCountryName", required = true)
    void setShortCountryName(String str);
}

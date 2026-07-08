package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.10Jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC19227210Jy extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "phoneCode", required = true)
    String getPhoneCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shortCountryName", required = true)
    String getShortCountryName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "phoneCode", required = true)
    void setPhoneCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "shortCountryName", required = true)
    void setShortCountryName(String str);
}

package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KTD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KTD extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "countryCode", required = false)
    String getCountryCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "currency", required = false)
    String getCurrency();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = true)
    Boolean getSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "countryCode", required = false)
    void setCountryCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "currency", required = false)
    void setCurrency(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "success", required = true)
    void setSuccess(Boolean bool);
}

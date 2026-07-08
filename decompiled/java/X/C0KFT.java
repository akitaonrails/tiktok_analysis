package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KFT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KFT extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "currencyCode", required = false)
    String getCurrencyCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "detail_code", required = false)
    Number getDetailCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "get_sku_response", required = false)
    Map<String, Object> getGetSkuResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = false)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "package_id", required = false)
    String getPackageId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pay_message", required = false)
    String getPayMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pay_status", required = false)
    Number getPayStatus();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "currencyCode", required = false)
    void setCurrencyCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "detail_code", required = false)
    void setDetailCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "get_sku_response", required = false)
    void setGetSkuResponse(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "message", required = false)
    void setMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "package_id", required = false)
    void setPackageId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pay_message", required = false)
    void setPayMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pay_status", required = false)
    void setPayStatus(Number number);
}

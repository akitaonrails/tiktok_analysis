package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0mT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040E
public interface InterfaceC1397420mT6 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "coupon_discount", required = true)
    String getCouponDiscount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_success", required = true)
    Boolean isSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "coupon_discount", required = true)
    void setCouponDiscount(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_success", required = true)
    void setSuccess(Boolean bool);
}

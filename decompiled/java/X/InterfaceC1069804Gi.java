package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimExpansionVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FollowAndClaimVoucherRequest;
import java.util.Map;

/* JADX INFO: renamed from: X.04Gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1069804Gi {
    public static final C1069904Gj LIZ = C1069904Gj.LIZ;

    @InterfaceC1501240pAY("/api/v1/promotion/voucher/record_expansion_voucher")
    Object LIZ(@C040I C1070504Gp c1070504Gp, InterfaceC1364105Vn<Object> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/promotion/voucher/claim_expansion_voucher")
    Object LIZIZ(@C040I ClaimExpansionVoucherRequest claimExpansionVoucherRequest, InterfaceC1364105Vn<? super ClaimExpansionVoucherResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/voucher/claim")
    C11NZ<ClaimVoucherResponse> LIZJ(@C040I ClaimVoucherRequest claimVoucherRequest);

    @InterfaceC1501240pAY("aweme/v1/oec/live/short_touch/interactive_voucher/claim")
    C11NZ<ClaimVoucherResponse> LIZLLL(@C040I FollowAndClaimVoucherRequest followAndClaimVoucherRequest);

    @InterfaceC1501240pAY("/api/v1/shop/voucher/claim")
    Object LJ(@C040I Map<String, Object> map, InterfaceC1364105Vn<? super ClaimVoucherResponse> interfaceC1364105Vn);
}

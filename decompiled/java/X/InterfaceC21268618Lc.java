package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleMode;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.AnchorECSaleModeRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimExpansionVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: renamed from: X.18Lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21268618Lc {
    public static final C21268718Ld LIZ = C21268718Ld.LIZ;

    @InterfaceC1501240pAY("/api/v1/promotion/voucher/claim_expansion_voucher")
    Object LIZ(@C040I ClaimExpansionVoucherRequest claimExpansionVoucherRequest, InterfaceC1364105Vn<? super ClaimExpansionVoucherResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/voucher/claim")
    Object LIZIZ(@C040I ClaimVoucherRequest claimVoucherRequest, InterfaceC1364105Vn<? super ClaimVoucherResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/oec/creator/sale_mode/get")
    Object LIZJ(@C040I AnchorECSaleModeRequest anchorECSaleModeRequest, InterfaceC1364105Vn<? super BaseResponse<AnchorECSaleMode>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/item/product_info/get")
    Object LIZLLL(@C040I GetItemProductInfoRequest getItemProductInfoRequest, InterfaceC1364105Vn<? super GetItemProductInfoResponse> interfaceC1364105Vn);
}

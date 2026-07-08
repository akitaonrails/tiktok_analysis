package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.EcUploadPayInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.EcUploadPayInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import java.util.Map;

/* JADX INFO: renamed from: X.03gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC907103gb {
    public static final C907003ga LIZ = C907003ga.LIZ;

    @InterfaceC1501240pAY("/api/v1/trade/order/pay")
    C11NZ<Response<PaymentData>> LIZ(@C040I Map<String, Object> map);

    @InterfaceC1501200pAU("/api/v1/pay/auth/get")
    C11NZ<Response<PaymentData>> LIZIZ(@InterfaceC1501120pAM("need_token") Boolean bool, @InterfaceC1501120pAM("source_page_name") String str, @InterfaceC1501120pAM("sale_region") String str2);

    @InterfaceC1501240pAY("/api/v1/pay/upload_pay_info")
    C11NZ<Response<EcUploadPayInfoResponseData>> LIZJ(@C040I EcUploadPayInfoRequest ecUploadPayInfoRequest);
}

package X;

import com.bytedance.pipo.ttpay.recharge.network.CashierBasicInfoRequest;
import com.bytedance.pipo.ttpay.recharge.network.ConsultRequest;
import com.bytedance.pipo.ttpay.recharge.network.ConsultResponse;
import com.bytedance.pipo.ttpay.recharge.network.GetOrderInfoRequest;
import com.bytedance.pipo.ttpay.recharge.network.PreDealPaymentRequest;
import com.bytedance.pipo.ttpay.recharge.network.PreDealPaymentResponse;
import com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentRequest;
import com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: renamed from: X.0utw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1721580utw extends InterfaceC149400hg {
    Object LJIL(String str, String str2, ConsultRequest consultRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ConsultResponse>>> interfaceC1364105Vn);

    Object LJJIFFI(String str, String str2, GetOrderInfoRequest getOrderInfoRequest, C1721890uuR c1721890uuR);

    Object LLIIZ(String str, String str2, SubmitPaymentRequest submitPaymentRequest, InterfaceC1364105Vn<? super BaseResponse<SubmitPaymentResponse>> interfaceC1364105Vn);

    Object LLILZIL(String str, String str2, CashierBasicInfoRequest cashierBasicInfoRequest, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn);

    Object LLJL(String str, String str2, PreDealPaymentRequest preDealPaymentRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<PreDealPaymentResponse>>> interfaceC1364105Vn);
}

package X;

import com.bytedance.pipo.ttpay.recharge.network.CashierBasicInfoRequest;
import com.bytedance.pipo.ttpay.recharge.network.ConsultRequest;
import com.bytedance.pipo.ttpay.recharge.network.ConsultResponse;
import com.bytedance.pipo.ttpay.recharge.network.GetOrderInfoRequest;
import com.bytedance.pipo.ttpay.recharge.network.PreDealPaymentRequest;
import com.bytedance.pipo.ttpay.recharge.network.PreDealPaymentResponse;
import com.bytedance.pipo.ttpay.recharge.network.RechargeApi;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: renamed from: X.0utx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721590utx implements InterfaceC1721580utw {
    @Override // X.InterfaceC1721580utw
    public final Object LJIL(String str, String str2, ConsultRequest consultRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<ConsultResponse>>> interfaceC1364105Vn) {
        Object objConsult = null;
        if (str == null || str2 == null) {
            return null;
        }
        RechargeApi.LIZ.getClass();
        RechargeApi rechargeApiLIZ = C1505720pHm.LIZ(str);
        if (rechargeApiLIZ != null && (objConsult = rechargeApiLIZ.consult(str2, consultRequest, interfaceC1364105Vn)) == C099R.LJFF()) {
            return objConsult;
        }
        return objConsult;
    }

    @Override // X.InterfaceC1721580utw
    public final Object LJJIFFI(String str, String str2, GetOrderInfoRequest getOrderInfoRequest, C1721890uuR c1721890uuR) {
        Object orderInfo = null;
        if (str == null || str2 == null) {
            return null;
        }
        RechargeApi.LIZ.getClass();
        RechargeApi rechargeApiLIZ = C1505720pHm.LIZ(str);
        if (rechargeApiLIZ != null && (orderInfo = rechargeApiLIZ.getOrderInfo(str2, getOrderInfoRequest, c1721890uuR)) == C099R.LJFF()) {
            return orderInfo;
        }
        return orderInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // X.InterfaceC1721580utw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLIIZ(java.lang.String r7, java.lang.String r8, com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentRequest r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentResponse>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1721600uty
            if (r0 == 0) goto L63
            r5 = r10
            X.0uty r5 = (X.C1721600uty) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L46
            if (r0 != r2) goto L69
            X.C155000ia.LIZIZ(r4)
        L23:
            X.0X52 r4 = (X.C0X52) r4
            if (r4 == 0) goto L71
            T r3 = r4.LIZIZ
            com.bytedance.pipo.ttpay.recharge.network.Response r3 = (com.bytedance.pipo.ttpay.recharge.network.Response) r3
            if (r3 == 0) goto L71
            X.0utz r0 = new X.0utz
            r0.<init>()
            java.lang.reflect.Type r2 = r0.getType()
            X.04rF r0 = X.C1227904rF.LIZ
            r0.getClass()
            com.google.gson.Gson r1 = X.C1227904rF.LIZLLL()
            java.lang.String r0 = r3.response
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r0, r2)
            return r0
        L46:
            X.C155000ia.LIZIZ(r4)
            if (r7 != 0) goto L4c
            return r1
        L4c:
            if (r8 != 0) goto L4f
            return r1
        L4f:
            X.0pHm r0 = com.bytedance.pipo.ttpay.recharge.network.RechargeApi.LIZ
            r0.getClass()
            com.bytedance.pipo.ttpay.recharge.network.RechargeApi r0 = X.C1505720pHm.LIZ(r7)
            if (r0 == 0) goto L71
            r5.LLILLL = r2
            java.lang.Object r4 = r0.submitPayment(r8, r9, r5)
            if (r4 != r3) goto L23
            return r3
        L63:
            X.0uty r5 = new X.0uty
            r5.<init>(r6, r10)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721590utx.LLIIZ(java.lang.String, java.lang.String, com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentRequest, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1721580utw
    public final Object LLILZIL(String str, String str2, CashierBasicInfoRequest cashierBasicInfoRequest, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn) {
        Object objCashierBasicInfo = null;
        if (str == null || str2 == null) {
            return null;
        }
        RechargeApi.LIZ.getClass();
        RechargeApi rechargeApiLIZ = C1505720pHm.LIZ(str);
        if (rechargeApiLIZ != null && (objCashierBasicInfo = rechargeApiLIZ.cashierBasicInfo(str2, cashierBasicInfoRequest, interfaceC1364105Vn)) == C099R.LJFF()) {
            return objCashierBasicInfo;
        }
        return objCashierBasicInfo;
    }

    @Override // X.InterfaceC1721580utw
    public final Object LLJL(String str, String str2, PreDealPaymentRequest preDealPaymentRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<PreDealPaymentResponse>>> interfaceC1364105Vn) {
        Object objPreDealPaymentInfo = null;
        if (str == null || str2 == null) {
            return null;
        }
        RechargeApi.LIZ.getClass();
        RechargeApi rechargeApiLIZ = C1505720pHm.LIZ(str);
        if (rechargeApiLIZ != null && (objPreDealPaymentInfo = rechargeApiLIZ.preDealPaymentInfo(str2, preDealPaymentRequest, interfaceC1364105Vn)) == C099R.LJFF()) {
            return objPreDealPaymentInfo;
        }
        return objPreDealPaymentInfo;
    }
}

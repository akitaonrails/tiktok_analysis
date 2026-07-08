package Y;

import X.AbstractC1614570s7L;
import X.AbstractC19486711Lt;
import X.AbstractC2126608Uu;
import X.C0TAU;
import X.C11IR;
import X.C11NZ;
import X.C1613300s5I;
import X.C1614530s7H;
import X.C204575153d;
import X.C2188811AlT;
import X.C2195221Avo;
import X.C2197431AzN;
import X.C2197481AzS;
import X.C259800zU;
import X.InterfaceC1487280oo2;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.model.payment.MinisGetBeanBalanceResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisQueryOrderResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisTradeOrderInfo;
import com.ss.android.ugc.aweme.minis.request.payment.MinisPaymentApi;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$MpIapResult;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$ReactivateContractResponse;
import com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes35.dex */
public class AkS74S1200000_34 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.ss.android.ugc.aweme.minis.model.payment.MinisTradeOrderInfo] */
    public static final Object apply$0(AkS74S1200000_34 akS74S1200000_34, Object obj) {
        Long lValueOf;
        String str;
        C11NZ<MinisGetBeanBalanceResponse> beanBalance;
        MinisPaymentApi.PaymentApi paymentApiLIZIZ;
        String str2;
        ((C259800zU) akS74S1200000_34.l1).element = ((MinisQueryOrderResponse) obj).tradeOrderInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPayFlow queryOrder - tokenAmount : ");
        MinisTradeOrderInfo minisTradeOrderInfo = (MinisTradeOrderInfo) ((C259800zU) akS74S1200000_34.l1).element;
        if (minisTradeOrderInfo != null) {
            lValueOf = Long.valueOf(minisTradeOrderInfo.tokenAmount);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C2197481AzS c2197481AzS = ((C2197431AzN) akS74S1200000_34.l2).LJIIJ;
        C2197481AzS.LIZJ(c2197481AzS, "pay_query_order_success", 0, null, c2197481AzS.LIZ("pay_query_order_start"), 0, 0L, 0L, null, null, 0, null, null, false, null, null, null, 65526);
        C2197481AzS c2197481AzS2 = ((C2197431AzN) akS74S1200000_34.l2).LJIIJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tokenType : ");
        MinisTradeOrderInfo minisTradeOrderInfo2 = (MinisTradeOrderInfo) ((C259800zU) akS74S1200000_34.l1).element;
        String str3 = "";
        if (minisTradeOrderInfo2 == null || (str = minisTradeOrderInfo2.tokenType) == null) {
            str = "";
        }
        sbLIZ2.append(str);
        C2197481AzS.LIZJ(c2197481AzS2, "check_balance_start", 0, null, 0L, 0, 0L, 0L, null, null, 0, null, C2188811AlT.LIZIZ(sbLIZ2), true, null, null, null, 59390);
        String strLIZ = C2195221Avo.LIZ();
        MinisTradeOrderInfo minisTradeOrderInfo3 = (MinisTradeOrderInfo) ((C259800zU) akS74S1200000_34.l1).element;
        if (minisTradeOrderInfo3 != null && (str2 = minisTradeOrderInfo3.tokenType) != null) {
            str3 = str2;
        }
        String str4 = akS74S1200000_34.s0;
        String str5 = ((C2197431AzN) akS74S1200000_34.l2).LIZIZ.LIZ;
        int iLJ = C204575153d.LJ();
        boolean zLIZIZ = C204575153d.LIZIZ();
        try {
            paymentApiLIZIZ = C0TAU.LIZIZ();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
        }
        if (paymentApiLIZIZ != null) {
            beanBalance = paymentApiLIZIZ.getBeanBalance(strLIZ, str3, str4, str5, iLJ, zLIZIZ);
        } else {
            beanBalance = C11IR.LL;
        }
        return beanBalance.LJJL(new InterfaceC1487280oo2() { // from class: X.11To
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                return C11NZ.LJJIJLIJ(new C19633211re((Throwable) obj2));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0255 A[PHI: r5
      0x0255: PHI (r5v2 long) = (r5v1 long), (r5v4 long) binds: [B:45:0x0233, B:47:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$1(Y.AkS74S1200000_34 r73, java.lang.Object r74) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS74S1200000_34.apply$1(Y.AkS74S1200000_34, java.lang.Object):java.lang.Object");
    }

    public static final Object apply$2(AkS74S1200000_34 akS74S1200000_34, Object obj) {
        String str;
        AbstractC1614570s7L abstractC1614570s7LLJIIL;
        SeriesSubscriptionModels$ReactivateContractResponse seriesSubscriptionModels$ReactivateContractResponse = (SeriesSubscriptionModels$ReactivateContractResponse) obj;
        int i = seriesSubscriptionModels$ReactivateContractResponse.statusCode;
        if (i != 0) {
            if (i == 4025058) {
                abstractC1614570s7LLJIIL = new C1614530s7H(((SeriesSubscriptionServiceImpl) akS74S1200000_34.l1).LIZJ, 2131848159);
            } else {
                abstractC1614570s7LLJIIL = ((SeriesSubscriptionServiceImpl) akS74S1200000_34.l1).LJIIL(seriesSubscriptionModels$ReactivateContractResponse.statusMsg);
            }
            ((SeriesSubscriptionServiceImpl) akS74S1200000_34.l1).LIZ.onNext(abstractC1614570s7LLJIIL);
            return AbstractC19486711Lt.LJIIJ(new C1613300s5I(null, null));
        }
        SeriesSubscriptionModels$MpIapResult seriesSubscriptionModels$MpIapResult = seriesSubscriptionModels$ReactivateContractResponse.iapResult;
        if (seriesSubscriptionModels$MpIapResult != null && (str = seriesSubscriptionModels$MpIapResult.inAppRequest) != null && str.length() != 0) {
            return ((SeriesSubscriptionServiceImpl) akS74S1200000_34.l1).LJIIJ((Context) akS74S1200000_34.l2, str).LJIJ(new AkS109S1100000_34((SeriesSubscriptionServiceImpl) akS74S1200000_34.l1, akS74S1200000_34.s0, 1));
        }
        return AbstractC19486711Lt.LJIIJ(new IllegalStateException("empty iapPayload"));
    }

    public AkS74S1200000_34(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}

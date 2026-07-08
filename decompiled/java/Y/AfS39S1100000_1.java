package Y;

import X.C09JN;
import X.C1C7U;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AfS39S1100000_1 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS39S1100000_1 r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS39S1100000_1.accept$0(Y.AfS39S1100000_1, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS39S1100000_1 afS39S1100000_1, Object obj) {
        C1C7U.LIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$4");
        PaymentData paymentData = (PaymentData) ((Response) obj).data;
        EcomPaymentInterceptor ecomPaymentInterceptor = (EcomPaymentInterceptor) afS39S1100000_1.l1;
        ecomPaymentInterceptor.LL = 2;
        n nVar = null;
        if (ecomPaymentInterceptor.LLILLJJLI) {
            if (paymentData != null) {
                nVar = paymentData.cashier;
            }
            ecomPaymentInterceptor.LJIIIIZZ(nVar);
        } else {
            Map map = (Map) ecomPaymentInterceptor.LLILLL.getValue();
            String str = afS39S1100000_1.s0;
            if (paymentData != null) {
                nVar = paymentData.cashier;
            }
            map.put(str, nVar);
        }
        C1C7U.LIZIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS39S1100000_1 afS39S1100000_1, Object obj) {
        C1C7U.LIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$7");
        PaymentData paymentData = (PaymentData) ((Response) obj).data;
        EcomPaymentInterceptor ecomPaymentInterceptor = (EcomPaymentInterceptor) afS39S1100000_1.l1;
        ecomPaymentInterceptor.LL = 2;
        n nVar = null;
        if (ecomPaymentInterceptor.LLILLJJLI) {
            if (paymentData != null) {
                nVar = paymentData.cashier;
            }
            ecomPaymentInterceptor.LJIIIIZZ(nVar);
        } else {
            Map map = (Map) ecomPaymentInterceptor.LLILLL.getValue();
            String str = afS39S1100000_1.s0;
            if (paymentData != null) {
                nVar = paymentData.cashier;
            }
            map.put(str, nVar);
        }
        C1C7U.LIZIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$7");
    }

    public AfS39S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

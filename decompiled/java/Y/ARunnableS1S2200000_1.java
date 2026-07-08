package Y;

import X.C03VQ;
import X.C1741890vQh;
import X.C1C7U;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C842803Ra;
import X.C897703f5;
import X.C907803gi;
import X.C925303jX;
import X.EnumC899203fK;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS1S2200000_1 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        PaymentMethod paymentMethod;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invokeTime: appSwitch2 ");
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZJ(strLIZIZ);
        C907803gi.LIZ.getClass();
        AtomicBoolean atomicBoolean = C907803gi.LIZLLL;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            C03VQ c03vq = C03VQ.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c03vq.getClass();
            C03VQ.LJIJI = jCurrentTimeMillis;
            if (!C925303jX.LIZ()) {
                C907803gi.LJJJ(this.s1, (List) this.l3, (C897703f5) this.l2);
                return;
            }
            IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
            String value = EnumC899203fK.PAYING.getValue();
            PaymentInfo paymentInfo = ((C897703f5) this.l2).LJI;
            iEventCenter.LIZ("ec_common_pay_result", C1741890vQh.LJIIIIZZ(new EcomPaymentInterceptor.CommonPayResultEvent(value, null, (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null) ? null : paymentMethod.LJJIIZ(), null, this.s0, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE)));
        }
    }

    public static final void run$0(ARunnableS1S2200000_1 aRunnableS1S2200000_1) {
        boolean zLIZ;
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        C1C7U.LIZ("OrderSubmitFragment@bed5.showPaymentErrorDialogAndClear$1$1$1");
        try {
            C907803gi c907803gi = C907803gi.LIZ;
            Context context = (Context) aRunnableS1S2200000_1.l2;
            String str = aRunnableS1S2200000_1.s0;
            String str2 = aRunnableS1S2200000_1.s1;
            PaymentInfo paymentInfo = ((OrderSubmitFragment) aRunnableS1S2200000_1.l3).ZR().LLJJJ;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            c907803gi.getClass();
            C907803gi.LJJJJJ(context, str, str2, strLJJIIZ, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OrderSubmitFragment@bed5.showPaymentErrorDialogAndClear$1$1$1");
    }

    public static final void run$1(ARunnableS1S2200000_1 aRunnableS1S2200000_1) {
        boolean zLIZ;
        C1C7U.LIZ("PaymentResultProcess@6ad4.payResultProcess$handleAppBackgroundSwitch$1$onAppForeground$1");
        try {
            aRunnableS1S2200000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$handleAppBackgroundSwitch$1$onAppForeground$1");
    }

    public static final void run$2(ARunnableS1S2200000_1 aRunnableS1S2200000_1) {
        boolean zLIZ;
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        C1C7U.LIZ("SeaOneStepOrderSubmitFragment@522e.showPaymentErrorDialogAndClear$1$1$1");
        try {
            C907803gi c907803gi = C907803gi.LIZ;
            Context context = (Context) aRunnableS1S2200000_1.l2;
            String strLIZIZ = aRunnableS1S2200000_1.s0;
            if (strLIZIZ == null) {
                C842803Ra c842803Ra = C842803Ra.LIZ;
                String str = aRunnableS1S2200000_1.s1;
                c842803Ra.getClass();
                strLIZIZ = C842803Ra.LIZIZ(str);
            }
            String str2 = aRunnableS1S2200000_1.s1;
            PaymentInfo paymentInfo = ((SeaOneStepOrderSubmitFragment) aRunnableS1S2200000_1.l3).bS().LLJJJ;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            c907803gi.getClass();
            C907803gi.LJJJJJ(context, strLIZIZ, str2, strLJJIIZ, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaOneStepOrderSubmitFragment@522e.showPaymentErrorDialogAndClear$1$1$1");
    }

    public static final void run$3(ARunnableS1S2200000_1 aRunnableS1S2200000_1) {
        boolean zLIZ;
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        C1C7U.LIZ("MiniOspFragment@1cc5.showPaymentErrorDialogAndClear$1$1$1");
        try {
            C907803gi c907803gi = C907803gi.LIZ;
            Context context = (Context) aRunnableS1S2200000_1.l2;
            String strLIZIZ = aRunnableS1S2200000_1.s0;
            if (strLIZIZ == null) {
                C842803Ra c842803Ra = C842803Ra.LIZ;
                String str = aRunnableS1S2200000_1.s1;
                c842803Ra.getClass();
                strLIZIZ = C842803Ra.LIZIZ(str);
            }
            String str2 = aRunnableS1S2200000_1.s1;
            PaymentInfo paymentInfo = ((MiniOspFragment) aRunnableS1S2200000_1.l3).WR().LLJIJIL;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            c907803gi.getClass();
            C907803gi.LJJJJJ(context, strLIZIZ, str2, strLJJIIZ, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniOspFragment@1cc5.showPaymentErrorDialogAndClear$1$1$1");
    }

    public static final void run$4(ARunnableS1S2200000_1 aRunnableS1S2200000_1) {
        boolean zLIZ;
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        C1C7U.LIZ("CombinedSkuOrderSubmitFragment@b53b.showPaymentErrorDialogAndClear$1$1$1");
        try {
            C907803gi c907803gi = C907803gi.LIZ;
            Context context = (Context) aRunnableS1S2200000_1.l2;
            String strLIZIZ = aRunnableS1S2200000_1.s0;
            if (strLIZIZ == null) {
                C842803Ra c842803Ra = C842803Ra.LIZ;
                String str = aRunnableS1S2200000_1.s1;
                c842803Ra.getClass();
                strLIZIZ = C842803Ra.LIZIZ(str);
            }
            String str2 = aRunnableS1S2200000_1.s1;
            PaymentInfo paymentInfo = ((CombinedSkuOrderSubmitFragment) aRunnableS1S2200000_1.l3).VR().LLJJJ;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            c907803gi.getClass();
            C907803gi.LJJJJJ(context, strLIZIZ, str2, strLJJIIZ, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CombinedSkuOrderSubmitFragment@b53b.showPaymentErrorDialogAndClear$1$1$1");
    }

    public ARunnableS1S2200000_1(Object obj, String str, String str2, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = obj2;
    }
}

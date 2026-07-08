package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingAmount;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PricingPlan;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POConfiguration;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834520WoU implements InterfaceC835070WpN {
    public static final C834520WoU LIZ = new C834520WoU();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static C834270Wo5 LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static WeakReference<Function1<Boolean, Unit>> LJI;
    public static InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit> LJII;
    public static WeakReference<LifecycleOwner> LJIIIIZZ;

    public static void LIZLLL() {
        LJIIIIZZ = null;
        LIZJ.set(false);
        LIZIZ.set(false);
        LIZLLL = null;
        LJ = null;
        LJFF = null;
        LJI = null;
        LJII = null;
    }

    @Override // X.InterfaceC835070WpN
    public final boolean LIZ() {
        return true;
    }

    public static boolean LJFF(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "pm_pi_ptw_googlepay_c_d", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC835070WpN
    public final boolean LIZJ(PaymentOption paymentOption) {
        if (paymentOption != null && LJFF(paymentOption.LJIL())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.content.Context r22, X.C1709570uaZ r23) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C834520WoU.LJ(android.content.Context, X.0uaZ):void");
    }

    public static void LJI(EnumC336190DFx enumC336190DFx, List list, String str, String str2) {
        InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit> interfaceC1631630sYr = LJII;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(enumC336190DFx, list, str, str2);
        }
        LJII = null;
    }

    @Override // X.InterfaceC835070WpN
    public final void LIZIZ(Context context, C1709570uaZ c1709570uaZ, PaymentOption paymentOption, InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        Object c098200Yq;
        String str;
        PricingPlan pricingPlan;
        String str2;
        PricingAmount pricingAmount;
        List list;
        LJ(context, c1709570uaZ);
        if (LIZLLL == null) {
            interfaceC1631630sYr.invoke(EnumC336190DFx.PAYMENT_ERROR, null, "", "GP_ERROR_PROVIDER_UNAVAILABLE");
            return;
        }
        LJII = interfaceC1631630sYr;
        try {
            String strLJIJJLI = paymentOption.LJIJJLI();
            if (strLJIJJLI == null) {
                strLJIJJLI = "";
            }
            C1707990uY1 c1707990uY1 = c1709570uaZ.LIZIZ;
            if (c1707990uY1 != null) {
                str = c1707990uY1.LIZJ;
            } else {
                str = null;
            }
            PIPOPaymentMethod pIPOPaymentMethod = paymentOption.legacyPM;
            if ((pIPOPaymentMethod == null || (str2 = pIPOPaymentMethod.paymentCurrency) == null) && ((pricingPlan = paymentOption.LIZIZ) == null || (pricingAmount = pricingPlan.actualAmount) == null || (str2 = pricingAmount.amountCurrency) == null)) {
                str2 = "";
            }
            POConfiguration pOConfiguration = paymentOption.config;
            if (pOConfiguration == null || (list = pOConfiguration.supportNetworks) == null) {
                list = C13BV.INSTANCE;
            }
            C834270Wo5.LIZLLL(new C03Y9(strLJIJJLI, str, str2, list, 2032));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C834520WoU c834520WoU = LIZ;
            EnumC336190DFx enumC336190DFx = EnumC336190DFx.PAYMENT_ERROR;
            c834520WoU.getClass();
            LJI(enumC336190DFx, null, "", "GP_ERROR_REQUEST_PAYMENT_EXCEPTION");
        }
    }
}

package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.container.PaymentCheckoutFragment;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS150S1100000_1;

/* JADX INFO: renamed from: X.03jP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C924503jP {
    public static void LIZ(Context context, EnterParams enterParams, String str, InterfaceC1631630sYr interfaceC1631630sYr, AwS150S1100000_1 awS150S1100000_1, int i) {
        AFwS185S0000000_1 aFwS185S0000000_1;
        AFwS228S0000000_1 aFwS228S0000000_1;
        FragmentManager supportFragmentManager;
        String str2 = PaymentCheckoutFragment._pnsPageId;
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            interfaceC1631630sYr = C1077504Jh.get$arr$(1);
        }
        if ((i & 32) != 0) {
            aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(73);
        } else {
            aFwS185S0000000_1 = null;
        }
        if ((i & 64) != 0) {
            aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(211);
        } else {
            aFwS228S0000000_1 = null;
        }
        if ((i & 128) != 0) {
            awS150S1100000_1 = null;
        }
        PaymentCheckoutFragment paymentCheckoutFragment = new PaymentCheckoutFragment();
        paymentCheckoutFragment.LLIZ = enterParams;
        paymentCheckoutFragment.LLJILJILJ = str;
        paymentCheckoutFragment.LLIZLLLIL = null;
        paymentCheckoutFragment.LLJ = interfaceC1631630sYr;
        paymentCheckoutFragment.LLJI = aFwS185S0000000_1;
        paymentCheckoutFragment.LLJIJIL = aFwS228S0000000_1;
        paymentCheckoutFragment.LLJILJIL = awS150S1100000_1;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(paymentCheckoutFragment, "payment_checkout_fragment");
            c19ehLJIIJ.LJIIIZ();
        }
    }
}

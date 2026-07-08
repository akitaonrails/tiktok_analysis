package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CashierIndependentCVVFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ucf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710870ucf {
    public static void LIZ(C19EG c19eg, C1709570uaZ c1709570uaZ, PaymentOption paymentOption, C1710390ubt c1710390ubt, String str, Function0 function0) {
        CashierIndependentCVVFragment cashierIndependentCVVFragment = new CashierIndependentCVVFragment();
        cashierIndependentCVVFragment.LL = c1709570uaZ;
        cashierIndependentCVVFragment.LLILLJJLI = paymentOption;
        cashierIndependentCVVFragment.LLILLL = c1710390ubt;
        cashierIndependentCVVFragment.LLILZIL = str;
        cashierIndependentCVVFragment.LLILZ = "order_submit";
        cashierIndependentCVVFragment.LLILZLL = function0;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = cashierIndependentCVVFragment;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJJL = (int) (c19eg.getResources().getDisplayMetrics().heightPixels * 0.86f);
        c1390920mIc.LJ(1);
        c1390920mIc.LJI(16);
        c1390920mIc.LIZ.show(c19eg.getSupportFragmentManager(), "pipo_cashier_independent_cvv");
    }
}

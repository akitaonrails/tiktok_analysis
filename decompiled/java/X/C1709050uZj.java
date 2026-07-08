package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierFragmentStarter$addDestroyObserver$1;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709050uZj {
    public static volatile boolean LIZJ;
    public static volatile long LIZLLL;
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1527));

    public final void LIZIZ() {
        try {
            C786410Ut5.LJIIJ((DialogC1389620mGW) this.LIZIZ.getValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public C1709050uZj(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(C1709570uaZ c1709570uaZ, C1708910uZV c1708910uZV, CashierKey cashierKey, C1709220ua0 c1709220ua0) {
        CashierFragment cashierFragment = new CashierFragment();
        cashierFragment.LLJJJIL = new CashierEnterParams(cashierKey.payRequestId, cashierKey, c1709570uaZ, c1708910uZV.LIZIZ, c1708910uZV.LJFF, c1708910uZV.LIZLLL, c1708910uZV.LJ, c1709220ua0);
        cashierFragment.getLifecycle().addObserver(new CashierFragmentStarter$addDestroyObserver$1(this, c1708910uZV.LIZLLL));
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ != null) {
            cashierFragment.gS(c19egLIZIZ);
        }
    }
}

package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierFragmentStarter$addDestroyObserver$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709140uZs {
    public final CashierKey LIZ;
    public final C1708990uZd LIZIZ;
    public final Function0<C1710390ubt> LIZJ;
    public final Function1<EnumC334240D8k, C1192680h8s> LIZLLL;
    public final Function0<Unit> LJ;
    public final C1708680uZ8 LJFF;
    public boolean LJI;
    public boolean LJII;
    public final List<String> LJIIIIZZ = new ArrayList();
    public final List<Function0<Unit>> LJIIIZ = new ArrayList();
    public final List<Function0<Unit>> LJIIJ = new ArrayList();
    public C1709880ub4 LJIIJJI;
    public WeakReference<C995290c0V> LJIIL;
    public C1709570uaZ LJIILIIL;

    public final void LIZ() {
        WeakReference<C995290c0V> weakReference;
        C995290c0V c995290c0V;
        LinearLayout llNoSelectionHint;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("pipo_ttls_inline_error_optimize_switch", false) || (weakReference = this.LJIIL) == null || (c995290c0V = weakReference.get()) == null || (llNoSelectionHint = c995290c0V.getLlNoSelectionHint()) == null) {
            return;
        }
        C337180DJs.LIZ(llNoSelectionHint);
    }

    public final void LIZIZ(C995290c0V c995290c0V, C1709570uaZ c1709570uaZ, Function0<Unit> function0) {
        Context context = c995290c0V.getContext();
        C1709050uZj c1709050uZj = new C1709050uZj(context);
        CashierKey cashierKey = this.LIZ;
        String str = cashierKey.payRequestId;
        if (str == null) {
            str = "";
        }
        C1709570uaZ c1709570uaZLJIIZILJ = c1709570uaZ.LJIIZILJ();
        Function0<Unit> function02 = this.LJ;
        C1708990uZd c1708990uZd = this.LIZIZ;
        EnumC1709240ua2 enumC1709240ua2 = c1709570uaZ.LJIJ.LIZIZ;
        if (C1709050uZj.LIZJ && System.currentTimeMillis() - C1709050uZj.LIZLLL < 10000) {
            C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cashier fragment mode select duplicated: ");
            sbLIZ.append(cashierKey);
            sbLIZ.append(", ignore!");
            c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1709050uZj.LIZJ = true;
        C1709050uZj.LIZLLL = System.currentTimeMillis();
        c1709570uaZLJIIZILJ.LJJIFFI = str;
        Function1 function1 = null;
        CashierEnterParams cashierEnterParams = new CashierEnterParams(str, cashierKey, c1709570uaZLJIIZILJ, null, new C1709070uZl(enumC1709240ua2, EnumC1709200uZy.CONTINUE, EnumC1709020uZg.FIRST_PAY), c1708990uZd, EnumC1708880uZS.LEGACY, new C1709220ua0(function0, function1, function02, function1, function1, function1, 58));
        CashierFragment cashierFragment = new CashierFragment();
        cashierFragment.LLJJJIL = cashierEnterParams;
        cashierFragment.getLifecycle().addObserver(new CashierFragmentStarter$addDestroyObserver$1(c1709050uZj, c1708990uZd));
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return;
        }
        cashierFragment.gS(c19egLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1709140uZs(CashierKey cashierKey, C1708990uZd c1708990uZd, Function0<C1710390ubt> function0, Function1<? super EnumC334240D8k, C1192680h8s> function1, Function0<Unit> function02) {
        this.LIZ = cashierKey;
        this.LIZIZ = c1708990uZd;
        this.LIZJ = function0;
        this.LIZLLL = function1;
        this.LJ = function02;
        this.LJFF = new C1708680uZ8(cashierKey.payRequestId);
    }
}

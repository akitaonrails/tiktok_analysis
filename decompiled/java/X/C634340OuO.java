package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS658S0100000_9;

/* JADX INFO: renamed from: X.0OuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634340OuO {
    public static final void LIZIZ(BaseFragment baseFragment) {
        C19EG activity;
        View view = baseFragment.getView();
        if (view != null && (activity = baseFragment.getActivity()) != null) {
            ((InputMethodManager) C786410Ut5.H2(activity, "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(1781430706);
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1685720ty6.LIZIZ(interfaceC1685750ty9, new AwS658S0100000_9(function0, (Function0<Unit>) 4));
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZIZ;
    }
}

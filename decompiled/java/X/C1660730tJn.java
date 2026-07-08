package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660730tJn implements InterfaceC1649090t11 {
    public final Function0<InterfaceC1674890tgd> LL;
    public final C1DRG LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 491));

    /* JADX WARN: Multi-variable type inference failed */
    public C1660730tJn(Function0<? extends InterfaceC1674890tgd> function0, C1DRG c1drg) {
        this.LL = function0;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.InterfaceC1649090t11
    public final boolean LIZ(EnumC1448590nnd enumC1448590nnd, View view, View view2, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view3;
        C1447470nlp.LIZIZ(view, C339190DRl.LIZ(12));
        C1461700o8m.LIZIZ(view2);
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            Object parent = view.getParent();
            if ((parent instanceof View) && (view3 = (View) parent) != null) {
                C1461700o8m.LIZIZ(view3);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C426750GoL.LJIIJ(marginLayoutParams, view.getContext(), 0, 0, 0, 0, 32);
        }
        C786410Ut5.W5(view, layoutParams);
        return true;
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649740t24 implements InterfaceC1649090t11 {
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 492));

    public C1649740t24(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1649090t11
    public final boolean LIZ(EnumC1448590nnd enumC1448590nnd, View view, View view2, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view3;
        C1447470nlp.LIZIZ(view, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        C578880Mn8.LIZ(view2);
        if (((Boolean) this.LLILLJJLI.getValue()).booleanValue()) {
            Object parent = view.getParent();
            if ((parent instanceof View) && (view3 = (View) parent) != null) {
                C578880Mn8.LIZ(view3);
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

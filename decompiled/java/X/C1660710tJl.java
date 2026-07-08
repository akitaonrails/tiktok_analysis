package X;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import lth.o;

/* JADX INFO: renamed from: X.0tJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660710tJl implements InterfaceC1649090t11 {
    public final Function0<InterfaceC1674890tgd> LL;
    public final C1DRG LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 496));

    /* JADX WARN: Multi-variable type inference failed */
    public C1660710tJl(Function0<? extends InterfaceC1674890tgd> function0, C1DRG c1drg) {
        this.LL = function0;
        this.LLILLJJLI = c1drg;
    }

    @Override // X.InterfaceC1649090t11
    public final boolean LIZ(EnumC1448590nnd enumC1448590nnd, View view, View view2, boolean z) {
        View view3;
        C1447470nlp.LIZIZ(view, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        C1447470nlp.LIZ(view2, 0.0f);
        C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, -1));
        if (((Boolean) this.LLILLL.getValue()).booleanValue()) {
            Object parent = view.getParent();
            if ((parent instanceof View) && (view3 = (View) parent) != null) {
                C1447470nlp.LIZ(view3, 0.0f);
                C786410Ut5.W5(view3, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        InterfaceC1674890tgd interfaceC1674890tgdInvoke = this.LL.invoke();
        if (interfaceC1674890tgdInvoke != null) {
            C1443590nfZ c1443590nfZ = o.LJIIJJI;
            c1443590nfZ.LIZ();
            int i = c1443590nfZ.LIZ;
            C1443590nfZ c1443590nfZ2 = o.LJIIJJI;
            c1443590nfZ2.LIZ();
            interfaceC1674890tgdInvoke.q2(i, c1443590nfZ2.LIZIZ, view);
            return true;
        }
        return true;
    }
}

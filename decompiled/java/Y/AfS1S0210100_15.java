package Y;

import X.C09JN;
import X.C0UVC;
import X.C1C7U;
import X.C957590b1h;
import X.C974540bT2;
import X.C977590bXx;
import X.C977620bY0;
import X.C977630bY1;
import X.C977720bYA;
import X.C977730bYB;
import X.C977770bYF;
import X.EnumC919170a1j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS1S0210100_15 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS1S0210100_15 afS1S0210100_15, Object obj) {
        C1C7U.LIZ("TeamMatchInviterViewModel@38a2.requestCancelApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJJJZI(afS1S0210100_15.j3, th, afS1S0210100_15.z2, (EnumC919170a1j) afS1S0210100_15.l0);
        C0UVC.LIZIZ(th);
        C977590bXx c977590bXx = (C977590bXx) afS1S0210100_15.l1;
        if (!c977590bXx.LJIJJLI) {
            c977590bXx.LJIIZILJ.setValue(C977720bYA.LIZ(new C977720bYA(null, null, null, null), null, null, null, th, 7));
        }
        C1C7U.LIZIZ("TeamMatchInviterViewModel@38a2.requestCancelApi$dispose$2");
    }

    public static final void accept$1(AfS1S0210100_15 afS1S0210100_15, Object obj) {
        Function1<Throwable, Unit> function1;
        C1C7U.LIZ("CombinedMatchInviterViewModel@5274.requestCancelApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJJJZI(afS1S0210100_15.j3, th, afS1S0210100_15.z2, EnumC919170a1j.MATCH_TYPE_1V1);
        C0UVC.LIZIZ(th);
        C977630bY1 c977630bY1 = (C977630bY1) afS1S0210100_15.l0;
        if (!c977630bY1.LJJJIL) {
            c977630bY1.LJJ.setValue(C977770bYF.LIZ(new C977770bYF(0), null, null, null, null, th, 15));
        }
        C957590b1h c957590b1h = (C957590b1h) afS1S0210100_15.l1;
        if (c957590b1h != null && (function1 = c957590b1h.LIZIZ) != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("CombinedMatchInviterViewModel@5274.requestCancelApi$dispose$2");
    }

    public static final void accept$2(AfS1S0210100_15 afS1S0210100_15, Object obj) {
        Function1<Throwable, Unit> function1;
        C1C7U.LIZ("TwoMatchInviterViewModel@1a1b.requestCancelApi$dispose$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJJJZI(afS1S0210100_15.j3, th, afS1S0210100_15.z2, EnumC919170a1j.MATCH_TYPE_1V1);
        C0UVC.LIZIZ(th);
        C977620bY0 c977620bY0 = (C977620bY0) afS1S0210100_15.l0;
        if (!c977620bY0.LJJIIJ) {
            c977620bY0.LJIIZILJ.setValue(C977730bYB.LIZ(new C977730bYB(null, null, null, null), null, null, null, th, 7));
        }
        C957590b1h c957590b1h = (C957590b1h) afS1S0210100_15.l1;
        if (c957590b1h != null && (function1 = c957590b1h.LIZIZ) != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("TwoMatchInviterViewModel@1a1b.requestCancelApi$dispose$2");
    }

    public AfS1S0210100_15(long j, boolean z, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j3 = j;
        this.z2 = z;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

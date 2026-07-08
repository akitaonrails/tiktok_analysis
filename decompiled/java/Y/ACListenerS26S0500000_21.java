package Y;

import X.C1066900ds0;
import X.C1104190eq9;
import X.C1392540mLE;
import X.C1393580mMu;
import X.C2344009Gk;
import X.C259800zU;
import X.C712520RxC;
import X.InterfaceC1393560mMs;
import X.InterfaceC1631620sYq;
import X.InterfaceC705550Rlx;
import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class ACListenerS26S0500000_21 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS26S0500000_21 aCListenerS26S0500000_21, View view) {
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) aCListenerS26S0500000_21.l0;
        C712520RxC c712520RxC = (C712520RxC) aCListenerS26S0500000_21.l1;
        C2344009Gk c2344009GkLIZIZ = C1392540mLE.LIZIZ(c712520RxC, interfaceC1393560mMs, ((C1393580mMu) aCListenerS26S0500000_21.l2).LJI(c712520RxC));
        c2344009GkLIZIZ.LJ(C1104190eq9.LIZ(((InterfaceC705550Rlx) aCListenerS26S0500000_21.l3).rootView(), "c9855.d4418"), "btm_param_map_key");
        interfaceC1393560mMs.LJFF(c2344009GkLIZIZ);
        C1393580mMu c1393580mMu = (C1393580mMu) aCListenerS26S0500000_21.l2;
        C1066900ds0 c1066900ds0 = c1393580mMu.LIZIZ;
        String strLIZIZ = null;
        if (c1066900ds0 != null) {
            c1393580mMu.LJIIIIZZ(c1066900ds0, null);
        }
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) ((C259800zU) aCListenerS26S0500000_21.l4).element;
        Boolean bool = Boolean.TRUE;
        View viewLJIIL = ((InterfaceC705550Rlx) aCListenerS26S0500000_21.l3).LJIIL();
        if (viewLJIIL != null) {
            strLIZIZ = C1104190eq9.LIZIZ(viewLJIIL, "c9855.d4418");
        }
        interfaceC1631620sYq.invoke(bool, bool, strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS26S0500000_21 r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS26S0500000_21.onClick$1(Y.ACListenerS26S0500000_21, android.view.View):void");
    }

    public ACListenerS26S0500000_21(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}

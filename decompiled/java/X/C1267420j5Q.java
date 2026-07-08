package X;

import Y.ARunnableS120S0100000_20;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: renamed from: X.0j5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267420j5Q implements InterfaceC1266680j4E {
    public final InterfaceC1267470j5V LL;
    public C1269990j9Z LLILLJJLI;

    @Override // X.InterfaceC1266680j4E
    public final void LIZLLL(C1267940j6G c1267940j6G) {
    }

    @Override // X.InterfaceC1266680j4E
    public final void LJ(Bundle bundle, C777170UeB c777170UeB, InterfaceC1270140j9o interfaceC1270140j9o) {
    }

    @Override // X.InterfaceC1266680j4E
    public final void LIZ() {
        Handler handler;
        C1269990j9Z c1269990j9Z = this.LLILLJJLI;
        if (c1269990j9Z != null) {
            if (C1267430j5R.LIZ[c1269990j9Z.LLJILLL.ordinal()] == 1 && (handler = c1269990j9Z.LLILZIL) != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1269990j9Z, 453));
            }
        }
        InterfaceC1267470j5V interfaceC1267470j5V = this.LL;
        if (interfaceC1267470j5V != null) {
            ((C1266850j4V) interfaceC1267470j5V).LIZ.LJIIJ();
        }
    }

    @Override // X.InterfaceC1266680j4E
    public final void LJIILL() {
        Handler handler;
        C1269990j9Z c1269990j9Z = this.LLILLJJLI;
        if (c1269990j9Z != null) {
            if (C1267430j5R.LIZ[c1269990j9Z.LLJILLL.ordinal()] == 1 && (handler = c1269990j9Z.LLILZIL) != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1269990j9Z, 412));
            }
        }
        InterfaceC1267470j5V interfaceC1267470j5V = this.LL;
        if (interfaceC1267470j5V != null) {
            ((C1266850j4V) interfaceC1267470j5V).LIZ.LJ();
        }
    }

    public C1267420j5Q(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, InterfaceC1267470j5V interfaceC1267470j5V, C1269730j99 c1269730j99) {
        this.LL = interfaceC1267470j5V;
        this.LLILLJJLI = new C1269990j9Z(c1267500j5Y, c1266350j3h, c1269730j99);
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            c1268700j7U.LIZ();
        }
    }
}

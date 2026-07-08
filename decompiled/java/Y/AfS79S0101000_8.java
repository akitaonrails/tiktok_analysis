package Y;

import X.C09JN;
import X.C0CHQ;
import X.C1C7U;
import X.C529740Kq4;
import X.C530380Kr6;
import X.InterfaceC535290Kz1;

/* JADX INFO: loaded from: classes9.dex */
public class AfS79S0101000_8 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS79S0101000_8 afS79S0101000_8, Object obj) {
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.scrollToFullyVisible$1");
        ((C529740Kq4) afS79S0101000_8.l0).LLJL.smoothScrollToPosition(afS79S0101000_8.i1);
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.scrollToFullyVisible$1");
    }

    public static final void accept$1(AfS79S0101000_8 afS79S0101000_8, Object obj) {
        InterfaceC535290Kz1 interfaceC535290Kz1 = (InterfaceC535290Kz1) afS79S0101000_8.l0;
        int i = afS79S0101000_8.i1;
        C1C7U.LIZ("MediaManager@e18e.loadMedia$5L");
        C0CHQ.LIZ().isDebugConfigOpen();
        if (interfaceC535290Kz1 != null) {
            interfaceC535290Kz1.LIZ(false, i, null, C530380Kr6.LIZ);
        }
        C1C7U.LIZIZ("MediaManager@e18e.loadMedia$5L");
    }

    public AfS79S0101000_8(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}

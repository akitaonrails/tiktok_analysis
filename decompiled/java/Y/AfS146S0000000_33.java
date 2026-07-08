package Y;

import X.C09JN;
import X.C1C7U;
import X.C2187451AjH;

/* JADX INFO: loaded from: classes34.dex */
public class AfS146S0000000_33 implements C09JN {
    public final int $t;

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

    public AfS146S0000000_33(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS146S0000000_33 afS146S0000000_33, Object obj) {
        C1C7U.LIZ("OptimizerHelper@3f44.registerMUnlockInBgV4$1L");
        if (((Boolean) obj).booleanValue()) {
            C2187451AjH.LJIILL(false);
        } else {
            C2187451AjH.LJIILIIL(C2187451AjH.LJIILLIIL, C2187451AjH.LJIIZILJ);
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.registerMUnlockInBgV4$1L");
    }

    public static final void accept$1(AfS146S0000000_33 afS146S0000000_33, Object obj) {
        C1C7U.LIZ("OptimizerHelper@3f44.registerMUnlockInBg$1L");
        if (((Boolean) obj).booleanValue()) {
            C2187451AjH.LJIILJJIL(false);
        } else {
            C2187451AjH.LJIIL(C2187451AjH.LJIILIIL);
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.registerMUnlockInBg$1L");
    }
}

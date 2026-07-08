package Y;

import X.C2247771CyN;
import X.InterfaceC1441305kZ;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS251S0100000_34 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public AObjectS251S0100000_34(C2247771CyN c2247771CyN, int i) {
        this.$t = i;
        this.l0 = c2247771CyN;
    }

    public static final void onChanged$0(AObjectS251S0100000_34 aObjectS251S0100000_34, Object obj) {
        ((C2247771CyN) aObjectS251S0100000_34.l0).LLJJIJIL = true;
    }

    public static final void onChanged$1(AObjectS251S0100000_34 aObjectS251S0100000_34, Object obj) {
        ((C2247771CyN) aObjectS251S0100000_34.l0).LLJJIJIL = false;
    }
}

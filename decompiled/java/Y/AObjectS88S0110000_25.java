package Y;

import X.C1644920suI;
import X.C1644940suK;
import X.InterfaceC1441305kZ;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS88S0110000_25 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final void onChanged$0(AObjectS88S0110000_25 aObjectS88S0110000_25, Object obj) {
        ((C1644920suI) aObjectS88S0110000_25.l0).X1((C1644940suK) obj, aObjectS88S0110000_25.z1);
    }

    public static final void onChanged$1(AObjectS88S0110000_25 aObjectS88S0110000_25, Object obj) {
        ((C1644920suI) aObjectS88S0110000_25.l0).X1((C1644940suK) obj, aObjectS88S0110000_25.z1);
    }

    public AObjectS88S0110000_25(C1644920suI c1644920suI, boolean z, int i) {
        this.$t = i;
        this.l0 = c1644920suI;
        this.z1 = z;
    }
}

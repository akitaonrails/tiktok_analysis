package Y;

import X.C09JN;
import X.C1C7U;
import X.C974540bT2;
import X.C976180bVg;
import X.C976190bVh;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AfS0S0211100_15 implements C09JN {
    public final int $t;
    public int i3;
    public long j4;
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
        }
    }

    public static final void accept$0(AfS0S0211100_15 afS0S0211100_15, Object obj) {
        C1C7U.LIZ("MatchMatchingCoordinator@f28c.requestSettleFinishApi$finishDispose$2");
        Throwable th = (Throwable) obj;
        ((C976190bVh) afS0S0211100_15.l0).LJI = false;
        C974540bT2.LIZ.LJJL(afS0S0211100_15.j4, afS0S0211100_15.z2, afS0S0211100_15.i3, th);
        ((Function1) afS0S0211100_15.l1).invoke(th);
        C1C7U.LIZIZ("MatchMatchingCoordinator@f28c.requestSettleFinishApi$finishDispose$2");
    }

    public static final void accept$1(AfS0S0211100_15 afS0S0211100_15, Object obj) {
        C1C7U.LIZ("TwoMatchMatchingCoordinator@caf2.requestSettleFinishApi$finishDispose$2");
        Throwable th = (Throwable) obj;
        ((C976180bVg) afS0S0211100_15.l0).LJ = false;
        C974540bT2.LIZ.LJJL(afS0S0211100_15.j4, afS0S0211100_15.z2, afS0S0211100_15.i3, th);
        ((Function1) afS0S0211100_15.l1).invoke(th);
        C1C7U.LIZIZ("TwoMatchMatchingCoordinator@caf2.requestSettleFinishApi$finishDispose$2");
    }

    public AfS0S0211100_15(Object obj, long j, boolean z, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.j4 = j;
        this.z2 = z;
        this.i3 = i;
        this.l1 = obj2;
    }
}

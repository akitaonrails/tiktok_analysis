package Y;

import X.C09JN;
import X.C1C7U;
import X.C484570IzP;
import X.C484580IzQ;

/* JADX INFO: loaded from: classes8.dex */
public class AfS0S0101100_7 implements C09JN {
    public final int $t;
    public int i1;
    public long j2;
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

    public static final void accept$0(AfS0S0101100_7 afS0S0101100_7, Object obj) {
        C1C7U.LIZ("FollowGuideFilter@ba9e.serverFilter$2");
        ((C484570IzP) afS0S0101100_7.l0).LIZIZ(afS0S0101100_7.i1, afS0S0101100_7.j2);
        C1C7U.LIZIZ("FollowGuideFilter@ba9e.serverFilter$2");
    }

    public static final void accept$1(AfS0S0101100_7 afS0S0101100_7, Object obj) {
        C1C7U.LIZ("ToolbarTipsFilter@552f.serverFilter$3");
        ((C484580IzQ) afS0S0101100_7.l0).LIZIZ(afS0S0101100_7.i1, afS0S0101100_7.j2);
        C1C7U.LIZIZ("ToolbarTipsFilter@552f.serverFilter$3");
    }

    public AfS0S0101100_7(Object obj, long j, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.j2 = j;
        this.i1 = i;
    }
}

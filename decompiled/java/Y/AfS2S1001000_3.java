package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public class AfS2S1001000_3 implements C09JN {
    public final int $t;
    public int i1;
    public String s0;

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

    public static final void accept$0(AfS2S1001000_3 afS2S1001000_3, Object obj) {
        String str = afS2S1001000_3.s0;
        int i = afS2S1001000_3.i1;
        C1C7U.LIZ("LiveHostAction@d608.updateSettingItem$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" update setting item success: ");
        sbLIZ.append(str);
        sbLIZ.append(" ,");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveHostAction", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveHostAction@d608.updateSettingItem$1L");
    }

    public static final void accept$1(AfS2S1001000_3 afS2S1001000_3, Object obj) {
        String str = afS2S1001000_3.s0;
        int i = afS2S1001000_3.i1;
        C1C7U.LIZ("LiveHostAction@d608.updateSettingItem$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" update setting item error: ");
        sbLIZ.append(str);
        sbLIZ.append(" ,");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveHostAction", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveHostAction@d608.updateSettingItem$2L");
    }

    public AfS2S1001000_3(String str, int i, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}

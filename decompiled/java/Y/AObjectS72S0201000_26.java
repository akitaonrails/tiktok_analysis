package Y;

import X.C1699260uJw;
import X.C1699270uJx;
import X.C2188811AlT;
import X.InterfaceC1484830ok5;
import android.view.Surface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AObjectS72S0201000_26 implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS72S0201000_26 aObjectS72S0201000_26) {
        ((C1699260uJw) aObjectS72S0201000_26.l0).LJJJJZ(aObjectS72S0201000_26.i2, (Surface) aObjectS72S0201000_26.l1);
        return null;
    }

    public static final Object invoke$1(AObjectS72S0201000_26 aObjectS72S0201000_26) {
        C1699270uJx c1699270uJx = (C1699270uJx) aObjectS72S0201000_26.l0;
        Surface surface = (Surface) aObjectS72S0201000_26.l1;
        int i = aObjectS72S0201000_26.i2;
        InterfaceC1484830ok5 interfaceC1484830ok5 = c1699270uJx.LLJILJILJ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJJIIJZLJL(i, surface, true);
        }
        if (surface != null) {
            c1699270uJx.LLJJIJI = false;
        } else {
            c1699270uJx.LLJJIJI = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asyncSetSurface: timeout:");
        sbLIZ.append(i);
        sbLIZ.append(" mIsSurfaceReleased:");
        sbLIZ.append(c1699270uJx.LLJJIJI);
        c1699270uJx.LJJJJJL("TTLivePlayer3", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public AObjectS72S0201000_26(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}

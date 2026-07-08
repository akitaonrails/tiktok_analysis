package Y;

import X.C1259360isQ;
import X.C1266190j3R;
import X.InterfaceC1259560isk;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS101S0101000_19 implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AObjectS101S0101000_19 aObjectS101S0101000_19) {
        C1266190j3R c1266190j3R = (C1266190j3R) aObjectS101S0101000_19.l0;
        int i = aObjectS101S0101000_19.i1;
        VerticalViewPager verticalViewPager = ((DetailFragmentPanel) c1266190j3R.l0).LLJJIJI;
        if (verticalViewPager != null && verticalViewPager.getCurrentItem() == i && ((DetailFragmentPanel) c1266190j3R.l0).LLJJIJI.getScrollState() == 0) {
            ((DetailFragmentPanel) c1266190j3R.l0).z0(i);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS101S0101000_19 aObjectS101S0101000_19) {
        C1259360isQ c1259360isQ = (C1259360isQ) aObjectS101S0101000_19.l0;
        int i = aObjectS101S0101000_19.i1;
        InterfaceC1259560isk interfaceC1259560isk = c1259360isQ.LLLLLLJ;
        if (interfaceC1259560isk != null) {
            interfaceC1259560isk.LIZIZ(i, 30, null);
        }
        return Unit.LIZ;
    }

    public AObjectS101S0101000_19(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}

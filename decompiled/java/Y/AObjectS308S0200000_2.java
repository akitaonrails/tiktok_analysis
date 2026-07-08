package Y;

import X.C786410Ut5;
import X.InterfaceC1449905lx;
import X.InterfaceC1631620sYq;
import X.InterfaceC1844700y6W;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS308S0200000_2 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS308S0200000_2 aObjectS308S0200000_2, Object obj) {
        Float f = (Float) obj;
        if (((boolean[]) aObjectS308S0200000_2.l0)[0]) {
            return Unit.LIZ;
        }
        if (f.floatValue() <= -0.5f) {
            if (((View) aObjectS308S0200000_2.l1).getVisibility() != 8) {
                C786410Ut5.LJLLLLLL(8, (View) aObjectS308S0200000_2.l1);
            }
        } else if (((View) aObjectS308S0200000_2.l1).getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, (View) aObjectS308S0200000_2.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS308S0200000_2 aObjectS308S0200000_2, Object obj) {
        final InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS308S0200000_2.l0;
        final InterfaceC1449905lx interfaceC1449905lx = (InterfaceC1449905lx) aObjectS308S0200000_2.l1;
        final Function1 function1 = (Function1) obj;
        return new Function1() { // from class: X.05lh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return interfaceC1631620sYq.invoke(interfaceC1449905lx, function1, obj2);
            }
        };
    }

    public static final Object invoke$2(AObjectS308S0200000_2 aObjectS308S0200000_2, Object obj) {
        ((Function1) aObjectS308S0200000_2.l0).invoke(((InterfaceC1844700y6W) aObjectS308S0200000_2.l1).get(obj));
        return Unit.LIZ;
    }

    public AObjectS308S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}

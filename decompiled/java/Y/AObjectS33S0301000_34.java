package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS33S0301000_34 implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AObjectS33S0301000_34 aObjectS33S0301000_34) {
        return ((C2221091BwR) aObjectS33S0301000_34.l0).LJJIJIL(aObjectS33S0301000_34.i3, (byte[]) aObjectS33S0301000_34.l1, (Integer) aObjectS33S0301000_34.l2);
    }

    public static final Object invoke$1(AObjectS33S0301000_34 aObjectS33S0301000_34) {
        return ((C2221081BwQ) aObjectS33S0301000_34.l0).LJJIJIL(aObjectS33S0301000_34.i3, (byte[]) aObjectS33S0301000_34.l1, (Integer) aObjectS33S0301000_34.l2);
    }

    public AObjectS33S0301000_34(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

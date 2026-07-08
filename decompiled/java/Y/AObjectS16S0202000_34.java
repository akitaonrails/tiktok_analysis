package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS16S0202000_34 implements Function0 {
    public final int $t;
    public int i2;
    public int i3;
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

    public static final Object invoke$0(AObjectS16S0202000_34 aObjectS16S0202000_34) {
        return ((C2221081BwQ) aObjectS16S0202000_34.l0).LJJJJIZL(aObjectS16S0202000_34.i2, aObjectS16S0202000_34.i3, (Integer) aObjectS16S0202000_34.l1);
    }

    public static final Object invoke$1(AObjectS16S0202000_34 aObjectS16S0202000_34) {
        return ((C2221091BwR) aObjectS16S0202000_34.l0).LJJJJIZL(aObjectS16S0202000_34.i2, aObjectS16S0202000_34.i3, (Integer) aObjectS16S0202000_34.l1);
    }

    public AObjectS16S0202000_34(Object obj, int i, int i2, Object obj2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = obj2;
    }
}

package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS82S1200000_34 implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object invoke$0(AObjectS82S1200000_34 aObjectS82S1200000_34) {
        return ((C2221081BwQ) aObjectS82S1200000_34.l1).LJIIL(aObjectS82S1200000_34.s0, (byte[]) aObjectS82S1200000_34.l2, true);
    }

    public static final Object invoke$1(AObjectS82S1200000_34 aObjectS82S1200000_34) {
        return ((C2221091BwR) aObjectS82S1200000_34.l1).LJIIL(aObjectS82S1200000_34.s0, (byte[]) aObjectS82S1200000_34.l2, true);
    }

    public AObjectS82S1200000_34(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}

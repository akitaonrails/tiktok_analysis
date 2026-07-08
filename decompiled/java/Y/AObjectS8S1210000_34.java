package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS8S1210000_34 implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AObjectS8S1210000_34 aObjectS8S1210000_34) {
        return ((C2221091BwR) aObjectS8S1210000_34.l1).LJIIL(aObjectS8S1210000_34.s0, (byte[]) aObjectS8S1210000_34.l2, aObjectS8S1210000_34.z3);
    }

    public static final Object invoke$1(AObjectS8S1210000_34 aObjectS8S1210000_34) {
        return ((C2221081BwQ) aObjectS8S1210000_34.l1).LJIIL(aObjectS8S1210000_34.s0, (byte[]) aObjectS8S1210000_34.l2, aObjectS8S1210000_34.z3);
    }

    public AObjectS8S1210000_34(Object obj, String str, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.z3 = z;
    }
}

package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS9S1100100_34 implements Function0 {
    public final int $t;
    public long j2;
    public Object l1;
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

    public static final Object invoke$0(AObjectS9S1100100_34 aObjectS9S1100100_34) {
        return ((C2221091BwR) aObjectS9S1100100_34.l1).LJJJJ(aObjectS9S1100100_34.j2, aObjectS9S1100100_34.s0);
    }

    public static final Object invoke$1(AObjectS9S1100100_34 aObjectS9S1100100_34) {
        return ((C2221081BwQ) aObjectS9S1100100_34.l1).LJJJJ(aObjectS9S1100100_34.j2, aObjectS9S1100100_34.s0);
    }

    public AObjectS9S1100100_34(Object obj, String str, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.j2 = j;
    }
}

package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS5S0101100_34 implements Function0 {
    public final int $t;
    public int i1;
    public long j2;
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

    public static final Object invoke$0(AObjectS5S0101100_34 aObjectS5S0101100_34) {
        return ((C2221091BwR) aObjectS5S0101100_34.l0).LJIIIZ(aObjectS5S0101100_34.i1, aObjectS5S0101100_34.j2);
    }

    public static final Object invoke$1(AObjectS5S0101100_34 aObjectS5S0101100_34) {
        return ((C2221081BwQ) aObjectS5S0101100_34.l0).LJIIIZ(aObjectS5S0101100_34.i1, aObjectS5S0101100_34.j2);
    }

    public AObjectS5S0101100_34(Object obj, int i, long j, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
        this.j2 = j;
    }
}

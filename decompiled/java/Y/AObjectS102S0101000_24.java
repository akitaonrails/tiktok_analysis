package Y;

import X.C1603970rqF;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AObjectS102S0101000_24 implements Function0 {
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

    public static final Object invoke$0(AObjectS102S0101000_24 aObjectS102S0101000_24) {
        ((C1603970rqF) aObjectS102S0101000_24.l0).LIZ(aObjectS102S0101000_24.i1);
        return null;
    }

    public static final Object invoke$1(AObjectS102S0101000_24 aObjectS102S0101000_24) {
        ((C1603970rqF) aObjectS102S0101000_24.l0).LJFF(aObjectS102S0101000_24.i1);
        return null;
    }

    public AObjectS102S0101000_24(C1603970rqF c1603970rqF, int i, int i2) {
        this.$t = i2;
        this.l0 = c1603970rqF;
        this.i1 = i;
    }
}

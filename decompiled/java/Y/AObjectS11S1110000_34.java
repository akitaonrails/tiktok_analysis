package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS11S1110000_34 implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS11S1110000_34 aObjectS11S1110000_34) {
        return ((C2221081BwQ) aObjectS11S1110000_34.l1).LJIJJ(aObjectS11S1110000_34.s0, aObjectS11S1110000_34.z2);
    }

    public static final Object invoke$1(AObjectS11S1110000_34 aObjectS11S1110000_34) {
        return ((C2221091BwR) aObjectS11S1110000_34.l1).LIZIZ(aObjectS11S1110000_34.s0, aObjectS11S1110000_34.z2);
    }

    public static final Object invoke$2(AObjectS11S1110000_34 aObjectS11S1110000_34) {
        return ((C2221081BwQ) aObjectS11S1110000_34.l1).LIZIZ(aObjectS11S1110000_34.s0, aObjectS11S1110000_34.z2);
    }

    public static final Object invoke$3(AObjectS11S1110000_34 aObjectS11S1110000_34) {
        return ((C2221091BwR) aObjectS11S1110000_34.l1).LJIJJ(aObjectS11S1110000_34.s0, aObjectS11S1110000_34.z2);
    }

    public AObjectS11S1110000_34(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}

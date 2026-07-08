package Y;

import X.C2220221Bv2;
import X.C2220331BvD;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS15S1101000_34 implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS15S1101000_34 aObjectS15S1101000_34, Object obj) {
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS15S1101000_34.l1;
        String str = aObjectS15S1101000_34.s0;
        int i = aObjectS15S1101000_34.i2;
        c2220331BvD.getClass();
        C2220221Bv2 c2220221Bv2LIZ = C2220331BvD.LIZ((C2220221Bv2) obj);
        c2220331BvD.LJJIIJZLJL(c2220221Bv2LIZ, str);
        c2220331BvD.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i), c2220221Bv2LIZ.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS15S1101000_34 aObjectS15S1101000_34, Object obj) {
        C2220331BvD c2220331BvD = (C2220331BvD) aObjectS15S1101000_34.l1;
        String str = aObjectS15S1101000_34.s0;
        int i = aObjectS15S1101000_34.i2;
        c2220331BvD.getClass();
        c2220331BvD.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i), C2220331BvD.LIZJ((C2220221Bv2) obj, str).LIZ());
        return Unit.LIZ;
    }

    public AObjectS15S1101000_34(C2220331BvD c2220331BvD, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = c2220331BvD;
        this.s0 = str;
        this.i2 = i;
    }
}

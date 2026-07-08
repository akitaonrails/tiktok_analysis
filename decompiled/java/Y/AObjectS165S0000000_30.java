package Y;

import X.C13G2;
import X.C13G7;
import X.C13HG;
import X.C13IQ;
import X.C19983613Gw;
import X.C20049413ca;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AObjectS165S0000000_30 implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS165S0000000_30(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS165S0000000_30 aObjectS165S0000000_30, Object obj, Object obj2) {
        return ((C20049413ca) obj2).LIZ;
    }

    public static final Object invoke$1(AObjectS165S0000000_30 aObjectS165S0000000_30, Object obj, Object obj2) {
        List list = (List) obj2;
        return C13G2.LIZ((C13IQ) obj, C13G2.LIZLLL(C13G7.LIZ, list, true), new AObjectS404S0100000_30(list, 7));
    }

    public static final Object invoke$2(AObjectS165S0000000_30 aObjectS165S0000000_30, Object obj, Object obj2) {
        List list = (List) obj2;
        C13HG<? extends Object> c13hgLIZ = C13G2.LIZ((C13IQ) obj, C13G2.LIZLLL(C13G7.LIZ, list, true), new AObjectS404S0100000_30(list, 8));
        if (c13hgLIZ != null) {
            return C19983613Gw.LIZ(c13hgLIZ);
        }
        return null;
    }
}

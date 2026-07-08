package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS3S2210000_34 implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

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

    public static final Object invoke$0(AObjectS3S2210000_34 aObjectS3S2210000_34) {
        return ((C2221091BwR) aObjectS3S2210000_34.l2).LJIIIIZZ(aObjectS3S2210000_34.s0, aObjectS3S2210000_34.s1, (List) aObjectS3S2210000_34.l3, aObjectS3S2210000_34.z4);
    }

    public static final Object invoke$1(AObjectS3S2210000_34 aObjectS3S2210000_34) {
        return ((C2221081BwQ) aObjectS3S2210000_34.l2).LJIIIIZZ(aObjectS3S2210000_34.s0, aObjectS3S2210000_34.s1, (List) aObjectS3S2210000_34.l3, aObjectS3S2210000_34.z4);
    }

    public AObjectS3S2210000_34(Object obj, String str, Object obj2, boolean z, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
        this.z4 = z;
        this.s1 = str2;
    }
}

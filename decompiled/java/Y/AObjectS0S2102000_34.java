package Y;

import X.C2221081BwQ;
import X.C2221091BwR;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS0S2102000_34 implements Function0 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AObjectS0S2102000_34 aObjectS0S2102000_34) {
        return ((C2221091BwR) aObjectS0S2102000_34.l2).LJJJZ(aObjectS0S2102000_34.i3, aObjectS0S2102000_34.i4, aObjectS0S2102000_34.s0, aObjectS0S2102000_34.s1);
    }

    public static final Object invoke$1(AObjectS0S2102000_34 aObjectS0S2102000_34) {
        return ((C2221081BwQ) aObjectS0S2102000_34.l2).LJJJZ(aObjectS0S2102000_34.i3, aObjectS0S2102000_34.i4, aObjectS0S2102000_34.s0, aObjectS0S2102000_34.s1);
    }

    public AObjectS0S2102000_34(Object obj, String str, int i, int i2, String str2, int i3) {
        this.$t = i3;
        this.l2 = obj;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
        this.s1 = str2;
    }
}

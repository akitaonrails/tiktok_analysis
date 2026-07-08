package Y;

import X.C474500IjA;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS49S1000000_12 implements Function1 {
    public final int $t;
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

    public AObjectS49S1000000_12(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AObjectS49S1000000_12 aObjectS49S1000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII(aObjectS49S1000000_12.s0, "features");
        return c474500IjA;
    }

    public static final Object invoke$1(AObjectS49S1000000_12 aObjectS49S1000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII(aObjectS49S1000000_12.s0, "features");
        return c474500IjA;
    }
}

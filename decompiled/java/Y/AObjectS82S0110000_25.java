package Y;

import X.C594920NVa;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS82S0110000_25 implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AObjectS82S0110000_25 aObjectS82S0110000_25) {
        boolean z = aObjectS82S0110000_25.z1;
        Function0 function0 = (Function0) aObjectS82S0110000_25.l0;
        if (z) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS82S0110000_25 aObjectS82S0110000_25) {
        boolean z = aObjectS82S0110000_25.z1;
        Function0 function0 = (Function0) aObjectS82S0110000_25.l0;
        if (z) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS82S0110000_25 aObjectS82S0110000_25) {
        float fLIZLLL;
        boolean z = aObjectS82S0110000_25.z1;
        C594920NVa c594920NVa = (C594920NVa) aObjectS82S0110000_25.l0;
        if (z) {
            fLIZLLL = c594920NVa.LIZLLL();
        } else {
            fLIZLLL = 0.0f;
        }
        return Float.valueOf(fLIZLLL);
    }

    public static final Object invoke$3(AObjectS82S0110000_25 aObjectS82S0110000_25) {
        boolean z = aObjectS82S0110000_25.z1;
        Function0 function0 = (Function0) aObjectS82S0110000_25.l0;
        if (z) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public AObjectS82S0110000_25(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}

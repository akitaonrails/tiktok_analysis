package Y;

import X.C1668330tW3;
import X.C1672740tdA;
import X.C1677750tlF;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS108S0101000_25 implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS108S0101000_25(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    public static final Object invoke$0(AObjectS108S0101000_25 aObjectS108S0101000_25, Object obj, Object obj2) {
        Function0 function0 = (Function0) aObjectS108S0101000_25.l0;
        int i = aObjectS108S0101000_25.i1;
        ((Integer) obj2).intValue();
        C1672740tdA.LIZLLL(function0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS108S0101000_25 aObjectS108S0101000_25, Object obj, Object obj2) {
        Function2 function2 = (Function2) aObjectS108S0101000_25.l0;
        int i = aObjectS108S0101000_25.i1;
        ((Integer) obj2).intValue();
        C1668330tW3.LJ(function2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS108S0101000_25 aObjectS108S0101000_25, Object obj, Object obj2) {
        Function2 function2 = (Function2) aObjectS108S0101000_25.l0;
        int i = aObjectS108S0101000_25.i1;
        ((Integer) obj2).intValue();
        C1668330tW3.LIZIZ(function2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS108S0101000_25 aObjectS108S0101000_25, Object obj, Object obj2) {
        C1677750tlF c1677750tlF = (C1677750tlF) aObjectS108S0101000_25.l0;
        int i = aObjectS108S0101000_25.i1;
        ((Integer) obj2).intValue();
        c1677750tlF.LIZ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1));
        return Unit.LIZ;
    }
}

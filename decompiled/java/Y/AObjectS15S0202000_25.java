package Y;

import X.C1670340tZI;
import X.C1672790tdF;
import X.C341440Da2;
import X.C594920NVa;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS15S0202000_25 implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS15S0202000_25 aObjectS15S0202000_25, Object obj, Object obj2) {
        C594920NVa c594920NVa = (C594920NVa) aObjectS15S0202000_25.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS15S0202000_25.l1;
        int i = aObjectS15S0202000_25.i2;
        int i2 = aObjectS15S0202000_25.i3;
        ((Integer) obj2).intValue();
        C1672790tdF.LIZ(c594920NVa, interfaceC1685750ty9, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS15S0202000_25 aObjectS15S0202000_25, Object obj, Object obj2) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS15S0202000_25.l0;
        Function1 function1 = (Function1) aObjectS15S0202000_25.l1;
        int i = aObjectS15S0202000_25.i2;
        int i2 = aObjectS15S0202000_25.i3;
        ((Integer) obj2).intValue();
        C1670340tZI.LIZ(interfaceC1685750ty9, function1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public AObjectS15S0202000_25(Object obj, Object obj2, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
        this.i3 = i2;
    }
}

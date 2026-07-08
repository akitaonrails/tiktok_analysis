package Y;

import X.C1668190tVp;
import X.C1672740tdA;
import X.C341440Da2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS1S0212000_25 implements Function2 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AObjectS1S0212000_25 aObjectS1S0212000_25, Object obj, Object obj2) {
        boolean z = aObjectS1S0212000_25.z2;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS1S0212000_25.l0;
        Function2 function2 = (Function2) aObjectS1S0212000_25.l1;
        int i = aObjectS1S0212000_25.i3;
        ((Integer) obj2).intValue();
        C1672740tdA.LIZIZ(C341440Da2.LIZ(i | 1), aObjectS1S0212000_25.i4, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, function2, z);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS1S0212000_25 aObjectS1S0212000_25, Object obj, Object obj2) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS1S0212000_25.l0;
        boolean z = aObjectS1S0212000_25.z2;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS1S0212000_25.l1;
        int i = aObjectS1S0212000_25.i3;
        int i2 = aObjectS1S0212000_25.i4;
        ((Integer) obj2).intValue();
        C1668190tVp.LIZ(interfaceC1685750ty9, z, interfaceC1631620sYq, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS1S0212000_25 aObjectS1S0212000_25, Object obj, Object obj2) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS1S0212000_25.l0;
        boolean z = aObjectS1S0212000_25.z2;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS1S0212000_25.l1;
        int i = aObjectS1S0212000_25.i3;
        int i2 = aObjectS1S0212000_25.i4;
        ((Integer) obj2).intValue();
        C1668190tVp.LIZ(interfaceC1685750ty9, z, interfaceC1631620sYq, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public AObjectS1S0212000_25(int i, int i2, Object obj, Object obj2, boolean z, int i3) {
        this.$t = i3;
        this.z2 = z;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.i4 = i2;
    }
}

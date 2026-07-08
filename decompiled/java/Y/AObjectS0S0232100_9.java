package Y;

import X.C1669340tXg;
import X.C341440Da2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS0S0232100_9 implements Function2 {
    public final int $t;
    public int i5;
    public int i6;
    public long j7;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

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

    public static final Object invoke$0(AObjectS0S0232100_9 aObjectS0S0232100_9, Object obj, Object obj2) {
        long j = aObjectS0S0232100_9.j7;
        Function0 function0 = (Function0) aObjectS0S0232100_9.l0;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS0S0232100_9.l1;
        boolean z = aObjectS0S0232100_9.z2;
        boolean z2 = aObjectS0S0232100_9.z3;
        boolean z3 = aObjectS0S0232100_9.z4;
        int i = aObjectS0S0232100_9.i5;
        int i2 = aObjectS0S0232100_9.i6;
        ((Integer) obj2).intValue();
        C1669340tXg.LIZ(j, function0, interfaceC1631620sYq, z, z2, z3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS0S0232100_9 aObjectS0S0232100_9, Object obj, Object obj2) {
        long j = aObjectS0S0232100_9.j7;
        Function0 function0 = (Function0) aObjectS0S0232100_9.l0;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS0S0232100_9.l1;
        boolean z = aObjectS0S0232100_9.z2;
        boolean z2 = aObjectS0S0232100_9.z3;
        boolean z3 = aObjectS0S0232100_9.z4;
        int i = aObjectS0S0232100_9.i5;
        int i2 = aObjectS0S0232100_9.i6;
        ((Integer) obj2).intValue();
        C1669340tXg.LIZ(j, function0, interfaceC1631620sYq, z, z2, z3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public AObjectS0S0232100_9(long j, Function0 function0, InterfaceC1631620sYq interfaceC1631620sYq, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        this.$t = i3;
        this.j7 = j;
        this.l0 = function0;
        this.l1 = interfaceC1631620sYq;
        this.z2 = z;
        this.z3 = z2;
        this.z4 = z3;
        this.i5 = i;
        this.i6 = i2;
    }
}

package Y;

import X.C1670100tYu;
import X.C1673100tdk;
import X.C1673110tdl;
import X.C341440Da2;
import X.InterfaceC1670130tYx;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC595010NVj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS0S0422000_25 implements Function2 {
    public final int $t;
    public int i6;
    public int i7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;
    public boolean z5;

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

    public static final Object invoke$0(AObjectS0S0422000_25 aObjectS0S0422000_25, Object obj, Object obj2) {
        boolean z = aObjectS0S0422000_25.z4;
        Function1 function1 = (Function1) aObjectS0S0422000_25.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS0S0422000_25.l1;
        C1673110tdl c1673110tdl = (C1673110tdl) aObjectS0S0422000_25.l2;
        boolean z2 = aObjectS0S0422000_25.z5;
        InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) aObjectS0S0422000_25.l3;
        int i = aObjectS0S0422000_25.i6;
        int i2 = aObjectS0S0422000_25.i7;
        ((Integer) obj2).intValue();
        C1673100tdk.LIZIZ(z, function1, interfaceC1685750ty9, c1673110tdl, z2, interfaceC595010NVj, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS0S0422000_25 aObjectS0S0422000_25, Object obj, Object obj2) {
        boolean z = aObjectS0S0422000_25.z4;
        Function0 function0 = (Function0) aObjectS0S0422000_25.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS0S0422000_25.l1;
        boolean z2 = aObjectS0S0422000_25.z5;
        InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) aObjectS0S0422000_25.l2;
        InterfaceC1670130tYx interfaceC1670130tYx = (InterfaceC1670130tYx) aObjectS0S0422000_25.l3;
        int i = aObjectS0S0422000_25.i6;
        int i2 = aObjectS0S0422000_25.i7;
        ((Integer) obj2).intValue();
        C1670100tYu.LIZ(z, function0, interfaceC1685750ty9, z2, interfaceC595010NVj, interfaceC1670130tYx, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public AObjectS0S0422000_25(boolean z, Object obj, Object obj2, boolean z2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.$t = i3;
        this.z4 = z;
        this.l0 = obj;
        this.l1 = obj2;
        this.z5 = z2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.i6 = i;
        this.i7 = i2;
    }
}

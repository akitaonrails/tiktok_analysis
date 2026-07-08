package Y;

import X.C1668690tWd;
import X.C1668880tWw;
import X.C1672870tdN;
import X.C1673210tdv;
import X.C1685910tyP;
import X.C341440Da2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS2S0302000_25 implements Function2 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AObjectS2S0302000_25 aObjectS2S0302000_25, Object obj, Object obj2) {
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS2S0302000_25.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS2S0302000_25.l1;
        Function2 function2 = (Function2) aObjectS2S0302000_25.l2;
        int i = aObjectS2S0302000_25.i3;
        int i2 = aObjectS2S0302000_25.i4;
        ((Integer) obj2).intValue();
        C1673210tdv.LJIIJJI(interfaceC1631620sYq, interfaceC1685750ty9, function2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS2S0302000_25 aObjectS2S0302000_25, Object obj, Object obj2) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS2S0302000_25.l0;
        C1668880tWw c1668880tWw = (C1668880tWw) aObjectS2S0302000_25.l1;
        C1685910tyP c1685910tyP = (C1685910tyP) aObjectS2S0302000_25.l2;
        int i = aObjectS2S0302000_25.i3;
        int i2 = aObjectS2S0302000_25.i4;
        ((Integer) obj2).intValue();
        C1668690tWd.LIZJ(interfaceC1685750ty9, c1668880tWw, c1685910tyP, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS2S0302000_25 aObjectS2S0302000_25, Object obj, Object obj2) {
        Function2 function2 = (Function2) aObjectS2S0302000_25.l0;
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS2S0302000_25.l1;
        Function2 function22 = (Function2) aObjectS2S0302000_25.l2;
        int i = aObjectS2S0302000_25.i3;
        int i2 = aObjectS2S0302000_25.i4;
        ((Integer) obj2).intValue();
        C1673210tdv.LJIIL(function2, interfaceC1685750ty9, function22, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS2S0302000_25 aObjectS2S0302000_25, Object obj, Object obj2) {
        Object obj3 = aObjectS2S0302000_25.l0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aObjectS2S0302000_25.l1;
        Function1 function1 = (Function1) aObjectS2S0302000_25.l2;
        int i = aObjectS2S0302000_25.i3;
        int i2 = aObjectS2S0302000_25.i4;
        ((Integer) obj2).intValue();
        C1672870tdN.LIZ(obj3, lifecycleOwner, function1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1), i2);
        return Unit.LIZ;
    }

    public AObjectS2S0302000_25(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
        this.i4 = i2;
    }
}

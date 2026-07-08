package Y;

import X.C1673210tdv;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS2S0112000_19 implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AObjectS2S0112000_19 aObjectS2S0112000_19, Object obj, Object obj2) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS2S0112000_19.l0;
        boolean z = aObjectS2S0112000_19.z1;
        int i = aObjectS2S0112000_19.i2;
        ((Integer) obj2).intValue();
        C1673210tdv.LJIIIZ(C341440Da2.LIZ(i | 1), aObjectS2S0112000_19.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, z);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS2S0112000_19 aObjectS2S0112000_19, Object obj, Object obj2) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) aObjectS2S0112000_19.l0;
        boolean z = aObjectS2S0112000_19.z1;
        int i = aObjectS2S0112000_19.i2;
        ((Integer) obj2).intValue();
        C1673210tdv.LJIIIIZZ(C341440Da2.LIZ(i | 1), aObjectS2S0112000_19.i3, (InterfaceC1680500tpg) obj, interfaceC1685750ty9, z);
        return Unit.LIZ;
    }

    public AObjectS2S0112000_19(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, int i3) {
        this.$t = i3;
        this.l0 = interfaceC1685750ty9;
        this.z1 = z;
        this.i2 = i;
        this.i3 = i2;
    }
}

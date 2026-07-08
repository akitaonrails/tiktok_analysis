package Y;

import X.C1668040tVa;
import X.C1670950taH;
import X.C1685760tyA;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import androidx.compose.foundation.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS1S1130000_25 implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;
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

    public static final Object invoke$0(AObjectS1S1130000_25 aObjectS1S1130000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670950taH.LJFF(aObjectS1S1130000_25.s0, (Function0) aObjectS1S1130000_25.l1, aObjectS1S1130000_25.z2, aObjectS1S1130000_25.z3, aObjectS1S1130000_25.z4, c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), interfaceC1680500tpg, 196608, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS1S1130000_25 aObjectS1S1130000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            String str = aObjectS1S1130000_25.s0;
            Function0 function0 = (Function0) aObjectS1S1130000_25.l1;
            boolean z = aObjectS1S1130000_25.z2;
            boolean z2 = aObjectS1S1130000_25.z3;
            boolean z3 = aObjectS1S1130000_25.z4;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1670950taH.LJFF(str, function0, z, z2, z3, c.LJIJJLI(c1685760tyA, C1668040tVa.LJIILJJIL, false), interfaceC1680500tpg, 196608, 0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS1S1130000_25(String str, String str2, Function0<Unit> function0, boolean z, boolean z2, boolean z3) {
        this.$t = z3 ? 1 : 0;
        this.s0 = str;
        this.l1 = str2;
        this.z2 = function0;
        this.z3 = z;
        this.z4 = z2;
    }
}

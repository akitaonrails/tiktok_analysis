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
public class AObjectS12S1110000_25 implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;
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

    public static final Object invoke$0(AObjectS12S1110000_25 aObjectS12S1110000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670950taH.LJI(0, interfaceC1680500tpg, aObjectS12S1110000_25.s0, (Function0) aObjectS12S1110000_25.l1, aObjectS12S1110000_25.z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS12S1110000_25 aObjectS12S1110000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670950taH.LJ(3072, 0, interfaceC1680500tpg, c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), aObjectS12S1110000_25.s0, (Function0) aObjectS12S1110000_25.l1, aObjectS12S1110000_25.z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS12S1110000_25 aObjectS12S1110000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            String str = aObjectS12S1110000_25.s0;
            Function0 function0 = (Function0) aObjectS12S1110000_25.l1;
            boolean z = aObjectS12S1110000_25.z2;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1670950taH.LJ(3072, 0, interfaceC1680500tpg, c.LJIJJLI(c1685760tyA, C1668040tVa.LJIILJJIL, false), str, function0, z);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS12S1110000_25(String str, String str2, Function0<Unit> function0, boolean z) {
        this.$t = z ? 1 : 0;
        this.s0 = str;
        this.l1 = str2;
        this.z2 = function0;
    }
}

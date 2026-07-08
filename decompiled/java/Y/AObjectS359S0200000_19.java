package Y;

import X.C1669670tYD;
import X.C19719212De;
import X.EnumC1427810nG7;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS359S0200000_19 implements Function2 {
    public final int $t;
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

    public AObjectS359S0200000_19(EnumC1427810nG7 enumC1427810nG7, C19719212De c19719212De, int i) {
        this.$t = i;
        this.l0 = enumC1427810nG7;
        this.l1 = c19719212De;
    }

    public static final Object invoke$0(AObjectS359S0200000_19 aObjectS359S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1669670tYD.LIZIZ((EnumC1427810nG7) aObjectS359S0200000_19.l0, (Function2) aObjectS359S0200000_19.l1, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS359S0200000_19 aObjectS359S0200000_19, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1669670tYD.LIZIZ((EnumC1427810nG7) aObjectS359S0200000_19.l0, (Function2) aObjectS359S0200000_19.l1, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }
}

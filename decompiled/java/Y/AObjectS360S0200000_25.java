package Y;

import X.C05P0;
import X.C1656070tCH;
import X.C1656120tCM;
import X.C1669670tYD;
import X.C1670410tZP;
import X.C1670950taH;
import X.C1673360teA;
import X.C1ETK;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS360S0200000_25 implements Function2 {
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
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS360S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object invoke$0(AObjectS360S0200000_25 aObjectS360S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670410tZP.LIZ((C1ETK) aObjectS360S0200000_25.l0, null, null, null, null, C1669670tYD.LIZ, (Function2) aObjectS360S0200000_25.l1, interfaceC1680500tpg, 196608, 30);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS360S0200000_25 aObjectS360S0200000_25, Object obj, Object obj2) {
        C1656070tCH c1656070tCH = (C1656070tCH) aObjectS360S0200000_25.l0;
        c1656070tCH.LIZ.runOnUiThread(new ARunnableS19S1300000_25((C1656120tCM) aObjectS360S0200000_25.l1, c1656070tCH, (Integer) obj, (String) obj2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS360S0200000_25 aObjectS360S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1670950taH.LIZJ((Function2) aObjectS360S0200000_25.l0, (Function2) aObjectS360S0200000_25.l1, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS360S0200000_25 aObjectS360S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((InterfaceC1631620sYq) aObjectS360S0200000_25.l0).invoke(((C1673360teA) ((C05P0) aObjectS360S0200000_25.l1).getValue()).LIZIZ, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS360S0200000_25 aObjectS360S0200000_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((InterfaceC1631620sYq) aObjectS360S0200000_25.l0).invoke(((C1673360teA) ((C05P0) aObjectS360S0200000_25.l1).getValue()).LIZIZ, interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }
}

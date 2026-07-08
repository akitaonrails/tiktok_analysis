package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20475815Ae {
    public final List<InterfaceC20476615Am> LIZ = new ArrayList();

    public final InterfaceC20476615Am LIZIZ(String str) {
        Object next;
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((InterfaceC20476615Am) next).getGeniusId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC20476615Am interfaceC20476615Am = (InterfaceC20476615Am) next;
        if (interfaceC20476615Am == null) {
            return null;
        }
        return interfaceC20476615Am.LJ(null, null);
    }

    public final void LIZJ(InterfaceC20476615Am interfaceC20476615Am) {
        C500260Jjc.LJJJLIIL(this.LIZ, new AwS610S0100000_31(interfaceC20476615Am, 11));
        Unit unit = Unit.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGeniusModel contains:");
        sbLIZ.append(unit);
        sbLIZ.append(" geniusModel:");
        sbLIZ.append(interfaceC20476615Am);
        C20441214yg.LIZIZ("AnimationDataCenter", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LIZ).add(interfaceC20476615Am);
    }

    public final InterfaceC20476615Am LIZ(String str, EnumC20476415Ak enumC20476415Ak, C20476115Ah c20476115Ah, InterfaceC20477315At interfaceC20477315At, EnumC20476715An enumC20476715An) {
        InterfaceC20476615Am c15az;
        switch (C20476215Ai.LIZ[enumC20476415Ak.ordinal()]) {
            case 1:
                c15az = new C20475415Aa(interfaceC20477315At, c20476115Ah, enumC20476715An, str);
                break;
            case 2:
                c15az = new C20475715Ad(interfaceC20477315At, c20476115Ah, enumC20476715An, str);
                break;
            case 3:
                c15az = new C20475515Ab(interfaceC20477315At, c20476115Ah, enumC20476715An, str);
                break;
            case 4:
                c15az = new C20475915Af(c20476115Ah, interfaceC20477315At);
                break;
            case 5:
                c15az = new C20475615Ac(interfaceC20477315At, c20476115Ah, enumC20476715An, str);
                break;
            case 6:
                c15az = new C20476015Ag(c20476115Ah, str, interfaceC20477315At);
                break;
            case 7:
                c15az = new C15AZ(interfaceC20477315At, c20476115Ah, enumC20476715An, str);
                break;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invalid genius type: ");
                sbLIZ.append(enumC20476415Ak);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        c15az.LIZIZ(str);
        C500260Jjc.LJJJLIIL(this.LIZ, new AwS610S0100000_31(c15az, 12));
        ((ArrayList) this.LIZ).add(c15az);
        return c15az;
    }
}

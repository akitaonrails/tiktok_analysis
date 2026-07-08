package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19796512ct {
    public static InterfaceC19797112cz LIZIZ(C19796612cu c19796612cu, C19795712cl c19795712cl, List<InterfaceC19797112cz> list, boolean z) {
        InterfaceC19797112cz interfaceC19797112czLIZ;
        int i;
        int i2;
        int i3;
        C19796312cr.LJIIIZ(1, "reduce", list);
        C19796312cr.LJIILIIL(2, "reduce", list);
        InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
        if (interfaceC19797112czLIZIZ instanceof AbstractC19795912cn) {
            if (((ArrayList) list).size() == 2) {
                interfaceC19797112czLIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                if (interfaceC19797112czLIZ instanceof C19797212d0) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c19796612cu.LJIILIIL() != 0) {
                interfaceC19797112czLIZ = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC19795912cn abstractC19795912cn = (AbstractC19795912cn) interfaceC19797112czLIZIZ;
            int iLJIILIIL = c19796612cu.LJIILIIL();
            if (z) {
                i = 0;
                i2 = iLJIILIIL - 1;
                i3 = 1;
            } else {
                i = iLJIILIIL - 1;
                i2 = 0;
                i3 = -1;
            }
            if (interfaceC19797112czLIZ == null) {
                interfaceC19797112czLIZ = c19796612cu.LIZJ(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (!c19796612cu.LJIJI(i)) {
                    i += i3;
                } else {
                    interfaceC19797112czLIZ = abstractC19795912cn.LIZ(c19795712cl, Arrays.asList(interfaceC19797112czLIZ, c19796612cu.LIZJ(i), new C19816212g4(Double.valueOf(i)), c19796612cu));
                    if (!(interfaceC19797112czLIZ instanceof C19797212d0)) {
                        i += i3;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return interfaceC19797112czLIZ;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static C19796612cu LIZ(C19796612cu c19796612cu, C19795712cl c19795712cl, C19795612ck c19795612ck, Boolean bool, Boolean bool2) {
        C19796612cu c19796612cu2 = new C19796612cu();
        Iterator<Integer> itLJIL = c19796612cu.LJIL();
        while (itLJIL.hasNext()) {
            int iIntValue = itLJIL.next().intValue();
            if (c19796612cu.LJIJI(iIntValue)) {
                InterfaceC19797112cz interfaceC19797112czLIZ = c19795612ck.LIZ(c19795712cl, Arrays.asList(c19796612cu.LIZJ(iIntValue), new C19816212g4(Double.valueOf(iIntValue)), c19796612cu));
                if (interfaceC19797112czLIZ.LIZLLL().equals(bool)) {
                    return c19796612cu2;
                }
                if (bool2 == null || interfaceC19797112czLIZ.LIZLLL().equals(bool2)) {
                    c19796612cu2.LJIJ(iIntValue, interfaceC19797112czLIZ);
                }
            }
        }
        return c19796612cu2;
    }
}

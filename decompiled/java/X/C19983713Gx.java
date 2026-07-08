package X;

import Y.AObjectS373S0100000_30;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13Gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19983713Gx {
    public static final String LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt) {
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, interfaceC19983313Gt.LJ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19983313Gt.LJI());
        sbLIZ.append('(');
        return C13LP.LJJLIIIJ(intRangeLJIILJJIL, ", ", C2188811AlT.LIZIZ(sbLIZ), ")", 0, null, new AObjectS373S0100000_30(interfaceC19983313Gt, 0), 24);
    }

    public static final int LIZ(InterfaceC19983313Gt interfaceC19983313Gt, InterfaceC19983313Gt[] interfaceC19983313GtArr) {
        int iHashCode;
        int iHashCode2 = (interfaceC19983313Gt.LJI().hashCode() * 31) + Arrays.hashCode(interfaceC19983313GtArr);
        C20307914dB c20307914dB = new C20307914dB(interfaceC19983313Gt, 0);
        Iterator<InterfaceC19983313Gt> it2 = c20307914dB.iterator();
        int i = 1;
        int i2 = 1;
        while (true) {
            C20307814dA c20307814dA = (C20307814dA) it2;
            int iHashCode3 = 0;
            if (!c20307814dA.hasNext()) {
                break;
            }
            int i3 = i2 * 31;
            String strLJI = ((InterfaceC19983313Gt) c20307814dA.next()).LJI();
            if (strLJI != null) {
                iHashCode3 = strLJI.hashCode();
            }
            i2 = i3 + iHashCode3;
        }
        Iterator<InterfaceC19983313Gt> it3 = c20307914dB.iterator();
        while (true) {
            C20307814dA c20307814dA2 = (C20307814dA) it3;
            if (c20307814dA2.hasNext()) {
                int i4 = i * 31;
                C13GW c13gwLIZIZ = ((InterfaceC19983313Gt) c20307814dA2.next()).LIZIZ();
                if (c13gwLIZIZ != null) {
                    iHashCode = c13gwLIZIZ.hashCode();
                } else {
                    iHashCode = 0;
                }
                i = i4 + iHashCode;
            } else {
                return (((iHashCode2 * 31) + i2) * 31) + i;
            }
        }
    }
}

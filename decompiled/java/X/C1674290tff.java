package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0tff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674290tff {
    public static final void LIZ(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-33689592);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C13DR c13dr = C20055113dV.LJIILIIL;
            Object objLJJIL = c13zcLJIIJ.LJJIL(c13dr);
            EnumC1671200tag enumC1671200tag = EnumC1671200tag.Rtl;
            if (objLJJIL == enumC1671200tag) {
                enumC1671200tag = EnumC1671200tag.Ltr;
            }
            C13ZT.LIZ(c13dr.LIZJ(enumC1671200tag), C13Z4.LIZJ(-2010799288, new AwS639S0100000_25(function2, (Function2<? super AbstractC1678220tm0, ? super InterfaceC1660090tIl, Unit>) 104), c13zcLJIIJ), c13zcLJIIJ, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(i, function2, 54);
        }
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS123S0201000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0iYC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246820iYC {
    public static final void LIZ(Function0<Unit> function0, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1649292248);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1668060tVc.LIZ(null, false, 0L, C1685910tyP.LJIIIZ, null, C13Z4.LIZJ(-2983697, new AwS633S0100000_19(function0, (Function0<Unit>) 309), c13zcLJIIJ), C1246830iYD.LIZ, C13Z4.LIZJ(414905005, new AwS639S0100000_25(function02, (Function0<Unit>) 160), c13zcLJIIJ), c13zcLJIIJ, 14355456, 23);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS123S0201000_19(i, (int) function0, function02, (Function0<Unit>) 10);
        }
    }
}

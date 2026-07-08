package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS24S0410000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0ty3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685690ty3 {
    public final C13ES<InterfaceC1631620sYq<C1685710ty5, InterfaceC1680500tpg, Integer, Unit>> LIZ = new C13ES<>();

    public static void LIZIZ(C1685690ty3 c1685690ty3, AwS639S0100000_25 awS639S0100000_25, Function0 function0) {
        c1685690ty3.LIZ.add(new C19719212De(262103052, new AwS24S0410000_25((InterfaceC1685750ty9) InterfaceC1685750ty9.LIZ, function0, awS639S0100000_25, (InterfaceC1631620sYq) null, true, 1), true));
    }

    public final void LIZ(C1685710ty5 c1685710ty5, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1320309496);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1685710ty5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i2 & 1, z)) {
            C13ES<InterfaceC1631620sYq<C1685710ty5, InterfaceC1680500tpg, Integer, Unit>> c13es = this.LIZ;
            int size = c13es.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((InterfaceC1631620sYq) ListProtector.get(c13es, i5)).invoke(c1685710ty5, c13zcLJIIJ, Integer.valueOf(i2 & 14));
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1685710ty5, i, 82);
        }
    }
}

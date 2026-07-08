package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.AwS6S0302000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672420tce {
    public static final C19719212De LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return new C19719212De(-1586257396, new AwS674S0100000_25(interfaceC1685750ty9, 43), true);
    }

    @InterfaceC1294060jmO
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC20053113dB interfaceC20053113dB, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1949933075);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC20053113dB)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            AFwS214S0000000_25 aFwS214S0000000_25 = C20053713dH.LLLIIIIL;
            int i8 = ((i3 << 3) & 896) | 6;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                g.LJLIIIL.getClass();
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dB, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS266S0000000_25 aFwS266S0000000_25 = AFwS266S0000000_25.get$arr$(483);
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LIZIZ(Unit.LIZ, new AwS639S0100000_25(aFwS266S0000000_25, 2));
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                function2.invoke(c13zcLJIIJ, Integer.valueOf((i8 >> 6) & 14));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0302000_25(interfaceC1685750ty92, (InterfaceC1685750ty9) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) interfaceC20053113dB, (InterfaceC20053113dB) i, i2, 13);
        }
    }
}

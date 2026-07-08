package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S0202000_25;

/* JADX INFO: renamed from: X.0tto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683060tto {
    public static final C1683070ttp LIZ = new Object() { // from class: X.0ttp
        public final String toString() {
            return "ReusedSlotId";
        }
    };

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1672350tcX, ? super C1682380tsi, ? extends InterfaceC1690350u5Z> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1298353104);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new C20037913aj();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            int i7 = i3 << 3;
            LIZIZ((C20037913aj) objLJJ, interfaceC1685750ty92, function2, c13zcLJIIJ, (i7 & 112) | (i7 & 896), 0);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25(interfaceC1685750ty92, (InterfaceC1685750ty9) function2, (Function2<? super InterfaceC1672350tcX, ? super C1682380tsi, ? extends InterfaceC1690350u5Z>) i, i2, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C20037913aj r14, X.InterfaceC1685750ty9 r15, kotlin.jvm.functions.Function2<? super X.InterfaceC1672350tcX, ? super X.C1682380tsi, ? extends X.InterfaceC1690350u5Z> r16, X.InterfaceC1680500tpg r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683060tto.LIZIZ(X.13aj, X.0ty9, kotlin.jvm.functions.Function2, X.0tpg, int, int):void");
    }
}

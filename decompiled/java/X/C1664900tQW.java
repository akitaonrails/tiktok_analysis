package X;

import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS62S0301000_25;

/* JADX INFO: renamed from: X.0tQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664900tQW implements InterfaceC1664980tQe<C1659930tIV, C1659880tIQ> {
    @Override // X.InterfaceC1664980tQe
    public final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2068980562);
        if ((i & 1) == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1665970tSF.LIZJ(0, 2, c13zcLJIIJ, null, C0MBB.LIZIZ(2131837783, c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1685750ty9, i, 67);
        }
    }

    public final void LIZIZ(C1659880tIQ c1659880tIQ, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(906756478);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1659880tIQ)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1668880tWw c1668880tWw = C1669660tYC.LJLZ;
            C1668880tWw c1668880tWw2 = C1669660tYC.LL;
            if (!c1659880tIQ.LIZ) {
                c1668880tWw2 = null;
            }
            C1665970tSF.LIZ(c1668880tWw, interfaceC1685750ty9, c1668880tWw2, false, c13zcLJIIJ, i2 & 112, 8);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(this, c1659880tIQ, interfaceC1685750ty9, i, 22);
        }
    }

    @Override // X.InterfaceC1664980tQe
    public final /* bridge */ /* synthetic */ void LIZJ(InterfaceC1461640o8g interfaceC1461640o8g, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        LIZIZ((C1659880tIQ) interfaceC1461640o8g, interfaceC1685750ty9, interfaceC1680500tpg, 0);
    }
}

package X;

import androidx.compose.foundation.layout.c;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS62S0301000_25;
import o0.k;

/* JADX INFO: renamed from: X.0tRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665440tRO implements InterfaceC1664980tQe<C1660200tIw, C1660000tIc> {
    @Override // X.InterfaceC1664980tQe
    public final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1737600283);
        if ((i & 1) == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1685750ty9, i, 84);
        }
    }

    public final void LIZIZ(C1660000tIc c1660000tIc, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1084785861);
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
            float f = 56;
            float f2 = 6;
            float f3 = 18;
            k.LIZ(C1675980tiO.LIZIZ(c.LJI(C1682520tsw.LJIIJJI(c.LJIILLIIL(interfaceC1685750ty9, f), (f - f3) - 20, f2, f3, f2), 1), C1685850tyJ.LIZIZ(1627389951), C1669430tXp.LIZ), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(this, c1660000tIc, interfaceC1685750ty9, i, 32);
        }
    }

    @Override // X.InterfaceC1664980tQe
    public final /* bridge */ /* synthetic */ void LIZJ(InterfaceC1461640o8g interfaceC1461640o8g, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        LIZIZ((C1660000tIc) interfaceC1461640o8g, interfaceC1685750ty9, interfaceC1680500tpg, 0);
    }
}

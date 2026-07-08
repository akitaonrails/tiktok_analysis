package X;

import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS62S0301000_25;

/* JADX INFO: renamed from: X.0tUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667280tUM implements InterfaceC1664980tQe<C1660350tJB, C1661660tLI> {
    public final C05P0<Boolean> LIZ = C20028913Yh.LJI(Boolean.FALSE);

    @Override // X.InterfaceC1664980tQe
    public final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1760557045);
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
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
        } else if (!((Boolean) ((C13FE) this.LIZ).getValue()).booleanValue()) {
            C1665970tSF.LIZJ(0, 2, c13zcLJIIJ, null, C0MBB.LIZIZ(2131846805, c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1685750ty9, i, 124);
        }
    }

    public final void LIZIZ(C1661660tLI c1661660tLI, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1636038976);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1661660tLI)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (c1661660tLI.LIZIZ) {
            c13zcLJIIJ.LJJIIJZLJL(-51561872);
            if (!((Boolean) ((C13FE) this.LIZ).getValue()).booleanValue()) {
                ((C13FE) this.LIZ).setValue(Boolean.TRUE);
            }
            C1667230tUH.LIZLLL(true, C0MBB.LIZIZ(2131846806, c13zcLJIIJ), C0MBB.LIZIZ(2131846805, c13zcLJIIJ), InterfaceC1685750ty9.LIZ, c13zcLJIIJ, 3078);
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(-51196041);
            if (((Boolean) ((C13FE) this.LIZ).getValue()).booleanValue()) {
                ((C13FE) this.LIZ).setValue(Boolean.FALSE);
            }
            C1665970tSF.LIZ(C1669660tYC.LJLIL, interfaceC1685750ty9, null, false, c13zcLJIIJ, i2 & 112, 12);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(this, c1661660tLI, interfaceC1685750ty9, i, 49);
        }
    }

    @Override // X.InterfaceC1664980tQe
    public final /* bridge */ /* synthetic */ void LIZJ(InterfaceC1461640o8g interfaceC1461640o8g, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        LIZIZ((C1661660tLI) interfaceC1461640o8g, interfaceC1685750ty9, interfaceC1680500tpg, 0);
    }
}

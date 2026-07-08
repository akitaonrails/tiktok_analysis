package X;

import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS62S0301000_25;

/* JADX INFO: renamed from: X.0tUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667260tUK implements InterfaceC1664980tQe<C1678300tm8, C1661650tLH> {
    public final int LIZ;
    public final C05P0<Boolean> LIZIZ;

    public C1667260tUK() {
        this.LIZ = ((Number) C0BN5.LIZ.getValue()).intValue() > 0 ? 2131846769 : 2131836997;
        this.LIZIZ = C20028913Yh.LJI(Boolean.FALSE);
    }

    @Override // X.InterfaceC1664980tQe
    public final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-505588529);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (!((Boolean) ((C13FE) this.LIZIZ).getValue()).booleanValue()) {
            C1665970tSF.LIZJ((i2 << 3) & 112, 0, c13zcLJIIJ, interfaceC1685750ty9, C0MBB.LIZIZ(this.LIZ, c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1685750ty9, i, 0);
        }
    }

    public final void LIZIZ(C1661650tLH c1661650tLH, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1282156526);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1661650tLH)) {
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
        } else if (c1661650tLH.LIZIZ) {
            c13zcLJIIJ.LJJIIJZLJL(1581072713);
            if (!((Boolean) ((C13FE) this.LIZIZ).getValue()).booleanValue()) {
                ((C13FE) this.LIZIZ).setValue(Boolean.TRUE);
            }
            C1667230tUH.LIZIZ(interfaceC1685750ty9, c13zcLJIIJ, c1661650tLH.LIZ, i2 & 112);
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1581278460);
            if (((Boolean) ((C13FE) this.LIZIZ).getValue()).booleanValue()) {
                ((C13FE) this.LIZIZ).setValue(Boolean.FALSE);
            }
            C1665970tSF.LIZ(C1669660tYC.LJLILLLLZI, interfaceC1685750ty9, null, false, c13zcLJIIJ, i2 & 112, 12);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(this, c1661650tLH, interfaceC1685750ty9, i, 0);
        }
    }

    @Override // X.InterfaceC1664980tQe
    public final /* bridge */ /* synthetic */ void LIZJ(InterfaceC1461640o8g interfaceC1461640o8g, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        LIZIZ((C1661650tLH) interfaceC1461640o8g, interfaceC1685750ty9, interfaceC1680500tpg, 0);
    }
}

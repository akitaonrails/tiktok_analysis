package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS62S0301000_25;

/* JADX INFO: renamed from: X.0tmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678340tmC implements InterfaceC1664980tQe<C1678240tm2, InterfaceC1461640o8g<C1678240tm2>> {
    @Override // X.InterfaceC1664980tQe
    public final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1886429413);
        if ((i & 1) == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1665970tSF.LIZJ(0, 2, c13zcLJIIJ, null, C0MBB.LIZIZ(R.string.jlc, c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1685750ty9, i, 119);
        }
    }

    @Override // X.InterfaceC1664980tQe
    public final void LIZJ(InterfaceC1461640o8g<C1678240tm2> interfaceC1461640o8g, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2822341);
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
            C1665970tSF.LIZ(C1669660tYC.LJLL, interfaceC1685750ty9, null, false, c13zcLJIIJ, i2 & 112, 12);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(this, (C1678340tmC) interfaceC1461640o8g, (InterfaceC1461640o8g<C1678240tm2>) interfaceC1685750ty9, (InterfaceC1685750ty9) i, 46);
        }
    }
}

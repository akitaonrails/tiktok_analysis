package X;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS120S0400000_25;
import kotlin.jvm.internal.AwS176S0400000_25;
import kotlin.jvm.internal.AwS17S0000001_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672170tcF {
    public static final Context LIZLLL(InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(-42075016);
        Context context = (Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
        interfaceC1680500tpg.LJ();
        return context;
    }

    public static final long LJ(InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        Object c098200Yq;
        long jK3;
        interfaceC1680500tpg.LJJIIJZLJL(-1726525021);
        try {
            c098200Yq = new C1685910tyP(C1685850tyJ.LIZIZ(Color.parseColor(str)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1685910tyP c1685910tyP = (C1685910tyP) c098200Yq;
        if (c1685910tyP == null) {
            jK3 = C1670400tZO.LIZIZ(interfaceC1680500tpg).K3();
        } else {
            jK3 = c1685910tyP.LIZ;
        }
        interfaceC1680500tpg.LJ();
        return jK3;
    }

    public static final C442290HVz LJFF(C442260HVw c442260HVw, InterfaceC1680500tpg interfaceC1680500tpg) {
        boolean z;
        interfaceC1680500tpg.LJJIIJZLJL(-1683853138);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = C20028913Yh.LJI(new C442290HVz(c442260HVw.LIZJ, ""));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C05P0 c05p0 = (C05P0) objLJJ;
        interfaceC1680500tpg.LJ();
        String str = c442260HVw.LIZ;
        interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
        if (!interfaceC1680500tpg.LJJIIJ(c442260HVw)) {
            z = false;
        } else {
            z = true;
        }
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (z || objLJJ2 == c1680520tpi) {
            objLJJ2 = new C442250HVv(c442260HVw, c05p0, null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        C1680540tpk.LJFF(str, (Function2) objLJJ2, interfaceC1680500tpg);
        C442290HVz c442290HVz = (C442290HVz) c05p0.getValue();
        interfaceC1680500tpg.LJ();
        return c442290HVz;
    }

    public static final void LIZ(C1672190tcH c1672190tcH, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(824804163);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1672190tcH)) {
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
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BigBanner(), ");
            sbLIZ.append(c1672190tcH);
            C201955140j.LIZLLL(c20012313Rx, "StickerDetailBannerCompose", C2188811AlT.LIZIZ(sbLIZ));
            Context contextLIZLLL = LIZLLL(c13zcLJIIJ);
            float f = 8;
            long jLJ = LJ(c13zcLJIIJ, c1672190tcH.LIZLLL);
            String str = c1672190tcH.LIZIZ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C442290HVz c442290HVzLJFF = LJFF(new C442260HVw(str, C1685720ty6.LIZIZ(c1685760tyA, new AwS17S0000001_25(f, 1)), 4), c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(new C1668650tWZ(Float.NaN));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJII = c13zcLJIIJ.LJII(contextLIZLLL);
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z | zLJII;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS120S0400000_25(contextLIZLLL, (Context) c1672190tcH, (C1672190tcH) c05p0, (C05P0<C1668650tWZ>) c05p02, (C05P0<Boolean>) 29);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(interfaceC1685750ty9LJ, (Function1) objLJJ3);
            c13zcLJIIJ.LJJIJIIJIL(-270267587);
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = new C2267001DoI();
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C2267001DoI c2267001DoI = (C2267001DoI) objLJJ4;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = new C1672050tc3();
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1672050tc3 c1672050tc3 = (C1672050tc3) objLJJ5;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            c13zcLJIIJ.LJJJJL(false);
            Pair pairLIZIZ = C1686650tzb.LIZIZ(c1672050tc3, (C05P0) objLJJ6, c2267001DoI, c13zcLJIIJ);
            C1672420tce.LIZ(C1689740u4a.LIZIZ(interfaceC1685750ty9LIZ, false, new AwS604S0100000_25(c2267001DoI, 664)), C13Z4.LIZIZ(c13zcLJIIJ, -819894182, new C1672160tcE(c1672050tc3, 0, (Function0) pairLIZIZ.getSecond(), c442290HVzLJFF, f, c1672190tcH, jLJ, c05p02, c05p0)), (InterfaceC20053113dB) pairLIZIZ.getFirst(), c13zcLJIIJ, 48, 0);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(c1672190tcH, i, 65);
        }
    }

    public static final void LIZIZ(C1672180tcG c1672180tcG, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        InterfaceC1685750ty9 interfaceC1685750ty9LJIILLIIL;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1936053291);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1672180tcG)) {
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
            String str = c1672180tcG.LIZ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C442290HVz c442290HVzLJFF = LJFF(new C442260HVw(str, C1685720ty6.LIZIZ(c1685760tyA, new AwS17S0000001_25(12, 1)), 4), c13zcLJIIJ);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MiddleBanner(), ");
            sbLIZ.append(c1672180tcG);
            C201955140j.LIZLLL(c20012313Rx, "StickerDetailBannerCompose", C2188811AlT.LIZIZ(sbLIZ));
            if (C1668650tWZ.LIZJ(c1672180tcG.LIZLLL, Float.NaN)) {
                interfaceC1685750ty9LJIILLIIL = c.LJIJ(c1685760tyA, 0.0f, c1672180tcG.LJ, 1);
            } else {
                interfaceC1685750ty9LJIILLIIL = c.LJIILLIIL(c1685760tyA, c1672180tcG.LIZLLL);
            }
            c13zcLJIIJ.LJJIJIIJIL(-270267587);
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C2267001DoI();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C2267001DoI c2267001DoI = (C2267001DoI) objLJJ;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1672050tc3();
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1672050tc3 c1672050tc3 = (C1672050tc3) objLJJ2;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            Pair pairLIZIZ = C1686650tzb.LIZIZ(c1672050tc3, (C05P0) objLJJ3, c2267001DoI, c13zcLJIIJ);
            C1672420tce.LIZ(C1689740u4a.LIZIZ(interfaceC1685750ty9LJIILLIIL, false, new AwS604S0100000_25(c2267001DoI, 665)), C13Z4.LIZIZ(c13zcLJIIJ, -819894182, new AwS176S0400000_25(c1672050tc3, 0, (Function0) pairLIZIZ.getSecond(), c442290HVzLJFF, c1672180tcG, 9)), (InterfaceC20053113dB) pairLIZIZ.getFirst(), c13zcLJIIJ, 48, 0);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(c1672180tcG, i, 66);
        }
    }

    public static final void LIZJ(C1672200tcI c1672200tcI, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(641227765);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1672200tcI)) {
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
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SmallBanner(), ");
            sbLIZ.append(c1672200tcI);
            C201955140j.LIZLLL(c20012313Rx, "StickerDetailBannerCompose", C2188811AlT.LIZIZ(sbLIZ));
            String str = c1672200tcI.LIZ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C442290HVz c442290HVzLJFF = LJFF(new C442260HVw(str, C1685720ty6.LIZIZ(c1685760tyA, new AwS17S0000001_25(12, 1)), 4), c13zcLJIIJ);
            c13zcLJIIJ.LJJIJIIJIL(-270267587);
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C2267001DoI();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C2267001DoI c2267001DoI = (C2267001DoI) objLJJ;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1672050tc3();
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1672050tc3 c1672050tc3 = (C1672050tc3) objLJJ2;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            Pair pairLIZIZ = C1686650tzb.LIZIZ(c1672050tc3, (C05P0) objLJJ3, c2267001DoI, c13zcLJIIJ);
            C1672420tce.LIZ(C1689740u4a.LIZIZ(c1685760tyA, false, new AwS604S0100000_25(c2267001DoI, 666)), C13Z4.LIZIZ(c13zcLJIIJ, -819894182, new AwS176S0400000_25(c1672050tc3, 0, (Function0) pairLIZIZ.getSecond(), c442290HVzLJFF, c1672200tcI, 10)), (InterfaceC20053113dB) pairLIZIZ.getFirst(), c13zcLJIIJ, 48, 0);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(c1672200tcI, i, 67);
        }
    }
}

package X;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS11S0211000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS69S0001000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0td7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672710td7 {
    public static final void LIZIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int iIntValue;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1331604972);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f514t5, (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            k.LIZ(C1675980tiO.LIZIZ(C1667200tUE.LIZ(C1665900tS8.LIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), 1.0f), C1669050tXD.LIZIZ(C1670400tZO.LIZJ(c13zcLJIIJ).LIZJ)), C1685850tyJ.LIZIZ(iIntValue), C1669430tXp.LIZ), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 29);
        }
    }

    public static final void LIZLLL(Uri uri, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1002543572);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(uri)) {
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
            C1175204ik c1175204ik = new C1175204ik(String.valueOf(uri));
            InterfaceC1671600tbK.LIZ.getClass();
            C1670600tZi.LIZ(c1175204ik, "", C1667200tUE.LIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), C1669050tXD.LIZIZ(C1670400tZO.LIZJ(c13zcLJIIJ).LIZJ)), null, C1671610tbL.LJFF, null, null, null, null, null, c13zcLJIIJ, 24624, LSPassThroughRecordSizeConfig.DEFAULT);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(uri, i, 102);
        }
    }

    public static final Uri LJFF(int i, C1672730td9 c1672730td9, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(1224987774);
        ArrayList<C21356918hz> arrayList = c1672730td9.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    interfaceC1680500tpg.LJ();
                    return null;
                }
                if (arrayList.size() >= 3) {
                    Uri uriLJIILIIL = C2471909mP.LJIILIIL(((C21356918hz) ListProtector.get(c1672730td9.LIZ, 2)).LIZIZ);
                    interfaceC1680500tpg.LJ();
                    return uriLJIILIIL;
                }
                interfaceC1680500tpg.LJ();
                return null;
            }
            if (arrayList.size() >= 2) {
                Uri uriLJIILIIL2 = C2471909mP.LJIILIIL(((C21356918hz) ListProtector.get(c1672730td9.LIZ, 1)).LIZIZ);
                interfaceC1680500tpg.LJ();
                return uriLJIILIIL2;
            }
            interfaceC1680500tpg.LJ();
            return null;
        }
        if (arrayList.size() >= 1) {
            Uri uriLJIILIIL3 = C2471909mP.LJIILIIL(((C21356918hz) ListProtector.get(c1672730td9.LIZ, 0)).LIZIZ);
            interfaceC1680500tpg.LJ();
            return uriLJIILIIL3;
        }
        interfaceC1680500tpg.LJ();
        return null;
    }

    public static final void LJ(Function0<Unit> function0, C1672730td9 c1672730td9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-994231985);
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
            if (c13zcLJIIJ.LJII(c1672730td9)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 16;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C634380OuS.LIZJ(C1667200tUE.LIZ(c.LJIILJJIL(c1685760tyA, 100, 45), C1669050tXD.LIZIZ(f)), false, null, function0, 7), C1670400tZO.LIZIZ(c13zcLJIIJ).A2(), C1669050tXD.LIZIZ(f));
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                FillElement fillElement = c.LIZJ;
                C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LJ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 54);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, fillElement);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    LIZ(12.0f, C1684150tvZ.LIZ(C1688600u2k.LIZLLL(c1685760tyA, 6, 0.0f, 2), 3.0f), LJFF(0, c1672730td9, c13zcLJIIJ), c13zcLJIIJ, 54, 0);
                    LIZ(-10.0f, C1684150tvZ.LIZ(c1685760tyA, 2.0f), LJFF(1, c1672730td9, c13zcLJIIJ), c13zcLJIIJ, 48, 0);
                    LIZ(10.0f, C1684150tvZ.LIZ(C1688600u2k.LIZLLL(c1685760tyA, -5, 0.0f, 2), 1.0f), LJFF(2, c1672730td9, c13zcLJIIJ), c13zcLJIIJ, 54, 0);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25((Function0) function0, (Function0<Unit>) c1672730td9, (C1672730td9) i, 120);
        }
    }

    public static final void LIZJ(boolean z, C1672730td9 c1672730td9, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1062527382);
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(c1672730td9)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 145) == 144 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (c1672730td9 != null) {
            LJ(function0, c1672730td9, c13zcLJIIJ, (i2 >> 6) & 14);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS11S0211000_25(z, (boolean) c1672730td9, (C1672730td9) function0, (Function0<Unit>) i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(float r17, X.InterfaceC1685750ty9 r18, android.net.Uri r19, X.InterfaceC1680500tpg r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1672710td7.LIZ(float, X.0ty9, android.net.Uri, X.0tpg, int, int):void");
    }
}

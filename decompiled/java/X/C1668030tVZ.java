package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.compose.node.ComposeExposureModifierElement;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tVZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668030tVZ {
    public static final void LIZ(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, String str3, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(460480598);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str3)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i12 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            final C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function03, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(140243095);
            if (function02 != null) {
                interfaceC1685750ty9LIZ = C634380OuS.LJ(InterfaceC1685750ty9.LIZ, false, function02, null, function0, 111);
                i11 = 4;
            } else {
                i11 = 4;
                interfaceC1685750ty9LIZ = C1670810ta3.LIZ(InterfaceC1685750ty9.LIZ, null, null, function0, c13zcLJIIJ, ((i3 << 9) & 458752) | 6, 15);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = c.LJIILJJIL(interfaceC1685750ty92, 72, 96).LIZ(new ComposeExposureModifierElement(new C1776880wL8(str3, 0.0f, 0, false, false, 62), new InterfaceC20089713j5() { // from class: X.0OuD
                @Override // X.InterfaceC20089713j5
                public final void LIZ() {
                }

                @Override // X.InterfaceC20089713j5
                public final void LIZIZ(String str4) {
                    c05p0LJIIIIZZ.getValue().invoke();
                }
            })).LIZ(interfaceC1685750ty9LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ2);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                C1175204ik c1175204ik = new C1175204ik(str);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ3 = C1667200tUE.LIZ(c.LIZLLL(c1685760tyA), C1669050tXD.LIZIZ(i11));
                InterfaceC1671600tbK.LIZ.getClass();
                C1670600tZi.LIZ(c1175204ik, null, interfaceC1685750ty9LIZ3, null, C1671610tbL.LIZIZ, null, null, null, null, null, c13zcLJIIJ, 24624, LSPassThroughRecordSizeConfig.DEFAULT);
                C1175204ik c1175204ik2 = new C1175204ik(str2);
                C1670520tZa c1670520tZa = C1670520tZa.LJ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJII);
                float f = 8;
                C1670480tZW.LIZ(c1175204ik2, null, C1682520tsw.LJIIL(interfaceC1685750ty9LIZIZ, f, 0.0f, 0.0f, f, 6), c1670520tZa, null, true, null, c13zcLJIIJ, 196656, 80);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C634220OuC(str, str2, function0, function02, function03, str3, interfaceC1685750ty92, i, i2);
        }
    }
}

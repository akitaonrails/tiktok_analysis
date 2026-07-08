package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS28S0401000_25;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS93S0500000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669300tXc {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, SocialMediaPickerViewModel socialMediaPickerViewModel, SocMediaResource socMediaResource, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(642490157);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(socMediaResource)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1677470tkn.LIZ(0.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C1677480tko c1677480tko = (C1677480tko) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c05p0.getValue()).booleanValue());
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII = c13zcLJIIJ.LJII(c1677480tko);
            if ((i2 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z | zLJII;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1356905St(c1677480tko, function0, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ3, c13zcLJIIJ);
            if (((Number) c1677480tko.LIZLLL()).floatValue() > 0.0f) {
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = interfaceC1685750ty9.LIZ(c.LIZJ);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS546S0100000_2(c05p0, (C05P0<InterfaceC1692950u9l>) 813);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LIZ, false, null, (Function0) objLJJ4, 7);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
                int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
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
                    C1296870jqv c1296870jqv = C1668040tVa.LJFF;
                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                    Object objLJJ5 = c13zcLJIIJ.LJJ();
                    if (objLJJ5 == c1680520tpi) {
                        objLJJ5 = new AwS546S0100000_2(c05p0, (C05P0<InterfaceC1692950u9l>) 814);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1680580tpo.LIZIZ(c1296870jqv, 0L, (Function0) objLJJ5, null, C13Z4.LIZJ(1780275147, new AwS93S0500000_25(socMediaResource, (SocMediaResource) c1677480tko, (C1677480tko<Float, C1677280tkU>) socialMediaPickerViewModel, (SocialMediaPickerViewModel) function0, (Function0<Unit>) c05p0, (C05P0<Boolean>) 2), c13zcLJIIJ), c13zcLJIIJ, 24966, 10);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS28S0401000_25(interfaceC1685750ty9, (InterfaceC1685750ty9) socialMediaPickerViewModel, (SocialMediaPickerViewModel) socMediaResource, (SocMediaResource) function0, (Function0<Unit>) i, 1);
        }
    }
}

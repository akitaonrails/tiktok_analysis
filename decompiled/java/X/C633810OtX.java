package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.compose.node.ComposeExposureModifierElement;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: renamed from: X.0OtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633810OtX {
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1357705Tb r18, com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r19, com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm.FanSpotlightProfileDetailShareVM r20, X.InterfaceC346201Wa<kotlin.Unit> r21, X.InterfaceC1680500tpg r22, int r23) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C633810OtX.LIZIZ(X.05Tb, com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel, com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm.FanSpotlightProfileDetailShareVM, X.01Wa, X.0tpg, int):void");
    }

    public static final void LIZ(InterfaceC636240OxS<InterfaceC1891350zJl> interfaceC636240OxS, OriginMusicListViewModel originMusicListViewModel, String str, InterfaceC1685750ty9 interfaceC1685750ty9, C1690080u58 c1690080u58, InterfaceC1679150tnV interfaceC1679150tnV, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        C1690080u58 c1690080u58LIZ = c1690080u58;
        InterfaceC1679150tnV c1682530tsx = interfaceC1679150tnV;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1784002466);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC636240OxS)) {
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
            if (c13zcLJIIJ.LJJIIJ(originMusicListViewModel)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJJIIJ(c1690080u58LIZ)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        int i12 = i2 & 32;
        if (i12 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1682530tsx)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            } else {
                if (i11 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 16) != 0) {
                    c1690080u58LIZ = C1690130u5D.LIZ(0, 0, c13zcLJIIJ, 0, 3);
                    i3 &= -57345;
                }
                if (i12 != 0) {
                    float f = 16;
                    float f2 = 8;
                    c1682530tsx = new C1682530tsx(f, f2, f, f2);
                }
            }
            c13zcLJIIJ.LJJJJLI();
            final C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function0, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C636330Oxb(true, 0, false, false, 29);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C636330Oxb c636330Oxb = (C636330Oxb) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            str2 = str2;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = c.LJIJI(c.LJ(interfaceC1685750ty92, 1.0f), null, 3).LIZ(new ComposeExposureModifierElement(new C1776880wL8(str2, 0.0f, 0, false, false, 62), new InterfaceC20089713j5() { // from class: X.0OtZ
                @Override // X.InterfaceC20089713j5
                public final void LIZ() {
                }

                @Override // X.InterfaceC20089713j5
                public final void LIZIZ(String str3) {
                    c05p0LJIIIIZZ.getValue().invoke();
                }
            }));
            C1666950tTp c1666950tTpLJI = C1679930tol.LJI(4);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS623S0100000_9(originMusicListViewModel, 220);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C636380Oxg.LIZ(interfaceC636240OxS, interfaceC1685750ty9LIZ, c636330Oxb, null, c1690080u58LIZ, c1682530tsx, false, c1666950tTpLJI, null, null, false, null, (Function2) objLJJ2, c13zcLJIIJ, 0 | (i3 & 14) | 12582912 | (57344 & i3) | (i3 & 458752), 0, 3912);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C633820OtY(interfaceC636240OxS, originMusicListViewModel, str2, interfaceC1685750ty92, c1690080u58LIZ, c1682530tsx, function0, i, i2);
        }
    }
}

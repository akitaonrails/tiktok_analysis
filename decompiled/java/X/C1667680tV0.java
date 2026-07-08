package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tV0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667680tV0 {
    public static final float LIZ = 16;
    public static final float LIZIZ = 52;
    public static final float LIZJ = 8;
    public static final float LIZLLL = 0;
    public static final float LJ = 10;
    public static final float LJFF = 44;
    public static final float LJI = 32;

    public static final void LIZIZ(TakoContentPreviewItem.Image image, InterfaceC1361305Ul interfaceC1361305Ul, int i, float f, boolean z, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zLJII;
        int i9;
        int i10;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1269974545);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(image)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1361305Ul);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1361305Ul);
            }
            if (zLJII) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        Function0<Unit> function03 = function0;
        if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        Function0<Unit> function04 = function02;
        if ((1572864 & i2) == 0) {
            if (c13zcLJIIJ.LJII(function04)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((i3 & 599187) == 599186 && c13zcLJIIJ.LIZ()) {
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
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS569S0100000_25(c05p0, (C05P0<Boolean>) 12);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                int i11 = i3 << 3;
                function04 = function04;
                LIZ(c1672220tcK, image, interfaceC1361305Ul, i, f, z, function04, (Function0) objLJJ2, c13zcLJIIJ, (i11 & 458752) | (i11 & 112) | 12582918 | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i3 & 3670016), 0);
                c13zcLJIIJ.LJJIIJZLJL(-2016756150);
                if (i <= 0 && ((Boolean) c05p0.getValue()).booleanValue()) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1671840tbi.LIZIZ(c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv));
                    float f2 = LJ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ = c.LJIJJ(c.LJIILIIL(C1682520tsw.LJIIL(interfaceC1685750ty9LIZIZ, f2, f2, 0.0f, 0.0f, 12), LJFF), C1668040tVa.LJFF, 2);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                    if (objLJJ3 == c1680520tpi) {
                        objLJJ3 = AFwS266S0000000_25.get$arr$(4);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(interfaceC1685750ty9LJIJJ, (Function1) objLJJ3);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        function03 = function03;
                        C1668060tVc.LIZLLL(C1669660tYC.Z, null, false, null, function03, c13zcLJIIJ, (i3 >> 3) & 57344, 14);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1667700tV2(image, interfaceC1361305Ul, i, f, z, function03, function04, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.InterfaceC1665870tS5 r41, com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem.Image r42, X.InterfaceC1361305Ul r43, int r44, float r45, boolean r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function0<kotlin.Unit> r48, X.InterfaceC1680500tpg r49, int r50, int r51) {
        /*
            Method dump skipped, instruction units count: 1399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1667680tV0.LIZ(X.0tS5, com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem$Image, X.05Ul, int, float, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}

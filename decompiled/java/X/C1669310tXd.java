package X;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669310tXd {
    public static final boolean LIZIZ(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final C1680470tpd LIZLLL(C1683130ttv c1683130ttv) {
        return new C1680470tpd(C814420VxA.LIZIZ(c1683130ttv.LIZ), C814420VxA.LIZIZ(c1683130ttv.LIZIZ), C814420VxA.LIZIZ(c1683130ttv.LIZJ), C814420VxA.LIZIZ(c1683130ttv.LIZLLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.InterfaceC1685750ty9 r26, java.lang.String r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r29, X.InterfaceC1680500tpg r30, int r31) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1669310tXd.LIZJ(X.0ty9, java.lang.String, kotlin.jvm.functions.Function0, com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel, X.0tpg, int):void");
    }

    public static final void LIZ(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, float f, SocialMediaPickerViewModel socialMediaPickerViewModel2, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int iHeight;
        int i3;
        float f2;
        boolean z;
        boolean z2;
        C13ZC c13zc;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(231581586);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel2)) {
                i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((i2 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c13zc = c13zcLJIIJ;
        } else {
            C13DR c13dr = C20055113dV.LJII;
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1696870uG5.LIZ(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJ(new AwS409S0200000_8(interfaceC1690500u5o, interfaceC1676320tiw, 133));
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P1 c05p1 = (C05P1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p0 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05P0 c05p02 = (C05P0) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            C1680470tpd c1680470tpd = (C1680470tpd) c05p02.getValue();
            c13zcLJIIJ.LJJIIJZLJL(-1222808688);
            View view = (View) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
            InterfaceC1690500u5o interfaceC1690500u5o2 = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
            } else {
                iHeight = 0;
            }
            float fLJJI = interfaceC1690500u5o2.LJJI(iHeight);
            if (c1680470tpd != null) {
                i3 = c1680470tpd.LIZLLL;
            } else {
                i3 = 0;
            }
            float fLJJI2 = fLJJI - interfaceC1690500u5o2.LJJI(i3);
            c13zcLJIIJ.LJJJJL(false);
            C1668650tWZ c1668650tWZ = new C1668650tWZ(fLJJI2);
            C1668650tWZ c1668650tWZ2 = new C1668650tWZ(0.8f * f);
            if (c1668650tWZ.compareTo(c1668650tWZ2) > 0) {
                c1668650tWZ = c1668650tWZ2;
            }
            float f3 = c1668650tWZ.LL;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            C05P0 c05p03 = (C05P0) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            C05P0 c05p04 = (C05P0) objLJJ6;
            c13zcLJIIJ.LJJJJL(false);
            if (LIZIZ(c05p03)) {
                f2 = 0;
            } else if (interfaceC1676320tiw.LIZLLL() == 0) {
                f2 = f3;
            } else {
                f2 = ((C1668650tWZ) c05p1.getValue()).LL;
            }
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(500, 0, null, 6);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (objLJJ7 == c1680520tpi) {
                objLJJ7 = new AwS391S0200000_25(c05p03, (C05P0<C1680470tpd>) c05p04, (C05P0<C1680470tpd>) 327);
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            c13zcLJIIJ.LJJJJL(false);
            C05P1 c05p1LIZ = C1675660ths.LIZ(f2, c1677050tk7LIZLLL, "", (Function1) objLJJ7, c13zcLJIIJ, 3504, 0);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (objLJJ8 == c1680520tpi) {
                objLJJ8 = C1696870uG5.LIZ(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            InterfaceC1676320tiw interfaceC1676320tiw2 = (InterfaceC1676320tiw) objLJJ8;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (objLJJ9 == c1680520tpi) {
                objLJJ9 = C1696870uG5.LIZ(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            InterfaceC1676320tiw interfaceC1676320tiw3 = (InterfaceC1676320tiw) objLJJ9;
            c13zcLJIIJ.LJJJJL(false);
            float f4 = 48;
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(interfaceC1685750ty9, f4);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJI);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJI2 = c.LJI(C1675980tiO.LIZIZ(c.LJ(c1685760tyA, 1.0f), C1666510tT7.LIZ(c13zcLJIIJ), C1669430tXp.LIZ), f4);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                Object objLJJ10 = c13zcLJIIJ.LJJ();
                if (objLJJ10 == c1680520tpi) {
                    objLJJ10 = new AwS391S0200000_25(c05p0, (C05P0<C1680470tpd>) c05p02, (C05P0<C1680470tpd>) 326);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ10);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(interfaceC1685750ty9LJI2, (Function1) objLJJ10);
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                    c13zcLJIIJ.LJJIIJZLJL(1553225932);
                    SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfig = socialMediaPickerViewModel2.LL.getTitleAreaUIConfig();
                    if (titleAreaUIConfig != null && titleAreaUIConfig.getHideCloseButton()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(C1682520tsw.LJIIL(c1685760tyA, 16, 0.0f, 0.0f, 0.0f, 14), C1668040tVa.LJ);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        if ((57344 & i2) == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Object objLJJ11 = c13zcLJIIJ.LJJ();
                        if (z4 || objLJJ11 == c1680520tpi) {
                            objLJJ11 = new AwS569S0100000_25(function0, (Function0<Unit>) 974);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ11);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LIZIZ, false, null, (Function0) objLJJ11, 7);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        Object objLJJ12 = c13zcLJIIJ.LJJ();
                        if (objLJJ12 == c1680520tpi) {
                            objLJJ12 = new AwS604S0100000_25(interfaceC1676320tiw3, 734);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ12);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        float f5 = 24;
                        C1668930tX1.LIZIZ(C1669660tYC.Z, "Close", C1685330txT.LIZ(interfaceC1685750ty9LIZJ, (Function1) objLJJ12), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), f5, f5, false, c13zcLJIIJ, 221232, 64);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    float f6 = 12;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(C1675980tiO.LIZIZ(c.LJI(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJFF), 36), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669050tXD.LIZIZ(18)), C1666420tSy.LIZ(Integer.valueOf(Math.max(interfaceC1676320tiw3.LIZLLL(), interfaceC1676320tiw2.LIZLLL())), c13zcLJIIJ) + f6, 0.0f, 2);
                    boolean zLIZIZ = LIZIZ(c05p03);
                    c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                    Object objLJJ13 = c13zcLJIIJ.LJJ();
                    if (objLJJ13 == c1680520tpi) {
                        objLJJ13 = new AwS426S0200000_25(c05p03, (C05P0<Boolean>) c05p04, (C05P0<Boolean>) 158);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ13);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1668950tX3.LIZ(socialMediaPickerViewModel2, zLIZIZ, interfaceC1685750ty9LJIIJ, (Function0) objLJJ13, c13zcLJIIJ, ((i2 >> 9) & 14) | 3072, 0);
                    c13zcLJIIJ.LJJIIJZLJL(1553275574);
                    if (socialMediaPickerViewModel.LL.getAiLiveSwitchStyle() == EnumC563850M9n.TOP_TOGGLE) {
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, f6, 0.0f, 11), C1668040tVa.LJI);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        boolean zLJII = c13zcLJIIJ.LJII(socialMediaPickerViewModel);
                        Object objLJJ14 = c13zcLJIIJ.LJJ();
                        if (zLJII || objLJJ14 == c1680520tpi) {
                            objLJJ14 = new AwS552S0100000_8(socialMediaPickerViewModel, 1016);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ14);
                        }
                        z2 = false;
                        c13zcLJIIJ.LJJJJL(false);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ2 = C634380OuS.LIZJ(interfaceC1685750ty9LIZIZ2, false, null, (Function0) objLJJ14, 7);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        Object objLJJ15 = c13zcLJIIJ.LJJ();
                        if (objLJJ15 == c1680520tpi) {
                            objLJJ15 = new AwS604S0100000_25(interfaceC1676320tiw2, 735);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ15);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        C1669170tXP.LIZ(socialMediaPickerViewModel, C1685330txT.LIZ(interfaceC1685750ty9LIZJ2, (Function1) objLJJ15), c13zcLJIIJ, i2 & 14, 0);
                    } else {
                        z2 = false;
                    }
                    c13zcLJIIJ.LJJJJL(z2);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJIIJZLJL(267219589);
                    if (((Boolean) c05p04.getValue()).booleanValue()) {
                        C1680470tpd c1680470tpd2 = (C1680470tpd) c05p0.getValue();
                        float f7 = ((C1668650tWZ) c05p1LIZ.getValue()).LL;
                        c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                        boolean zLJII2 = c13zcLJIIJ.LJII(socialMediaPickerViewModel2);
                        Object objLJJ16 = c13zcLJIIJ.LJJ();
                        if (zLJII2 || objLJJ16 == c1680520tpi) {
                            objLJJ16 = new AwS374S0200000_8(socialMediaPickerViewModel2, (SocialMediaPickerViewModel) c05p03, (C05P0<Boolean>) 197);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ16);
                        }
                        Function1 function1 = (Function1) objLJJ16;
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        Object objLJJ17 = c13zcLJIIJ.LJJ();
                        if (objLJJ17 == c1680520tpi) {
                            objLJJ17 = new AwS552S0100000_8(c05p03, (C05P0<String>) 1017);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ17);
                        }
                        Function0 function02 = (Function0) objLJJ17;
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        Object objLJJ18 = c13zcLJIIJ.LJJ();
                        if (objLJJ18 == c1680520tpi) {
                            objLJJ18 = new AwS604S0100000_25(interfaceC1676320tiw, 736);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ18);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        z3 = false;
                        c13zc = c13zcLJIIJ;
                        C1669280tXa.LIZIZ(c1680470tpd2, f3, f7, socialMediaPickerViewModel, function1, function02, C1685330txT.LIZ(c1685760tyA, (Function1) objLJJ18), c13zcLJIIJ, ((i2 << 9) & 7168) | 1769472, 0);
                    } else {
                        c13zc = c13zcLJIIJ;
                        z3 = false;
                    }
                    c13zc.LJJJJL(z3);
                    c13zc.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M9R(socialMediaPickerViewModel, interfaceC1685750ty9, f, socialMediaPickerViewModel2, function0, i);
        }
    }
}

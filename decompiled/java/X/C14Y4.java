package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.LoginScope;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.LoginGroupVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS183S0101000_30;
import kotlin.jvm.internal.AwS2S0121000_30;
import kotlin.jvm.internal.AwS7S0103000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import tiktok.communication.ComposeScope;

/* JADX INFO: renamed from: X.14Y4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14Y4 {
    public static final void LIZIZ(EnumC19320810iM enumC19320810iM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1127976646);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC19320810iM.ordinal())) {
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
            int i4 = C2174481A8g.LIZ[enumC19320810iM.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        c13zcLJIIJ.LJJIIJZLJL(1653807231);
                        C1688990u3N.LIZ(null, c13zcLJIIJ, 0, 1);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(1653801037);
                        c13zcLJIIJ.LJJJJL(false);
                        throw new C1954807lC();
                    }
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(1653804917);
                    C1689200u3i.LIZ(null, c13zcLJIIJ, 0, 1);
                    c13zcLJIIJ.LJJJJL(false);
                }
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1653802933);
                C1689190u3h.LIZ(null, c13zcLJIIJ, 0, 1);
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS183S0101000_30(enumC19320810iM, i, 4);
        }
    }

    public static final void LJFF(C1555940qam c1555940qam, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1001907897);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1555940qam)) {
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
        } else if (c1555940qam.LLILZ || c1555940qam.LLILLL) {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1688900u3E.LIZJ(C0MBB.LIZIZ(2131847816, c13zcLJIIJ), true, false, false, null, c13zcLJIIJ, 48, 28);
                c13zcLJIIJ.LJJIIJZLJL(906748952);
                if (c1555940qam.LLILZ) {
                    C1688930u3H.LIZIZ(true, !c1555940qam.LLILLL, null, c13zcLJIIJ, 6, 4);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(906753969);
                if (c1555940qam.LLILLL) {
                    C14YE.LIZIZ(!c1555940qam.LLILZ, true, null, c13zcLJIIJ, 48, 4);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS183S0101000_30(c1555940qam, i, 5);
        }
    }

    public static final void LJI(LoginGroupVM loginGroupVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(119732012);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(loginGroupVM)) {
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
            LJFF((C1555940qam) C1244280iU6.LIZ(loginGroupVM, null, c13zcLJIIJ, i2 & 14, 7).getValue(), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(i, loginGroupVM, 57);
        }
    }

    public static final void LIZ(EnumC2174511A8j enumC2174511A8j, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1976553190);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC2174511A8j.ordinal())) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            switch (C2174481A8g.LIZJ[enumC2174511A8j.ordinal()]) {
                case 1:
                    c13zcLJIIJ.LJJIIJZLJL(-1092064416);
                    C1688900u3E.LIZJ(C0MBB.LIZIZ(2131847815, c13zcLJIIJ), false, false, false, null, c13zcLJIIJ, 48, 28);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 2:
                    c13zcLJIIJ.LJJIIJZLJL(-1092059420);
                    int i6 = i2 >> 3;
                    C14Y1.LIZIZ(z, z2, null, c13zcLJIIJ, (i6 & 14) | (i6 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 3:
                    c13zcLJIIJ.LJJIIJZLJL(-1092057370);
                    int i7 = i2 >> 3;
                    C20282914Xz.LIZIZ(z, z2, null, c13zcLJIIJ, (i7 & 14) | (i7 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 4:
                    c13zcLJIIJ.LJJIIJZLJL(-1092055357);
                    int i8 = i2 >> 3;
                    C1689160u3e.LIZIZ(z, z2, null, c13zcLJIIJ, (i8 & 14) | (i8 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 5:
                    c13zcLJIIJ.LJJIIJZLJL(-1092053404);
                    int i9 = i2 >> 3;
                    C20281714Xn.LIZIZ(z, z2, null, c13zcLJIIJ, (i9 & 14) | (i9 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 6:
                    c13zcLJIIJ.LJJIIJZLJL(-1092051451);
                    int i10 = i2 >> 3;
                    C14Y7.LIZIZ(z, z2, null, c13zcLJIIJ, (i10 & 14) | (i10 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 7:
                    c13zcLJIIJ.LJJIIJZLJL(-1092048910);
                    int i11 = i2 >> 3;
                    C14Y0.LIZIZ(z, z2, null, c13zcLJIIJ, (i11 & 14) | (i11 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 8:
                    c13zcLJIIJ.LJJIIJZLJL(-1092045933);
                    int i12 = i2 >> 3;
                    C20281814Xo.LIZIZ(z, z2, null, c13zcLJIIJ, (i12 & 14) | (i12 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c13zcLJIIJ.LJJIIJZLJL(-1092043287);
                    int i13 = i2 >> 3;
                    C1689590u4L.LIZIZ(z, z2, null, c13zcLJIIJ, (i13 & 14) | (i13 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    c13zcLJIIJ.LJJIIJZLJL(-1092041181);
                    int i14 = i2 >> 3;
                    C20281414Xk.LIZIZ(z, z2, null, c13zcLJIIJ, (i14 & 14) | (i14 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    c13zcLJIIJ.LJJIIJZLJL(-1092039097);
                    int i15 = i2 >> 3;
                    C14Y8.LIZIZ(z, z2, null, c13zcLJIIJ, (i15 & 14) | (i15 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    c13zcLJIIJ.LJJIIJZLJL(-1092037053);
                    int i16 = i2 >> 3;
                    C14YO.LIZIZ(z, z2, null, c13zcLJIIJ, (i16 & 14) | (i16 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                default:
                    c13zcLJIIJ.LJJIIJZLJL(-1092065133);
                    c13zcLJIIJ.LJJJJL(false);
                    throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0121000_30(enumC2174511A8j, z, z2, i, 44);
        }
    }

    public static final void LIZJ(EnumC2174521A8k enumC2174521A8k, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1140853626);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC2174521A8k.ordinal())) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            switch (C2174481A8g.LIZLLL[enumC2174521A8k.ordinal()]) {
                case 1:
                    c13zcLJIIJ.LJJIIJZLJL(1143680672);
                    C1688900u3E.LIZJ(C0MBB.LIZIZ(2131847817, c13zcLJIIJ), true, false, false, null, c13zcLJIIJ, 48, 28);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 2:
                    c13zcLJIIJ.LJJIIJZLJL(1143686152);
                    int i6 = i2 >> 3;
                    C14Y3.LIZIZ(z, z2, null, c13zcLJIIJ, (i6 & 14) | (i6 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 3:
                    c13zcLJIIJ.LJJIIJZLJL(1143688879);
                    int i7 = i2 >> 3;
                    C14Y2.LIZIZ(z, z2, null, c13zcLJIIJ, (i7 & 14) | (i7 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 4:
                    c13zcLJIIJ.LJJIIJZLJL(1143691790);
                    int i8 = i2 >> 3;
                    C14Y9.LIZIZ(z, z2, null, c13zcLJIIJ, (i8 & 14) | (i8 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 5:
                    c13zcLJIIJ.LJJIIJZLJL(1143694999);
                    int i9 = i2 >> 3;
                    C14YA.LIZIZ(z, z2, null, c13zcLJIIJ, (i9 & 14) | (i9 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 6:
                    c13zcLJIIJ.LJJIIJZLJL(1143698290);
                    int i10 = i2 >> 3;
                    C14YB.LIZIZ(z, z2, null, c13zcLJIIJ, (i10 & 14) | (i10 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 7:
                    c13zcLJIIJ.LJJIIJZLJL(1143701261);
                    int i11 = i2 >> 3;
                    C14YJ.LIZIZ(z, z2, null, c13zcLJIIJ, (i11 & 14) | (i11 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                default:
                    c13zcLJIIJ.LJJIIJZLJL(1143679350);
                    c13zcLJIIJ.LJJJJL(false);
                    throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0121000_30(enumC2174521A8k, z, z2, i, 45);
        }
    }

    public static final void LJ(LoginGroupVM loginGroupVM, int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        LoginGroupVM loginGroupVM2 = loginGroupVM;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(346513322);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJII(loginGroupVM2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i4 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                loginGroupVM2 = null;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new LoginScope();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20136213qa.LIZ((ComposeScope) objLJJ, C13Z4.LIZJ(-136213198, new AwS181S0101000_25(i, loginGroupVM2, 56), c13zcLJIIJ), c13zcLJIIJ, 48);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS7S0103000_25(loginGroupVM2, i, i2, i3, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.InterfaceC1688870u3B r19, boolean r20, boolean r21, X.InterfaceC1680500tpg r22, int r23) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14Y4.LJII(X.0u3B, boolean, boolean, X.0tpg, int):void");
    }

    public static final void LJIIIIZZ(EnumC2174421A8a enumC2174421A8a, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(305795546);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC2174421A8a.ordinal())) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            switch (C2174481A8g.LJFF[enumC2174421A8a.ordinal()]) {
                case 1:
                    c13zcLJIIJ.LJJIIJZLJL(1811750720);
                    C1688900u3E.LIZJ(C0MBB.LIZIZ(2131847814, c13zcLJIIJ), true, false, false, null, c13zcLJIIJ, 48, 28);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 2:
                    c13zcLJIIJ.LJJIIJZLJL(1811755753);
                    int i6 = i2 >> 3;
                    C1688920u3G.LIZIZ(z, z2, null, c13zcLJIIJ, (i6 & 14) | (i6 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 3:
                    c13zcLJIIJ.LJJIIJZLJL(1811757933);
                    int i7 = i2 >> 3;
                    C14YS.LIZIZ(z, z2, null, c13zcLJIIJ, (i7 & 14) | (i7 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 4:
                    c13zcLJIIJ.LJJIIJZLJL(1811760204);
                    int i8 = i2 >> 3;
                    C1689150u3d.LIZIZ(z, z2, null, c13zcLJIIJ, (i8 & 14) | (i8 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 5:
                    c13zcLJIIJ.LJJIIJZLJL(1811762732);
                    int i9 = i2 >> 3;
                    C14YV.LIZIZ(z, z2, null, c13zcLJIIJ, (i9 & 14) | (i9 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 6:
                    c13zcLJIIJ.LJJIIJZLJL(1811765746);
                    int i10 = i2 >> 3;
                    C14YQ.LIZIZ(z, z2, null, c13zcLJIIJ, (i10 & 14) | (i10 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 7:
                    c13zcLJIIJ.LJJIIJZLJL(1811768979);
                    int i11 = i2 >> 3;
                    C14YR.LIZIZ(z, z2, null, c13zcLJIIJ, (i11 & 14) | (i11 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 8:
                    c13zcLJIIJ.LJJIIJZLJL(1811771370);
                    int i12 = i2 >> 3;
                    C14YF.LIZIZ(z, z2, null, c13zcLJIIJ, (i12 & 14) | (i12 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c13zcLJIIJ.LJJIIJZLJL(1811773745);
                    int i13 = i2 >> 3;
                    C14YH.LIZIZ(z, z2, null, c13zcLJIIJ, (i13 & 14) | (i13 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    c13zcLJIIJ.LJJIIJZLJL(1811776238);
                    int i14 = i2 >> 3;
                    C14YG.LIZIZ(z, z2, null, c13zcLJIIJ, (i14 & 14) | (i14 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    c13zcLJIIJ.LJJIIJZLJL(1811778605);
                    int i15 = i2 >> 3;
                    C14YI.LIZIZ(z, z2, null, c13zcLJIIJ, (i15 & 14) | (i15 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                default:
                    c13zcLJIIJ.LJJIIJZLJL(1811749378);
                    c13zcLJIIJ.LJJJJL(false);
                    throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0121000_30(enumC2174421A8a, z, z2, i, 47);
        }
    }

    public static final void LJIIIZ(EnumC2174461A8e enumC2174461A8e, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZIZ;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2137959782);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC2174461A8e.ordinal())) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            boolean zLIZ = C1207504nx.LIZ();
            switch (C2174481A8g.LIZIZ[enumC2174461A8e.ordinal()]) {
                case 1:
                    c13zcLJIIJ.LJJIIJZLJL(-1584974495);
                    c13zcLJIIJ.LJJIIJZLJL(-1584973288);
                    if (zLIZ) {
                        strLIZIZ = C0MBB.LIZIZ(2131847747, c13zcLJIIJ);
                    } else {
                        strLIZIZ = "";
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    boolean z3 = !zLIZ;
                    C1688900u3E.LIZJ(strLIZIZ, z3, false, z3, null, c13zcLJIIJ, 0, 20);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 2:
                    c13zcLJIIJ.LJJIIJZLJL(-1584963949);
                    int i6 = i2 >> 3;
                    C20282014Xq.LIZIZ(z, z2, null, c13zcLJIIJ, (i6 & 14) | (i6 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 3:
                    c13zcLJIIJ.LJJIIJZLJL(-1584960912);
                    int i7 = i2 >> 3;
                    C20282814Xy.LIZIZ(z, z2, null, c13zcLJIIJ, (i7 & 14) | (i7 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 4:
                    c13zcLJIIJ.LJJIIJZLJL(-1584957770);
                    int i8 = i2 >> 3;
                    C14YT.LIZIZ(z, z2, null, c13zcLJIIJ, (i8 & 14) | (i8 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 5:
                    c13zcLJIIJ.LJJIIJZLJL(-1584954615);
                    int i9 = i2 >> 3;
                    C20281914Xp.LIZIZ(z, z2, null, c13zcLJIIJ, (i9 & 14) | (i9 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 6:
                    c13zcLJIIJ.LJJIIJZLJL(-1584951599);
                    int i10 = i2 >> 3;
                    C20281514Xl.LIZIZ(z, z2, null, c13zcLJIIJ, (i10 & 14) | (i10 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 7:
                    c13zcLJIIJ.LJJIIJZLJL(-1584948657);
                    int i11 = i2 >> 3;
                    C14YN.LIZIZ(z, z2, null, c13zcLJIIJ, (i11 & 14) | (i11 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 8:
                    c13zcLJIIJ.LJJIIJZLJL(-1584945678);
                    int i12 = i2 >> 3;
                    C20281614Xm.LIZIZ(z, z2, null, c13zcLJIIJ, (i12 & 14) | (i12 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                default:
                    c13zcLJIIJ.LJJIIJZLJL(-1584975587);
                    c13zcLJIIJ.LJJJJL(false);
                    throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0121000_30(enumC2174461A8e, z, z2, i, 48);
        }
    }

    public static final void LIZLLL(EnumC2174471A8f enumC2174471A8f, boolean z, boolean z2, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2 = str;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(23630747);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC2174471A8f.ordinal())) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                str2 = null;
            }
            switch (C2174481A8g.LJ[enumC2174471A8f.ordinal()]) {
                case 1:
                    c13zcLJIIJ.LJJIIJZLJL(1234319423);
                    C1688900u3E.LIZJ(C0MBB.LIZIZ(2131847818, c13zcLJIIJ), true, false, false, null, c13zcLJIIJ, 48, 28);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 2:
                    c13zcLJIIJ.LJJIIJZLJL(1234324947);
                    int i9 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C14YL.LIZIZ(z3, z4, null, c13zcLJIIJ, (i9 & 14) | (i9 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 3:
                    c13zcLJIIJ.LJJIIJZLJL(1234328212);
                    int i10 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282014Xq.LIZIZ(z3, z4, null, c13zcLJIIJ, (i10 & 14) | (i10 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 4:
                    c13zcLJIIJ.LJJIIJZLJL(1234331369);
                    int i11 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C14YC.LIZIZ(z3, z4, null, c13zcLJIIJ, (i11 & 14) | (i11 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 5:
                    c13zcLJIIJ.LJJIIJZLJL(1234334325);
                    int i12 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C14YU.LIZIZ(z3, z4, null, c13zcLJIIJ, (i12 & 14) | (i12 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 6:
                    c13zcLJIIJ.LJJIIJZLJL(1234337653);
                    int i13 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282214Xs.LIZIZ(z3, z4, null, c13zcLJIIJ, (i13 & 14) | (i13 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 7:
                    c13zcLJIIJ.LJJIIJZLJL(1234341047);
                    int i14 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282314Xt.LIZIZ(z3, z4, null, c13zcLJIIJ, (i14 & 14) | (i14 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 8:
                    c13zcLJIIJ.LJJIIJZLJL(1234344503);
                    int i15 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C14YT.LIZIZ(z3, z4, null, c13zcLJIIJ, (i15 & 14) | (i15 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234347597);
                    int i16 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282614Xw.LIZIZ(z3, z4, null, c13zcLJIIJ, (i16 & 14) | (i16 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234350611);
                    int i17 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20281614Xm.LIZIZ(z3, z4, null, c13zcLJIIJ, (i17 & 14) | (i17 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234353745);
                    int i18 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C14YD.LIZIZ(z3, z4, null, c13zcLJIIJ, (i18 & 14) | (i18 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234356686);
                    int i19 = i3 >> 3;
                    C1688970u3L.LIZIZ(z3, z4, c13zcLJIIJ, (i19 & 112) | (i19 & 14));
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234359690);
                    int i20 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20281914Xp.LIZIZ(z3, z4, null, c13zcLJIIJ, (i20 & 14) | (i20 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 14:
                    c13zcLJIIJ.LJJIIJZLJL(1234362702);
                    int i21 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282714Xx.LIZIZ(z3, z4, null, c13zcLJIIJ, (i21 & 14) | (i21 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 15:
                    c13zcLJIIJ.LJJIIJZLJL(1234365739);
                    int i22 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282114Xr.LIZIZ(z3, z4, null, c13zcLJIIJ, (i22 & 14) | (i22 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 16:
                    c13zcLJIIJ.LJJIIJZLJL(1234368914);
                    int i23 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20281514Xl.LIZIZ(z3, z4, null, c13zcLJIIJ, (i23 & 14) | (i23 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234372174);
                    int i24 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C14YM.LIZIZ(z3, z4, null, c13zcLJIIJ, (i24 & 14) | (i24 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234375120);
                    int i25 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C14YN.LIZIZ(z3, z4, null, c13zcLJIIJ, (i25 & 14) | (i25 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 19:
                    c13zcLJIIJ.LJJIIJZLJL(1234378037);
                    int i26 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282414Xu.LIZIZ(z3, z4, null, c13zcLJIIJ, (i26 & 14) | (i26 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    c13zcLJIIJ.LJJIIJZLJL(1234381457);
                    int i27 = i3 >> 3;
                    C1688950u3J.LIZIZ(z3, z4, Intrinsics.LJFF(str2, EnumC2174471A8f.SWITCH_INBOX_MODE.getKey()), null, c13zcLJIIJ, (i27 & 14) | (i27 & 112), 8);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                case 21:
                    c13zcLJIIJ.LJJIIJZLJL(1234386809);
                    int i28 = i3 >> 3;
                    z3 = z3;
                    z4 = z4;
                    C20282514Xv.LIZIZ(z3, z4, null, c13zcLJIIJ, (i28 & 14) | (i28 & 112), 4);
                    c13zcLJIIJ.LJJJJL(false);
                    break;
                default:
                    c13zcLJIIJ.LJJIIJZLJL(1234319483);
                    c13zcLJIIJ.LJJJJL(false);
                    throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C14Y5(enumC2174471A8f, z3, z4, str2, i, i2);
        }
    }
}

package X;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0tST, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666110tST {
    public static final void LIZ(C948130amR c948130amR, String str, Function1<? super AbstractC948200amY, Unit> function1, Function1<? super AbstractC948180amW, Unit> function12, Function1<? super Integer, AnchorPanelLayoutTypeSetting> function13, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        boolean z2;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-431098247);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c948130amR)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
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
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function13, c13zcLJIIJ);
            final C259800zU c259800zU = new C259800zU();
            c13zcLJIIJ.LJJIIJZLJL(-1968532210);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c.LIZIZ(c.LJ(c1685760tyA, 1.0f), 1.0f);
            c13zcLJIIJ.LJJIIJZLJL(-1968531542);
            if (((Boolean) c05p0.getValue()).booleanValue()) {
                interfaceC1685750ty9LIZJ = C1679720toQ.LIZ(interfaceC1685750ty9LIZIZ, Unit.LIZ, new PointerInputEventHandler() { // from class: X.0tSU
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Function0<Unit> function0 = c259800zU.element;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.LIZ;
                    }
                });
                z2 = false;
            } else {
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((i2 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (z || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS559S0100000_15(function12, (Function1<? super Throwable, Unit>) 1049);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                z2 = false;
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LIZIZ, false, null, (Function0) objLJJ2, 7);
            }
            c13zcLJIIJ.LJJJJL(z2);
            c13zcLJIIJ.LJJJJL(z2);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJIIIIZZ, z2);
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
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (objLJJ3 == c1680520tpi) {
                    objLJJ3 = AFwS203S0000000_15.get$arr$(410);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZJ2 = C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ3, 7);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    float f = 12;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(c.LJ(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), C1669050tXD.LIZLLL(f, f, 0.0f, 0.0f, 12)), 1.0f), 16, 14);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ4 = c13zcLJIIJ.LJJ();
                    if (objLJJ4 == c1680520tpi) {
                        objLJJ4 = AFwS203S0000000_15.get$arr$(411);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZJ3 = C634380OuS.LIZJ(interfaceC1685750ty9LJIIIZ, false, null, (Function0) objLJJ4, 7);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(C1668040tVa.LIZIZ, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ3);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        C1668880tWw c1668880tWw = C1669660tYC.LJJL;
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJ);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        int i8 = i2 & 7168;
                        if (i8 == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Object objLJJ5 = c13zcLJIIJ.LJJ();
                        if (z3 || objLJJ5 == c1680520tpi) {
                            objLJJ5 = new AwS559S0100000_15(function12, (Function1<? super Throwable, Unit>) 1050);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        float f2 = 24;
                        C1668930tX1.LIZIZ(c1668880tWw, "back", C634380OuS.LIZJ(interfaceC1685750ty9LIZIZ2, false, null, (Function0) objLJJ5, 7), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), f2, f2, false, c13zcLJIIJ, 221232, 64);
                        C1685190txF.LIZ(C497740JfY.LJIJI(2131854490), c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJFF), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJI, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2032);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJIIJZLJL(1119379307);
                        if (c948130amR.LIZJ.LIZ) {
                            C948300ami c948300ami = c948130amR.LIZ;
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            if ((i2 & 896) == 256) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            Object objLJJ6 = c13zcLJIIJ.LJJ();
                            if (z4 || objLJJ6 == c1680520tpi) {
                                objLJJ6 = new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 1041);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                            }
                            Function1 function14 = (Function1) objLJJ6;
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            if (i8 == 2048) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            Object objLJJ7 = c13zcLJIIJ.LJJ();
                            if (z5 || objLJJ7 == c1680520tpi) {
                                objLJJ7 = new AwS594S0100000_15(function12, (Function1<? super PosIdentity, Unit>) 1042);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                            }
                            Function1 function15 = (Function1) objLJJ7;
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            Object objLJJ8 = c13zcLJIIJ.LJJ();
                            if (objLJJ8 == c1680520tpi) {
                                objLJJ8 = new AwS594S0100000_15(c05p0, 1043);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
                            }
                            Function1 function16 = (Function1) objLJJ8;
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ);
                            Object objLJJ9 = c13zcLJIIJ.LJJ();
                            if (zLJJIIJ || objLJJ9 == c1680520tpi) {
                                objLJJ9 = new AwS594S0100000_15(c05p0LJIIIIZZ, 1044);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            C1666080tSQ.LIZ(c948300ami, str, function14, function15, function16, (Function1) objLJJ9, c13zcLJIIJ, (i2 & 112) | 24576);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJIIJZLJL(1119405670);
                        if (c948130amR.LIZJ.LIZIZ) {
                            C1666610tTH.LIZIZ(c948130amR.LIZIZ, function1, c13zcLJIIJ, (i2 >> 3) & 112);
                        }
                        c13zcLJIIJ.LJJJJL(false);
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
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C951490arr(c948130amR, str, function1, function12, function13, i);
        }
    }
}

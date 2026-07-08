package X;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.layout.c;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS155S1200000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.AwS99S1200000_15;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;

/* JADX INFO: renamed from: X.0tSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666080tSQ {
    public static final void LIZ(C948300ami c948300ami, String str, Function1<? super AbstractC948140amS, Unit> function1, Function1<? super AbstractC948190amX, Unit> function12, Function1<? super Boolean, Unit> function13, Function1<? super Integer, AnchorPanelLayoutTypeSetting> function14, InterfaceC1680500tpg interfaceC1680500tpg, int i) throws Throwable {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        int i4;
        boolean z8;
        boolean z9;
        boolean z10;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-806408225);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c948300ami)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function14)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((74899 & i2) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C948400ams c948400ams = (C948400ams) C13LP.LJJJLZIJ(c948300ami.LIZIZ, c948300ami.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new BPEAHandler(Looper.getMainLooper());
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Handler handler = (Handler) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(Boolean.TRUE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p02 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05P0 c05p03 = (C05P0) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            C05P0 c05p04 = (C05P0) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function14, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), C1669430tXp.LIZ), 1.0f);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
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
                C1687990u1l c1687990u1l = C1687990u1l.LIZ;
                boolean z11 = c948300ami.LJFF;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                int i11 = i2 & 896;
                if (i11 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (z || objLJJ6 == c1680520tpi) {
                    objLJJ6 = new AwS629S0100000_15(function1, (Function1<? super AbstractC948140amS, Unit>) 94);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                Function2 function2 = (Function2) objLJJ6;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                boolean zLJII = c13zcLJIIJ.LJII(c948300ami);
                int i12 = i2 & 112;
                if (i12 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z12 = zLJII | z2;
                if (i11 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z13 = z12 | z3;
                Object objLJJ7 = c13zcLJIIJ.LJJ();
                if (z13 || objLJJ7 == c1680520tpi) {
                    objLJJ7 = new AwS155S1200000_15(c948300ami, (C948300ami) str, (String) function1, (Function1<? super AbstractC948140amS, Unit>) 2);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                }
                Function2 function22 = (Function2) objLJJ7;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((i2 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object objLJJ8 = c13zcLJIIJ.LJJ();
                if (z4 || objLJJ8 == c1680520tpi) {
                    objLJJ8 = new AwS559S0100000_15(function12, (Function1<? super Throwable, Unit>) 1034);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ8);
                }
                Function0 function0 = (Function0) objLJJ8;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ);
                Object objLJJ9 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ || objLJJ9 == c1680520tpi) {
                    objLJJ9 = new AwS594S0100000_15(c05p0LJIIIIZZ, 1027);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ9);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1666070tSP.LIZ(c948300ami, z11, function2, function22, function0, (Function1) objLJJ9, str, null, c13zcLJIIJ, (i2 & 14) | ((i2 << 15) & 3670016), 128);
                c13zcLJIIJ.LJJIIJZLJL(-1778871883);
                if (c948400ams != null && (((i4 = c948400ams.LIZIZ) == 2 || i4 == 4) && c948300ami.LJFF)) {
                    String strLJIJI = C497740JfY.LJIJI(2131854590);
                    boolean z14 = c948300ami.LIZJ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = c.LJIIIIZZ(c1685760tyA, 75, 0.0f, 2);
                    c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                    boolean zLJII2 = c13zcLJIIJ.LJII(c948300ami);
                    if (i12 == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z15 = zLJII2 | z8;
                    Object objLJJ10 = c13zcLJIIJ.LJJ();
                    if (z15 || objLJJ10 == c1680520tpi) {
                        objLJJ10 = new AwS99S1200000_15(c948300ami, (C948300ami) str, (String) c05p04, (C05P0<Boolean>) 7);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ10);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(interfaceC1685750ty9LJIIIIZZ, (Function1) objLJJ10);
                    c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                    if (i12 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i11 == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z16 = z9 | z10;
                    Object objLJJ11 = c13zcLJIIJ.LJJ();
                    if (z16 || objLJJ11 == c1680520tpi) {
                        objLJJ11 = new AwS129S1100000_15(str, function1, 14);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ11);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1666130tSV.LIZ(strLJIJI, z14, interfaceC1685750ty9LIZ, (Function1) objLJJ11, C497740JfY.LJIJI(2131854591), false, c13zcLJIIJ, 196608, 0);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1778808868);
                if (c948400ams == null || (((i3 = c948400ams.LIZIZ) != 3 && i3 != 5 && i3 != 6 && i3 != 7 && i3 != 11 && i3 != 12) || !c948300ami.LJFF || C934890aR5.LIZ())) {
                    z5 = false;
                } else {
                    Unit unit = Unit.LIZ;
                    c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                    boolean zLJII3 = c13zcLJIIJ.LJII(c948300ami);
                    if (i12 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z17 = zLJII3 | z6;
                    Object objLJJ12 = c13zcLJIIJ.LJJ();
                    if (z17 || objLJJ12 == c1680520tpi) {
                        objLJJ12 = new C948350amn(c05p0, c948300ami, str, c05p03, null);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ12);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1680540tpk.LJFF(unit, (Function2) objLJJ12, c13zcLJIIJ);
                    String strLJIJI2 = C497740JfY.LJIJI(2131854589);
                    String strValueOf = String.valueOf(c948300ami.LIZLLL);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c1685760tyA, 54);
                    c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                    if ((i2 & 57344) == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    Object objLJJ13 = c13zcLJIIJ.LJJ();
                    if (z7 || objLJJ13 == c1680520tpi) {
                        objLJJ13 = new AwS259S0300000_15(function13, (Function1<? super Boolean, Unit>) c05p02, (C05P0<Boolean>) c05p0, (C05P0<Boolean>) 48);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ13);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1666100tSS.LIZ(strLJIJI2, interfaceC1685750ty9LJI, strValueOf, null, false, (Function0) objLJJ13, c13zcLJIIJ, 24624, 8);
                    z5 = false;
                    C1676630tjR.LIZLLL(c1687990u1l, ((Boolean) c05p0.getValue()).booleanValue(), c.LJ(c1685760tyA, 1.0f), C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)), C1676510tjF.LJI(0.0f, C1671550tbF.LIZLLL(100, 0, null, 6)), null, C13Z4.LIZJ(-765166145, new C951530arv(handler, c05p0, c05p02, c05p03, c948300ami, c948400ams, str, function13, function1), c13zcLJIIJ), c13zcLJIIJ, 1600902, 16);
                }
                c13zcLJIIJ.LJJJJL(z5);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C951450arn(c948300ami, str, function1, function12, function13, function14, i);
        }
    }
}

package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666700tTQ {
    public static final void LIZ(Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, Integer num, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String strLIZIZ;
        int iIntValue;
        boolean z3 = z2;
        Integer num2 = num;
        boolean z4 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(5472452);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
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
            if (c13zcLJIIJ.LJJIIJ(num2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i10 != 0) {
                z4 = false;
            }
            if (i11 != 0) {
                num2 = null;
            }
            if (i12 != 0) {
                z3 = true;
            }
            Function0 function0LIZ = C0MXD.LIZ(i3 & 14, c13zcLJIIJ, function0);
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(interfaceC1685750ty92, 1.0f);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C612270Nzt();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            float f = 24;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(C634380OuS.LIZ(interfaceC1685750ty9LJ, (InterfaceC595010NVj) objLJJ, null, z3, null, null, function0LIZ), 16, f);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIZ);
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
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    try {
                        List<C530500KrI> list = C529730Kq3.LIZ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (C530500KrI c530500KrI : (ArrayList) list) {
                            C547860LeC.LIZ.getClass();
                            String strLIZ = C547860LeC.LJI().LIZ(c530500KrI);
                            if (strLIZ == null) {
                                strLIZ = "";
                            }
                            arrayList.add(strLIZ);
                        }
                        objLJJ2 = C1687430u0r.LIZ(arrayList);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        objLJJ2 = null;
                    }
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1667170tUB.LIZ((InterfaceC1665500tRU) objLJJ2, c13zcLJIIJ, 6);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131825792, c13zcLJIIJ), c.LJ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                C1665790tRx.LIZ(c.LJI(c1685760tyA, 8), c13zcLJIIJ);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131825789, c13zcLJIIJ), c.LJ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                c13zcLJIIJ.LJJIIJZLJL(-1689449409);
                if (z4) {
                    String strLIZIZ2 = C555520LqY.LIZIZ(2131825786);
                    Pair[] pairArr = new Pair[1];
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    pairArr[0] = new Pair("num", Integer.valueOf(iIntValue));
                    strLIZIZ = C202200qC.LIZ(strLIZIZ2, pairArr);
                } else {
                    strLIZIZ = C0MBB.LIZIZ(2131825787, c13zcLJIIJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673400teE.LIZJ(function0LIZ, strLIZIZ, c.LJI(c.LJ(c1685760tyA, 1.0f), 48), z3, 0L, false, null, null, null, C1666920tTm.LIZ(0.0f, null, C1671140taa.LIZ, c13zcLJIIJ, 3072, 7), C1666340tSq.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).v2(), C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), 0.0f, C1670400tZO.LIZIZ(c13zcLJIIJ).v2(), c13zcLJIIJ, 0, 12), null, false, c13zcLJIIJ, ((i3 >> 3) & 7168) | 384, 0, 6640);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C569800MWk(function0, interfaceC1685750ty92, z4, num2, z3, i, i2);
        }
    }
}

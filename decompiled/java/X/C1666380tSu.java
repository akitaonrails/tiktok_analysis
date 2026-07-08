package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666380tSu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0jqv, X.0jqw, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r38v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r39v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r40v0, types: [kotlin.jvm.functions.Function1] */
    public static final void LIZ(boolean z, Function1<? super Boolean, Unit> function1, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(263573299);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 32;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c.LJ(c.LJIJI(c1685760tyA, null, 3), 1.0f), f, 0.0f, 2);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
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
                C1665790tRx.LIZ(c.LJI(c1685760tyA, 36), c13zcLJIIJ);
                boolean z3 = false;
                ?? r10 = 0;
                C1685190txF.LIZ(C0MBB.LIZIZ(2131830816, c13zcLJIIJ), null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LIZ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2002);
                C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                float f2 = 4;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ2 = C1682520tsw.LJIIJ(C1675980tiO.LIZIZ(c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3), C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), C1669050tXD.LIZIZ(12)), 0.0f, f2, 1);
                C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    c13zcLJIIJ.LJJIIJZLJL(-950329019);
                    if (C901130ZWt.LIZIZ.LJIIIZ()) {
                        InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1682520tsw.LJIIIZ(c1685760tyA, 16, 10), 1.0f);
                        C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 48);
                        int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                            z3 = false;
                            r10 = 0;
                            C1685190txF.LIZ(C0MBB.LIZIZ(2131830814, c13zcLJIIJ), C1687980u1k.LIZ.LIZ(c.LJIJI(c1685760tyA, null, 3), 1.0f, true), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 5, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2000);
                            C1673100tdk.LIZIZ(z, function1, null, null, false, null, c13zcLJIIJ, (i2 & 14) | (i2 & 112), 60);
                            z2 = true;
                            c13zcLJIIJ.LJJJJL(true);
                        } else {
                            C0MXE.LIZIZ();
                            throw null;
                        }
                    } else {
                        z2 = true;
                    }
                    c13zcLJIIJ.LJJJJL(z3);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c1685760tyA, z3, r10, function0, 7);
                    float f3 = 16;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJ2 = c.LJ(C1682520tsw.LJIIIZ(interfaceC1685750ty9LIZJ, f3, 10), 1.0f);
                    C1688120u1y c1688120u1yLIZ2 = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 48);
                    int iLIZ4 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL4 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ2);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL4, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                        C1685190txF.LIZ(C0MBB.LIZIZ(2131830819, c13zcLJIIJ), C1687980u1k.LIZ.LIZ(c.LJIJI(c1685760tyA, r10, 3), 1.0f, z2), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 5, 0, false, 0, r10, r10, c13zcLJIIJ, 0, 0, 2000);
                        C1685190txF.LIZ(str, c.LJIJJ(c1685760tyA, r10, 3), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJZLJL, 0L, 5, 0, false, 0, r10, r10, c13zcLJIIJ, ((i2 >> 6) & 14) | 48, 0, 2000);
                        C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, f2), c13zcLJIIJ);
                        float f4 = 8;
                        C1668930tX1.LIZIZ(C1669660tYC.LJJLIIIJJI, r10, c.LJIILJJIL(c1685760tyA, f4, f3), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), (float) 6.33d, (float) 11.24d, false, c13zcLJIIJ, 221616, 64);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(true);
                        C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                        float f5 = 14;
                        C1673400teE.LIZJ(function02, C0MBB.LIZIZ(2131830818, c13zcLJIIJ), c.LJ(c1685760tyA, 1.0f), false, 0L, false, null, null, null, C1666920tTm.LIZIZ(0.0f, 0.0f, new C1682530tsx(f4, f5, f4, f5), 0.0f, c13zcLJIIJ, 384, 11), C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zcLJIIJ, 0, 31), null, false, c13zcLJIIJ, ((i2 >> 12) & 14) | 384, 0, 6648);
                        C1665790tRx.LIZ(c.LJI(c1685760tyA, f2), c13zcLJIIJ);
                        C1673400teE.LIZJ(function03, C0MBB.LIZIZ(2131830817, c13zcLJIIJ), c.LJ(c1685760tyA, 1.0f), false, 0L, false, null, null, null, C1666920tTm.LIZIZ(0.0f, 0.0f, new C1682530tsx(f4, f5, f4, f5), 0.0f, c13zcLJIIJ, 384, 11), C1666340tSq.LIZIZ(0L, C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), 0L, c13zcLJIIJ, 0, 29), null, false, c13zcLJIIJ, ((i2 >> 15) & 14) | 384, 0, 6648);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw r10;
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
            c20030013YsLJJJJZI.LIZLLL = new C1301780jyq(z, function1, str, function0, function02, function03, i);
        }
    }
}

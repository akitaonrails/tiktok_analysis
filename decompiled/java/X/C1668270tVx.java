package X;

import Y.AObjectS124S0000000_25;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668270tVx {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680710tq1 interfaceC1680710tq1, long j, C1668470tWH c1668470tWH, float f, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ;
        int i9;
        final C1668470tWH c1668470tWH2 = c1668470tWH;
        final long jH2 = j;
        final InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        final float f2 = f;
        final InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1500318645);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1680710tq12)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && c13zcLJIIJ.LJIJJ(jH2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1668470tWH2)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else {
                if (i10 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i11 != 0) {
                    interfaceC1680710tq12 = C1669430tXp.LIZ;
                }
                if ((i2 & 4) != 0) {
                    jH2 = C1670400tZO.LIZIZ(c13zcLJIIJ).H2();
                    i3 &= -897;
                }
                if (i12 != 0) {
                    c1668470tWH2 = null;
                }
                if (i13 != 0) {
                    f2 = 0;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1679640toI.LIZIZ(interfaceC1685750ty92, f2, interfaceC1680710tq12, 0L, 0L, 24);
            if (c1668470tWH2 != null) {
                interfaceC1685750ty9LIZIZ = C1675890tiF.LIZIZ(c1668470tWH2.LIZ, InterfaceC1685750ty9.LIZ, c1668470tWH2.LIZIZ, interfaceC1680710tq12);
            } else {
                interfaceC1685750ty9LIZIZ = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1667200tUE.LIZ(C1675980tiO.LIZIZ(interfaceC1685750ty9LIZIZ2.LIZ(interfaceC1685750ty9LIZIZ), jH2, interfaceC1680710tq12), interfaceC1680710tq12);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new AObjectS124S0000000_25(14);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ3 = C1689740u4a.LIZIZ(interfaceC1685750ty9LIZ, false, (Function1) objLJJ);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new PointerInputEventHandler() { // from class: X.0OuM
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1679720toQ.LIZ(interfaceC1685750ty9LIZIZ3, unit, (PointerInputEventHandler) objLJJ2);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, true);
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
                function2.invoke(c13zcLJIIJ, Integer.valueOf((i3 >> 15) & 14));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0OuU
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
                    InterfaceC1680710tq1 interfaceC1680710tq13 = interfaceC1680710tq12;
                    long j2 = jH2;
                    C1668470tWH c1668470tWH3 = c1668470tWH2;
                    float f3 = f2;
                    Function2 function22 = function2;
                    int i14 = i;
                    int i15 = i2;
                    ((Integer) obj2).intValue();
                    C1668270tVx.LIZ(interfaceC1685750ty93, interfaceC1680710tq13, j2, c1668470tWH3, f3, function22, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i14 | 1), i15);
                    return Unit.LIZ;
                }
            };
        }
    }
}

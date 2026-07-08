package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668120tVi {
    public static final void LIZ(final String str, InterfaceC1685750ty9 interfaceC1685750ty9, long j, C1693430uAX c1693430uAX, boolean z, InterfaceC1668050tVb interfaceC1668050tVb, final Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long jQ3;
        int i9;
        int i10;
        boolean z2 = z;
        InterfaceC1668050tVb interfaceC1668050tVb2 = interfaceC1668050tVb;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        long jK3 = j;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1461447493);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && c13zcLJIIJ.LJIJJ(jK3)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1668050tVb2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else {
                if (i11 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 4) != 0) {
                    jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ;
                    i3 &= -7169;
                }
                if (i12 != 0) {
                    z2 = true;
                }
                if (i13 != 0) {
                    InterfaceC1668050tVb.LIZ.getClass();
                    interfaceC1668050tVb2 = C1668040tVa.LJFF;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            c13zcLJIIJ.LJJIIJZLJL(3275892);
            if (z2) {
                jQ3 = jK3;
            } else {
                jQ3 = C1670400tZO.LIZIZ(c13zcLJIIJ).Q3();
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634380OuS.LIZ(InterfaceC1685750ty9.LIZ, null, C1673460teK.LIZJ(c13zcLJIIJ), z2, null, null, function0).LIZ(interfaceC1685750ty92);
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(interfaceC1668050tVb2, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                C1685190txF.LIZ(str, null, jQ3, c1693430uAX2, 0L, 3, 0, false, 1, null, null, c13zcLJIIJ, (i3 & 14) | 100663296 | (i3 & 7168), 0, 1746);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final long j2 = jK3;
            final C1693430uAX c1693430uAX3 = c1693430uAX2;
            final boolean z3 = z2;
            final InterfaceC1668050tVb interfaceC1668050tVb3 = interfaceC1668050tVb2;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tVj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    long j3 = j2;
                    C1693430uAX c1693430uAX4 = c1693430uAX3;
                    boolean z4 = z3;
                    InterfaceC1668050tVb interfaceC1668050tVb4 = interfaceC1668050tVb3;
                    Function0 function02 = function0;
                    int i14 = i;
                    int i15 = i2;
                    ((Integer) obj2).intValue();
                    C1668120tVi.LIZ(str2, interfaceC1685750ty94, j3, c1693430uAX4, z4, interfaceC1668050tVb4, function02, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i14 | 1), i15);
                    return Unit.LIZ;
                }
            };
        }
    }
}

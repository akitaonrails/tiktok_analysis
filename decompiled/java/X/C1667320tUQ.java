package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667320tUQ {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, long j, boolean z, long j2, float f, InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        long jU2 = j2;
        boolean z6 = z;
        float f2 = f;
        long j3 = j;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1888040023);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJJ(j3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z6)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJIJJ(jU2)) {
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
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((i3 & 74899) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else {
                if (i10 != 0) {
                    j3 = C1685910tyP.LJ;
                }
                if (i11 != 0) {
                    z6 = true;
                }
                if ((i2 & 8) != 0) {
                    jU2 = C1670400tZO.LIZIZ(c13zcLJIIJ).U2();
                    i3 &= -7169;
                }
                if (i12 != 0) {
                    f2 = 1;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new InterfaceC1680710tq1() { // from class: X.0tXB
                    public final C1668650tWZ LIZ = null;
                    public final float LIZIZ = 0;
                    public final float LIZJ = 0.14285715f;

                    @Override // X.InterfaceC1680710tq1
                    public final AbstractC1680810tqB LIZ(long j4, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o) {
                        float fMin;
                        float fLJJJJLL;
                        C1668650tWZ c1668650tWZ = this.LIZ;
                        if (c1668650tWZ != null) {
                            fMin = interfaceC1690500u5o.LJJJJLL(c1668650tWZ.LL);
                        } else {
                            fMin = Math.min(Float.intBitsToFloat((int) (j4 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j4 & 4294967295L)) / 2.0f);
                        }
                        if (this.LIZJ > 0.0f) {
                            fLJJJJLL = Math.min(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4))) * this.LIZJ;
                        } else {
                            fLJJJJLL = interfaceC1690500u5o.LJJJJLL(this.LIZIZ);
                        }
                        return new C1680800tqA(C1669140tXM.LIZ(fMin, fLJJJJLL, j4));
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1669030tXB c1669030tXB = (C1669030tXB) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z3 | z2;
            if ((((i3 & 7168) ^ 3072) <= 2048 || !c13zcLJIIJ.LJIJJ(jU2)) && (i3 & 3072) != 2048) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z8 = z7 | z4;
            if ((57344 & i3) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z9 || objLJJ2 == c1680520tpi) {
                f2 = f2;
                objLJJ2 = new C1669020tXA(f2, j3, jU2, z6);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ = c.LJIJJ(C1680910tqL.LIZJ(interfaceC1685750ty9, (Function1) objLJJ2), null, 3);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJJ);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ2 = c.LJIJJ(InterfaceC1685750ty9.LIZ, null, 3);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (objLJJ3 == c1680520tpi) {
                    objLJJ3 = new AwS604S0100000_25(c1669030tXB, 794);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1679660toK.LIZ(interfaceC1685750ty9LJIJJ2, (Function1) objLJJ3);
                int i13 = ((i3 >> 6) & 7168) | 6;
                InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    interfaceC1631620sYq.invoke(c1672220tcK, c13zcLJIIJ, Integer.valueOf(((i13 >> 6) & 112) | 6));
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
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1667310tUP(interfaceC1685750ty9, j3, z6, jU2, f2, interfaceC1631620sYq, i, i2);
        }
    }
}

package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tXW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669240tXW {
    public static final void LIZ(String str, String str2, C1669440tXq c1669440tXq, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Integer num, List<C1669250tXX> list, List<String> list2, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean zLJII;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        List<String> list3 = list2;
        List<C1669250tXX> list4 = list;
        Integer num2 = num;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1556236183);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1669440tXq);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1669440tXq);
            }
            if (zLJII) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i18 = i3 & 16;
        if (i18 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i19 = i3 & 32;
        if (i19 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(num2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i20 = i3 & 64;
        if (i20 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(list4)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i21 = i3 & 128;
        if (i21 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(list3)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        if ((i3 & 1024) != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i15 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        if ((306783379 & i4) == 306783378 && (i15 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i18 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i19 != 0) {
                num2 = null;
            }
            if (i20 != 0) {
                list4 = C13BV.INSTANCE;
            }
            if (i21 != 0) {
                list3 = C13BV.INSTANCE;
            }
            if (num2 != null) {
                size = Math.min(num2.intValue(), list4.size());
            } else {
                size = list4.size();
            }
            float f = 8;
            float f2 = 16;
            List<C1669250tXX> listSubList = list4.subList(0, size);
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(interfaceC1685750ty92, 1.0f);
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
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = AFwS266S0000000_25.get$arr$(416);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                Function1 function12 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i15 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z11 = z2 | z3;
                if ((i4 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z12 = z11 | z4;
                if ((i15 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z13 = z5 | z12;
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (z13 || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new C1800510wxF(str, function03, function02, z);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(6, 2, c13zcLJIIJ, null, function12, (Function1) objLJJ2);
                c13zcLJIIJ.LJJIIJZLJL(-289004237);
                if (str2 != null) {
                    C1685190txF.LIZ(str2, C1682520tsw.LJIIIIZZ(interfaceC1685750ty92, f2), 0L, null, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2044);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJII2 = c13zcLJIIJ.LJII(listSubList);
                if ((57344 & i4) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean zLJII3 = zLJII2 | z6 | c13zcLJIIJ.LJII(list4);
                if ((234881024 & i4) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zLJII4 = zLJII3 | z7 | c13zcLJIIJ.LJII(list3);
                if ((i4 & 896) == 256 || ((i4 & 512) != 0 && c13zcLJIIJ.LJII(c1669440tXq))) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z14 = zLJII4 | z8;
                if ((458752 & i4) == 131072) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z15 = z14 | z9;
                if ((1879048192 & i4) == 536870912) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z16 = z15 | z10;
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (z16 || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new C1669220tXU(listSubList, num2, list4, interfaceC1685750ty92, f, f, function1, list3, c1669440tXq, function0, f2);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                C636400Oxi.LIZ(null, null, null, false, null, null, null, false, null, (Function1) objLJJ3, c13zcLJIIJ, 0, 511);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1669230tXV(str, str2, c1669440tXq, z, interfaceC1685750ty92, num2, list4, list3, function1, function0, function02, function03, i, i2, i3);
        }
    }
}

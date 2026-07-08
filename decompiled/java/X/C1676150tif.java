package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676150tif {
    public static final C1676230tin LIZ = new C1676230tin();

    public static final float LJI(C1692150u8T c1692150u8T) {
        int i = c1692150u8T.LIZIZ.LJFF;
        float fLJIIIIZZ = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            fLJIIIIZZ += LJIIIIZZ(c1692150u8T, i2);
        }
        return fLJIIIIZZ;
    }

    public static final int LJII(C1692150u8T c1692150u8T, float f) {
        int i = c1692150u8T.LIZIZ.LJFF;
        int i2 = 0;
        if (i <= 0) {
            return 0;
        }
        float fLJI = LJI(c1692150u8T);
        float fLJIIIIZZ = 0.0f;
        if (fLJI <= 0.0f) {
            return 0;
        }
        float fLIZLLL = fLJI * C13LZ.LIZLLL(f, 0.0f, 1.0f);
        do {
            fLJIIIIZZ += LJIIIIZZ(c1692150u8T, i2);
            if (fLIZLLL <= fLJIIIIZZ) {
                return i2;
            }
            i2++;
        } while (i2 < i);
        return i - 1;
    }

    public static final float LJIIIIZZ(C1692150u8T c1692150u8T, int i) {
        float fLJIIJ = c1692150u8T.LJIIJ(i) - c1692150u8T.LJIIIZ(i);
        if (fLJIIJ < 0.0f) {
            return 0.0f;
        }
        return fLJIIJ;
    }

    public static final String LJIIIZ(C1692150u8T c1692150u8T, String str, int i) {
        int i2 = c1692150u8T.LIZIZ.LJFF;
        if (i2 > 0 && i >= 0 && i < i2) {
            int iLJ = C13LZ.LJ(c1692150u8T.LJIIJJI(i), 0, str.length());
            return a0.LJLIIIL(str.substring(iLJ, C13LZ.LJ(c1692150u8T.LJI(i, false), iLJ, str.length()))).toString();
        }
        return str;
    }

    public static final void LIZ(String str, C05P1<C1396005dG> c05p1, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(149359871);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            LIZJ(str, c05p1, C1693430uAX.LIZ(0, 0, 16646141, 0L, C1682430tsn.LIZLLL(28.0f), 0L, C1682430tsn.LIZLLL(36.0f), null, C1670400tZO.LJ(c13zcLJIIJ).LIZIZ, null, null), 2, 36.0f, interfaceC1685750ty93, c13zcLJIIJ, (i3 & 14) | 27648 | (i3 & 112) | ((i3 << 9) & 458752), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1676190tij(str, c05p1, interfaceC1685750ty92, i, i2);
        }
    }

    public static final void LIZIZ(String str, C05P1<C1396005dG> c05p1, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(186001387);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            LIZJ(str, c05p1, C1693430uAX.LIZ(0, 0, 16646143, 0L, 0L, 0L, C1682430tsn.LIZLLL(30.0f), null, C1670400tZO.LJ(c13zcLJIIJ).LJ, null, null), 1, 30.0f, interfaceC1685750ty93, c13zcLJIIJ, (i3 & 14) | 27648 | (i3 & 112) | ((i3 << 9) & 458752), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1676200tik(str, c05p1, interfaceC1685750ty92, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1677480tko<java.lang.Float, X.C1677280tkU> LJIIJ(int r14, boolean r15, kotlin.jvm.functions.Function0<java.lang.Boolean> r16, boolean r17, kotlin.jvm.functions.Function0<java.lang.Float> r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676150tif.LJIIJ(int, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, X.0tpg, int):X.0tko");
    }

    public static final void LIZJ(String str, C05P1<C1396005dG> c05p1, C1693430uAX c1693430uAX, int i, float f, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        C1677480tko c1677480tko;
        boolean z2;
        Object obj;
        int i11;
        boolean z3;
        int i12;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1862030957);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i13 = i3 & 32;
        if (i13 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        if ((i4 & 74899) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i13 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj2 = objLJJ;
            if (objLJJ == c1680520tpi) {
                C05P0 c05p0LJI = C20028913Yh.LJI(str);
                c13zcLJIIJ.LJJIJIIJI(c05p0LJI);
                obj2 = c05p0LJI;
            }
            C05P0 c05p0 = (C05P0) obj2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            Object obj3 = objLJJ2;
            if (objLJJ2 == c1680520tpi) {
                C05P0 c05p0LJI2 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(c05p0LJI2);
                obj3 = c05p0LJI2;
            }
            C05P0 c05p02 = (C05P0) obj3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            Object obj4 = objLJJ3;
            if (objLJJ3 == c1680520tpi) {
                C1677480tko c1677480tkoLIZ = C1677470tkn.LIZ(1.0f);
                c13zcLJIIJ.LJJIJIIJI(c1677480tkoLIZ);
                obj4 = c1677480tkoLIZ;
            }
            C1677480tko c1677480tko2 = (C1677480tko) obj4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            Object obj5 = objLJJ4;
            if (objLJJ4 == c1680520tpi) {
                C1677480tko c1677480tkoLIZ2 = C1677470tkn.LIZ(0.0f);
                c13zcLJIIJ.LJJIJIIJI(c1677480tkoLIZ2);
                obj5 = c1677480tkoLIZ2;
            }
            C1677480tko c1677480tko3 = (C1677480tko) obj5;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            Object obj6 = objLJJ5;
            if (objLJJ5 == c1680520tpi) {
                C13YZ c13yzLJ = C20028913Yh.LJ(new C05T2(c05p1));
                c13zcLJIIJ.LJJIJIIJI(c13yzLJ);
                obj6 = c13yzLJ;
            }
            C05P1 c05p12 = (C05P1) obj6;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            Object obj7 = objLJJ6;
            if (objLJJ6 == c1680520tpi) {
                C13YZ c13yzLJ2 = C20028913Yh.LJ(new C1358605Tk(c05p1));
                c13zcLJIIJ.LJJIJIIJI(c13yzLJ2);
                obj7 = c13yzLJ2;
            }
            C05P1 c05p13 = (C05P1) obj7;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            Object obj8 = objLJJ7;
            if (objLJJ7 == c1680520tpi) {
                C1358705Tl c1358705Tl = new C1358705Tl(c05p1);
                c13zcLJIIJ.LJJIJIIJI(c1358705Tl);
                obj8 = c1358705Tl;
            }
            Function0 function0 = (Function0) obj8;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII = z | c13zcLJIIJ.LJII(c1677480tko2) | c13zcLJIIJ.LJII(c1677480tko3);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (!zLJII && objLJJ8 != c1680520tpi) {
                c1677480tko = c1677480tko2;
                z2 = false;
                obj = objLJJ8;
            } else {
                c1677480tko = c1677480tko2;
                z2 = false;
                C05SD c05sd = new C05SD(str, c1677480tko2, c1677480tko3, c05p0, c05p02, null);
                c13zcLJIIJ.LJJIJIIJI(c05sd);
                obj = c05sd;
            }
            c13zcLJIIJ.LJJJJL(z2);
            C1680540tpk.LJFF(str, (Function2) obj, c13zcLJIIJ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, z2);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
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
                String str2 = (String) c05p02.getValue();
                if (str2 == null || !(!a0.LJJJIL(str2))) {
                    str2 = null;
                }
                c13zcLJIIJ.LJJIIJZLJL(-1080288029);
                if (str2 == null) {
                    i11 = 1849434622;
                } else {
                    int iIntValue = ((Number) c05p13.getValue()).intValue();
                    C1676230tin c1676230tin = LIZ;
                    boolean zBooleanValue = ((Boolean) c05p12.getValue()).booleanValue();
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ9 = c13zcLJIIJ.LJJ();
                    Object obj9 = objLJJ9;
                    if (objLJJ9 == c1680520tpi) {
                        C05SH c05sh = new C05SH();
                        c13zcLJIIJ.LJJIJIIJI(c05sh);
                        obj9 = c05sh;
                    }
                    Function0 function02 = (Function0) obj9;
                    c13zcLJIIJ.LJJJJL(z2);
                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                    boolean zLJII2 = c13zcLJIIJ.LJII(c1677480tko3);
                    Object objLJJ10 = c13zcLJIIJ.LJJ();
                    Object obj10 = objLJJ10;
                    if (zLJII2 || objLJJ10 == c1680520tpi) {
                        C05SF c05sf = new C05SF(c1677480tko3);
                        c13zcLJIIJ.LJJIJIIJI(c05sf);
                        obj10 = c05sf;
                    }
                    c13zcLJIIJ.LJJJJL(z2);
                    int i14 = i4 << 3;
                    int i15 = (i14 & 7168) | 113246592 | (i14 & 57344) | (i14 & 458752);
                    i11 = 1849434622;
                    LIZLLL(str2, iIntValue, c1676230tin, c1693430uAX, i, f, zBooleanValue, function02, z2, (Function0) obj10, null, c13zcLJIIJ, i15, z2 ? 1 : 0, 1024);
                }
                c13zcLJIIJ.LJJJJL(z2);
                c13zcLJIIJ.LJJIIJZLJL(i11);
                Object objLJJ11 = c13zcLJIIJ.LJJ();
                Object obj11 = objLJJ11;
                if (objLJJ11 == c1680520tpi) {
                    C1358805Tm c1358805Tm = new C1358805Tm(c05p1);
                    c13zcLJIIJ.LJJIJIIJI(c1358805Tm);
                    obj11 = c1358805Tm;
                }
                Function0 function03 = (Function0) obj11;
                c13zcLJIIJ.LJJJJL(z2);
                String str3 = (String) c05p0.getValue();
                int iIntValue2 = ((Number) c05p13.getValue()).intValue();
                boolean zBooleanValue2 = ((Boolean) c05p12.getValue()).booleanValue();
                if (c05p02.getValue() != null) {
                    i12 = 5004770;
                    z3 = true;
                } else {
                    z3 = false;
                    i12 = 5004770;
                }
                c13zcLJIIJ.LJJIIJZLJL(i12);
                boolean zLJII3 = c13zcLJIIJ.LJII(c1677480tko);
                Object objLJJ12 = c13zcLJIIJ.LJJ();
                Object obj12 = objLJJ12;
                if (zLJII3 || objLJJ12 == c1680520tpi) {
                    C05SG c05sg = new C05SG(c1677480tko);
                    c13zcLJIIJ.LJJIJIIJI(c05sg);
                    obj12 = c05sg;
                }
                c13zcLJIIJ.LJJJJL(z2);
                int i16 = i4 << 3;
                LIZLLL(str3, iIntValue2, function03, c1693430uAX, i, f, zBooleanValue2, function0, z3, (Function0) obj12, null, c13zcLJIIJ, (i16 & 7168) | 12583296 | (57344 & i16) | (i16 & 458752), z2 ? 1 : 0, 1024);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1676180tii(str, c05p1, c1693430uAX, i, f, interfaceC1685750ty92, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.String r15, int r16, kotlin.jvm.functions.Function0<java.lang.Float> r17, X.C1693430uAX r18, float r19, boolean r20, kotlin.jvm.functions.Function0<java.lang.Boolean> r21, boolean r22, kotlin.jvm.functions.Function0<java.lang.Float> r23, X.InterfaceC1685750ty9 r24, X.InterfaceC1680500tpg r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676150tif.LJFF(java.lang.String, int, kotlin.jvm.functions.Function0, X.0uAX, float, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(java.lang.String r26, int r27, kotlin.jvm.functions.Function0<java.lang.Float> r28, X.C1693430uAX r29, int r30, float r31, boolean r32, kotlin.jvm.functions.Function0<java.lang.Boolean> r33, boolean r34, kotlin.jvm.functions.Function0<java.lang.Float> r35, X.InterfaceC1685750ty9 r36, X.InterfaceC1680500tpg r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676150tif.LIZLLL(java.lang.String, int, kotlin.jvm.functions.Function0, X.0uAX, int, float, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(java.lang.String r22, int r23, kotlin.jvm.functions.Function0<java.lang.Float> r24, X.C1693430uAX r25, int r26, float r27, boolean r28, kotlin.jvm.functions.Function0<java.lang.Boolean> r29, boolean r30, kotlin.jvm.functions.Function0<java.lang.Float> r31, X.InterfaceC1685750ty9 r32, X.InterfaceC1680500tpg r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676150tif.LJ(java.lang.String, int, kotlin.jvm.functions.Function0, X.0uAX, int, float, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int, int):void");
    }
}

package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS0S0512301_25;
import kotlin.jvm.internal.AwS27S0310000_2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678450tmN {
    public static final float LIZ = 56;
    public static final float LIZIZ = 125;
    public static final float LIZJ = 640;

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(long r15, kotlin.jvm.functions.Function0 r17, boolean r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1678450tmN.LIZIZ(long, kotlin.jvm.functions.Function0, boolean, X.0tpg, int):void");
    }

    public static final void LIZ(InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1685750ty9 interfaceC1685750ty9, C1382705b7 c1382705b7, boolean z, InterfaceC1680710tq1 interfaceC1680710tq1, float f, long j, long j2, long j3, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        long jLIZJ = j3;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        float f2 = f;
        long jLIZIZ = j2;
        final C1382705b7 c1382705b72 = c1382705b7;
        long jLJII = j;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-92970288);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 128;
        }
        int i15 = i2 & 8;
        if (i15 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1680710tq12)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0 && c13zcLJIIJ.LJIJJ(jLJII)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((29360128 & i) == 0) {
            if ((i2 & 128) == 0 && c13zcLJIIJ.LJIJJ(jLIZIZ)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((234881024 & i) == 0) {
            if ((i2 & 256) == 0 && c13zcLJIIJ.LJIJJ(jLIZJ)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((1879048192 & i) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i3 |= i8;
        }
        if (i14 == 4 && (i3 & 1533916891) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if (i14 != 0) {
                    i3 &= -897;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
            } else {
                if (i13 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i14 != 0) {
                    EnumC1382405b4 enumC1382405b4 = EnumC1382405b4.Hidden;
                    c13zcLJIIJ.LJJIJIIJIL(-126412120);
                    C1676890tjr<Float> c1676890tjr = C1677550tkv.LIZ;
                    AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(29);
                    InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
                    c13zcLJIIJ.LJIIL(170051607, enumC1382405b4);
                    z2 = true;
                    c1382705b72 = (C1382705b7) C20041813bM.LIZ(new Object[]{enumC1382405b4, c1676890tjr, Boolean.FALSE, aFwS229S0000000_2, interfaceC1690500u5o}, new C1687100u0K(new AwS27S0310000_2((InterfaceC1677030tk5) c1676890tjr, interfaceC1690500u5o, (Function1) aFwS229S0000000_2, false, 0), AFwS285S0000000_2.get$arr$(7)), new C1383105bB(enumC1382405b4, interfaceC1690500u5o, c1676890tjr, aFwS229S0000000_2, false), c13zcLJIIJ, 4);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                    i3 &= -897;
                } else {
                    z2 = true;
                }
                if (i15 == 0) {
                    z2 = z3;
                }
                if ((i2 & 16) != 0) {
                    interfaceC1680710tq12 = C1680090tp1.LIZIZ(c13zcLJIIJ).LIZJ;
                    i3 &= -57345;
                }
                if (i16 != 0) {
                    f2 = C1678470tmP.LIZ;
                }
                if ((i2 & 64) != 0) {
                    jLJII = C1680090tp1.LIZ(c13zcLJIIJ).LJII();
                    i3 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    jLIZIZ = C1680070toz.LIZIZ(jLJII, c13zcLJIIJ);
                    i3 &= -29360129;
                }
                if ((i2 & 256) != 0) {
                    c13zcLJIIJ.LJJIJIIJIL(-112572414);
                    jLIZJ = C1685910tyP.LIZJ(0.32f, C1680090tp1.LIZ(c13zcLJIIJ).LJ());
                    c13zcLJIIJ.LJJJJL(false);
                    i3 &= -234881025;
                }
                z3 = z2;
            }
            c13zcLJIIJ.LJJJJLI();
            c13zcLJIIJ.LJJIJIIJIL(502769027);
            if (c1382705b72.LIZLLL == null) {
                C1680540tpk.LJII(new AwS426S0200000_25(c1382705b72, (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII), 10), c13zcLJIIJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIJIIJIL(773894976);
            c13zcLJIIJ.LJJIJIIJIL(-492369756);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C2328209Ai(C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            final InterfaceC497601wk interfaceC497601wk = ((C2328209Ai) objLJJ).LL;
            c13zcLJIIJ.LJJJJL(false);
            EnumC1684030tvN enumC1684030tvN = EnumC1684030tvN.Vertical;
            c13zcLJIIJ.LJJIJIIJIL(511388516);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c1382705b72) | c13zcLJIIJ.LJJIIJ(interfaceC497601wk);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new InterfaceC1381705ax<EnumC1382405b4>() { // from class: X.05b2
                    @Override // X.InterfaceC1381705ax
                    public final void LIZ(EnumC1382405b4 enumC1382405b42, Map<EnumC1382405b4, Float> map, Map<EnumC1382405b4, Float> map2) {
                        EnumC1382405b4 enumC1382405b43;
                        EnumC1382405b4 enumC1382405b44 = enumC1382405b42;
                        Float f3 = map.get(enumC1382405b44);
                        int i17 = C1382305b3.LIZ[enumC1382405b44.ordinal()];
                        boolean z4 = true;
                        if (i17 != 1) {
                            if (i17 != 2 && i17 != 3) {
                                throw new C1954807lC();
                            }
                            enumC1382405b43 = EnumC1382405b4.HalfExpanded;
                            if (!map2.containsKey(enumC1382405b43)) {
                                enumC1382405b43 = EnumC1382405b4.Expanded;
                                if (!map2.containsKey(enumC1382405b43)) {
                                    enumC1382405b43 = EnumC1382405b4.Hidden;
                                }
                            }
                        } else {
                            enumC1382405b43 = EnumC1382405b4.Hidden;
                        }
                        if (!Intrinsics.LIZ(((Number) C2097608Jq.LJFF(enumC1382405b43, map2)).floatValue(), f3)) {
                            if (((C13FE) c1382705b72.LIZJ.LJIILIIL).getValue() == null) {
                                z4 = false;
                            }
                            if (z4) {
                                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1382105b1(c1382705b72, enumC1382405b43, null), 3);
                            } else {
                                if (c1382705b72.LIZJ.LJII(enumC1382405b43)) {
                                    return;
                                }
                                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1382005b0(c1382705b72, enumC1382405b43, null), 3);
                            }
                        }
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            C1668160tVm.LIZ(interfaceC1685750ty93, null, false, C13Z4.LIZIZ(c13zcLJIIJ, -1731958854, new C1678430tmL(z3, c1382705b72, enumC1684030tvN, interfaceC1680710tq12, jLJII, jLIZIZ, f2, i3, function2, jLIZJ, interfaceC497601wk, (InterfaceC1381705ax) objLJJ2, interfaceC1631620sYq)), c13zcLJIIJ, ((i3 >> 3) & 14) | 3072, 6);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0512301_25((InterfaceC1631620sYq) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit>) interfaceC1685750ty92, (InterfaceC1685750ty9) c1382705b72, (C1382705b7) z3, (boolean) interfaceC1680710tq12, (InterfaceC1680710tq1) f2, (float) jLJII, jLIZIZ, jLIZJ, (long) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 0);
        }
    }
}

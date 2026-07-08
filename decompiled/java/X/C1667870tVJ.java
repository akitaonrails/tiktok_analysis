package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667870tVJ {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, EnumC1667900tVM enumC1667900tVM, EnumC1667890tVL enumC1667890tVL, AbstractC1676270tir abstractC1676270tir, String str, String str2, String str3, InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iOrdinal;
        int i8;
        int iOrdinal2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        boolean z3;
        int i17;
        long jM3;
        C1693430uAX c1693430uAX;
        InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        AbstractC1676270tir abstractC1676270tir2 = abstractC1676270tir;
        EnumC1667900tVM enumC1667900tVM2 = enumC1667900tVM;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22 = function2;
        boolean z4 = z;
        final EnumC1667890tVL enumC1667890tVL2 = enumC1667890tVL;
        Function0<Unit> function02 = function0;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1087323700);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i21 = i3 & 8;
        if (i21 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (enumC1667900tVM2 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC1667900tVM2.ordinal();
            }
            if (c13zcLJIIJ.LJIJI(iOrdinal)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i22 = i3 & 16;
        if (i22 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (enumC1667890tVL2 == null) {
                iOrdinal2 = -1;
            } else {
                iOrdinal2 = enumC1667890tVL2.ordinal();
            }
            if (c13zcLJIIJ.LJIJI(iOrdinal2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i23 = i3 & 32;
        if (i23 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(abstractC1676270tir2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i24 = i3 & 64;
        if (i24 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str6)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i25 = i3 & 128;
        if (i25 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str5)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i26 = i3 & 256;
        if (i26 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str4)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        int i27 = i3 & 512;
        if (i27 != 0) {
            i4 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq2)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        int i28 = i3 & 1024;
        if (i28 != 0) {
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
        if ((i4 & 306783379) == 306783378 && (i15 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i18 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i19 != 0) {
                z4 = false;
            }
            if (i20 != 0) {
                function22 = C1667920tVO.LIZ;
            }
            if (i21 != 0) {
                enumC1667900tVM2 = EnumC1667900tVM.HugContent;
            }
            if (i22 != 0) {
                enumC1667890tVL2 = EnumC1667890tVL.Icon;
            }
            if (i23 != 0) {
                abstractC1676270tir2 = null;
            }
            if (i24 != 0) {
                str6 = null;
            }
            if (i25 != 0) {
                str5 = null;
            }
            if (i26 != 0) {
                str4 = null;
            }
            if (i27 != 0) {
                interfaceC1631620sYq2 = null;
            }
            if (i28 != 0) {
                function02 = null;
            }
            if (z4) {
                c13zcLJIIJ.LJJIIJZLJL(-182412683);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(interfaceC1685750ty92);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
                int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                    function22.invoke(c13zcLJIIJ, Integer.valueOf((i4 >> 6) & 14));
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                z4 = false;
                c13zcLJIIJ.LJJIIJZLJL(-182164001);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = c.LIZLLL(interfaceC1685750ty92);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(C1668040tVa.LIZJ, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3);
                g.LJLIIIL.getClass();
                AFwS214S0000000_25 aFwS214S0000000_252 = g.a.LIZIZ;
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_252);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJI;
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_252);
                    AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJFF;
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_253);
                    AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LJIIIIZZ;
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_254);
                    }
                    AFwS311S0000000_25 aFwS311S0000000_255 = g.a.LIZLLL;
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_255);
                    C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                    c13zcLJIIJ.LJJIIJZLJL(785241889);
                    if (function02 != null) {
                        k.LIZ(C634380OuS.LIZJ(C1682520tsw.LJIIJ(c.LIZLLL(InterfaceC1685750ty9.LIZ), 0.0f, 16, 1), false, null, function02, 7), c13zcLJIIJ, 0);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                    C1296870jqv c1296870jqv = C1668040tVa.LJFF;
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv);
                    C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 48);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL5 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_252);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_252);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_253);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_254);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL5, aFwS311S0000000_255);
                        c13zcLJIIJ.LJJIIJZLJL(-1667504605);
                        if (abstractC1676270tir2 != null) {
                            int i29 = C1667880tVK.LIZ[enumC1667890tVL2.ordinal()];
                            if (i29 != 1) {
                                if (i29 != 2) {
                                    if (i29 == 3) {
                                        c13zcLJIIJ.LJJIIJZLJL(-1667481240);
                                        int i30 = i4 >> 15;
                                        C1668230tVt.LIZ(abstractC1676270tir2, str6, c.LJI(C1682520tsw.LJIIJ(c1685760tyA, 24, 0.0f, 2), 147), null, null, 0.0f, null, c13zcLJIIJ, (i30 & 14) | 384 | (i30 & 112), 120);
                                        c13zcLJIIJ.LJJJJL(false);
                                    } else {
                                        c13zcLJIIJ.LJJIIJZLJL(-1667503290);
                                        c13zcLJIIJ.LJJJJL(false);
                                        throw new C1954807lC();
                                    }
                                } else {
                                    c13zcLJIIJ.LJJIIJZLJL(-1667491065);
                                    int i31 = i4 >> 15;
                                    C1668230tVt.LIZ(abstractC1676270tir2, str6, c.LJI(C1682520tsw.LJIIJ(c1685760tyA, 24, 0.0f, 2), 96), null, null, 0.0f, null, c13zcLJIIJ, (i31 & 14) | 384 | (i31 & 112), 120);
                                    c13zcLJIIJ.LJJJJL(false);
                                }
                            } else {
                                c13zcLJIIJ.LJJIIJZLJL(-152941147);
                                int i32 = i4 >> 15;
                                C1671210tah.LIZ(abstractC1676270tir2, str6, c.LJIILIIL(c1685760tyA, 72), C1685910tyP.LJIIJ, c13zcLJIIJ, (i32 & 112) | (i32 & 14) | 3456, 0);
                                c13zcLJIIJ.LJJJJL(false);
                            }
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        if (str5 != null && str5.length() != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        boolean z5 = !z2;
                        if (str4 != null && str4.length() != 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        boolean z6 = !z3;
                        c13zcLJIIJ.LJJIIJZLJL(-1667467726);
                        if (z5) {
                            if (z6) {
                                c13zcLJIIJ.LJJIIJZLJL(-1667463557);
                                jM3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                            } else {
                                c13zcLJIIJ.LJJIIJZLJL(-1667462629);
                                jM3 = C1670400tZO.LIZIZ(c13zcLJIIJ).M3();
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            if (z6) {
                                c13zcLJIIJ.LJJIIJZLJL(-1667460161);
                                c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJII;
                            } else {
                                c13zcLJIIJ.LJJIIJZLJL(-1667458971);
                                c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ;
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            C1685190txF.LIZ(str5, C1682520tsw.LJIIJ(C1682520tsw.LJIIL(c.LJIJJ(c1685760tyA, null, 3), 0.0f, 16, 0.0f, 0.0f, 13), 48, 0.0f, 2), jM3, c1693430uAX, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, ((i4 >> 21) & 14) | 48, 0, 2000);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJIIJZLJL(-1667449915);
                        if (z6) {
                            long jN3 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
                            C1693430uAX c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJIILJJIL;
                            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c.LJIJJ(c1685760tyA, null, 3), 48, 0.0f, 2);
                            if (z5) {
                                i17 = 8;
                            } else {
                                i17 = 16;
                            }
                            C1685190txF.LIZ(str4, C1682520tsw.LJIIL(interfaceC1685750ty9LJIIJ, 0.0f, i17, 0.0f, 0.0f, 13), jN3, c1693430uAX2, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, (i4 >> 24) & 14, 0, 2000);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        int i33 = C1667880tVK.LIZIZ[enumC1667900tVM2.ordinal()];
                        if (i33 != 1) {
                            if (i33 == 2) {
                                c13zcLJIIJ.LJJIIJZLJL(-150116923);
                                C1665790tRx.LIZ(c.LJI(c.LJ(c1685760tyA, 1.0f), 120), c13zcLJIIJ);
                                c13zcLJIIJ.LJJJJL(false);
                            } else {
                                c13zcLJIIJ.LJJIIJZLJL(-1667434071);
                                c13zcLJIIJ.LJJJJL(false);
                                throw new C1954807lC();
                            }
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(-150777471);
                            if (interfaceC1631620sYq2 != null) {
                                c13zcLJIIJ.LJJIIJZLJL(-150730878);
                                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ2 = C1682520tsw.LJIIJ(C1682520tsw.LJIIL(c.LJIJ(c1685760tyA, 120, 0.0f, 2), 0.0f, 8, 0.0f, 16, 5), 32, 0.0f, 2);
                                int i34 = ((i4 >> 18) & 7168) | 54;
                                InterfaceC20053113dB interfaceC20053113dBLIZLLL3 = k.LIZLLL(c1296870jqv, false);
                                int iLIZ4 = C0MXE.LIZ(c13zcLJIIJ);
                                C13D2 c13d2LJJJIL4 = c13zcLJIIJ.LJJJIL();
                                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL6 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ2);
                                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                    c13zcLJIIJ.LJJIII();
                                    if (c13zcLJIIJ.LJJJI) {
                                        c13zcLJIIJ.LJJI(aFwS214S0000000_252);
                                    } else {
                                        c13zcLJIIJ.LJIILJJIL();
                                    }
                                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL3, aFwS311S0000000_252);
                                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL4, aFwS311S0000000_253);
                                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_254);
                                    }
                                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL6, aFwS311S0000000_255);
                                    interfaceC1631620sYq2.invoke(c1672220tcK, c13zcLJIIJ, Integer.valueOf(((i34 >> 6) & 112) | 6));
                                    c13zcLJIIJ.LJJJJL(true);
                                    c13zcLJIIJ.LJJJJL(false);
                                } else {
                                    C0MXE.LIZIZ();
                                    throw null;
                                }
                            } else {
                                c13zcLJIIJ.LJJIIJZLJL(-150310146);
                                C1665790tRx.LIZ(c.LJI(c.LJ(c1685760tyA, 1.0f), 24), c13zcLJIIJ);
                                c13zcLJIIJ.LJJJJL(false);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                        }
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJIIJZLJL(785352107);
                        if (interfaceC1631620sYq2 != null && enumC1667900tVM2 == EnumC1667900tVM.FillContainer) {
                            float f = 32;
                            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ3 = C1682520tsw.LJIIJ(C1682520tsw.LJIIL(c1672220tcK.LIZIZ(c.LJ(c1685760tyA, 1.0f), C1668040tVa.LJIIIIZZ), 0.0f, 0.0f, 0.0f, f, 7), f, 0.0f, 2);
                            int i35 = ((i4 >> 18) & 7168) | 48;
                            InterfaceC20053113dB interfaceC20053113dBLIZLLL4 = k.LIZLLL(c1296870jqv, false);
                            int iLIZ5 = C0MXE.LIZ(c13zcLJIIJ);
                            C13D2 c13d2LJJJIL5 = c13zcLJIIJ.LJJJIL();
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL7 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ3);
                            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                c13zcLJIIJ.LJJIII();
                                if (c13zcLJIIJ.LJJJI) {
                                    c13zcLJIIJ.LJJI(aFwS214S0000000_252);
                                } else {
                                    c13zcLJIIJ.LJIILJJIL();
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL4, aFwS311S0000000_252);
                                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL5, aFwS311S0000000_253);
                                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ5))) {
                                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ5));
                                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ5), aFwS311S0000000_254);
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL7, aFwS311S0000000_255);
                                interfaceC1631620sYq2.invoke(c1672220tcK, c13zcLJIIJ, Integer.valueOf(((i35 >> 6) & 112) | 6));
                                c13zcLJIIJ.LJJJJL(true);
                            } else {
                                C0MXE.LIZIZ();
                                throw null;
                            }
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final boolean z7 = z4;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23 = function22;
            final EnumC1667900tVM enumC1667900tVM3 = enumC1667900tVM2;
            final AbstractC1676270tir abstractC1676270tir3 = abstractC1676270tir2;
            final String str7 = str6;
            final String str8 = str5;
            final String str9 = str4;
            final InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq3 = interfaceC1631620sYq2;
            final Function0<Unit> function03 = function02;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tVN
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    boolean z8 = z7;
                    Function2 function24 = function23;
                    EnumC1667900tVM enumC1667900tVM4 = enumC1667900tVM3;
                    EnumC1667890tVL enumC1667890tVL3 = enumC1667890tVL2;
                    AbstractC1676270tir abstractC1676270tir4 = abstractC1676270tir3;
                    String str10 = str7;
                    String str11 = str8;
                    String str12 = str9;
                    InterfaceC1631620sYq interfaceC1631620sYq4 = interfaceC1631620sYq3;
                    Function0 function04 = function03;
                    int i36 = i;
                    int i37 = i2;
                    int i38 = i3;
                    ((Integer) obj2).intValue();
                    C1667870tVJ.LIZ(interfaceC1685750ty94, z8, function24, enumC1667900tVM4, enumC1667890tVL3, abstractC1676270tir4, str10, str11, str12, interfaceC1631620sYq4, function04, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i36 | 1), C341440Da2.LIZ(i37), i38);
                    return Unit.LIZ;
                }
            };
        }
    }
}

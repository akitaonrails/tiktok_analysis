package X;

import Y.AObjectS124S0000000_25;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0txF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685190txF {
    public static final void LIZ(final String str, InterfaceC1685750ty9 interfaceC1685750ty9, long j, C1693430uAX c1693430uAX, long j2, int i, int i2, boolean z, int i3, Map<String, C1672660td2> map, Function1<? super C1692150u8T, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, final int i4, final int i5, final int i6) {
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
        boolean z2;
        int i17;
        int i18;
        int i19;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        Function1<? super C1692150u8T, Unit> function12 = function1;
        Map<String, C1672660td2> mapLJ = map;
        int i20 = i2;
        int i21 = i3;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        int i22 = i;
        long j3 = j2;
        long jK3 = j;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1052732160);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i4;
        } else {
            i7 = i4;
        }
        int i23 = i6 & 2;
        if (i23 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i4 & 384) == 0) {
            if ((i6 & 4) == 0 && c13zcLJIIJ.LJIJJ(jK3)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i7 |= i19;
        }
        if ((i4 & 3072) == 0) {
            if ((i6 & 8) == 0 && c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i18 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i18 = 1024;
            }
            i7 |= i18;
        }
        int i24 = i6 & 16;
        if (i24 != 0) {
            i7 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJJ(j3)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i7 |= i10;
        }
        if ((196608 & i4) == 0) {
            if ((i6 & 32) == 0 && c13zcLJIIJ.LJIJI(i22)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i7 |= i17;
        }
        int i25 = i6 & 64;
        if (i25 != 0) {
            i7 |= 1572864;
        } else if ((1572864 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i20)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i7 |= i11;
        }
        int i26 = i6 & 128;
        if (i26 != 0) {
            i7 |= 12582912;
        } else if ((12582912 & i4) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i7 |= i12;
        }
        int i27 = i6 & 256;
        if (i27 != 0) {
            i7 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i21)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i7 |= i13;
        }
        int i28 = i6 & 512;
        if (i28 != 0) {
            i7 |= 805306368;
        } else if ((805306368 & i4) == 0) {
            if (c13zcLJIIJ.LJII(mapLJ)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i7 |= i14;
        }
        int i29 = i6 & 1024;
        if (i29 != 0) {
            i15 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i5 | i16;
        } else {
            i15 = i5;
        }
        if ((i7 & 306783379) == 306783378 && (i15 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            z2 = z;
        } else {
            c13zcLJIIJ.LJLI();
            if ((i4 & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i6 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i6 & 8) != 0) {
                    i7 &= -7169;
                }
                if ((i6 & 32) != 0) {
                    i7 &= -458753;
                }
                z2 = z;
            } else {
                if (i23 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i6 & 4) != 0) {
                    jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                    i7 &= -897;
                }
                if ((i6 & 8) != 0) {
                    c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJIILJJIL;
                    i7 &= -7169;
                }
                if (i24 != 0) {
                    j3 = C1682440tso.LIZJ;
                }
                if ((i6 & 32) != 0) {
                    i7 &= -458753;
                    i22 = Integer.MIN_VALUE;
                }
                z2 = true;
                if (i25 != 0) {
                    i20 = 1;
                }
                if (i26 == 0) {
                    z2 = z;
                }
                if (i27 != 0) {
                    i21 = Integer.MAX_VALUE;
                }
                if (i28 != 0) {
                    mapLJ = C2097608Jq.LJ();
                }
                if (i29 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = new AObjectS124S0000000_25(12);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    function12 = (Function1) objLJJ;
                    c13zcLJIIJ.LJJJJL(false);
                }
            }
            c13zcLJIIJ.LJJJJLI();
            long j4 = j3;
            int i30 = i22;
            int i31 = i20;
            int i32 = i21;
            Map<String, C1672660td2> map2 = mapLJ;
            Function1<? super C1692150u8T, Unit> function13 = function12;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            long j5 = jK3;
            c1693430uAX2 = c1693430uAX2;
            LIZIZ(new C1692220u8a(str), interfaceC1685750ty93, j5, c1693430uAX2, j4, i30, i31, z2, i32, map2, function13, c13zcLJIIJ, (i7 & 896) | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), i15 & 14, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty92;
            final long j6 = jK3;
            final C1693430uAX c1693430uAX3 = c1693430uAX2;
            final long j7 = j3;
            final int i33 = i22;
            final int i34 = i20;
            final boolean z3 = z2;
            final int i35 = i21;
            final Map<String, C1672660td2> map3 = mapLJ;
            final Function1<? super C1692150u8T, Unit> function14 = function12;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0txG
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty95 = interfaceC1685750ty94;
                    long j8 = j6;
                    C1693430uAX c1693430uAX4 = c1693430uAX3;
                    long j9 = j7;
                    int i36 = i33;
                    int i37 = i34;
                    boolean z4 = z3;
                    int i38 = i35;
                    Map map4 = map3;
                    Function1 function15 = function14;
                    int i39 = i4;
                    int i40 = i5;
                    int i41 = i6;
                    ((Integer) obj2).intValue();
                    C1685190txF.LIZ(str2, interfaceC1685750ty95, j8, c1693430uAX4, j9, i36, i37, z4, i38, map4, function15, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i39 | 1), C341440Da2.LIZ(i40), i41);
                    return Unit.LIZ;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(final X.C1692220u8a r27, X.InterfaceC1685750ty9 r28, long r29, X.C1693430uAX r31, long r32, int r34, int r35, boolean r36, int r37, java.util.Map<java.lang.String, X.C1672660td2> r38, kotlin.jvm.functions.Function1<? super X.C1692150u8T, kotlin.Unit> r39, X.InterfaceC1680500tpg r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685190txF.LIZIZ(X.0u8a, X.0ty9, long, X.0uAX, long, int, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, X.0tpg, int, int, int):void");
    }
}

package X;

import Y.AObjectS0S1112000_19;
import Y.AObjectS0S2920000_25;
import Y.AObjectS108S0101000_25;
import Y.AObjectS399S0100000_25;
import Y.AObjectS536S0100000_25;
import Y.AObjectS85S0201000_25;
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

/* JADX INFO: renamed from: X.0tW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668330tW3 {
    public static final float LIZ;
    public static final float LIZJ;
    public static final float LIZLLL;
    public static final float LIZIZ = 480;
    public static final float LJ = 360;

    static {
        float f = 280;
        LIZ = f;
        float f2 = 16;
        LIZJ = f2;
        LIZLLL = f + f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r7, X.InterfaceC1680500tpg r8, int r9) {
        /*
            r0 = -916413002(0xffffffffc960a5b6, float:-920155.4)
            X.13ZC r4 = r8.LJIIJ(r0)
            r0 = r9 & 6
            r5 = 4
            r3 = 2
            if (r0 != 0) goto L79
            boolean r0 = r4.LJII(r7)
            if (r0 == 0) goto L77
            r6 = 4
        L14:
            r6 = r6 | r9
        L15:
            r0 = r6 & 3
            if (r0 != r3) goto L31
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L31
            r4.LIZJ()
        L22:
            X.13Ys r2 = r4.LJJJJZI()
            if (r2 == 0) goto L30
            Y.AObjectS108S0101000_25 r1 = new Y.AObjectS108S0101000_25
            r0 = 2
            r1.<init>(r9, r7, r0)
            r2.LIZLLL = r1
        L30:
            return
        L31:
            X.0tyA r1 = X.InterfaceC1685750ty9.LIZ
            r2 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.0ty9 r1 = androidx.compose.foundation.layout.c.LJ(r1, r0)
            r0 = 3
            X.0ty9 r2 = androidx.compose.foundation.layout.c.LJIJI(r1, r2, r0)
            r0 = 18
            float r1 = (float) r0
            r0 = 0
            X.0ty9 r3 = X.C1682520tsw.LJIIJ(r2, r1, r0, r3)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r6 & 14
            r2 = 0
            if (r0 != r5) goto L75
            r0 = 1
        L53:
            java.lang.Object r1 = r4.LJJ()
            if (r0 != 0) goto L62
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L6b
        L62:
            Y.AObjectS533S0100000_25 r1 = new Y.AObjectS533S0100000_25
            r0 = 1
            r1.<init>(r7, r0)
            r4.LJJIJIIJI(r1)
        L6b:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r4.LJJJJL(r2)
            r0 = 6
            X.C1683060tto.LIZ(r3, r1, r4, r0, r2)
            goto L22
        L75:
            r0 = 0
            goto L53
        L77:
            r6 = 2
            goto L14
        L79:
            r6 = r9
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668330tW3.LIZIZ(kotlin.jvm.functions.Function2, X.0tpg, int):void");
    }

    public static final void LJ(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(40318533);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (function2 == null) {
            c13zcLJIIJ.LJJIIJZLJL(-1461324254);
            float f = 24;
            k.LIZ(c.LJI(c.LJIILLIIL(InterfaceC1685750ty9.LIZ, f), f), c13zcLJIIJ, 6);
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(-1461199293);
            function2.invoke(c13zcLJIIJ, Integer.valueOf(i2 & 14));
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS108S0101000_25(i, function2, 1);
        }
    }

    public static final void LIZ(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1461857521);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (function2 != null) {
            c13zcLJIIJ.LJJIIJZLJL(771136608);
            C1667590tUr.LIZ(c.LJIJI(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), null, 3), C1670400tZO.LIZIZ(c13zcLJIIJ).T2(), (float) 0.5d, function2, c13zcLJIIJ, ((i2 << 9) & 7168) | 390, 0);
            c13zcLJIIJ.LJJJJL(false);
        } else if (function22 != null) {
            c13zcLJIIJ.LJJIIJZLJL(771433061);
            LIZIZ(function22, c13zcLJIIJ, (i2 >> 3) & 14);
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(771477267);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS85S0201000_25(i, function2, function22, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(final java.lang.String r25, final java.lang.String r26, final kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r27, X.InterfaceC1680500tpg r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668330tW3.LIZJ(java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, X.0tpg, int):void");
    }

    public static final void LJII(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, String str, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1465688488);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
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
                z2 = true;
            }
            int i8 = i3 << 6;
            LJFF(str, C1670400tZO.LIZIZ(c13zcLJIIJ).K2(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, z2, function0, c13zcLJIIJ, (i3 & 14) | (i8 & 7168) | (i8 & 57344), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS0S1112000_19(i, i2, str, function0, z2, 2);
        }
    }

    public static final void LJIIIIZZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, String str, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1931703896);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
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
                z2 = true;
            }
            int i8 = i3 << 6;
            LJFF(str, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, z2, function0, c13zcLJIIJ, (i3 & 14) | (i8 & 7168) | (i8 & 57344), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS0S1112000_19(i, i2, str, function0, z2, 1);
        }
    }

    public static final void LJIIIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, String str, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1748136026);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
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
                z2 = true;
            }
            int i8 = i3 << 6;
            LJFF(str, C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI, z2, function0, c13zcLJIIJ, (i3 & 14) | (i8 & 7168) | (i8 & 57344), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS0S1112000_19(i, i2, str, function0, z2, 0);
        }
    }

    public static final void LJFF(final String str, final long j, final C1693430uAX c1693430uAX, boolean z, final Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-306332836);
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
            if (c13zcLJIIJ.LJIJJ(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
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
                z2 = true;
            }
            int i10 = i3 << 3;
            C1668120tVi.LIZ(str, C1682520tsw.LJIIJ(c.LJIIIIZZ(InterfaceC1685750ty9.LIZ, (float) 47.5d, 0.0f, 2), 8, 0.0f, 2), j, c1693430uAX, z2, null, function0, c13zcLJIIJ, (i3 & 14) | 48 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | ((i3 << 6) & 3670016), 32);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final boolean z3 = z2;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tW4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    long j2 = j;
                    C1693430uAX c1693430uAX2 = c1693430uAX;
                    boolean z4 = z3;
                    Function0 function02 = function0;
                    int i11 = i;
                    int i12 = i2;
                    ((Integer) obj2).intValue();
                    C1668330tW3.LJFF(str2, j2, c1693430uAX2, z4, function02, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i11 | 1), i12);
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LIZLLL(final Function0<Unit> function0, final boolean z, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, final String str, final String str2, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function24, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function25, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1752406872);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function23)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function24)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function25)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJI2 = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
                C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
                C1680030tov c1680030tov = C1679930tol.LIZJ;
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 48);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    C1687990u1l c1687990u1l = C1687990u1l.LIZ;
                    LJ(function2, c13zcLJIIJ, (i2 >> 6) & 14);
                    float f = 20;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c1687990u1l.LIZ(c1685760tyA, 1.0f, false), f, 0.0f, 2);
                    C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 48);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        int i12 = i2 >> 9;
                        LIZJ(str, str2, function22, c13zcLJIIJ, (i12 & 896) | (i12 & 14) | (i12 & 112));
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJIIJZLJL(1238818807);
                        if (function23 != null) {
                            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, f, 12, f, 0.0f, 8);
                            InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                            int iLIZ4 = C0MXE.LIZ(c13zcLJIIJ);
                            C13D2 c13d2LJJJIL4 = c13zcLJIIJ.LJJJIL();
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
                            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                c13zcLJIIJ.LJJIII();
                                if (c13zcLJIIJ.LJJJI) {
                                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                                } else {
                                    c13zcLJIIJ.LJIILJJIL();
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL4, aFwS311S0000000_252);
                                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                                function23.invoke(c13zcLJIIJ, Integer.valueOf((i2 >> 18) & 14));
                                c13zcLJIIJ.LJJJJL(true);
                            } else {
                                C0MXE.LIZIZ();
                                throw null;
                            }
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        k.LIZ(c.LJI(c.LJIILLIIL(c1685760tyA, f), f), c13zcLJIIJ, 6);
                        int i13 = i2 >> 21;
                        LIZ(function24, function25, c13zcLJIIJ, (i13 & 112) | (i13 & 14));
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJIIJZLJL(975816980);
                        if (z) {
                            float f2 = 40;
                            C1668190tVp.LIZ(c.LJI(c.LJIILLIIL(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LIZLLL), f2), f2), false, C13Z4.LIZJ(405925577, new AObjectS536S0100000_25(function0, 0), c13zcLJIIJ), c13zcLJIIJ, 384, 2);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
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
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tW5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function02 = function0;
                    boolean z2 = z;
                    Function2 function26 = function2;
                    String str3 = str;
                    String str4 = str2;
                    Function2 function27 = function22;
                    Function2 function28 = function23;
                    Function2 function29 = function24;
                    Function2 function210 = function25;
                    int i14 = i;
                    ((Integer) obj2).intValue();
                    C1668330tW3.LIZLLL(function02, z2, function26, str3, str4, function27, function28, function29, function210, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i14 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LJI(final Function0<Unit> function0, boolean z, EnumC1668310tW1 enumC1668310tW1, boolean z2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, String str, String str2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function24, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function25, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int iOrdinal;
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
        boolean z3;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function26 = function25;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function27 = function23;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function28 = function22;
        String str3 = str2;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function29 = function24;
        String str4 = str;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function210 = function2;
        boolean z4 = z2;
        EnumC1668310tW1 enumC1668310tW12 = enumC1668310tW1;
        boolean z5 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1921476508);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z5)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (enumC1668310tW12 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC1668310tW12.ordinal();
            }
            if (c13zcLJIIJ.LJIJI(iOrdinal)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i19 = i3 & 8;
        if (i19 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i20 = i3 & 16;
        if (i20 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function210)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i21 = i3 & 32;
        if (i21 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str4)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i22 = i3 & 64;
        if (i22 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i23 = i3 & 128;
        if (i23 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function28)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i24 = i3 & 256;
        if (i24 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function27)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        int i25 = i3 & 512;
        if (i25 != 0) {
            i4 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function29)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        int i26 = i3 & 1024;
        if (i26 != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJII(function26)) {
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
            if (i17 != 0) {
                z5 = true;
            }
            if (i18 != 0) {
                enumC1668310tW12 = EnumC1668310tW1.Normal;
            }
            if (i19 != 0) {
                z4 = true;
            }
            if (i20 != 0) {
                function210 = null;
            }
            if (i21 != 0) {
                str4 = null;
            }
            if (i22 != 0) {
                str3 = null;
            }
            if (i23 != 0) {
                function28 = null;
            }
            if (i24 != 0) {
                function27 = null;
            }
            if (i25 != 0) {
                function29 = null;
            }
            if (i26 != 0) {
                function26 = null;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.TRUE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new AObjectS399S0100000_25(c05p0, 19);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            Function0 function02 = (Function0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c05p0.getValue()).booleanValue());
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i4 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1324705Gj(c05p0, null, function0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ3, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05P0 c05p02 = (C05P0) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = new C1324805Gk(c05p02, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ5, c13zcLJIIJ);
            if (((Boolean) c13zcLJIIJ.LJJIL(C1674190tfV.LIZ)).booleanValue()) {
                c05p02.setValue(Boolean.TRUE);
            }
            boolean z6 = true;
            C1670630tZl.LIZ(function02, new C1686740tzk(z6, z6, false, z6, 4), 0.5f, C13Z4.LIZJ(-956984525, new AObjectS0S2920000_25(z5, function02, enumC1668310tW12, c05p02, c05p0, z4, function210, str4, str3, function28, function27, function29, function26, 0), c13zcLJIIJ), c13zcLJIIJ, 3462);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final boolean z7 = z5;
            final EnumC1668310tW1 enumC1668310tW13 = enumC1668310tW12;
            final boolean z8 = z4;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function211 = function210;
            final String str5 = str4;
            final String str6 = str3;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function212 = function28;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function213 = function27;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function214 = function29;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function215 = function26;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0Da8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function03 = function0;
                    boolean z9 = z7;
                    EnumC1668310tW1 enumC1668310tW14 = enumC1668310tW13;
                    boolean z10 = z8;
                    Function2 function216 = function211;
                    String str7 = str5;
                    String str8 = str6;
                    Function2 function217 = function212;
                    Function2 function218 = function213;
                    Function2 function219 = function214;
                    Function2 function220 = function215;
                    int i27 = i;
                    int i28 = i2;
                    int i29 = i3;
                    ((Integer) obj2).intValue();
                    C1668330tW3.LJI(function03, z9, enumC1668310tW14, z10, function216, str7, str8, function217, function218, function219, function220, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i27 | 1), C341440Da2.LIZ(i28), i29);
                    return Unit.LIZ;
                }
            };
        }
    }
}

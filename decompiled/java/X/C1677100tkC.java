package X;

import X.C1676910tjt;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import h0.n2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0500002_25;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS4S0101001_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS75S1000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677100tkC {
    public static final float LJII(float f, C13LY<Float> c13ly) {
        return (f - c13ly.getStart().floatValue()) / (c13ly.LJFF().floatValue() - c13ly.getStart().floatValue());
    }

    public static final long LJI(float f, C13LY<Float> c13ly, float f2, float f3, int i) {
        return (((long) C1677160tkI.LIZ((f2 + (LJII(f, c13ly) * i)) + f3)) << 32) | (((long) 0) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(float r14, float r15, X.C13LY<java.lang.Float> r16, int r17, float r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677100tkC.LIZ(float, float, X.13LY, int, float, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.String r26, float r27, X.C13LY<java.lang.Float> r28, float r29, float r30, int r31, X.InterfaceC1680500tpg r32, int r33) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677100tkC.LJFF(java.lang.String, float, X.13LY, float, float, int, X.0tpg, int):void");
    }

    public static final void LIZJ(AbstractC1159950gI5 abstractC1159950gI5, float f, float f2, C13LY<Float> c13ly, float f3, float f4, int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-848772653);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1159950gI5)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c13ly)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJIJ(f4)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            float f5 = -(f4 / 2);
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1682520tsw.LJIIL(c.LJIJI(InterfaceC1685750ty9.LIZ, null, 3), 0.0f, 0.0f, 0.0f, 8, 7), 1.0f);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 48);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                if (abstractC1159950gI5 instanceof C1159930gI3) {
                    c13zcLJIIJ.LJJIIJZLJL(-2097128841);
                    int i11 = i3 & 112;
                    int i12 = i3 >> 3;
                    LJFF(C0MBB.LIZIZ(2131830339, c13zcLJIIJ), f, c13ly, f3, f5, i, c13zcLJIIJ, i11 | (i12 & 896) | (i12 & 7168) | (i12 & 458752));
                    c13zcLJIIJ.LJJJJL(false);
                } else if (abstractC1159950gI5 instanceof C1159940gI4) {
                    c13zcLJIIJ.LJJIIJZLJL(-586051063);
                    C443120HZe c443120HZeLIZ = C10FS.LIZ(true, Float.valueOf(((C1159940gI4) abstractC1159950gI5).LIZ));
                    int i13 = i3 >> 3;
                    LJFF(C0MBB.LIZJ(2131830338, new Object[]{c443120HZeLIZ.getSecond(), c443120HZeLIZ.getThird()}, c13zcLJIIJ), f2, c13ly, f3, f5, i, c13zcLJIIJ, (i13 & 112) | (i13 & 896) | (i13 & 7168) | (i13 & 458752));
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-2097093725);
                    int i14 = (i3 & 112) | 6;
                    int i15 = i3 >> 3;
                    LJFF("", f, c13ly, f3, f5, i, c13zcLJIIJ, i14 | (i15 & 896) | (i15 & 7168) | (i15 & 458752));
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1677140tkG(abstractC1159950gI5, f, f2, c13ly, f3, f4, i, i2);
        }
    }

    public static final void LIZLLL(float f, float f2, C13LY<Float> c13ly, int i, float f3, float f4, int i2, InterfaceC1680500tpg interfaceC1680500tpg, int i3) {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-628795988);
        if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i4 = i11 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i4 |= i10;
        }
        if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c13ly)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i4 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((196608 & i3) == 0) {
            if (c13zcLJIIJ.LJIJ(f4)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i4 |= i6;
        }
        if ((1572864 & i3) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        if ((599187 & i4) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1691250u71.LIZ(f4);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05ZL c05zl = (C05ZL) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            C1676910tjt c1676910tjtLJ = C1676860tjo.LJ(Float.valueOf(f4), "Progress animation", c13zcLJIIJ, ((i4 >> 15) & 14) | 48, 0);
            C1677090tkB c1677090tkB = new C1677090tkB(f4, i2, c05zl);
            C1677610tl1 c1677610tl1 = n2.LIZ;
            float fFloatValue = ((Number) c1676910tjtLJ.LIZJ()).floatValue();
            c13zcLJIIJ.LJJIIJZLJL(-1576622942);
            c13zcLJIIJ.LJJJJL(false);
            Float fValueOf = Float.valueOf(fFloatValue);
            float fFloatValue2 = ((Number) c1676910tjtLJ.LJI()).floatValue();
            c13zcLJIIJ.LJJIIJZLJL(-1576622942);
            c13zcLJIIJ.LJJJJL(false);
            C1676910tjt.d dVarLIZJ = C1676860tjo.LIZJ(c1676910tjtLJ, fValueOf, Float.valueOf(fFloatValue2), c1677090tkB.invoke(c1676910tjtLJ.LJFF(), c13zcLJIIJ, 0), c1677610tl1, c13zcLJIIJ, 196608);
            String strLIZIZ = C0MBB.LIZIZ(2131830315, c13zcLJIIJ);
            Float fValueOf2 = Float.valueOf(f4);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean z4 = true;
            if ((458752 & i4) == 131072) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1243460iSm(f4, c05zl, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(fValueOf2, (Function2) objLJJ2, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if ((i4 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i4 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((i4 & 7168) != 2048) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z6 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS4S0101001_25(f2, c13ly, i, 1);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1688600u2k.LIZIZ(c1685760tyA, (Function1) objLJJ3);
            float fFloatValue3 = ((Number) dVarLIZJ.getValue()).floatValue();
            if (fFloatValue3 > f) {
                fFloatValue3 = f;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILLIIL = c.LJIILLIIL(interfaceC1685750ty9LIZIZ, ((fFloatValue3 - f2) / (c13ly.LJFF().floatValue() - c13ly.getStart().floatValue())) * f3);
            float f5 = 4;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1675980tiO.LIZIZ(c.LJI(interfaceC1685750ty9LJIILLIIL, f5), C1670400tZO.LIZIZ(c13zcLJIIJ).D2(), C1669050tXD.LIZIZ(f5));
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(strLIZIZ);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS75S1000000_25(strLIZIZ, 8);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            k.LIZ(C1689740u4a.LIZIZ(interfaceC1685750ty9LIZIZ2, false, (Function1) objLJJ4), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1243480iSo(f, f2, c13ly, i, f3, f4, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(float r38, X.C13LY<java.lang.Float> r39, int r40, float r41, float r42, float r43, float r44, float r45, X.AbstractC1676270tir r46, java.lang.String r47, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, X.InterfaceC1668050tVb r50, boolean r51, float r52, float r53, X.InterfaceC1680710tq1 r54, X.InterfaceC1680500tpg r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677100tkC.LJ(float, X.13LY, int, float, float, float, float, float, X.0tir, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0tVb, boolean, float, float, X.0tq1, X.0tpg, int, int, int):void");
    }

    public static final void LIZIZ(C13LY<Float> c13ly, Function1<? super Float, Unit> function1, Function1<? super Float, Unit> function12, Function1<? super Float, Unit> function13, Function1<? super Float, Unit> function14, InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, AbstractC1159950gI5 abstractC1159950gI5, float f3, float f4, int i, float f5, float f6, float f7, float f8, Drawable drawable, Drawable drawable2, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3, int i4) {
        int i5;
        int i6;
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
        int i18;
        int i19;
        boolean z;
        boolean z2;
        AbstractC1676270tir abstractC1676270tir;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Drawable drawable3 = drawable2;
        Drawable drawable4 = drawable;
        float f9 = f7;
        float f10 = f6;
        float fFloatValue = f;
        float f11 = f8;
        float f12 = f5;
        int i25 = i;
        float f13 = f4;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        float f14 = f3;
        float fFloatValue2 = f2;
        AbstractC1159950gI5 abstractC1159950gI52 = abstractC1159950gI5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(31976858);
        C13LY<Float> c13ly2 = c13ly;
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c13ly2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function14)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        int i26 = i4 & 32;
        if (i26 != 0) {
            i5 |= 196608;
        } else if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((i2 & 1572864) == 0) {
            if ((i4 & 64) == 0 && c13zcLJIIJ.LJIJ(fFloatValue)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i5 |= i24;
        }
        if ((i2 & 12582912) == 0) {
            if ((i4 & 128) == 0 && c13zcLJIIJ.LJIJ(fFloatValue2)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i5 |= i23;
        }
        int i27 = i4 & 256;
        if (i27 != 0) {
            i5 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1159950gI52)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i5 |= i12;
        }
        int i28 = i4 & 512;
        if (i28 != 0) {
            i5 |= 805306368;
        } else if ((805306368 & i2) == 0) {
            if (c13zcLJIIJ.LJIJ(f14)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i5 |= i13;
        }
        int i29 = i4 & 1024;
        if (i29 != 0) {
            i14 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJIJ(f13)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i3;
        } else {
            i14 = i3;
        }
        int i30 = i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i30 != 0) {
            i14 |= 48;
        } else if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i25)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        int i31 = i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (i31 != 0) {
            i14 |= 384;
        } else if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f12)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        int i32 = i4 & 8192;
        if (i32 != 0) {
            i14 |= 3072;
        } else if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f10)) {
                i18 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i18 = 1024;
            }
            i14 |= i18;
        }
        int i33 = i4 & 16384;
        if (i33 != 0) {
            i14 |= 24576;
        } else if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f9)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i14 |= i19;
        }
        if ((196608 & i3) == 0) {
            if ((32768 & i4) == 0 && c13zcLJIIJ.LJIJ(f11)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i14 |= i22;
        }
        if ((i3 & 1572864) == 0) {
            if ((i4 & 65536) == 0 && c13zcLJIIJ.LJII(drawable4)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i14 |= i21;
        }
        if ((i3 & 12582912) == 0) {
            if ((i4 & 131072) == 0 && c13zcLJIIJ.LJII(drawable3)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i14 |= i20;
        }
        if ((i5 & 306783379) == 306783378 && (4793491 & i14) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i2 & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i4 & 64) != 0) {
                    i5 &= -3670017;
                }
                if ((i4 & 128) != 0) {
                    i5 &= -29360129;
                }
                if ((32768 & i4) != 0) {
                    i14 &= -458753;
                }
                if ((i4 & 65536) != 0) {
                    i14 &= -3670017;
                }
                if ((i4 & 131072) != 0) {
                    i14 &= -29360129;
                }
            } else {
                if (i26 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i4 & 64) != 0) {
                    fFloatValue = c13ly2.getStart().floatValue();
                    i5 &= -3670017;
                }
                if ((i4 & 128) != 0) {
                    fFloatValue2 = c13ly2.LJFF().floatValue();
                    i5 &= -29360129;
                }
                if (i27 != 0) {
                    abstractC1159950gI52 = null;
                }
                if (i28 != 0) {
                    f14 = 5.0f;
                }
                if (i29 != 0) {
                    f13 = 0.0f;
                }
                if (i30 != 0) {
                    i25 = 250;
                }
                if (i31 != 0) {
                    f12 = 32;
                }
                if (i32 != 0) {
                    f10 = 18;
                }
                if (i33 != 0) {
                    f9 = 23;
                }
                if ((32768 & i4) != 0) {
                    f11 = -(f12 / 2);
                    i14 &= -458753;
                }
                if ((i4 & 65536) != 0) {
                    drawable4 = new AbstractC415370GQl() { // from class: X.0GHR
                        public final int LJ = 18;
                        public final int LJFF = 23;
                        public final C415290GQd LJI;
                        public final Paint LJII;
                        public final C415290GQd LJIIIIZZ;
                        public final Paint LJIIIZ;
                        public final C415290GQd LJIIJ;

                        {
                            new Paint();
                            C415290GQd c415290GQd = new C415290GQd();
                            this.LJI = c415290GQd;
                            c415290GQd.LJIIIZ(18.0f, 4.99999f);
                            c415290GQd.LJIJI(1.72027f);
                            c415290GQd.LJFF(18.0f, 0.818264f, 16.8641f, 0.419823f, 16.3007f, 1.12417f);
                            c415290GQd.LJIIIIZZ(13.2f, 4.99999f);
                            c415290GQd.LJII(9.0f);
                            c415290GQd.LJFF(4.02944f, 4.99999f, 0.0f, 9.02943f, 0.0f, 14.0f);
                            c415290GQd.LJFF(0.0f, 18.9706f, 4.02944f, 23.0f, 9.0f, 23.0f);
                            c415290GQd.LJII(14.1831f);
                            c415290GQd.LJFF(16.2911f, 23.0f, 18.0f, 21.2911f, 18.0f, 19.1831f);
                            c415290GQd.LJIJI(8.99999f);
                            c415290GQd.LJIJI(4.99999f);
                            c415290GQd.LJ();
                            c415290GQd.LJIJ(Path.FillType.EVEN_ODD);
                            Paint paint = new Paint();
                            this.LJII = paint;
                            C415290GQd c415290GQd2 = new C415290GQd();
                            this.LJIIIIZZ = c415290GQd2;
                            c415290GQd2.LJIIIZ(18.0f, 4.99999f);
                            c415290GQd2.LJIJI(1.72027f);
                            c415290GQd2.LJFF(18.0f, 0.818264f, 16.8641f, 0.419823f, 16.3007f, 1.12417f);
                            c415290GQd2.LJIIIIZZ(13.2f, 4.99999f);
                            c415290GQd2.LJII(9.0f);
                            c415290GQd2.LJFF(4.02944f, 4.99999f, 0.0f, 9.02943f, 0.0f, 14.0f);
                            c415290GQd2.LJFF(0.0f, 18.9706f, 4.02944f, 23.0f, 9.0f, 23.0f);
                            c415290GQd2.LJII(14.1831f);
                            c415290GQd2.LJFF(16.2911f, 23.0f, 18.0f, 21.2911f, 18.0f, 19.1831f);
                            c415290GQd2.LJIJI(8.99999f);
                            c415290GQd2.LJIJI(4.99999f);
                            c415290GQd2.LJ();
                            c415290GQd2.LJIJ(Path.FillType.EVEN_ODD);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setColor(-1);
                            this.LIZ.add(paint);
                            Paint paint2 = new Paint();
                            this.LJIIIZ = paint2;
                            C415290GQd c415290GQd3 = new C415290GQd();
                            this.LJIIJ = c415290GQd3;
                            c415290GQd3.LJIIIZ(16.3007f, 1.12417f);
                            c415290GQd3.LJIIIIZZ(15.9102f, 0.811823f);
                            c415290GQd3.LJIJI(0.811823f);
                            c415290GQd3.LJIIIIZZ(16.3007f, 1.12417f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(13.2f, 4.99999f);
                            c415290GQd3.LJIJI(5.49999f);
                            c415290GQd3.LJII(13.4403f);
                            c415290GQd3.LJIIIIZZ(13.5904f, 5.31234f);
                            c415290GQd3.LJIIIIZZ(13.2f, 4.99999f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(17.5f, 1.72027f);
                            c415290GQd3.LJIJI(4.99999f);
                            c415290GQd3.LJII(18.5f);
                            c415290GQd3.LJIJI(1.72027f);
                            c415290GQd3.LJII(17.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(16.6911f, 1.43652f);
                            c415290GQd3.LJFF(16.9593f, 1.10124f, 17.5f, 1.2909f, 17.5f, 1.72027f);
                            c415290GQd3.LJII(18.5f);
                            c415290GQd3.LJFF(18.5f, 0.345626f, 16.769f, -0.261594f, 15.9102f, 0.811823f);
                            c415290GQd3.LJIIIIZZ(16.6911f, 1.43652f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(13.5904f, 5.31234f);
                            c415290GQd3.LJIIIIZZ(16.6911f, 1.43652f);
                            c415290GQd3.LJIIIIZZ(15.9102f, 0.811823f);
                            c415290GQd3.LJIIIIZZ(12.8096f, 4.68764f);
                            c415290GQd3.LJIIIIZZ(13.5904f, 5.31234f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(9.0f, 5.49999f);
                            c415290GQd3.LJII(13.2f);
                            c415290GQd3.LJIJI(4.49999f);
                            c415290GQd3.LJII(9.0f);
                            c415290GQd3.LJIJI(5.49999f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(0.5f, 14.0f);
                            c415290GQd3.LJFF(0.5f, 9.30557f, 4.30558f, 5.49999f, 9.0f, 5.49999f);
                            c415290GQd3.LJIJI(4.49999f);
                            c415290GQd3.LJFF(3.7533f, 4.49999f, -0.5f, 8.75328f, -0.5f, 14.0f);
                            c415290GQd3.LJII(0.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(9.0f, 22.5f);
                            c415290GQd3.LJFF(4.30558f, 22.5f, 0.5f, 18.6944f, 0.5f, 14.0f);
                            c415290GQd3.LJII(-0.5f);
                            c415290GQd3.LJFF(-0.5f, 19.2467f, 3.7533f, 23.5f, 9.0f, 23.5f);
                            c415290GQd3.LJIJI(22.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(14.1831f, 22.5f);
                            c415290GQd3.LJII(9.0f);
                            c415290GQd3.LJIJI(23.5f);
                            c415290GQd3.LJII(14.1831f);
                            c415290GQd3.LJIJI(22.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(17.5f, 19.1831f);
                            c415290GQd3.LJFF(17.5f, 21.015f, 16.015f, 22.5f, 14.1831f, 22.5f);
                            c415290GQd3.LJIJI(23.5f);
                            c415290GQd3.LJFF(16.5673f, 23.5f, 18.5f, 21.5673f, 18.5f, 19.1831f);
                            c415290GQd3.LJII(17.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(17.5f, 8.99999f);
                            c415290GQd3.LJIJI(19.1831f);
                            c415290GQd3.LJII(18.5f);
                            c415290GQd3.LJIJI(8.99999f);
                            c415290GQd3.LJII(17.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(17.5f, 4.99999f);
                            c415290GQd3.LJIJI(8.99999f);
                            c415290GQd3.LJII(18.5f);
                            c415290GQd3.LJIJI(4.99999f);
                            c415290GQd3.LJII(17.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIJ(Path.FillType.WINDING);
                            paint2.setStyle(Paint.Style.FILL);
                            paint2.setColor(-16777216);
                            paint2.setAlpha(30);
                            this.LIZ.add(paint2);
                        }

                        @Override // X.AbstractC415370GQl
                        public final void LIZ(Canvas canvas) {
                            LIZIZ(this.LJ, this.LJFF, canvas);
                            canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
                            canvas.clipPath(this.LJI.LIZ);
                            canvas.drawPath(this.LJIIJ.LIZ, this.LJIIIZ);
                        }
                    };
                    i14 &= -3670017;
                }
                if ((i4 & 131072) != 0) {
                    drawable3 = new AbstractC415370GQl() { // from class: X.0GHS
                        public final int LJ = 18;
                        public final int LJFF = 23;
                        public final C415290GQd LJI;
                        public final Paint LJII;
                        public final C415290GQd LJIIIIZZ;
                        public final Paint LJIIIZ;
                        public final C415290GQd LJIIJ;

                        {
                            new Paint();
                            C415290GQd c415290GQd = new C415290GQd();
                            this.LJI = c415290GQd;
                            c415290GQd.LJIIIZ(0.0f, 4.99999f);
                            c415290GQd.LJIJI(1.72027f);
                            c415290GQd.LJFF(0.0f, 0.818264f, 1.13587f, 0.419823f, 1.69934f, 1.12417f);
                            c415290GQd.LJIIIIZZ(4.8f, 4.99999f);
                            c415290GQd.LJII(9.0f);
                            c415290GQd.LJFF(13.9706f, 4.99999f, 18.0f, 9.02943f, 18.0f, 14.0f);
                            c415290GQd.LJFF(18.0f, 18.9706f, 13.9706f, 23.0f, 9.0f, 23.0f);
                            c415290GQd.LJII(3.81689f);
                            c415290GQd.LJFF(1.70888f, 23.0f, 0.0f, 21.2911f, 0.0f, 19.1831f);
                            c415290GQd.LJIJI(8.99999f);
                            c415290GQd.LJIJI(4.99999f);
                            c415290GQd.LJ();
                            c415290GQd.LJIJ(Path.FillType.EVEN_ODD);
                            Paint paint = new Paint();
                            this.LJII = paint;
                            C415290GQd c415290GQd2 = new C415290GQd();
                            this.LJIIIIZZ = c415290GQd2;
                            c415290GQd2.LJIIIZ(0.0f, 4.99999f);
                            c415290GQd2.LJIJI(1.72027f);
                            c415290GQd2.LJFF(0.0f, 0.818264f, 1.13587f, 0.419823f, 1.69934f, 1.12417f);
                            c415290GQd2.LJIIIIZZ(4.8f, 4.99999f);
                            c415290GQd2.LJII(9.0f);
                            c415290GQd2.LJFF(13.9706f, 4.99999f, 18.0f, 9.02943f, 18.0f, 14.0f);
                            c415290GQd2.LJFF(18.0f, 18.9706f, 13.9706f, 23.0f, 9.0f, 23.0f);
                            c415290GQd2.LJII(3.81689f);
                            c415290GQd2.LJFF(1.70888f, 23.0f, 0.0f, 21.2911f, 0.0f, 19.1831f);
                            c415290GQd2.LJIJI(8.99999f);
                            c415290GQd2.LJIJI(4.99999f);
                            c415290GQd2.LJ();
                            c415290GQd2.LJIJ(Path.FillType.EVEN_ODD);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setColor(-1);
                            this.LIZ.add(paint);
                            Paint paint2 = new Paint();
                            this.LJIIIZ = paint2;
                            C415290GQd c415290GQd3 = new C415290GQd();
                            this.LJIIJ = c415290GQd3;
                            c415290GQd3.LJIIIZ(1.69934f, 1.12417f);
                            c415290GQd3.LJIIIIZZ(2.08978f, 0.811823f);
                            c415290GQd3.LJIIIIZZ(2.08978f, 0.811823f);
                            c415290GQd3.LJIIIIZZ(1.69934f, 1.12417f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(4.8f, 4.99999f);
                            c415290GQd3.LJIJI(5.49999f);
                            c415290GQd3.LJII(4.55969f);
                            c415290GQd3.LJIIIIZZ(4.40956f, 5.31234f);
                            c415290GQd3.LJIIIIZZ(4.8f, 4.99999f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(0.5f, 1.72027f);
                            c415290GQd3.LJIJI(4.99999f);
                            c415290GQd3.LJII(-0.5f);
                            c415290GQd3.LJIJI(1.72027f);
                            c415290GQd3.LJII(0.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(1.30891f, 1.43652f);
                            c415290GQd3.LJFF(1.04069f, 1.10124f, 0.5f, 1.2909f, 0.5f, 1.72027f);
                            c415290GQd3.LJII(-0.5f);
                            c415290GQd3.LJFF(-0.5f, 0.345626f, 1.23104f, -0.261594f, 2.08978f, 0.811823f);
                            c415290GQd3.LJIIIIZZ(1.30891f, 1.43652f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(4.40956f, 5.31234f);
                            c415290GQd3.LJIIIIZZ(1.30891f, 1.43652f);
                            c415290GQd3.LJIIIIZZ(2.08978f, 0.811823f);
                            c415290GQd3.LJIIIIZZ(5.19043f, 4.68764f);
                            c415290GQd3.LJIIIIZZ(4.40956f, 5.31234f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(9.0f, 5.49999f);
                            c415290GQd3.LJII(4.8f);
                            c415290GQd3.LJIJI(4.49999f);
                            c415290GQd3.LJII(9.0f);
                            c415290GQd3.LJIJI(5.49999f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(17.5f, 14.0f);
                            c415290GQd3.LJFF(17.5f, 9.30557f, 13.6944f, 5.49999f, 9.0f, 5.49999f);
                            c415290GQd3.LJIJI(4.49999f);
                            c415290GQd3.LJFF(14.2467f, 4.49999f, 18.5f, 8.75328f, 18.5f, 14.0f);
                            c415290GQd3.LJII(17.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(9.0f, 22.5f);
                            c415290GQd3.LJFF(13.6944f, 22.5f, 17.5f, 18.6944f, 17.5f, 14.0f);
                            c415290GQd3.LJII(18.5f);
                            c415290GQd3.LJFF(18.5f, 19.2467f, 14.2467f, 23.5f, 9.0f, 23.5f);
                            c415290GQd3.LJIJI(22.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(3.81689f, 22.5f);
                            c415290GQd3.LJII(9.0f);
                            c415290GQd3.LJIJI(23.5f);
                            c415290GQd3.LJII(3.81689f);
                            c415290GQd3.LJIJI(22.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(0.5f, 19.1831f);
                            c415290GQd3.LJFF(0.5f, 21.015f, 1.98502f, 22.5f, 3.81689f, 22.5f);
                            c415290GQd3.LJIJI(23.5f);
                            c415290GQd3.LJFF(1.43274f, 23.5f, -0.5f, 21.5673f, -0.5f, 19.1831f);
                            c415290GQd3.LJII(0.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(0.5f, 8.99999f);
                            c415290GQd3.LJIJI(19.1831f);
                            c415290GQd3.LJII(-0.5f);
                            c415290GQd3.LJIJI(8.99999f);
                            c415290GQd3.LJII(0.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIIIZ(0.5f, 4.99999f);
                            c415290GQd3.LJIJI(8.99999f);
                            c415290GQd3.LJII(-0.5f);
                            c415290GQd3.LJIJI(4.99999f);
                            c415290GQd3.LJII(0.5f);
                            c415290GQd3.LJ();
                            c415290GQd3.LJIJ(Path.FillType.WINDING);
                            paint2.setStyle(Paint.Style.FILL);
                            paint2.setColor(-16777216);
                            paint2.setAlpha(30);
                            this.LIZ.add(paint2);
                        }

                        @Override // X.AbstractC415370GQl
                        public final void LIZ(Canvas canvas) {
                            LIZIZ(this.LJ, this.LJFF, canvas);
                            canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
                            canvas.clipPath(this.LJI.LIZ);
                            canvas.drawPath(this.LJIIJ.LIZ, this.LJIIIZ);
                        }
                    };
                    i14 &= -29360129;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            float fFloatValue3 = c13ly2.LJFF().floatValue() - c13ly2.getStart().floatValue();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1696870uG5.LIZ(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1691250u71.LIZ(0.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05ZL c05zl = (C05ZL) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C1691250u71.LIZ(fFloatValue);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05ZL c05zl2 = (C05ZL) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C1691250u71.LIZ(fFloatValue2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05ZL c05zl3 = (C05ZL) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            C13DR c13dr = C20055113dV.LJII;
            int iLIZ = C1677160tkI.LIZ(((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr)).LJJJJLL(f10));
            int iLIZ2 = C1677160tkI.LIZ(((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr)).LJJJJLL(f9));
            drawable4.setBounds(0, 0, iLIZ, iLIZ2);
            AbstractC1676270tir abstractC1676270tirLIZIZ = C1668830tWr.LIZIZ(drawable4, c13zcLJIIJ);
            drawable3.setBounds(0, 0, iLIZ, iLIZ2);
            AbstractC1676270tir abstractC1676270tirLIZIZ2 = C1668830tWr.LIZIZ(drawable3, c13zcLJIIJ);
            String strLIZIZ = C0MBB.LIZIZ(2131830317, c13zcLJIIJ);
            Float fValueOf = Float.valueOf(fFloatValue);
            Float fValueOf2 = Float.valueOf(fFloatValue2);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((((3670016 & i5) ^ 1572864) <= 1048576 || !c13zcLJIIJ.LJIJ(fFloatValue)) && (i5 & 1572864) != 1048576) {
                z = false;
            } else {
                z = true;
            }
            if ((((29360128 & i5) ^ 12582912) <= 8388608 || !c13zcLJIIJ.LJIJ(fFloatValue2)) && (i5 & 12582912) != 8388608) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z11 = z2 | z;
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (z11 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C1243470iSn(fFloatValue, fFloatValue2, c05zl2, c05zl3, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJ(fValueOf, fValueOf2, (Function2) objLJJ5, c13zcLJIIJ);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            int i34 = ((i5 >> 15) & 14) >> 3;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, (i34 & 112) | (i34 & 14));
            int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
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
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                int i35 = i14 << 9;
                int i36 = i35 & 458752;
                LIZJ(abstractC1159950gI52, c05zl2.LIZIZ(), c05zl3.LIZIZ(), c13ly2, c05zl.LIZIZ(), f12, interfaceC1676320tiw.LIZLLL(), c13zcLJIIJ, ((i5 >> 24) & 14) | ((i5 << 9) & 7168) | i36);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
                C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
                int iLIZ4 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIJI2 = c.LJIJI(C1688600u2k.LIZLLL(c.LJ(c1685760tyA, 1.0f), 0.0f, -4, 1), null, 3);
                    C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
                    int iLIZ5 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI2);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ5))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ5));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ5), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        float fLJJI = ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr)).LJJI(interfaceC1676320tiw.LIZLLL());
                        InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        Object objLJJ6 = c13zcLJIIJ.LJJ();
                        if (objLJJ6 == c1680520tpi) {
                            objLJJ6 = new AwS604S0100000_25(interfaceC1676320tiw, 319);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1674000tfC.LIZ(interfaceC1685750ty9LJ, (Function1) objLJJ6);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        Object objLJJ7 = c13zcLJIIJ.LJJ();
                        if (objLJJ7 == c1680520tpi) {
                            objLJJ7 = new AwS604S0100000_25(c05zl, 320);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1685330txT.LIZ(interfaceC1685750ty9LIZ, (Function1) objLJJ7), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669050tXD.LIZIZ(2));
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(strLIZIZ);
                        Object objLJJ8 = c13zcLJIIJ.LJJ();
                        if (zLJJIIJ || objLJJ8 == c1680520tpi) {
                            objLJJ8 = new AwS75S1000000_25(strLIZIZ, 7);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ8);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1689740u4a.LIZIZ(interfaceC1685750ty9LIZIZ, false, (Function1) objLJJ8);
                        InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                        int iLIZ6 = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL4 = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ2);
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL4, aFwS311S0000000_252);
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ6))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ6));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ6), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                            float fLIZIZ = c05zl3.LIZIZ();
                            float fLIZIZ2 = c05zl2.LIZIZ();
                            int iLIZLLL = interfaceC1676320tiw.LIZLLL();
                            int i37 = (i5 << 6) & 896;
                            LIZ(fLIZIZ, fLIZIZ2, c13ly2, iLIZLLL, fLJJI, c13zcLJIIJ, i37);
                            int i38 = i14 << 15;
                            LIZLLL(c05zl3.LIZIZ(), c05zl2.LIZIZ(), c13ly2, interfaceC1676320tiw.LIZLLL(), fLJJI, f13, i25, c13zcLJIIJ, i37 | (458752 & i38) | (i38 & 3670016));
                            c13zcLJIIJ.LJJJJL(true);
                            Object objLJJIL = c13zcLJIIJ.LJJIL(C20055113dV.LJIILIIL);
                            float fLIZIZ3 = c05zl2.LIZIZ();
                            int iLIZLLL2 = interfaceC1676320tiw.LIZLLL();
                            float fLIZIZ4 = c05zl.LIZIZ();
                            C1296870jqv c1296870jqv2 = C1668040tVa.LJ;
                            EnumC1671200tag enumC1671200tag = EnumC1671200tag.Ltr;
                            if (objLJJIL == enumC1671200tag) {
                                abstractC1676270tir = abstractC1676270tirLIZIZ;
                            } else {
                                abstractC1676270tir = abstractC1676270tirLIZIZ2;
                            }
                            String strLIZIZ2 = C0MBB.LIZIZ(2131830321, c13zcLJIIJ);
                            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                            boolean zLJIJ = c13zcLJIIJ.LJIJ(fFloatValue3);
                            int i39 = i5 & 14;
                            if (i39 == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z12 = zLJIJ | z3;
                            int i40 = i5 & 1879048192;
                            if (i40 == 536870912) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            boolean z13 = z12 | z4;
                            if ((i5 & 7168) == 2048) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            boolean z14 = z13 | z5;
                            Object objLJJ9 = c13zcLJIIJ.LJJ();
                            if (z14 || objLJJ9 == c1680520tpi) {
                                objLJJ9 = new AwS0S0500002_25(fFloatValue3, f14, c05zl2, c05zl3, interfaceC1676320tiw, function13, c13ly2, 0);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
                            }
                            Function1 function15 = (Function1) objLJJ9;
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                            if ((i5 & 112) == 32) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            Object objLJJ10 = c13zcLJIIJ.LJJ();
                            if (z6 || objLJJ10 == c1680520tpi) {
                                objLJJ10 = new AwS420S0200000_19((Function1) function1, (Function1<? super Float, Unit>) c05zl2, (C05ZL) 102);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ10);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            int i41 = ((i5 << 3) & 112) | ((i14 >> 3) & 57344) | i36 | (i35 & 3670016) | (i35 & 29360128);
                            LJ(fLIZIZ3, c13ly2, iLIZLLL2, fLIZIZ4, f11, f12, f10, f9, abstractC1676270tir, strLIZIZ2, function15, (Function0) objLJJ10, c1296870jqv2, false, 0.0f, 0.0f, null, c13zcLJIIJ, i41, 384, 122880);
                            float fLIZIZ5 = c05zl3.LIZIZ();
                            int iLIZLLL3 = interfaceC1676320tiw.LIZLLL();
                            float fLIZIZ6 = c05zl.LIZIZ();
                            C1296870jqv c1296870jqv3 = C1668040tVa.LJI;
                            if (objLJJIL != enumC1671200tag) {
                                abstractC1676270tirLIZIZ2 = abstractC1676270tirLIZIZ;
                            }
                            String strLIZIZ3 = C0MBB.LIZIZ(2131830316, c13zcLJIIJ);
                            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                            boolean zLJIJ2 = c13zcLJIIJ.LJIJ(fFloatValue3);
                            if (i40 == 536870912) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            boolean z15 = zLJIJ2 | z7;
                            if (i39 == 4) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            boolean z16 = z15 | z8;
                            if ((57344 & i5) == 16384) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            boolean z17 = z16 | z9;
                            Object objLJJ11 = c13zcLJIIJ.LJJ();
                            if (z17 || objLJJ11 == c1680520tpi) {
                                objLJJ11 = new AwS0S0500002_25(fFloatValue3, f14, c05zl3, c05zl2, interfaceC1676320tiw, function14, c13ly2, 1);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ11);
                            }
                            Function1 function16 = (Function1) objLJJ11;
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                            if ((i5 & 896) == 256) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Object objLJJ12 = c13zcLJIIJ.LJJ();
                            if (z10 || objLJJ12 == c1680520tpi) {
                                objLJJ12 = new AwS420S0200000_19((Function1) function12, (Function1<? super Float, Unit>) c05zl3, (C05ZL) 103);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ12);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            c13ly2 = c13ly2;
                            f11 = f11;
                            f10 = f10;
                            f9 = f9;
                            LJ(fLIZIZ5, c13ly2, iLIZLLL3, fLIZIZ6, f11, f12, f10, f9, abstractC1676270tirLIZIZ2, strLIZIZ3, function16, (Function0) objLJJ12, c1296870jqv3, false, 0.0f, 0.0f, null, c13zcLJIIJ, i41, 384, 122880);
                            c13zcLJIIJ.LJJJJL(true);
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
            c20030013YsLJJJJZI.LIZLLL = new C1677120tkE(c13ly2, function1, function12, function13, function14, interfaceC1685750ty92, fFloatValue, fFloatValue2, abstractC1159950gI52, f14, f13, i25, f12, f10, f9, f11, drawable4, drawable3, i2, i3, i4);
        }
    }
}

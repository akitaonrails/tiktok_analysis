package X;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0302002_25;
import kotlin.jvm.internal.AwS0S0412100_25;
import kotlin.jvm.internal.AwS131S0400000_2;
import kotlin.jvm.internal.AwS25S0200100_2;
import kotlin.jvm.internal.AwS49S0102000_25;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0toT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679750toT {
    public static final C1683130ttv LJ(C05P0<C1683130ttv> c05p0) {
        return c05p0.getValue();
    }

    public static final Pair LJI(float f, long j, long j2) {
        long jFloatToRawIntBits;
        float fLIZLLL = C13LZ.LIZLLL(f, 1.0f, 4.0f);
        if (fLIZLLL <= 1.0f) {
            jFloatToRawIntBits = 0;
        } else {
            int i = (int) (j >> 32);
            float fIntBitsToFloat = (Float.intBitsToFloat(i) * fLIZLLL) - Float.intBitsToFloat(i);
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            int i2 = (int) (j & 4294967295L);
            float fIntBitsToFloat2 = (Float.intBitsToFloat(i2) * fLIZLLL) - Float.intBitsToFloat(i2);
            if (fIntBitsToFloat2 < 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            }
            float fLIZLLL2 = C13LZ.LIZLLL(Float.intBitsToFloat((int) (j2 >> 32)), -fIntBitsToFloat, 0.0f);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C13LZ.LIZLLL(Float.intBitsToFloat((int) (j2 & 4294967295L)), -fIntBitsToFloat2, 0.0f))) & 4294967295L) | (Float.floatToRawIntBits(fLIZLLL2) << 32);
        }
        return new Pair(new C1378605aS(jFloatToRawIntBits), Float.valueOf(fLIZLLL));
    }

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(194430435);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i5 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(interfaceC1685750ty92);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = AFwS214S0000000_25.get$arr$(228);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634380OuS.LIZ(interfaceC1685750ty9LIZLLL, null, null, true, null, null, (Function0) objLJJ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c1685760tyA, 16);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 54);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIIZZ);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                    C1668690tWd.LIZIZ(0.0f, 6, 6, c13zcLJIIJ, c.LJIILIIL(c1685760tyA, 36), false);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty92, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(kotlin.jvm.functions.Function0<kotlin.Unit> r8, kotlin.jvm.functions.Function0<kotlin.Unit> r9, X.InterfaceC1680500tpg r10, int r11) {
        /*
            r0 = -796734044(0xffffffffd082cda4, float:-1.755612E10)
            X.13ZC r5 = r10.LJIIJ(r0)
            r0 = r11 & 6
            r2 = 4
            if (r0 != 0) goto L8a
            boolean r0 = r5.LJII(r8)
            if (r0 == 0) goto L88
            r7 = 4
        L13:
            r7 = r7 | r11
        L14:
            r0 = r11 & 48
            r6 = 32
            if (r0 != 0) goto L23
            boolean r0 = r5.LJII(r9)
            if (r0 == 0) goto L85
            r0 = 32
        L22:
            r7 = r7 | r0
        L23:
            r1 = r7 & 19
            r0 = 18
            if (r1 != r0) goto L42
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L42
            r5.LIZJ()
        L32:
            X.13Ys r2 = r5.LJJJJZI()
            if (r2 == 0) goto L41
            kotlin.jvm.internal.AwS124S0201000_25 r1 = new kotlin.jvm.internal.AwS124S0201000_25
            r0 = 52
            r1.<init>(r11, r8, r9, r0)
            r2.LIZLLL = r1
        L41:
            return
        L42:
            X.13DN<androidx.lifecycle.LifecycleOwner> r0 = X.C13GF.LIZ
            java.lang.Object r4 = r5.LJJIL(r0)
            androidx.lifecycle.LifecycleOwner r4 = (androidx.lifecycle.LifecycleOwner) r4
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r5.LJJIIJZLJL(r0)
            r0 = r7 & 14
            r3 = 0
            r1 = 1
            if (r0 != r2) goto L83
            r2 = 1
        L57:
            r0 = r7 & 112(0x70, float:1.57E-43)
            if (r0 == r6) goto L5c
            r1 = 0
        L5c:
            r2 = r2 | r1
            boolean r0 = r5.LJII(r4)
            r2 = r2 | r0
            java.lang.Object r1 = r5.LJJ()
            if (r2 != 0) goto L71
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L7a
        L71:
            kotlin.jvm.internal.AwS212S0300000_3 r1 = new kotlin.jvm.internal.AwS212S0300000_3
            r0 = 6
            r1.<init>(r4, r8, r9, r0)
            r5.LJJIJIIJI(r1)
        L7a:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJJJJL(r3)
            X.C1680540tpk.LIZIZ(r4, r1, r5)
            goto L32
        L83:
            r2 = 0
            goto L57
        L85:
            r0 = 16
            goto L22
        L88:
            r7 = 2
            goto L13
        L8a:
            r7 = r11
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679750toT.LIZIZ(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final C1587506Jl LJII(float f, float f2, float f3, float f4, EnumC1338240kve enumC1338240kve) {
        float fMin;
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && f4 > 0.0f) {
            float f5 = f3 / f;
            float f6 = f4 / f2;
            int i = C1679760toU.LIZ[enumC1338240kve.ordinal()];
            if (i == 1 || i != 2) {
                fMin = Math.min(f5, f6);
            } else {
                fMin = Math.max(f5, f6);
            }
            float f7 = f * fMin;
            float f8 = f2 * fMin;
            float f9 = (f3 - f7) / 2.0f;
            float f10 = (f4 - f8) / 2.0f;
            return new C1587506Jl(new C1683130ttv(f9, f10, f7 + f9, f8 + f10));
        }
        return new C1587506Jl(new C1683130ttv(0.0f, 0.0f, f3, f4));
    }

    public static final void LIZLLL(C05UN c05un, float f, float f2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        Function0<Unit> function02 = function0;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        float f3 = f2;
        float f4 = f;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-110896118);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05un)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f4)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                f4 = 0;
            }
            if (i9 != 0) {
                f3 = 0;
            }
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if ((i2 & 16) != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS214S0000000_25.get$arr$(230);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                function02 = (Function0) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p02 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = new LinkedHashMap();
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            Map map = (Map) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = new LinkedHashMap();
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            Map map2 = (Map) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            int iLIZIZ = c05un.LIZIZ();
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            int i11 = i3 & 14;
            boolean z4 = true;
            if (i11 == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (z || objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS546S0100000_2(c05un, 863);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1386605bk c1386605bkLIZIZ = C1690670u65.LIZIZ(iLIZIZ, (Function0) objLJJ6, c13zcLJIIJ, 0);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (objLJJ7 == c1680520tpi) {
                objLJJ7 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ7;
            C05P1 c05p1LIZIZ = C1675660ths.LIZIZ(c05un.LJFF(), C1671550tbF.LIZJ(0.8f, 300.0f, null, 4), 0.0f, "dragOffsetY", null, c13zcLJIIJ, 3120, 20);
            C05P1 c05p1LIZIZ2 = C1675660ths.LIZIZ(c05un.LJ(), C1671550tbF.LIZJ(0.8f, 300.0f, null, 4), 0.0f, "dragOffsetX", null, c13zcLJIIJ, 3120, 20);
            C05P1 c05p1LIZIZ3 = C1675660ths.LIZIZ(((Number) ((C13FE) c05un.LJIILJJIL).getValue()).floatValue(), C1671550tbF.LIZJ(0.8f, 300.0f, null, 4), 0.0f, "dragScale", null, c13zcLJIIJ, 3120, 20);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if (i11 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJJIIJ = z2 | c13zcLJIIJ.LJJIIJ(c05p1LIZIZ2) | c13zcLJIIJ.LJJIIJ(c05p1LIZIZ) | c13zcLJIIJ.LJJIIJ(c05p1LIZIZ3);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ8 == c1680520tpi) {
                objLJJ8 = new AwS131S0400000_2(c05un, (C05UN) c05p1LIZIZ2, (C05P1<Float>) c05p1LIZIZ, (C05P1<Float>) c05p1LIZIZ3, (C05P1<Float>) 2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJII((Function0) objLJJ8, c13zcLJIIJ);
            Object value = c05p02.getValue();
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if (i11 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLJII = z3 | c13zcLJIIJ.LJII(interfaceC497601wk);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ9 == c1680520tpi) {
                objLJJ9 = new C05UK(c05un, interfaceC497601wk, c05p02, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJ(value, c05un, (Function2) objLJJ9, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c1386605bkLIZIZ);
            if (i11 != 4) {
                z4 = false;
            }
            boolean z5 = zLJJIIJ2 | z4;
            Object objLJJ10 = c13zcLJIIJ.LJJ();
            if (z5 || objLJJ10 == c1680520tpi) {
                objLJJ10 = new C1362105Ut(c1386605bkLIZIZ, c05un, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ10);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c1386605bkLIZIZ, (Function2) objLJJ10, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ11 = c13zcLJIIJ.LJJ();
            if (objLJJ11 == c1680520tpi) {
                objLJJ11 = new InterfaceC20086513iZ() { // from class: X.0toR
                    @Override // X.InterfaceC20086513iZ
                    public final /* synthetic */ Object LLFII(long j, long j2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        return C1670040tYo.LIZ();
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final /* synthetic */ Object LLILII(long j, InterfaceC1364105Vn interfaceC1364105Vn) {
                        return C1670040tYo.LIZIZ();
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final long LJJJLZIJ(int i12, long j) {
                        return 0L;
                    }

                    @Override // X.InterfaceC20086513iZ
                    public final long LJJLI(int i12, long j, long j2) {
                        return 0L;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ11);
            }
            C1679730toR c1679730toR = (C1679730toR) objLJJ11;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ12 = c13zcLJIIJ.LJJ();
            if (objLJJ12 == c1680520tpi) {
                objLJJ12 = new AwS581S0100000_2(c05p0, (C05P0<InterfaceC1692950u9l>) 329);
                c13zcLJIIJ.LJJIJIIJI(objLJJ12);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1675550thh.LIZ(c1386605bkLIZIZ, C1685330txT.LIZ(interfaceC1685750ty92, (Function1) objLJJ12), null, null, 1, 0.0f, null, null, false, false, null, c1679730toR, null, null, C13Z4.LIZJ(1032733195, new C1679740toS(c05un, f3, f4, c1679730toR, map, map2, c05p0, c05p02, c05p1LIZIZ3, c1386605bkLIZIZ, c05p1LIZIZ2, c05p1LIZIZ), c13zcLJIIJ), c13zcLJIIJ, 24576, 24624, 14316);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0302002_25(c05un, (C05UN) f4, f3, (float) interfaceC1685750ty92, (InterfaceC1685750ty9) function02, (Function0<Unit>) i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x05df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C05UN r50, X.InterfaceC1685750ty9 r51, kotlin.jvm.functions.Function0<kotlin.Unit> r52, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r53, kotlin.jvm.functions.Function1<? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r54, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem.Image, kotlin.Unit> r55, X.InterfaceC1680500tpg r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679750toT.LIZJ(X.05UN, X.0ty9, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.0tpg, int, int):void");
    }

    public static final void LJFF(final long j, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, C1378505aR c1378505aR, Function0<Unit> function0, InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        Throwable th;
        boolean z3;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        int i10;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        final InterfaceC497601wk interfaceC497601wk;
        boolean z8;
        boolean z9;
        final Function0<Unit> function02 = function0;
        boolean z10 = z;
        final C1378505aR c1378505aR2 = c1378505aR;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(721889444);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
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
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z10)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i13 = i2 & 8;
        if (i13 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1378505aR2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i3 & 74899) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i12 != 0) {
                z10 = true;
            }
            if (i13 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = new C1378505aR();
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c1378505aR2 = (C1378505aR) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i14 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ2 == C1680510tph.LIZIZ) {
                    objLJJ2 = AFwS187S0000000_2.get$arr$(691);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                function02 = (Function0) objLJJ2;
                c13zcLJIIJ.LJJJJL(false);
            }
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            InterfaceC497601wk interfaceC497601wk2 = (InterfaceC497601wk) objLJJ3;
            if (z10) {
                c13zcLJIIJ.LJJIIJZLJL(908340796);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1667200tUE.LIZIZ(interfaceC1685750ty92);
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJII = c13zcLJIIJ.LJII(interfaceC497601wk2);
                int i15 = i3 & 7168;
                if (i15 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z11 = zLJII | z5;
                int i16 = i3 & 14;
                if (i16 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z12 = z6 | z11;
                if ((57344 & i3) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z13 = z7 | z12;
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (!z13 && objLJJ4 != c1680520tpi) {
                    interfaceC497601wk = interfaceC497601wk2;
                } else {
                    interfaceC497601wk = interfaceC497601wk2;
                    final C1378505aR c1378505aR3 = c1378505aR2;
                    final Function0<Unit> function03 = function02;
                    objLJJ4 = new PointerInputEventHandler() { // from class: X.05aP
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                            InterfaceC497601wk interfaceC497601wk3 = interfaceC497601wk;
                            Object objLJ = C1374405Zm.LJ(interfaceC1369205Xm, interfaceC1364105Vn, new AwS25S0200100_2(j, c1378505aR3, interfaceC497601wk3, 0), null, new AwS581S0100000_2((Function0) function03, (Function0<Unit>) 325), C1374405Zm.LIZ);
                            if (objLJ == C099R.LJFF()) {
                                return objLJ;
                            }
                            return Unit.LIZ;
                        }
                    };
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1679720toQ.LIZ(interfaceC1685750ty9LIZIZ, c1378505aR2, (PointerInputEventHandler) objLJJ4);
                Boolean boolValueOf = Boolean.valueOf(z10);
                c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                if (i15 == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i16 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean zLJII2 = z9 | z8 | c13zcLJIIJ.LJII(interfaceC497601wk);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (zLJII2 || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new PointerInputEventHandler() { // from class: X.05aG
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                            Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C1373705Zf(new C1377505aH(j, c1378505aR2, interfaceC497601wk), null), interfaceC1364105Vn);
                            if (objLIZIZ != C099R.LJFF()) {
                                objLIZIZ = Unit.LIZ;
                            }
                            if (objLIZIZ == C099R.LJFF()) {
                                return objLIZIZ;
                            }
                            return Unit.LIZ;
                        }
                    };
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LIZ = C1679720toQ.LIZIZ(interfaceC1685750ty9LIZ2, c1378505aR2, boolValueOf, (PointerInputEventHandler) objLJJ5);
                c13zcLJIIJ.LJJJJL(false);
                i10 = 5004770;
                th = null;
            } else {
                c13zcLJIIJ.LJJIIJZLJL(910789765);
                Boolean bool = Boolean.FALSE;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (!z2 && objLJJ6 != c1680520tpi) {
                    th = null;
                } else {
                    th = null;
                    objLJJ6 = new C1377705aJ(c1378505aR2, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1680540tpk.LJFF(bool, (Function2) objLJJ6, c13zcLJIIJ);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1667200tUE.LIZIZ(interfaceC1685750ty92);
                Unit unit = Unit.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((57344 & i3) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object objLJJ7 = c13zcLJIIJ.LJJ();
                if (z3 || objLJJ7 == c1680520tpi) {
                    objLJJ7 = new PointerInputEventHandler() { // from class: X.05bT
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                            Object objLJ = C1374405Zm.LJ(interfaceC1369205Xm, interfaceC1364105Vn, null, null, new AwS581S0100000_2((Function0) function02, (Function0<Unit>) 326), C1374405Zm.LIZ);
                            if (objLJ == C099R.LJFF()) {
                                return objLJ;
                            }
                            return Unit.LIZ;
                        }
                    };
                    c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                }
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LIZ = C1679720toQ.LIZ(interfaceC1685750ty9LIZIZ2, unit, (PointerInputEventHandler) objLJJ7);
                c13zcLJIIJ.LJJJJL(false);
                i10 = 5004770;
            }
            c13zcLJIIJ.LJJIIJZLJL(i10);
            if ((i3 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (z4 || objLJJ8 == c1680520tpi) {
                objLJJ8 = new AwS604S0100000_25(c1378505aR2, 328);
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ3 = C1679660toK.LIZ(interfaceC1685750ty9LIZ, (Function1) objLJJ8);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ3);
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
                interfaceC1631620sYq.invoke(C1672220tcK.LIZ, c13zcLJIIJ, Integer.valueOf(((i3 >> 12) & 112) | 6));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0412100_25(j, (long) interfaceC1685750ty92, (InterfaceC1685750ty9) z10, (boolean) c1378505aR2, (C1378505aR) function02, (Function0<Unit>) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 1);
        }
    }
}

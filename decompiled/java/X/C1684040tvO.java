package X;

import android.content.Context;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS3S1302000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684040tvO {
    public static final void LIZJ(float f, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(624792625);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
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
        } else {
            k.LIZ(C1675980tiO.LIZIZ(c.LJIILLIIL(c.LJI(InterfaceC1685750ty9.LIZ, 1), f), C1670400tZO.LIZIZ(c13zcLJIIJ).T2(), C1669430tXp.LIZ), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1684060tvQ(f, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C1684090tvT<?> r20, kotlin.jvm.functions.Function0<kotlin.Unit> r21, X.InterfaceC1685750ty9 r22, X.InterfaceC1680500tpg r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684040tvO.LIZ(X.0tvT, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(kotlin.jvm.functions.Function0<kotlin.Unit> r15, X.AbstractC19875512pd<X.C1684090tvT<?>> r16, X.InterfaceC1685750ty9 r17, X.InterfaceC1680500tpg r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684040tvO.LIZIZ(kotlin.jvm.functions.Function0, X.12pd, X.0ty9, X.0tpg, int, int):void");
    }

    public static final void LIZLLL(Context context, String str, AbstractC1684080tvS abstractC1684080tvS, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1495160169);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
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
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1684080tvS)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
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
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C1670600tZi.LIZ(new C1670560tZe(new C0VSJ(str), null), "", interfaceC1685750ty92, null, null, new C989460br6(C1684070tvR.LIZJ(abstractC1684080tvS, context)), null, null, null, new C05AR() { // from class: X.0tvU
                @Override // X.C05AR
                public final void LIZ(C1696790uFx c1696790uFx) {
                }

                @Override // X.C05AR
                public final void onCanceled() {
                }

                @Override // X.C05AR
                public final void onFailed(Throwable th) {
                }

                @Override // X.C05AR
                public final void onProgress(float f) {
                }
            }, c13zcLJIIJ, ((i3 >> 3) & 896) | 48, 472);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1302000_25(context, str, abstractC1684080tvS, interfaceC1685750ty92, i, i2, 7);
        }
    }

    public static final void LJ(Context context, String str, AbstractC19875512pd<C1684090tvT<?>> abstractC19875512pd, boolean z, boolean z2, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean zLJII;
        int i6;
        int i7;
        int i8;
        int i9;
        AbstractC1684080tvS c1684110tvV;
        InterfaceC1680710tq1 interfaceC1680710tq1LIZIZ;
        boolean z3;
        Function0<Unit> function02 = function0;
        boolean z4 = z2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(662837063);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
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
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(abstractC19875512pd);
            } else {
                zLJII = c13zcLJIIJ.LJII(abstractC19875512pd);
            }
            if (zLJII) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i10 != 0) {
                z4 = false;
            }
            if (i11 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS214S0000000_25.get$arr$(548);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                function02 = (Function0) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (z) {
                c1684110tvV = new C1684120tvW();
            } else {
                c1684110tvV = new C1684110tvV();
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 15;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c1685760tyA, ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).D2).getValue()).LIZ, C1669050tXD.LIZIZ(f));
            C1668470tWH c1668470tWHLIZ = C1668460tWG.LIZ(1, C1670400tZO.LIZIZ(c13zcLJIIJ).T2());
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1675890tiF.LIZIZ(c1668470tWHLIZ.LIZ, interfaceC1685750ty9LIZIZ, c1668470tWHLIZ.LIZIZ, C1669050tXD.LIZIZ(f));
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ2);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c1685760tyA, 6);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIIZZ);
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
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ2 == C1680510tph.LIZIZ) {
                        objLJJ2 = AFwS214S0000000_25.get$arr$(549);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIJJI = c.LJIIJJI(C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ2, 6), c1684110tvV.LIZ, c1684110tvV.LIZIZ);
                    if (z4) {
                        final float f2 = 8;
                        final float f3 = 10;
                        interfaceC1680710tq1LIZIZ = new InterfaceC1680710tq1(f2, f2, f2, f2, f3) { // from class: X.0tXn
                            public final float LIZ;
                            public final float LIZIZ;
                            public final float LIZJ;
                            public final float LIZLLL;
                            public final float LJ;

                            @Override // X.InterfaceC1680710tq1
                            public final AbstractC1680810tqB LIZ(long j, EnumC1671200tag enumC1671200tag, InterfaceC1690500u5o interfaceC1690500u5o) {
                                float f4;
                                float f5;
                                float f6;
                                float f7;
                                C1695950uEb c1695950uEbLIZ;
                                if (C1668650tWZ.LIZJ(this.LIZ + this.LIZIZ + this.LIZJ + this.LIZLLL, 0)) {
                                    return new C1680780tq8(C1671580tbI.LIZJ(j));
                                }
                                float f8 = this.LJ;
                                EnumC1671200tag enumC1671200tag2 = EnumC1671200tag.Ltr;
                                if (enumC1671200tag == enumC1671200tag2) {
                                    f4 = this.LIZ;
                                } else {
                                    f4 = this.LIZIZ;
                                }
                                if (enumC1671200tag == enumC1671200tag2) {
                                    f5 = this.LIZIZ;
                                } else {
                                    f5 = this.LIZ;
                                }
                                if (enumC1671200tag == enumC1671200tag2) {
                                    f6 = this.LIZJ;
                                } else {
                                    f6 = this.LIZLLL;
                                }
                                if (enumC1671200tag == enumC1671200tag2) {
                                    f7 = this.LIZLLL;
                                } else {
                                    f7 = this.LIZJ;
                                }
                                if (enumC1671200tag == enumC1671200tag2) {
                                    float fLJJJJLL = interfaceC1690500u5o.LJJJJLL(f4);
                                    float fLJJJJLL2 = interfaceC1690500u5o.LJJJJLL(f5);
                                    float fLJJJJLL3 = interfaceC1690500u5o.LJJJJLL(f6);
                                    float fLJJJJLL4 = interfaceC1690500u5o.LJJJJLL(f7);
                                    float fLJJJJLL5 = interfaceC1690500u5o.LJJJJLL(f8);
                                    c1695950uEbLIZ = C1695940uEa.LIZ();
                                    c1695950uEbLIZ.LIZJ(fLJJJJLL, 0.0f);
                                    int i12 = (int) (j >> 32);
                                    c1695950uEbLIZ.LJIIL((Float.intBitsToFloat(i12) - fLJJJJLL2) - fLJJJJLL5, 0.0f);
                                    c1695950uEbLIZ.LJIIL((Float.intBitsToFloat(i12) - fLJJJJLL2) - fLJJJJLL5, fLJJJJLL5);
                                    float fIntBitsToFloat = (Float.intBitsToFloat(i12) - fLJJJJLL2) - fLJJJJLL5;
                                    float f9 = fLJJJJLL5 - fLJJJJLL2;
                                    float fIntBitsToFloat2 = (Float.intBitsToFloat(i12) - fLJJJJLL5) + fLJJJJLL2;
                                    float f10 = fLJJJJLL5 + fLJJJJLL2;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(fIntBitsToFloat, f9, fIntBitsToFloat2, f10), 180.0f, -90.0f);
                                    c1695950uEbLIZ.LJIIL(Float.intBitsToFloat(i12), f10);
                                    int i13 = (int) (j & 4294967295L);
                                    c1695950uEbLIZ.LJIIL(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13) - fLJJJJLL3);
                                    float f11 = 2;
                                    float f12 = fLJJJJLL3 * f11;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(Float.intBitsToFloat(i12) - f12, Float.intBitsToFloat(i13) - f12, Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), 0.0f, 90.0f);
                                    c1695950uEbLIZ.LJIIL(fLJJJJLL4, Float.intBitsToFloat(i13));
                                    float f13 = fLJJJJLL4 * f11;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(0.0f, Float.intBitsToFloat(i13) - f13, f13, Float.intBitsToFloat(i13)), 90.0f, 90.0f);
                                    c1695950uEbLIZ.LJIIL(0.0f, fLJJJJLL);
                                    float f14 = f11 * fLJJJJLL;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(0.0f, 0.0f, f14, f14), 180.0f, 90.0f);
                                    c1695950uEbLIZ.close();
                                } else {
                                    float fLJJJJLL6 = interfaceC1690500u5o.LJJJJLL(f4);
                                    float fLJJJJLL7 = interfaceC1690500u5o.LJJJJLL(f5);
                                    float fLJJJJLL8 = interfaceC1690500u5o.LJJJJLL(f6);
                                    float fLJJJJLL9 = interfaceC1690500u5o.LJJJJLL(f7);
                                    float fLJJJJLL10 = interfaceC1690500u5o.LJJJJLL(f8);
                                    c1695950uEbLIZ = C1695940uEa.LIZ();
                                    float f15 = fLJJJJLL10 + fLJJJJLL6;
                                    c1695950uEbLIZ.LIZJ(f15, 0.0f);
                                    int i14 = (int) (j >> 32);
                                    c1695950uEbLIZ.LJIIL(Float.intBitsToFloat(i14) - fLJJJJLL7, 0.0f);
                                    float f16 = 2;
                                    float f18 = fLJJJJLL7 * f16;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(Float.intBitsToFloat(i14) - f18, 0.0f, Float.intBitsToFloat(i14), f18), 270.0f, 90.0f);
                                    int i15 = (int) (j & 4294967295L);
                                    c1695950uEbLIZ.LJIIL(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15) - fLJJJJLL8);
                                    float f19 = fLJJJJLL8 * f16;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(Float.intBitsToFloat(i14) - f19, Float.intBitsToFloat(i15) - f19, Float.intBitsToFloat(i14), Float.intBitsToFloat(i15)), 0.0f, 90.0f);
                                    c1695950uEbLIZ.LJIIL(fLJJJJLL9, Float.intBitsToFloat(i15));
                                    float f20 = f16 * fLJJJJLL9;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(0.0f, Float.intBitsToFloat(i15) - f20, f20, Float.intBitsToFloat(i15)), 90.0f, 90.0f);
                                    c1695950uEbLIZ.LJIIL(0.0f, f15);
                                    c1695950uEbLIZ.LJIIL(fLJJJJLL10, f15);
                                    float f21 = fLJJJJLL10 - fLJJJJLL6;
                                    c1695950uEbLIZ.LJIILLIIL(new C1683130ttv(f21, f21, f15, f15), 90.0f, -90.0f);
                                    c1695950uEbLIZ.close();
                                }
                                return new C1680800tqA(c1695950uEbLIZ);
                            }

                            {
                                this.LIZ = f2;
                                this.LIZIZ = f2;
                                this.LIZJ = f2;
                                this.LIZLLL = f2;
                                this.LJ = f3;
                            }
                        };
                    } else {
                        interfaceC1680710tq1LIZIZ = C1669050tXD.LIZIZ(8);
                    }
                    LIZLLL(context, str, c1684110tvV, C1687990u1l.LIZIZ(C1667200tUE.LIZ(interfaceC1685750ty9LJIIJJI, interfaceC1680710tq1LIZIZ), C1668040tVa.LJIILJJIL), c13zcLJIIJ, (i3 & 14) | (i3 & 112), 0);
                    c13zcLJIIJ.LJJIIJZLJL(-1846445422);
                    int i12 = 0;
                    for (Object obj : abstractC19875512pd) {
                        int i13 = i12 + 1;
                        if (i12 >= 0) {
                            C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                            float f4 = 100;
                            SizeElement sizeElement = new SizeElement(f4, 0.0f, f4, 0.0f, false, C1684360tvu.LIZ, 10);
                            c1685760tyA2.getClass();
                            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(sizeElement, null, 3);
                            InterfaceC1668050tVb.LIZ.getClass();
                            LIZ((C1684090tvT) obj, function02, C1682520tsw.LJIIL(C1687990u1l.LIZIZ(interfaceC1685750ty9LJIJI, C1668040tVa.LJIILJJIL), 0.0f, 4, 0.0f, 0.0f, 13), c13zcLJIIJ, (i3 >> 12) & 112, 0);
                            c13zcLJIIJ.LJJIIJZLJL(-1846431703);
                            if (i12 != abstractC19875512pd.size() - 1) {
                                LIZJ(f4, c13zcLJIIJ, 6);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            i12 = i13;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJIIJZLJL(1162658192);
                    if (z4) {
                        C1685760tyA c1685760tyA3 = InterfaceC1685750ty9.LIZ;
                        InterfaceC1668050tVb.LIZ.getClass();
                        z3 = true;
                        LIZIZ(function02, abstractC19875512pd, c1672220tcK.LIZIZ(c1685760tyA3, C1668040tVa.LIZLLL), c13zcLJIIJ, ((i3 >> 15) & 14) | ((i3 >> 3) & 112), 0);
                    } else {
                        z3 = true;
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(z3);
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
            c20030013YsLJJJJZI.LIZLLL = new C1684050tvP(context, str, abstractC19875512pd, z, z4, function02, i, i2);
        }
    }
}

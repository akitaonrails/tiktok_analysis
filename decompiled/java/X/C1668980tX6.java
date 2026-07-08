package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS131S0400000_2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS2S0600001_25;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668980tX6 {
    public static final boolean LIZIZ(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final void LIZ(final int i, final C1690050u55 c1690050u55, Function1<? super Integer, String> function1, float f, float f2, float f3, InterfaceC1685750ty9 interfaceC1685750ty9, float f4, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f5;
        boolean z;
        int i13;
        InterfaceC497601wk interfaceC497601wk;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        InterfaceC1690500u5o interfaceC1690500u5o;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        boolean z6;
        boolean z7;
        boolean z8;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        float f6 = f4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-135217138);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
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
            if (c13zcLJIIJ.LJJIIJ(c1690050u55)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        final float f7 = f2;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJ(f7)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i14 = i3 & 64;
        if (i14 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i15 = i3 & 128;
        if (i15 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i2) == 0) {
            if (c13zcLJIIJ.LJIJ(f6)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i16 = 100663296;
        if ((i3 & 256) == 0) {
            if ((100663296 & i2) == 0) {
                if (c13zcLJIIJ.LJII(function2)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i4 |= i16;
            }
        } else {
            i4 |= i16;
        }
        if ((38347923 & i4) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i14 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i15 != 0) {
                f6 = 0;
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            InterfaceC1690500u5o interfaceC1690500u5o2 = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            EnumC1671200tag enumC1671200tag = (EnumC1671200tag) c13zcLJIIJ.LJJIL(C20055113dV.LJIILIIL);
            interfaceC1690500u5o2.LJJJJLL(f3);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(new C0ZDN(context));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            final float fMax = Math.max(32.0f, (8.0f * f) / 27.0f);
            C1668650tWZ c1668650tWZ = new C1668650tWZ(f3 - f6);
            C1668650tWZ c1668650tWZ2 = new C1668650tWZ(fMax);
            if (c1668650tWZ.compareTo(c1668650tWZ2) < 0) {
                c1668650tWZ = c1668650tWZ2;
            }
            final float f8 = c1668650tWZ.LL;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            final C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            long jD2 = C1670400tZO.LIZIZ(c13zcLJIIJ).D2();
            long jE2 = C1670400tZO.LIZIZ(c13zcLJIIJ).E2();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJ(new C1418205gq(jE2, jD2, c05p02));
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P1 c05p1 = (C05P1) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            float f9 = 3;
            float f10 = 6;
            if (LIZIZ(c05p02)) {
                f9 = f10;
            }
            C05P1 c05p1LIZ = C1675660ths.LIZ(f9, null, "", null, c13zcLJIIJ, 384, 10);
            float f11 = fMax * 2.4f;
            float f12 = 2.6f * fMax;
            if (!LIZIZ(c05p02)) {
                f12 = f11;
            }
            C05P1 c05p1LIZ2 = C1675660ths.LIZ(f12, null, "", null, c13zcLJIIJ, 384, 10);
            float f13 = 4;
            float f14 = 9;
            float f15 = 56;
            if (LIZIZ(c05p02)) {
                f14 = f15;
            }
            C05P1 c05p1LIZ3 = C1675660ths.LIZ(f14, null, "", null, c13zcLJIIJ, 384, 10);
            float f16 = ((C1668650tWZ) c05p1LIZ2.getValue()).LL + ((C1668650tWZ) c05p1LIZ3.getValue()).LL + ((C1668650tWZ) c05p1LIZ.getValue()).LL;
            C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJIJI;
            C1693430uAX c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJ(new AwS246S0300000_2(c1693430uAX2, c1693430uAX, (C1693430uAX) c05p02, (C05P0<Boolean>) 12));
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05P1 c05p12 = (C05P1) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C20028913Yh.LJ(new AwS546S0100000_2(c05p02, (C05P0<InterfaceC1692950u9l>) 812));
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            C05P1 c05p13 = (C05P1) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            long jV2 = C1670400tZO.LIZIZ(c13zcLJIIJ).v2();
            long jB2 = C1670400tZO.LIZIZ(c13zcLJIIJ).B2();
            float f18 = 8;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = C20028913Yh.LJI(Float.valueOf(0.0f));
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            final C05P0 c05p03 = (C05P0) objLJJ6;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (objLJJ7 == c1680520tpi) {
                objLJJ7 = C20028913Yh.LJI(Float.valueOf(0.0f));
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            final C05P0 c05p04 = (C05P0) objLJJ7;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (objLJJ8 == c1680520tpi) {
                objLJJ8 = C20028913Yh.LJI("");
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            C05P0 c05p05 = (C05P0) objLJJ8;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (objLJJ9 == c1680520tpi) {
                objLJJ9 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            final C05P0 c05p06 = (C05P0) objLJJ9;
            c13zcLJIIJ.LJJJJL(false);
            if (((Boolean) c05p06.getValue()).booleanValue()) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            C05P1 c05p1LIZIZ = C1675660ths.LIZIZ(f5, C1671550tbF.LIZLLL(200, 0, null, 6), 0.0f, "", null, c13zcLJIIJ, 3120, 20);
            Object objLJJ10 = c13zcLJIIJ.LJJ();
            if (objLJJ10 == c1680520tpi) {
                objLJJ10 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ10);
            }
            InterfaceC497601wk interfaceC497601wk2 = (InterfaceC497601wk) objLJJ10;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ11 = c13zcLJIIJ.LJJ();
            if (objLJJ11 == c1680520tpi) {
                objLJJ11 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ11);
            }
            final C05P0 c05p07 = (C05P0) objLJJ11;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            int i17 = i4 & 112;
            if (i17 == 32) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII = z | c13zcLJIIJ.LJII(interfaceC497601wk2) | c13zcLJIIJ.LJJIIJ(c05p1LIZIZ);
            Object objLJJ12 = c13zcLJIIJ.LJJ();
            if (!zLJII && objLJJ12 != c1680520tpi) {
                i13 = -1224400529;
                interfaceC497601wk = interfaceC497601wk2;
            } else {
                i13 = -1224400529;
                interfaceC497601wk = interfaceC497601wk2;
                objLJJ12 = new C05PB(c1690050u55, interfaceC497601wk2, c05p07, c05p06, c05p1LIZIZ, c05p02, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ12);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c1690050u55, (Function2) objLJJ12, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(i13);
            if (i17 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o2) | z2;
            int i18 = i4 & 57344;
            if (i18 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = zLJJIIJ | z3;
            int i19 = i4 & 14;
            if (i19 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = z9 | z4;
            if ((i4 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z10 | z5;
            Object objLJJ13 = c13zcLJIIJ.LJJ();
            if (!z11 && objLJJ13 != c1680520tpi) {
                interfaceC1690500u5o = interfaceC1690500u5o2;
            } else {
                interfaceC1690500u5o = interfaceC1690500u5o2;
                objLJJ13 = new C05UA(c1690050u55, interfaceC1690500u5o2, i, function1, f7, c05p06, c05p05, c05p03, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ13);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c1690050u55, (Function2) objLJJ13, c13zcLJIIJ);
            float fFloatValue = (f8 - fMax) * ((Number) C1675660ths.LIZIZ(((Number) c05p03.getValue()).floatValue(), null, 0.0f, "", null, c13zcLJIIJ, 3072, 22).getValue()).floatValue();
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
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
                function2.invoke(c13zcLJIIJ, Integer.valueOf((i4 >> 24) & 14));
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1679660toK.LIZIZ(C1682520tsw.LJIIL(C1688600u2k.LIZLLL(c1672220tcK.LIZIZ(c.LJIILLIIL(c.LJI(c1685760tyA, fMax), f16), C1668040tVa.LIZLLL), 0.0f, fFloatValue, 1), 0.0f, 0.0f, f18, 0.0f, 11), 0.0f, 0.0f, ((Number) c05p1LIZIZ.getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 0, 131067);
                c13zcLJIIJ.LJJIIJZLJL(1191691076);
                if (((Number) c05p1LIZIZ.getValue()).floatValue() > 0.0f) {
                    C1668650tWZ c1668650tWZ3 = new C1668650tWZ(f8);
                    c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                    boolean zLJII2 = c13zcLJIIJ.LJII(interfaceC497601wk) | c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o) | c13zcLJIIJ.LJIJ(f8) | c13zcLJIIJ.LJIJ(fMax);
                    if (i17 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z12 = zLJII2 | z6;
                    if (i18 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z13 = z12 | z7;
                    if (i19 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z14 = z13 | z8;
                    Object objLJJ14 = c13zcLJIIJ.LJJ();
                    if (z14 || objLJJ14 == c1680520tpi) {
                        final InterfaceC497601wk interfaceC497601wk3 = interfaceC497601wk;
                        final InterfaceC1690500u5o interfaceC1690500u5o3 = interfaceC1690500u5o;
                        f7 = f7;
                        objLJJ14 = new PointerInputEventHandler() { // from class: X.05Tt
                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                C05BU c05bu = new C05BU(interfaceC497601wk3, c05p0, c05p03, c05p04, c05p07, c05p02, c05p06);
                                Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C1369705Xr(null, new AwS131S0400000_2(interfaceC497601wk3, (InterfaceC497601wk) c05p07, (C05P0<C09AE>) c05p02, c05p06, (C05P0<Boolean>) 1), AFwS187S0000000_2.get$arr$(995), c05bu, new C1359805Tw(interfaceC1690500u5o3, c1690050u55, i, interfaceC497601wk3, f8, fMax, c05p04, f7)), interfaceC1364105Vn);
                                if (objLIZIZ != C099R.LJFF()) {
                                    objLIZIZ = Unit.LIZ;
                                }
                                if (objLIZIZ == C099R.LJFF()) {
                                    return objLIZIZ;
                                }
                                return Unit.LIZ;
                            }
                        };
                        c13zcLJIIJ.LJJIJIIJI(objLJJ14);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    interfaceC1685750ty9LIZ = C1679720toQ.LIZ(c1685760tyA, c1668650tWZ3, (PointerInputEventHandler) objLJJ14);
                } else {
                    interfaceC1685750ty9LIZ = c1685760tyA;
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = interfaceC1685750ty9LIZIZ.LIZ(interfaceC1685750ty9LIZ);
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o) | c13zcLJIIJ.LJIJI(enumC1671200tag.ordinal()) | c13zcLJIIJ.LJJIIJ(c05p1LIZ2) | c13zcLJIIJ.LJJIIJ(c05p1LIZ3) | c13zcLJIIJ.LJJIIJ(c05p1LIZ) | c13zcLJIIJ.LJIJ(fMax);
                Object objLJJ15 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ2 || objLJJ15 == c1680520tpi) {
                    objLJJ15 = new AwS2S0600001_25(interfaceC1690500u5o, (InterfaceC1690500u5o) fMax, (float) c05p1, (C05P1<C1685910tyP>) enumC1671200tag, (EnumC1671200tag) c05p1LIZ2, (C05P1<C1668650tWZ>) c05p1LIZ3, (C05P1<C1668650tWZ>) c05p1LIZ, (C05P1<C1668650tWZ>) 0);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ15);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C1680910tqL.LIZJ(interfaceC1685750ty9LIZ2, (Function1) objLJJ15);
                InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
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
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ16 = c13zcLJIIJ.LJJ();
                    if (objLJJ16 == c1680520tpi) {
                        objLJJ16 = C1696870uG5.LIZ(0);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ16);
                    }
                    InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ16;
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c.LIZIZ(c.LJIILLIIL(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJ), ((C1668650tWZ) c05p1LIZ2.getValue()).LL + ((C1668650tWZ) c05p1LIZ3.getValue()).LL), ((Number) c05p13.getValue()).floatValue());
                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                    Object objLJJ17 = c13zcLJIIJ.LJJ();
                    if (objLJJ17 == c1680520tpi) {
                        objLJJ17 = new AwS581S0100000_2(interfaceC1676320tiw, 303);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ17);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(C1685330txT.LIZ(interfaceC1685750ty9LIZIZ2, (Function1) objLJJ17), 0.0f, 0.0f, ((C1668650tWZ) c05p1LIZ3.getValue()).LL, 0.0f, 11);
                    final float fLIZLLL = interfaceC1676320tiw.LIZLLL() / 2.0f;
                    InterfaceC1160240gIY interfaceC1160240gIY = new InterfaceC1160240gIY(fLIZLLL) { // from class: X.0gIV
                        public final float LIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1160210gIV) && Float.compare(this.LIZ, ((C1160210gIV) obj).LIZ) == 0;
                        }

                        public final int hashCode() {
                            return Float.floatToIntBits(this.LIZ);
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("CornerSize(size = ");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(".px)");
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = fLIZLLL;
                        }

                        @Override // X.InterfaceC1160240gIY
                        public final float LIZ(long j, InterfaceC1690500u5o interfaceC1690500u5o4) {
                            return this.LIZ;
                        }
                    };
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ3 = C1675980tiO.LIZIZ(interfaceC1685750ty9LJIIL, jB2, new C1669400tXm(interfaceC1160240gIY, interfaceC1160240gIY, interfaceC1160240gIY, interfaceC1160240gIY));
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL3 = k.LIZLLL(C1668040tVa.LJFF, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ3);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL3, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        C1685190txF.LIZ((String) c05p05.getValue(), C1682520tsw.LJIIJ(c1685760tyA, f13, 0.0f, 2), jV2, (C1693430uAX) c05p12.getValue(), C1682430tsn.LJ(6), 0, 0, false, 1, null, null, c13zcLJIIJ, 100687920, 0, 1760);
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
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1668990tX7(i, c1690050u55, function1, f, f7, f3, interfaceC1685750ty92, f6, function2, i2, i3);
        }
    }
}

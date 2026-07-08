package X;

import Y.AObjectS0S0422000_25;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.gestures.AnchoredDraggableElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673100tdk {
    public static final float LIZ = 125;

    public static final void LIZIZ(boolean z, Function1<? super Boolean, Unit> function1, InterfaceC1685750ty9 interfaceC1685750ty9, C1673110tdl c1673110tdl, boolean z2, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        boolean z3 = z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C1673110tdl c1673110tdl2 = c1673110tdl;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2140036600);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            if (c13zcLJIIJ.LJII(function1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1673110tdl2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC595010NVj2)) {
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
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                c1673110tdl2 = C1673110tdl.LJ;
            }
            if (i12 != 0) {
                z3 = true;
            }
            if (i13 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = new C612270Nzt();
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                interfaceC595010NVj2 = (InterfaceC595010NVj) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            LIZJ(z, function1, interfaceC1685750ty92, c1673110tdl2, z3, interfaceC595010NVj2, false, C1670400tZO.LIZIZ(c13zcLJIIJ).a3(), c13zcLJIIJ, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS0S0422000_25(z, function1, interfaceC1685750ty92, z3, c1673110tdl2, interfaceC595010NVj2, i, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    public static final void LIZ(final InterfaceC1665870tS5 interfaceC1665870tS5, final boolean z, final boolean z2, final C1673110tdl c1673110tdl, final Function0<Float> function0, final C0NV4 c0nv4, final boolean z3, final long j, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        boolean z4;
        float f;
        long jT2;
        int i3;
        C1685380txY c1685380txYLIZ;
        C05P1 c05p1LIZ;
        boolean z5;
        ?? r0;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-239252401);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665870tS5)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1673110tdl)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c0nv4)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((i2 & 4793491) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            Object obj = C1680510tph.LIZIZ;
            if (objLJJ == obj) {
                objLJJ = new C13ES();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C13ES c13es = (C13ES) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean z6 = true;
            if ((458752 & i2) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z4 || objLJJ2 == obj) {
                objLJJ2 = new C0NW4(c0nv4, c13es, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c0nv4, (Function2) objLJJ2, c13zcLJIIJ);
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            boolean z7 = !c13es.isEmpty();
            if (z) {
                c13zcLJIIJ.LJJIIJZLJL(2078550907);
                if (z7) {
                    jT2 = C1673460teK.LIZ(j, c13zcLJIIJ);
                } else {
                    jT2 = j;
                }
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(2078708170);
                c13zcLJIIJ.LJJIIJZLJL(2006718132);
                if (z7) {
                    C1673460teK.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).T2(), c13zcLJIIJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                jT2 = C1670400tZO.LIZIZ(c13zcLJIIJ).T2();
                c13zcLJIIJ.LJJJJL(false);
            }
            final C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(new C1685910tyP(jT2), c13zcLJIIJ);
            final InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            c13zcLJIIJ.LJJIIJZLJL(1805614494);
            if (Intrinsics.LJFF(c1673110tdl, C1673110tdl.LJFF)) {
                c13zcLJIIJ.LJJIIJZLJL(28745846);
                i3 = C1670400tZO.LIZLLL(c13zcLJIIJ).LJIILLIIL;
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(28747704);
                i3 = C1670400tZO.LIZLLL(c13zcLJIIJ).LJIIZILJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(context) | c13zcLJIIJ.LJIJI(i3);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ3 == obj) {
                objLJJ3 = C800330VaR.LIZIZ(context, i3);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            final AbstractC1676270tir abstractC1676270tirLIZIZ = C1668830tWr.LIZIZ((Drawable) objLJJ3, c13zcLJIIJ);
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(2006727110);
            if (z3) {
                c1685380txYLIZ = C1668870tWv.LIZ(C1670400tZO.LIZLLL(c13zcLJIIJ).LJIILIIL, C1670400tZO.LIZIZ(c13zcLJIIJ).w2(), 0.0f, 0.0f, false, c13zcLJIIJ, 0, 28);
            } else {
                c1685380txYLIZ = null;
            }
            c13zcLJIIJ.LJJJJL(false);
            if (z3) {
                c13zcLJIIJ.LJJIIJZLJL(2079251569);
                c05p1LIZ = C1675690thv.LIZ(C1675690thv.LIZJ(0, c13zcLJIIJ, ""), 0.0f, 360.0f, C1671550tbF.LIZ(C1671550tbF.LIZLLL(LSPassThroughRecordSizeConfig.DEFAULT, 0, C05Y0.LIZLLL, 2), C0N66.Restart, 0L, 4), "", c13zcLJIIJ, 29112, 0);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(2079691087);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (objLJJ4 == obj) {
                    objLJJ4 = C1691250u71.LIZ(0.0f);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c05p1LIZ = (C05P1) objLJJ4;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(false);
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(c.LIZLLL(interfaceC1665870tS5.LIZIZ(c1685760tyA, C1668040tVa.LJFF)), f);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ);
            if ((i2 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zLJII = zLJJIIJ2 | z5 | c13zcLJIIJ.LJII(abstractC1676270tirLIZIZ) | c13zcLJIIJ.LJII(c1685380txYLIZ) | c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o) | c13zcLJIIJ.LJJIIJ(c05p1LIZ);
            if ((i2 & 57344) != 16384) {
                z6 = false;
            }
            boolean z8 = zLJII | z6;
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (!z8 && objLJJ5 != obj) {
                r0 = 0;
            } else {
                r0 = 0;
                final C1685380txY c1685380txY = c1685380txYLIZ;
                final C05P1 c05p1 = c05p1LIZ;
                objLJJ5 = new Function1() { // from class: X.0ti7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) throws Throwable {
                        C1673110tdl c1673110tdl2 = c1673110tdl;
                        AbstractC1676270tir abstractC1676270tir = abstractC1676270tirLIZIZ;
                        AbstractC1676270tir abstractC1676270tir2 = c1685380txY;
                        InterfaceC1690500u5o interfaceC1690500u5o2 = interfaceC1690500u5o;
                        C05P1 c05p12 = c05p1;
                        Function0 function02 = function0;
                        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj2;
                        long j2 = ((C1685910tyP) c05p0LJIIIIZZ.getValue()).LIZ;
                        float fLJJJJLL = interfaceC1675870tiD.LJJJJLL(c1673110tdl2.LIZ);
                        float fLJJJJLL2 = interfaceC1675870tiD.LJJJJLL(c1673110tdl2.LIZIZ);
                        float f2 = 2;
                        float f3 = fLJJJJLL2 / f2;
                        C1675860tiC.LJI(interfaceC1675870tiD, j2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LJIJI() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LJIJI() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fLJJJJLL - f3) << 32), fLJJJJLL2, 1, 480);
                        float density = c1673110tdl2.LIZJ * interfaceC1690500u5o2.getDensity();
                        float fLJJJJLL3 = interfaceC1675870tiD.LJJJJLL(c1673110tdl2.LIZLLL);
                        float fFloatValue = ((Number) c05p12.getValue()).floatValue();
                        float fFloatValue2 = ((Number) function02.invoke()).floatValue();
                        float density2 = ((c1673110tdl2.LIZIZ - c1673110tdl2.LIZJ) * interfaceC1690500u5o2.getDensity()) / 2.0f;
                        float fLJJJJLL4 = interfaceC1675870tiD.LJJJJLL(C1673110tdl.LJI);
                        float f4 = fFloatValue2 - fLJJJJLL4;
                        float f5 = density2 - fLJJJJLL4;
                        interfaceC1675870tiD.LJLJI().LIZ.LJII(f4, f5);
                        try {
                            interfaceC1675870tiD.LJLJI().LIZ();
                            if (abstractC1676270tir != null) {
                                float f6 = (f2 * fLJJJJLL4) + density;
                                abstractC1676270tir.LJI(interfaceC1675870tiD, (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), 1.0f, null);
                            }
                            if (abstractC1676270tir2 != null) {
                                interfaceC1675870tiD.LJLJI().LIZ.LJII(fLJJJJLL3, fLJJJJLL3);
                                float f7 = (density + (fLJJJJLL4 * f2)) - (f2 * fLJJJJLL3);
                                float f8 = f7 / 2.0f;
                                try {
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
                                    C1695230uDR c1695230uDRLJLJI = interfaceC1675870tiD.LJLJI();
                                    long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
                                    c1695230uDRLJLJI.LIZ().save();
                                    try {
                                        c1695230uDRLJLJI.LIZ.LJFF(fFloatValue, jFloatToRawIntBits);
                                        interfaceC1675870tiD.LJLJI().LIZ();
                                        abstractC1676270tir2.LJI(interfaceC1675870tiD, (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), 1.0f, null);
                                        c1695230uDRLJLJI.LIZ().LJIIJ();
                                        c1695230uDRLJLJI.LIZJ(jLIZIZ);
                                        float f9 = -fLJJJJLL3;
                                        interfaceC1675870tiD.LJLJI().LIZ.LJII(f9, f9);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c1695230uDRLJLJI.LIZ().LJIIJ();
                                        c1695230uDRLJLJI.LIZJ(jLIZIZ);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    float f10 = -fLJJJJLL3;
                                    interfaceC1675870tiD.LJLJI().LIZ.LJII(f10, f10);
                                    throw th2;
                                }
                            }
                            interfaceC1675870tiD.LJLJI().LIZ.LJII(-f4, -f5);
                            return Unit.LIZ;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    interfaceC1675870tiD.LJLJI().LIZ.LJII(-f4, -f5);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(r0);
            C1668170tVn.LIZ(interfaceC1685750ty9LIZ, (Function1) objLJJ5, c13zcLJIIJ, r0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0OqU
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    InterfaceC1665870tS5 interfaceC1665870tS52 = interfaceC1665870tS5;
                    boolean z9 = z;
                    boolean z10 = z2;
                    C1673110tdl c1673110tdl2 = c1673110tdl;
                    Function0 function02 = function0;
                    C0NV4 c0nv42 = c0nv4;
                    boolean z11 = z3;
                    long j2 = j;
                    int i12 = i;
                    ((Integer) obj3).intValue();
                    C1673100tdk.LIZ(interfaceC1665870tS52, z9, z10, c1673110tdl2, function02, c0nv42, z11, j2, (InterfaceC1680500tpg) obj2, C341440Da2.LIZ(i12 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LIZJ(final boolean z, final Function1<? super Boolean, Unit> function1, InterfaceC1685750ty9 interfaceC1685750ty9, C1673110tdl c1673110tdl, boolean z2, InterfaceC595010NVj interfaceC595010NVj, boolean z3, long j, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object objLJ;
        boolean z4;
        boolean z5;
        boolean z6;
        final boolean z7;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        boolean z8;
        int i11;
        C1673110tdl c1673110tdl2 = c1673110tdl;
        boolean z9 = z3;
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        long jA3 = j;
        boolean z10 = z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(883838053);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            if (c13zcLJIIJ.LJII(function1)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            if (c13zcLJIIJ.LJJIIJ(c1673110tdl2)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z10)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i15 = i2 & 32;
        if (i15 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC595010NVj2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i16 = i2 & 64;
        if (i16 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z9)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0 && c13zcLJIIJ.LJIJJ(jA3)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i3 & 4793491) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 128) != 0) {
                    i3 &= -29360129;
                }
            } else {
                if (i12 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i13 != 0) {
                    c1673110tdl2 = C1673110tdl.LJ;
                }
                if (i14 != 0) {
                    z10 = true;
                }
                if (i15 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = new C612270Nzt();
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    interfaceC595010NVj2 = (InterfaceC595010NVj) objLJJ;
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (i16 != 0) {
                    z9 = false;
                }
                if ((i2 & 128) != 0) {
                    jA3 = C1670400tZO.LIZIZ(c13zcLJIIJ).a3();
                    i3 &= -29360129;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            C13DR c13dr = C20055113dV.LJII;
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr);
            float f = C1673110tdl.LJI;
            final float fLJJJJLL = interfaceC1690500u5o.LJJJJLL(f);
            final float fLJJJJLL2 = ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr)).LJJJJLL((c1673110tdl2.LIZ - c1673110tdl2.LIZJ) - f);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            float fLJJJJLL3 = ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(c13dr)).LJJJJLL(LIZ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJIJ = c13zcLJIIJ.LJIJ(fLJJJJLL2) | c13zcLJIIJ.LJIJ(fLJJJJLL3);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            Object obj = objLJJ3;
            if (zLJIJ || objLJJ3 == c1680520tpi) {
                C594920NVa c594920NVa = new C594920NVa(Boolean.valueOf(z));
                C1673090tdj c1673090tdj = new C1673090tdj();
                c1673090tdj.LIZ(fLJJJJLL, Boolean.FALSE);
                c1673090tdj.LIZ(fLJJJJLL2, Boolean.TRUE);
                List<T> list = c1673090tdj.LIZ;
                float[] fArr = c1673090tdj.LIZIZ;
                int size = ((ArrayList) list).size();
                C1691430u7J.LIZ(size, fArr.length);
                C594950NVd c594950NVd = new C594950NVd(list, Arrays.copyOfRange(fArr, 0, size));
                if (Float.isNaN(c594920NVa.LIZLLL()) || (objLJ = c594950NVd.LIZ(c594920NVa.LIZLLL())) == null) {
                    objLJ = c594920NVa.LJ();
                }
                c594920NVa.LJIIJ(c594950NVd, objLJ);
                c13zcLJIIJ.LJJIJIIJI(c594920NVa);
                obj = c594920NVa;
            }
            final C594920NVa c594920NVa2 = (C594920NVa) obj;
            c13zcLJIIJ.LJJJJL(false);
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function1, c13zcLJIIJ);
            int i17 = i3 & 14;
            C05P0 c05p0LJIIIIZZ2 = C20028913Yh.LJIIIIZZ(Boolean.valueOf(z), c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c594920NVa2) | c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ2) | c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ4 == c1680520tpi) {
                objLJJ4 = new C05PC(c594920NVa2, c05p0LJIIIIZZ2, c05p0LJIIIIZZ, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c594920NVa2, (Function2) objLJJ4, c13zcLJIIJ);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) c05p0.getValue()).booleanValue());
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if (i17 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zLJJIIJ2 = z4 | c13zcLJIIJ.LJJIIJ(c594920NVa2);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C05PD(z, c594920NVa2, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJ(boolValueOf, boolValueOf2, (Function2) objLJJ5, c13zcLJIIJ);
            Boolean boolValueOf3 = Boolean.valueOf(z);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJJIIJ3 = c13zcLJIIJ.LJJIIJ(c594920NVa2);
            int i18 = 458752 & i3;
            if (i18 == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = zLJJIIJ3 | z5;
            if (i17 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (z12 || objLJJ6 == c1680520tpi) {
                objLJJ6 = new C0NV3(interfaceC595010NVj2, c594920NVa2, z, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJ(boolValueOf3, interfaceC595010NVj2, (Function2) objLJJ6, c13zcLJIIJ);
            if (c13zcLJIIJ.LJJIL(C20055113dV.LJIILIIL) == EnumC1671200tag.Rtl) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (function1 != null) {
                interfaceC1685750ty9LIZ = C634760Ov4.LIZ(InterfaceC1685750ty9.LIZ, z, interfaceC595010NVj2, null, z10, new C20279814Wu(2), function1);
            } else {
                interfaceC1685750ty9LIZ = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = interfaceC1685750ty92.LIZ(interfaceC1685750ty9LIZ);
            EnumC1684030tvN enumC1684030tvN = EnumC1684030tvN.Horizontal;
            if (z10 && function1 != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ3 = interfaceC1685750ty9LIZ2.LIZ(new AnchoredDraggableElement(c594920NVa2, enumC1684030tvN, z8, Boolean.valueOf(z7), interfaceC595010NVj2, null, null));
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJJI = c.LJIIJJI(c.LJIJJ(interfaceC1685750ty9LIZ3, C1668040tVa.LJFF, 2), c1673110tdl2.LIZ, c1673110tdl2.LIZIZ);
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJJI);
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
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                boolean zBooleanValue = ((Boolean) c594920NVa2.LJ()).booleanValue();
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJIIZILJ = c13zcLJIIJ.LJIIZILJ(z7) | c13zcLJIIJ.LJIJ(fLJJJJLL) | c13zcLJIIJ.LJIJ(fLJJJJLL2) | c13zcLJIIJ.LJJIIJ(c594920NVa2);
                Object objLJJ7 = c13zcLJIIJ.LJJ();
                if (zLJIIZILJ || objLJJ7 == c1680520tpi) {
                    objLJJ7 = new Function0() { // from class: X.0tdm
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z13 = z7;
                            float f2 = fLJJJJLL;
                            float f3 = fLJJJJLL2;
                            C594920NVa c594920NVa3 = c594920NVa2;
                            return Float.valueOf(z13 ? (f2 + f3) - c594920NVa3.LJII() : c594920NVa3.LJII());
                        }
                    };
                    c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                }
                c13zcLJIIJ.LJJJJL(false);
                LIZ(c1672220tcK, zBooleanValue, z10, c1673110tdl2, (Function0) objLJJ7, interfaceC595010NVj2, z9, jA3, c13zcLJIIJ, ((i3 >> 6) & 896) | 6 | (i3 & 7168) | i18 | (3670016 & i3) | (29360128 & i3));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final C1673110tdl c1673110tdl3 = c1673110tdl2;
            final boolean z13 = z10;
            final InterfaceC595010NVj interfaceC595010NVj3 = interfaceC595010NVj2;
            final boolean z14 = z9;
            final long j2 = jA3;
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0OqT
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z15 = z;
                    Function1 function12 = function1;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    C1673110tdl c1673110tdl4 = c1673110tdl3;
                    boolean z16 = z13;
                    InterfaceC595010NVj interfaceC595010NVj4 = interfaceC595010NVj3;
                    boolean z17 = z14;
                    long j3 = j2;
                    int i19 = i;
                    int i20 = i2;
                    ((Integer) obj3).intValue();
                    C1673100tdk.LIZJ(z15, function12, interfaceC1685750ty94, c1673110tdl4, z16, interfaceC595010NVj4, z17, j3, (InterfaceC1680500tpg) obj2, C341440Da2.LIZ(i19 | 1), i20);
                    return Unit.LIZ;
                }
            };
        }
    }
}

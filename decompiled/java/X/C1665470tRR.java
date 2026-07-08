package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS5S0311000_25;
import kotlin.jvm.internal.AwS6S0302000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665470tRR {
    public static final void LIZ(C1661820tLY c1661820tLY, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super Boolean, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        Float fValueOf;
        Float fValueOf2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-627932585);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1661820tLY)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
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
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(Boolean.valueOf(c1661820tLY.LJI), c13zcLJIIJ);
            if (c13zcLJIIJ.LJJIL(C20055113dV.LJIILIIL) == EnumC1671200tag.Rtl) {
                z = true;
            } else {
                z = false;
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                C12P5 c12p5 = new C12P5();
                c12p5.LIZJ = -16777216;
                if (z) {
                    fValueOf = Float.valueOf(0.5f);
                } else {
                    fValueOf = Float.valueOf(0.0f);
                }
                c12p5.LJ = fValueOf;
                if (z) {
                    fValueOf2 = Float.valueOf(0.0f);
                } else {
                    fValueOf2 = Float.valueOf(0.5f);
                }
                c12p5.LJFF = fValueOf2;
                c12p5.LJI = C12KQ.HORIZONTAL;
                c12p5.LJII = EnumC197015126j.EASE_IN_OUT;
                objLJJ = c12p5.LIZ(context);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C12P3 c12p3 = (C12P3) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c.LIZIZ(c.LJIJJLI(c1685760tyA, C1668040tVa.LJIILJJIL, false), 1.0f);
            if (c1661820tLY.LIZ) {
                interfaceC1685750ty9LIZ = c1685760tyA;
            } else {
                interfaceC1685750ty9LIZ = C1665900tS8.LIZ(c1685760tyA, 0.0f);
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = interfaceC1685750ty9LIZIZ.LIZ(interfaceC1685750ty9LIZ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ) | c13zcLJIIJ.LJII(c12p3);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS391S0200000_25(c05p0LJIIIIZZ, c12p3, 34);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ3 = C1680910tqL.LIZ(interfaceC1685750ty9LIZ2, (Function1) objLJJ2).LIZ(interfaceC1685750ty92);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZJ, false);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ = c.LJIJJ(c1685760tyA, null, 3);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILL, c13zcLJIIJ, 54);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJJ);
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
                    LJ(C1687430u0r.LIZ(c1661820tLY.LIZIZ), C1679030tnJ.LIZIZ(c1685760tyA, "topFixedSection"), c1661820tLY.LIZLLL, c1661820tLY.LIZ, c13zcLJIIJ, 48);
                    LIZLLL(C1687430u0r.LIZ(c1661820tLY.LIZJ), C1679030tnJ.LIZIZ(c1685760tyA, "scrollableSection"), c1661820tLY.LIZLLL, c1661820tLY.LJ, function1, c1661820tLY.LJI, c1661820tLY.LIZ, c13zcLJIIJ, ((i3 << 6) & 57344) | 48, 0);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0302000_25(c1661820tLY, (C1661820tLY) interfaceC1685750ty92, (InterfaceC1685750ty9) function1, (Function1<? super Boolean, Unit>) i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1661820tLY r21, X.InterfaceC1685750ty9 r22, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r23, X.InterfaceC1680500tpg r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665470tRR.LIZIZ(X.0tLY, X.0ty9, kotlin.jvm.functions.Function1, X.0tpg, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0ty9] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0ty9, X.0tyA] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0ty9] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0ty9] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.InterfaceC1665500tRU<X.C1661930tLj<X.AbstractC1678220tm0, X.InterfaceC1461640o8g<? extends X.AbstractC1678220tm0>>> r19, X.InterfaceC1685750ty9 r20, kotlin.jvm.functions.Function2<? super X.AbstractC1678220tm0, ? super X.InterfaceC1660090tIl, kotlin.Unit> r21, boolean r22, X.InterfaceC1680500tpg r23, int r24) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665470tRR.LIZJ(X.0tRU, X.0ty9, kotlin.jvm.functions.Function2, boolean, X.0tpg, int):void");
    }

    public static final void LJ(InterfaceC1665500tRU<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> interfaceC1665500tRU, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super AbstractC1678220tm0, ? super InterfaceC1660090tIl, Unit> function2, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-588155639);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LIZJ(interfaceC1665500tRU, interfaceC1685750ty9, function2, z, c13zcLJIIJ, (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS5S0311000_25((InterfaceC1665500tRU) interfaceC1665500tRU, (InterfaceC1665500tRU<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>) interfaceC1685750ty9, (InterfaceC1685750ty9) function2, (Function2<? super AbstractC1678220tm0, ? super InterfaceC1660090tIl, Unit>) z, (boolean) i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.InterfaceC1665500tRU<X.C1661930tLj<X.AbstractC1678220tm0, X.InterfaceC1461640o8g<? extends X.AbstractC1678220tm0>>> r25, X.InterfaceC1685750ty9 r26, kotlin.jvm.functions.Function2<? super X.AbstractC1678220tm0, ? super X.InterfaceC1660090tIl, kotlin.Unit> r27, int r28, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r29, boolean r30, boolean r31, X.InterfaceC1680500tpg r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665470tRR.LIZLLL(X.0tRU, X.0ty9, kotlin.jvm.functions.Function2, int, kotlin.jvm.functions.Function1, boolean, boolean, X.0tpg, int, int):void");
    }
}

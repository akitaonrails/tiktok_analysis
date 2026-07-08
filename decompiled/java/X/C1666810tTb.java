package X;

import X.C1676910tjt;
import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import h0.n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AFwS347S0000000_25;
import kotlin.jvm.internal.AwS0S0522000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS131S0101000_25;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS27S0202000_25;
import kotlin.jvm.internal.AwS2S0221000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import p2.j1;

/* JADX INFO: renamed from: X.0tTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666810tTb {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1139190889);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC20053113dB interfaceC20053113dB = new InterfaceC20053113dB() { // from class: X.0tci
                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZ(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZJ(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZIZ(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZLLL(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZJ(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZ(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZLLL(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZIZ(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<? extends InterfaceC1673370teB> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LJJJJZ(j));
                    }
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        int i5 = ((AbstractC1686530tzP) it3.next()).LL;
                        while (it3.hasNext()) {
                            int i6 = ((AbstractC1686530tzP) it3.next()).LL;
                            if (i5 < i6) {
                                i5 = i6;
                            }
                        }
                        int iLJ = C13LZ.LJ(i5, C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j));
                        Iterator it4 = arrayList.iterator();
                        int i7 = 0;
                        while (it4.hasNext()) {
                            i7 += ((AbstractC1686530tzP) it4.next()).LLILLJJLI;
                        }
                        return interfaceC1689940u4u.LJLJJL(iLJ, i7, C2097608Jq.LJ(), new AwS131S0101000_25(arrayList, (List<? extends AbstractC1686530tzP>) iLJ, 7));
                    }
                    throw new NoSuchElementException();
                }
            };
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dB, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                function2.invoke(c13zcLJIIJ, Integer.valueOf((i2 >> 3) & 14));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(interfaceC1685750ty9, (InterfaceC1685750ty9) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, 77);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
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
    public static final void LJ(X.C1661930tLj<X.InterfaceC1660190tIv, X.InterfaceC1461640o8g<? extends X.InterfaceC1660190tIv>> r16, boolean r17, kotlin.jvm.functions.Function2<? super X.InterfaceC1660190tIv, ? super X.InterfaceC1660090tIl, kotlin.Unit> r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666810tTb.LJ(X.0tLj, boolean, kotlin.jvm.functions.Function2, X.0tpg, int):void");
    }

    public static final void LJFF(boolean z, C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>> c1661930tLj, boolean z2, Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1957290644);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1661930tLj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            float f = 1.0f;
            if (C289570BWp.LIZ()) {
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                if (!c1661930tLj.LIZLLL.LIZIZ) {
                    f = 0.5f;
                }
                interfaceC1685750ty9LIZ = C1665900tS8.LIZ(c1685760tyA, f);
            } else {
                interfaceC1685750ty9LIZ = C1665900tS8.LIZ(InterfaceC1685750ty9.LIZ, 1.0f);
            }
            C1679910toj c1679910toj = C1679930tol.LIZIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679910toj, C1668040tVa.LJIIJJI, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                c13zcLJIIJ.LJJIIJZLJL(-1644042428);
                if (z) {
                    c1661930tLj.LIZJ.LIZ(InterfaceC1685750ty9.LIZ, c13zcLJIIJ, 6);
                }
                c13zcLJIIJ.LJJJJL(false);
                int i7 = i2 >> 3;
                LJ(c1661930tLj, z2, function2, c13zcLJIIJ, (i7 & 896) | (i7 & 14) | (i7 & 112));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0221000_25(z, (boolean) c1661930tLj, (C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>) z2, (boolean) function2, (Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit>) i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.C05P1<java.lang.Float> r28, X.C1666830tTd r29, boolean r30, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r31, boolean r32, X.InterfaceC1680500tpg r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666810tTb.LIZLLL(X.05P1, X.0tTd, boolean, kotlin.jvm.functions.Function1, boolean, X.0tpg, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, X.0tjs] */
    public static final void LIZIZ(InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU, InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU2, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1660190tIv, ? super InterfaceC1660090tIl, Unit> function2, Function1<? super Boolean, Unit> function1, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL;
        boolean z7 = z2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-268695864);
        final InterfaceC1665500tRU<C1661930tLj<InterfaceC1660190tIv, InterfaceC1461640o8g<? extends InterfaceC1660190tIv>>> interfaceC1665500tRU3 = interfaceC1665500tRU;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU3)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z7)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                z7 = true;
            }
            C259800zU c259800zU = new C259800zU();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C1676880tjq(Boolean.valueOf(z));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            ?? r8 = (AbstractC1676900tjs) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c259800zU.element = r8;
            C1676910tjt c1676910tjtLIZLLL = C1676860tjo.LIZLLL(r8, "", c13zcLJIIJ, 48);
            AFwS347S0000000_25 aFwS347S0000000_25 = AFwS347S0000000_25.get$arr$(14);
            C1677610tl1 c1677610tl1 = n2.LIZ;
            boolean zBooleanValue = ((Boolean) c1676910tjtLIZLLL.LIZJ()).booleanValue();
            c13zcLJIIJ.LJJIIJZLJL(272264775);
            float f2 = 1.0f;
            if (zBooleanValue) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            c13zcLJIIJ.LJJJJL(false);
            Float fValueOf = Float.valueOf(f);
            boolean zBooleanValue2 = ((Boolean) c1676910tjtLIZLLL.LJI()).booleanValue();
            c13zcLJIIJ.LJJIIJZLJL(272264775);
            if (!zBooleanValue2) {
                f2 = 0.0f;
            }
            c13zcLJIIJ.LJJJJL(false);
            final C1676910tjt.d dVarLIZJ = C1676860tjo.LIZJ(c1676910tjtLIZLLL, fValueOf, Float.valueOf(f2), (InterfaceC1675680thu) aFwS347S0000000_25.invoke(c1676910tjtLIZLLL.LJFF(), c13zcLJIIJ, 0), c1677610tl1, c13zcLJIIJ, 0);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            int i12 = i3 & 14;
            if (i12 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1666830tTd(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            final C1666830tTd c1666830tTd = (C1666830tTd) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            C1689390u41 c1689390u41LIZIZ = C1689370u3z.LIZIZ(c13zcLJIIJ);
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if (i12 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i3 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z4 | z5;
            if ((i3 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z6 | z8;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z9 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1663340tO0(interfaceC1665500tRU3, interfaceC1665500tRU2, function2, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ3, c13zcLJIIJ);
            C1680540tpk.LJFF(((AbstractC1676900tjs) c259800zU.element).LIZ(), new C1386105bf(c259800zU, c1689390u41LIZIZ, null), c13zcLJIIJ);
            C1680540tpk.LJFF(Boolean.valueOf(z), new C1386005be(null, c259800zU, z), c13zcLJIIJ);
            InterfaceC20053113dB interfaceC20053113dB = new InterfaceC20053113dB() { // from class: X.0tcg
                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZ(j1 j1Var, List list, int i13) {
                    return C1688390u2P.LIZJ(this, j1Var, list, i13);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZIZ(j1 j1Var, List list, int i13) {
                    return C1688390u2P.LIZLLL(this, j1Var, list, i13);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZJ(j1 j1Var, List list, int i13) {
                    return C1688390u2P.LIZ(this, j1Var, list, i13);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZLLL(j1 j1Var, List list, int i13) {
                    return C1688390u2P.LIZIZ(this, j1Var, list, i13);
                }

                @Override // X.InterfaceC20053113dB
                public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                    Iterator<? extends InterfaceC1673370teB> it2 = list.iterator();
                    while (it2.hasNext() && !Intrinsics.LJFF(C1679030tnJ.LIZ(it2.next()), "alwaysItemMeasureOnly")) {
                    }
                    for (InterfaceC1673370teB interfaceC1673370teB : list) {
                        if (Intrinsics.LJFF(C1679030tnJ.LIZ(interfaceC1673370teB), "scrollable")) {
                            for (InterfaceC1673370teB interfaceC1673370teB2 : list) {
                                if (Intrinsics.LJFF(C1679030tnJ.LIZ(interfaceC1673370teB2), "icon")) {
                                    int size = interfaceC1665500tRU3.size();
                                    C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
                                    int iLJLLJ = size * interfaceC1689940u4u.LJLLJ(52);
                                    AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB2.LJJJJZ(j);
                                    AbstractC1686530tzP abstractC1686530tzPLJJJJZ2 = interfaceC1673370teB.LJJJJZ(C1682380tsi.LIZ(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j) - abstractC1686530tzPLJJJJZ.LJJL()));
                                    C1666830tTd c1666830tTd2 = c1666830tTd;
                                    if (!c1666830tTd2.LIZJ) {
                                        c1666830tTd2.LIZ = iLJLLJ;
                                        c1666830tTd2.LIZIZ = abstractC1686530tzPLJJJJZ2.LLILLJJLI;
                                        c1666830tTd2.LIZJ = true;
                                    }
                                    int iMax = Math.max(abstractC1686530tzPLJJJJZ2.LL, abstractC1686530tzPLJJJJZ.LL);
                                    int iLIZJ = C1677720tlC.LIZJ(dVarLIZJ.getValue().floatValue(), c1666830tTd.LIZ, abstractC1686530tzPLJJJJZ2.LLILLJJLI);
                                    return interfaceC1689940u4u.LJLJJL(iMax, abstractC1686530tzPLJJJJZ.LLILLJJLI + iLIZJ, C2097608Jq.LJ(), new AwS27S0202000_25(abstractC1686530tzPLJJJJZ2, iMax, abstractC1686530tzPLJJJJZ, iLIZJ, 1));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dB, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1679030tnJ.LIZIZ(c1685760tyA, "scrollable");
                if (z7) {
                    interfaceC1685750ty9LIZLLL = C1689370u3z.LIZLLL(c1685760tyA, c1689390u41LIZIZ, ((Boolean) ((AbstractC1676900tjs) c259800zU.element).LIZ()).booleanValue(), 12);
                } else {
                    interfaceC1685750ty9LIZLLL = c1685760tyA;
                }
                interfaceC1665500tRU3 = interfaceC1665500tRU3;
                LIZ(interfaceC1685750ty9LIZIZ.LIZ(interfaceC1685750ty9LIZLLL), C13Z4.LIZJ(471368798, new C1665720tRq(interfaceC1665500tRU3, interfaceC1665500tRU2, c259800zU, z7, function2), c13zcLJIIJ), c13zcLJIIJ, 48);
                C1668880tWw c1668880tWw = C1669660tYC.LJLJJLL;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1679030tnJ.LIZIZ(c1685760tyA, "icon");
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (objLJJ4 == c1680520tpi) {
                    objLJJ4 = AFwS266S0000000_25.get$arr$(439);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJJI = c.LJIIJJI(C1682520tsw.LJIIL(C1689740u4a.LIZIZ(interfaceC1685750ty9LIZIZ2, true, (Function1) objLJJ4), 0.0f, 10, 14, 5, 1), 28, 22);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(dVarLIZJ);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new AwS604S0100000_25(dVarLIZJ, 581);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1679660toK.LIZ(interfaceC1685750ty9LJIIJJI, (Function1) objLJJ5);
                c13zcLJIIJ.LJJIIJZLJL(-447364275);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = c1685760tyA;
                if (z7) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ6 = c13zcLJIIJ.LJJ();
                    if (objLJJ6 == c1680520tpi) {
                        objLJJ6 = AFwS214S0000000_25.get$arr$(426);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                    }
                    Function0 function0 = (Function0) objLJJ6;
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ7 = c13zcLJIIJ.LJJ();
                    if (objLJJ7 == c1680520tpi) {
                        objLJJ7 = AFwS214S0000000_25.get$arr$(427);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    interfaceC1685750ty9LJ = C634380OuS.LJ(c1685760tyA, true, function0, (Function0) objLJJ7, new AwS246S0300000_2(context, (Context) function1, (Function1<? super Boolean, Unit>) c259800zU, (C259800zU<C1676880tjq<Boolean>>) 23), 78);
                }
                c13zcLJIIJ.LJJJJL(false);
                float f3 = 24;
                C1668930tX1.LIZIZ(c1668880tWw, null, interfaceC1685750ty9LIZ.LIZ(interfaceC1685750ty9LJ), 0L, f3, f3, false, c13zcLJIIJ, 221232, 72);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0522000_25(interfaceC1665500tRU3, interfaceC1665500tRU2, interfaceC1685750ty9, function2, function1, z, z7, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(final X.InterfaceC1665500tRU<X.C1661930tLj<X.InterfaceC1660190tIv, X.InterfaceC1461640o8g<? extends X.InterfaceC1660190tIv>>> r21, X.InterfaceC1665500tRU<X.C1661930tLj<X.InterfaceC1660190tIv, X.InterfaceC1461640o8g<? extends X.InterfaceC1660190tIv>>> r22, X.InterfaceC1685750ty9 r23, kotlin.jvm.functions.Function2<? super X.InterfaceC1660190tIv, ? super X.InterfaceC1660090tIl, kotlin.Unit> r24, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r25, boolean r26, boolean r27, X.InterfaceC1680500tpg r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666810tTb.LIZJ(X.0tRU, X.0tRU, X.0ty9, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, boolean, boolean, X.0tpg, int, int):void");
    }
}

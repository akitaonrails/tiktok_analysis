package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModel;
import com.ss.android.ugc.aweme.social.creation.record.viewmodel.RecordViewModelState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS62S0301000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665680tRm {
    public static final void LJFF(InterfaceC1665350tRF<InterfaceC1665520tRW> interfaceC1665350tRF, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean zLJII;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1983959282);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1665350tRF);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1665350tRF);
            }
            if (zLJII) {
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
            C05P0 c05p0LIZIZ = C1671620tbM.LIZIZ((C05YD) C20028913Yh.LJIIIIZZ(interfaceC1665350tRF.LIZ(), c13zcLJIIJ).getValue(), c13zcLJIIJ);
            if (((InterfaceC1665520tRW) c05p0LIZIZ.getValue()).isVisible()) {
                interfaceC1665350tRF.LIZIZ((InterfaceC1665520tRW) c05p0LIZIZ.getValue(), c13zcLJIIJ, (i2 << 3) & 112);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(interfaceC1665350tRF, (InterfaceC1665350tRF<InterfaceC1665520tRW>) i, 30);
        }
    }

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1658470tG9 c1658470tG9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1745565511);
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
            if (c13zcLJIIJ.LJJIIJ(c1658470tG9)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1665350tRF<? extends InterfaceC1665520tRW> interfaceC1665350tRF = c1658470tG9.LIZ;
            if (interfaceC1665350tRF != null) {
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                    AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = AFwS266S0000000_25.get$arr$(221);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1671870tbl.LIZIZ(interfaceC1665350tRF, null, (Function1) objLJJ, null, null, null, C1665360tRG.LIZ, c13zcLJIIJ, 1573248, 58);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(interfaceC1685750ty9, c1658470tG9, i, 43);
        }
    }

    public static final void LIZJ(RecordViewModelState recordViewModelState, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2053345982);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(recordViewModelState)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = interfaceC1685750ty9.LIZ(c.LIZJ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1658500tGC centerViewState = recordViewModelState.getCenterViewState();
                if (centerViewState.LIZJ != null) {
                    z = true;
                } else {
                    z = false;
                }
                C05Y1 c05y1 = C05Y0.LIZLLL;
                C1676630tjR.LJI(z, null, C1676510tjF.LJ(0.0f, C1671550tbF.LIZLLL(250, 0, c05y1, 2)), C1676510tjF.LJI(0.0f, C1671550tbF.LIZLLL(250, 0, c05y1, 2)), null, C13Z4.LIZJ(-1425869536, new AwS674S0100000_25(centerViewState, 19), c13zcLJIIJ), c13zcLJIIJ, 196608, 18);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(recordViewModelState, interfaceC1685750ty9, i, 44);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.InterfaceC1685750ty9 r21, X.C1665700tRo r22, X.InterfaceC1680500tpg r23, int r24) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665680tRm.LIZLLL(X.0ty9, X.0tRo, X.0tpg, int):void");
    }

    public static final void LJ(RecordViewModel recordViewModel, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-817374979);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(recordViewModel)) {
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
            C1670410tZP.LIZ(C1669670tYD.LIZJ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(256733570, new AwS639S0100000_25(recordViewModel, 52), c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(recordViewModel, (RecordViewModel) function0, function02, (Function0<Unit>) i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x028f  */
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
    public static final void LIZIZ(X.C1658500tGC r21, float r22, boolean r23, X.InterfaceC1680500tpg r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665680tRm.LIZIZ(X.0tGC, float, boolean, X.0tpg, int, int):void");
    }
}

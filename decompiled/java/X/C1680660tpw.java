package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS22S0202000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import p2.j1;

/* JADX INFO: renamed from: X.0tpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680660tpw {
    public static final void LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function2 function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1177876616);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C1675000tgo c1675000tgo = new InterfaceC20053113dB() { // from class: X.0tgo
                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZ(j1 j1Var, List list, int i7) {
                    return C1688390u2P.LIZJ(this, j1Var, list, i7);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZIZ(j1 j1Var, List list, int i7) {
                    return C1688390u2P.LIZLLL(this, j1Var, list, i7);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZJ(j1 j1Var, List list, int i7) {
                    return C1688390u2P.LIZ(this, j1Var, list, i7);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZLLL(j1 j1Var, List list, int i7) {
                    return C1688390u2P.LIZIZ(this, j1Var, list, i7);
                }

                @Override // X.InterfaceC20053113dB
                public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int iLJIIJ = 0;
                    int iLJIIIZ = 0;
                    for (int i7 = 0; i7 < size; i7++) {
                        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = ((InterfaceC1673370teB) ListProtector.get(list, i7)).LJJJJZ(j);
                        iLJIIJ = Math.max(iLJIIJ, abstractC1686530tzPLJJJJZ.LL);
                        iLJIIIZ = Math.max(iLJIIIZ, abstractC1686530tzPLJJJJZ.LLILLJJLI);
                        arrayList.add(abstractC1686530tzPLJJJJZ);
                    }
                    if (list.isEmpty()) {
                        iLJIIJ = C1682380tsi.LJIIJ(j);
                        iLJIIIZ = C1682380tsi.LJIIIZ(j);
                    }
                    return interfaceC1689940u4u.LJLJJL(iLJIIJ, iLJIIIZ, C2097608Jq.LJ(), new AwS604S0100000_25((List) arrayList, (List<? extends AbstractC1686530tzP>) 727));
                }
            };
            int i7 = ((i3 << 3) & 112) | ((i3 >> 3) & 14) | 384;
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            int i8 = ((i7 << 6) & 896) | 6;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1675000tgo, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                function2.invoke(c13zcLJIIJ, Integer.valueOf((i8 >> 6) & 14));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25(interfaceC1685750ty92, (InterfaceC1685750ty9) function2, (Function2<? super InterfaceC1672350tcX, ? super C1682380tsi, ? extends InterfaceC1690350u5Z>) i, i2, 16);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(kotlin.jvm.functions.Function0<kotlin.Unit> r18, X.C1686740tzk r19, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r20, X.InterfaceC1680500tpg r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680660tpw.LIZ(kotlin.jvm.functions.Function0, X.0tzk, kotlin.jvm.functions.Function2, X.0tpg, int, int):void");
    }
}

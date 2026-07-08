package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS18S0202000_8;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import p2.j1;

/* JADX INFO: renamed from: X.0MXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570170MXv {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2105228848);
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
            C1683190tu1 c1683190tu1 = new InterfaceC20053113dB() { // from class: X.0tu1
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
                    int iMax = 0;
                    int iMax2 = 0;
                    for (int i7 = 0; i7 < size; i7++) {
                        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = ((InterfaceC1673370teB) ListProtector.get(list, i7)).LJJJJZ(j);
                        iMax = Math.max(iMax, abstractC1686530tzPLJJJJZ.LL);
                        iMax2 = Math.max(iMax2, abstractC1686530tzPLJJJJZ.LLILLJJLI);
                        arrayList.add(abstractC1686530tzPLJJJJZ);
                    }
                    return interfaceC1689940u4u.LJLJJL(iMax, iMax2, C2097608Jq.LJ(), new AwS604S0100000_25((List) arrayList, (List<? extends AbstractC1686530tzP>) 29));
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1683190tu1, g.a.LJI);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS18S0202000_8(interfaceC1685750ty92, (InterfaceC1685750ty9) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 0);
        }
    }
}

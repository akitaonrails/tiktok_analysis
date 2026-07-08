package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import p2.j1;

/* JADX INFO: renamed from: X.0tu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683220tu4 {
    public static final Pair<List<C1692270u8f<C1680210tpD>>, List<C1692270u8f<InterfaceC1631620sYq<String, InterfaceC1680500tpg, Integer, Unit>>>> LIZ;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZ = new Pair<>(c13bv, c13bv);
    }

    public static final void LIZ(C1692220u8a c1692220u8a, List<C1692270u8f<InterfaceC1631620sYq<String, InterfaceC1680500tpg, Integer, Unit>>> list, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1794596951);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(list)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i2 & 1, z)) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(list, i5);
                InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c1692270u8f.LIZ;
                int i6 = c1692270u8f.LIZIZ;
                int i7 = c1692270u8f.LIZJ;
                C1683210tu3 c1683210tu3 = new InterfaceC20053113dB() { // from class: X.0tu3
                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZ(j1 j1Var, List list2, int i8) {
                        return C1688390u2P.LIZJ(this, j1Var, list2, i8);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZIZ(j1 j1Var, List list2, int i8) {
                        return C1688390u2P.LIZLLL(this, j1Var, list2, i8);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZJ(j1 j1Var, List list2, int i8) {
                        return C1688390u2P.LIZ(this, j1Var, list2, i8);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final /* synthetic */ int LIZLLL(j1 j1Var, List list2, int i8) {
                        return C1688390u2P.LIZIZ(this, j1Var, list2, i8);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list2, long j) {
                        ArrayList arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            arrayList.add(((InterfaceC1673370teB) ListProtector.get(list2, i8)).LJJJJZ(j));
                        }
                        return interfaceC1689940u4u.LJLJJL(C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJII(j), C2097608Jq.LJ(), new AwS604S0100000_25((List) arrayList, (List<? extends AbstractC1686530tzP>) 914));
                    }
                };
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
                g.LJLIIIL.getClass();
                AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1683210tu3, g.a.LJI);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                    AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                    interfaceC1631620sYq.invoke(c1692220u8a.subSequence(i6, i7).LLILLJJLI, c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(c1692220u8a, (C1692220u8a) list, (List<C1692270u8f<InterfaceC1631620sYq<String, InterfaceC1680500tpg, Integer, Unit>>>) i, 117);
        }
    }
}

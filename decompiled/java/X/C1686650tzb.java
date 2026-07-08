package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import p2.j1;

/* JADX INFO: renamed from: X.0tzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686650tzb {
    public static final void LIZ(C2267041DoM c2267041DoM, List<? extends InterfaceC1673370teB> list) {
        InterfaceC1686670tzd interfaceC1686670tzd;
        String strLIZ;
        ArrayList arrayList;
        InterfaceC1686670tzd interfaceC1686670tzd2;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                InterfaceC1673370teB interfaceC1673370teB = (InterfaceC1673370teB) ListProtector.get(list, i);
                Object objLIZ = C1679030tnJ.LIZ(interfaceC1673370teB);
                if (objLIZ == null) {
                    Object objLJJJ = interfaceC1673370teB.LJJJ();
                    if (!(objLJJJ instanceof InterfaceC1686670tzd) || (interfaceC1686670tzd2 = (InterfaceC1686670tzd) objLJJJ) == null || (objLIZ = interfaceC1686670tzd2.LIZIZ()) == null) {
                        objLIZ = new Object() { // from class: X.0tze
                        };
                    }
                }
                C2267061DoO c2267061DoOLIZ = c2267041DoM.LIZ(objLIZ);
                if (c2267061DoOLIZ instanceof C2267061DoO) {
                    c2267061DoOLIZ.LJJJJZ = interfaceC1673370teB;
                    C2267081DoQ c2267081DoQ = c2267061DoOLIZ.LJJJJZI;
                    if (c2267081DoQ != null) {
                        c2267081DoQ.LJJJZ = interfaceC1673370teB;
                    }
                }
                Object objLJJJ2 = interfaceC1673370teB.LJJJ();
                if ((objLJJJ2 instanceof InterfaceC1686670tzd) && (interfaceC1686670tzd = (InterfaceC1686670tzd) objLJJJ2) != null && (strLIZ = interfaceC1686670tzd.LIZ()) != null && (objLIZ instanceof String)) {
                    C2267061DoO c2267061DoOLIZ2 = c2267041DoM.LIZ(objLIZ);
                    if (c2267061DoOLIZ2 instanceof C2267061DoO) {
                        c2267061DoOLIZ2.getClass();
                        if (!c2267041DoM.LIZJ.containsKey(strLIZ)) {
                            arrayList = new ArrayList();
                            c2267041DoM.LIZJ.put(strLIZ, (ArrayList<String>) arrayList);
                        } else {
                            arrayList = c2267041DoM.LIZJ.get(strLIZ);
                        }
                        arrayList.add(objLIZ);
                    }
                }
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public static final Pair LIZIZ(C1672050tc3 c1672050tc3, final C05P0 c05p0, final C2267001DoI c2267001DoI, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIJIIJIL(-441911751);
        interfaceC1680500tpg.LJJIJIIJIL(-3687241);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1686660tzc(c1672050tc3);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        final C1686660tzc c1686660tzc = (C1686660tzc) objLJJ;
        interfaceC1680500tpg.LJJIJIIJIL(-3686930);
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(257);
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ || objLJJ2 == c1680520tpi) {
            objLJJ2 = new Pair(new InterfaceC20053113dB() { // from class: X.0tth
                public final /* synthetic */ int LIZJ = 257;

                @Override // X.InterfaceC20053113dB
                public final int LIZ(j1 j1Var, List list, int i) {
                    return C1688390u2P.LIZJ(this, j1Var, list, i);
                }

                @Override // X.InterfaceC20053113dB
                public final int LIZIZ(j1 j1Var, List list, int i) {
                    return C1688390u2P.LIZLLL(this, j1Var, list, i);
                }

                @Override // X.InterfaceC20053113dB
                public final int LIZJ(j1 j1Var, List list, int i) {
                    return C1688390u2P.LIZ(this, j1Var, list, i);
                }

                @Override // X.InterfaceC20053113dB
                public final int LIZLLL(j1 j1Var, List list, int i) {
                    return C1688390u2P.LIZIZ(this, j1Var, list, i);
                }

                @Override // X.InterfaceC20053113dB
                public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                    long jLJIIIZ = c2267001DoI.LJIIIZ(j, interfaceC1689940u4u.getLayoutDirection(), c1686660tzc, list, this.LIZJ, interfaceC1689940u4u);
                    c05p0.getValue();
                    return interfaceC1689940u4u.LJLJJL((int) (jLJIIIZ >> 32), C1682900ttY.LIZJ(jLJIIIZ), C2097608Jq.LJ(), new AwS391S0200000_25(c2267001DoI, (C2267001DoI) list, (List<? extends InterfaceC1673370teB>) 333));
                }
            }, new AwS426S0200000_25(c05p0, (C05P0<Boolean>) c1686660tzc, (C1686660tzc) 169));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        Pair pair = (Pair) objLJJ2;
        interfaceC1680500tpg.LJJIJLIJ();
        return pair;
    }
}

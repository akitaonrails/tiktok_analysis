package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS39S0600000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.j1;

/* JADX INFO: renamed from: X.0tgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674920tgg implements InterfaceC20053113dB {
    public final InterfaceC1668050tVb LIZ;
    public final boolean LIZIZ;

    @Override // X.InterfaceC20053113dB
    public final /* synthetic */ int LIZ(j1 j1Var, List list, int i) {
        return C1688390u2P.LIZJ(this, j1Var, list, i);
    }

    @Override // X.InterfaceC20053113dB
    public final /* synthetic */ int LIZIZ(j1 j1Var, List list, int i) {
        return C1688390u2P.LIZLLL(this, j1Var, list, i);
    }

    @Override // X.InterfaceC20053113dB
    public final /* synthetic */ int LIZJ(j1 j1Var, List list, int i) {
        return C1688390u2P.LIZ(this, j1Var, list, i);
    }

    @Override // X.InterfaceC20053113dB
    public final /* synthetic */ int LIZLLL(j1 j1Var, List list, int i) {
        return C1688390u2P.LIZIZ(this, j1Var, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674920tgg)) {
            return false;
        }
        C1674920tgg c1674920tgg = (C1674920tgg) obj;
        return Intrinsics.LJFF(this.LIZ, c1674920tgg.LIZ) && this.LIZIZ == c1674920tgg.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoxMeasurePolicy(alignment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", propagateMinConstraints=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1674920tgg(InterfaceC1668050tVb interfaceC1668050tVb, boolean z) {
        this.LIZ = interfaceC1668050tVb;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC20053113dB
    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
        long j2;
        int i;
        int i2;
        C1676430tj7 c1676430tj7;
        C1676430tj7 c1676430tj72;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ;
        int iMax;
        int iMax2;
        C1676430tj7 c1676430tj73;
        if (list.isEmpty()) {
            return interfaceC1689940u4u.LJLJJL(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIZ(j), C2097608Jq.LJ(), AFwS266S0000000_25.get$arr$(489));
        }
        if (this.LIZIZ) {
            j2 = j;
        } else {
            j2 = j & (-8589934589L);
        }
        if (list.size() == 1) {
            InterfaceC1673370teB interfaceC1673370teB = (InterfaceC1673370teB) ListProtector.get(list, 0);
            C19991913Kb<InterfaceC1668050tVb, InterfaceC20053113dB> c19991913Kb = k.LIZ;
            Object objLJJJ = interfaceC1673370teB.LJJJ();
            if ((objLJJJ instanceof C1676430tj7) && (c1676430tj73 = (C1676430tj7) objLJJJ) != null && c1676430tj73.LLJJI) {
                iMax = C1682380tsi.LJIIJ(j);
                iMax2 = C1682380tsi.LJIIIZ(j);
                abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682400tsk.LIZJ(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIZ(j)));
            } else {
                abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j2);
                iMax = Math.max(C1682380tsi.LJIIJ(j), abstractC1686530tzPLJJJJZ.LL);
                iMax2 = Math.max(C1682380tsi.LJIIIZ(j), abstractC1686530tzPLJJJJZ.LLILLJJLI);
            }
            return interfaceC1689940u4u.LJLJJL(iMax, iMax2, C2097608Jq.LJ(), new C1674930tgh(abstractC1686530tzPLJJJJZ, interfaceC1673370teB, interfaceC1689940u4u, iMax, iMax2, this));
        }
        AbstractC1686530tzP[] abstractC1686530tzPArr = new AbstractC1686530tzP[list.size()];
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = C1682380tsi.LJIIJ(j);
        C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = C1682380tsi.LJIIIZ(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1673370teB interfaceC1673370teB2 = (InterfaceC1673370teB) ListProtector.get(list, i3);
            C19991913Kb<InterfaceC1668050tVb, InterfaceC20053113dB> c19991913Kb2 = k.LIZ;
            Object objLJJJ2 = interfaceC1673370teB2.LJJJ();
            if ((objLJJJ2 instanceof C1676430tj7) && (c1676430tj72 = (C1676430tj7) objLJJJ2) != null && c1676430tj72.LLJJI) {
                z = true;
            } else {
                AbstractC1686530tzP abstractC1686530tzPLJJJJZ2 = interfaceC1673370teB2.LJJJJZ(j2);
                abstractC1686530tzPArr[i3] = abstractC1686530tzPLJJJJZ2;
                c118300cf.element = Math.max(c118300cf.element, abstractC1686530tzPLJJJJZ2.LL);
                c118300cf2.element = Math.max(c118300cf2.element, abstractC1686530tzPLJJJJZ2.LLILLJJLI);
            }
        }
        if (z) {
            int i4 = c118300cf.element;
            if (i4 != Integer.MAX_VALUE) {
                i = i4;
            } else {
                i = 0;
            }
            int i5 = c118300cf2.element;
            if (i5 != Integer.MAX_VALUE) {
                i2 = i5;
            } else {
                i2 = 0;
            }
            long jLIZ = C1682390tsj.LIZ(i, i4, i2, i5);
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                InterfaceC1673370teB interfaceC1673370teB3 = (InterfaceC1673370teB) ListProtector.get(list, i6);
                C19991913Kb<InterfaceC1668050tVb, InterfaceC20053113dB> c19991913Kb3 = k.LIZ;
                Object objLJJJ3 = interfaceC1673370teB3.LJJJ();
                if ((objLJJJ3 instanceof C1676430tj7) && (c1676430tj7 = (C1676430tj7) objLJJJ3) != null && c1676430tj7.LLJJI) {
                    abstractC1686530tzPArr[i6] = interfaceC1673370teB3.LJJJJZ(jLIZ);
                }
            }
        }
        return interfaceC1689940u4u.LJLJJL(c118300cf.element, c118300cf2.element, C2097608Jq.LJ(), new AwS39S0600000_25(abstractC1686530tzPArr, (AbstractC1686530tzP[]) list, (List<? extends InterfaceC1673370teB>) interfaceC1689940u4u, (InterfaceC1689940u4u) c118300cf, c118300cf2, (C118300cf) this, (C1674920tgg) 3));
    }
}

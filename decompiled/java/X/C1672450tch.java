package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.j1;

/* JADX INFO: renamed from: X.0tch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672450tch implements InterfaceC20053113dB {
    public final int LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;

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

    public C1672450tch(float f, int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = f;
    }

    @Override // X.InterfaceC20053113dB
    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
        int i;
        int iMin;
        int iLIZJ;
        int i2;
        int i3;
        AbstractC1686530tzP abstractC1686530tzP;
        long jLIZ = C1682380tsi.LIZ(0, C1682380tsi.LJIIIIZZ(j), 0, C1682380tsi.LJII(j));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends InterfaceC1673370teB> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJJJJZ(jLIZ));
        }
        float fLIZLLL = C13LZ.LIZLLL(this.LIZJ, 0.0f, 1.0f);
        float f = this.LIZJ - fLIZLLL;
        int iLJLLJ = interfaceC1689940u4u.LJLLJ(C1666850tTf.LIZ);
        int iLJLLJ2 = interfaceC1689940u4u.LJLLJ(C1666850tTf.LJ);
        int iLJLLJ3 = interfaceC1689940u4u.LJLLJ(C1666850tTf.LJIILIIL);
        int size = arrayList.size();
        int iIntValue = 0;
        if (size <= 0 || (abstractC1686530tzP = (AbstractC1686530tzP) C13LP.LJJJLZIJ(0, arrayList)) == null || (i = abstractC1686530tzP.LLILLJJLI) <= 0) {
            i = iLJLLJ2;
        }
        int[] iArr = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = i4;
            AbstractC1686530tzP abstractC1686530tzP2 = (AbstractC1686530tzP) C13LP.LJJJLZIJ(i5, arrayList);
            if (abstractC1686530tzP2 == null || (i3 = abstractC1686530tzP2.LLILLJJLI) <= 0) {
                i3 = iLJLLJ2;
            }
            i4 += i3;
            if (i5 < size - 1) {
                i4 += iLJLLJ;
            }
        }
        if (this.LIZIZ) {
            iMin = Math.min(size, 3);
        } else {
            iMin = size;
        }
        int iLJ = LJ(size, arrayList, iLJLLJ, iLJLLJ2, iMin);
        int iLJ2 = LJ(size, arrayList, iLJLLJ, iLJLLJ2, size);
        if (this.LIZ == 0) {
            iLIZJ = 0;
        } else if (this.LIZIZ) {
            iLIZJ = C1677720tlC.LIZJ(fLIZLLL, iLJ, iLJ2);
        } else {
            iLIZJ = iLJ2;
        }
        if (this.LIZ == 0) {
            i2 = 0;
        } else {
            i2 = (int) (iLJLLJ3 * fLIZLLL);
        }
        int i6 = iLIZJ + i2;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Integer numValueOf = Integer.valueOf(((AbstractC1686530tzP) it3.next()).LL);
            while (it3.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((AbstractC1686530tzP) it3.next()).LL);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        int iLJ3 = C13LZ.LJ(iIntValue, C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j));
        return interfaceC1689940u4u.LJLJJL(iLJ3, C13LZ.LJ(i6, C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j)), C2097608Jq.LJ(), new C1672480tck(iLJ2, size, arrayList, iLJ3, iArr, f, this, iLJLLJ, i, fLIZLLL));
    }

    public static final int LJ(int i, List list, int i2, int i3, int i4) {
        int i5;
        int iLJ = C13LZ.LJ(i4, 0, i);
        if (iLJ == 0) {
            return 0;
        }
        Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, iLJ).iterator();
        int i6 = 0;
        while (((C531650Kt9) it2).LLILLL) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) C13LP.LJJJLZIJ(((AbstractC2098408Jy) it2).nextInt(), list);
            if (abstractC1686530tzP == null || (i5 = abstractC1686530tzP.LLILLJJLI) <= 0) {
                i5 = i3;
            }
            i6 += i5;
        }
        return i6 + (Math.max(0, iLJ - 1) * i2);
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AwS17S0401000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.0u1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688130u1z implements InterfaceC20053113dB, InterfaceC1688150u21 {
    public final InterfaceC1688160u22 LIZ;
    public final InterfaceC1666960tTq LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688130u1z)) {
            return false;
        }
        C1688130u1z c1688130u1z = (C1688130u1z) obj;
        return Intrinsics.LJFF(this.LIZ, c1688130u1z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1688130u1z.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColumnMeasurePolicy(verticalArrangement=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", horizontalAlignment=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1688150u21
    public final int LJ(AbstractC1686530tzP abstractC1686530tzP) {
        return abstractC1686530tzP.LL;
    }

    @Override // X.InterfaceC1688150u21
    public final int LJI(AbstractC1686530tzP abstractC1686530tzP) {
        return abstractC1686530tzP.LLILLJJLI;
    }

    public C1688130u1z(InterfaceC1688160u22 interfaceC1688160u22, C1296860jqu c1296860jqu) {
        this.LIZ = interfaceC1688160u22;
        this.LIZIZ = c1296860jqu;
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZ(j1 j1Var, List list, int i) {
        float fLIZ = this.LIZ.LIZ();
        j1Var.getClass();
        int iLIZ = C1682420tsm.LIZ(fLIZ, j1Var);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1676340tiy interfaceC1676340tiy = (InterfaceC1676340tiy) ListProtector.get(list, i3);
            float fLIZIZ = C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1676340tiy));
            int iLJJIJ = interfaceC1676340tiy.LJJIJ(i);
            if (fLIZIZ == 0.0f) {
                i2 += iLJJIJ;
            } else if (fLIZIZ > 0.0f) {
                f += fLIZIZ;
                iMax = Math.max(iMax, Math.round(iLJJIJ / fLIZIZ));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iLIZ);
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZIZ(j1 j1Var, List list, int i) {
        int iRound;
        int iRound2;
        int i2;
        float fLIZ = this.LIZ.LIZ();
        j1Var.getClass();
        int iLIZ = C1682420tsm.LIZ(fLIZ, j1Var);
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iLIZ, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1676340tiy interfaceC1676340tiy = (InterfaceC1676340tiy) ListProtector.get(list, i3);
            float fLIZIZ = C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1676340tiy));
            if (fLIZIZ == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = i - iMin;
                }
                int iMin2 = Math.min(interfaceC1676340tiy.LJJIIZ(Integer.MAX_VALUE), i2);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1676340tiy.LJJII(iMin2));
            } else if (fLIZIZ > 0.0f) {
                f += fLIZIZ;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else if (i == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(i - iMin, 0) / f);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            InterfaceC1676340tiy interfaceC1676340tiy2 = (InterfaceC1676340tiy) ListProtector.get(list, i4);
            float fLIZIZ2 = C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1676340tiy2));
            if (fLIZIZ2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fLIZIZ2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, interfaceC1676340tiy2.LJJII(iRound2));
            }
        }
        return iMax;
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZJ(j1 j1Var, List list, int i) {
        float fLIZ = this.LIZ.LIZ();
        j1Var.getClass();
        int iLIZ = C1682420tsm.LIZ(fLIZ, j1Var);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1676340tiy interfaceC1676340tiy = (InterfaceC1676340tiy) ListProtector.get(list, i3);
            float fLIZIZ = C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1676340tiy));
            int iLJJIIZ = interfaceC1676340tiy.LJJIIZ(i);
            if (fLIZIZ == 0.0f) {
                i2 += iLJJIIZ;
            } else if (fLIZIZ > 0.0f) {
                f += fLIZIZ;
                iMax = Math.max(iMax, Math.round(iLJJIIZ / fLIZIZ));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iLIZ);
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZLLL(j1 j1Var, List list, int i) {
        int iRound;
        int iRound2;
        int i2;
        float fLIZ = this.LIZ.LIZ();
        j1Var.getClass();
        int iLIZ = C1682420tsm.LIZ(fLIZ, j1Var);
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iLIZ, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1676340tiy interfaceC1676340tiy = (InterfaceC1676340tiy) ListProtector.get(list, i3);
            float fLIZIZ = C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1676340tiy));
            if (fLIZIZ == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = i - iMin;
                }
                int iMin2 = Math.min(interfaceC1676340tiy.LJJIIZ(Integer.MAX_VALUE), i2);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1676340tiy.LJJIL(iMin2));
            } else if (fLIZIZ > 0.0f) {
                f += fLIZIZ;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else if (i == Integer.MAX_VALUE) {
            iRound = Integer.MAX_VALUE;
        } else {
            iRound = Math.round(Math.max(i - iMin, 0) / f);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            InterfaceC1676340tiy interfaceC1676340tiy2 = (InterfaceC1676340tiy) ListProtector.get(list, i4);
            float fLIZIZ2 = C1688080u1u.LIZIZ(C1688080u1u.LIZ(interfaceC1676340tiy2));
            if (fLIZIZ2 > 0.0f) {
                if (iRound != Integer.MAX_VALUE) {
                    iRound2 = Math.round(iRound * fLIZIZ2);
                } else {
                    iRound2 = Integer.MAX_VALUE;
                }
                iMax = Math.max(iMax, interfaceC1676340tiy2.LJJIL(iRound2));
            }
        }
        return iMax;
    }

    @Override // X.InterfaceC20053113dB
    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
        return C1688110u1x.LIZ(this, C1682380tsi.LJIIIZ(j), C1682380tsi.LJIIJ(j), C1682380tsi.LJII(j), C1682380tsi.LJIIIIZZ(j), interfaceC1689940u4u.LJLLJ(this.LIZ.LIZ()), interfaceC1689940u4u, list, new AbstractC1686530tzP[list.size()], 0, list.size(), null, 0);
    }

    @Override // X.InterfaceC1688150u21
    public final void LJIIIIZZ(int i, int[] iArr, int[] iArr2, InterfaceC1689940u4u interfaceC1689940u4u) {
        this.LIZ.LIZJ(interfaceC1689940u4u, i, iArr, iArr2);
    }

    @Override // X.InterfaceC1688150u21
    public final long LJIIJJI(int i, int i2, int i3, boolean z) {
        if (!z) {
            return C1682390tsj.LIZ(0, i3, i, i2);
        }
        return C1682400tsk.LIZ(0, i3, i, i2);
    }

    @Override // X.InterfaceC1688150u21
    public final InterfaceC1690350u5Z LJIIJ(AbstractC1686530tzP[] abstractC1686530tzPArr, InterfaceC1689940u4u interfaceC1689940u4u, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return interfaceC1689940u4u.LJLJJL(i2, i, C2097608Jq.LJ(), new AwS17S0401000_25(abstractC1686530tzPArr, this, i2, interfaceC1689940u4u, iArr, 4));
    }
}

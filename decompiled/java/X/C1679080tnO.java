package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.0tnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679080tnO implements InterfaceC20053113dB {
    public final Function1<C1680770tq7, Unit> LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;
    public final InterfaceC1679150tnV LIZLLL;

    @Override // X.InterfaceC20053113dB
    public final int LIZ(j1 j1Var, List list, int i) {
        return LJ(j1Var, list, i, AFwS311S0000000_25.get$arr$(8));
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZIZ(j1 j1Var, List list, int i) {
        return LJI(j1Var, list, i, AFwS311S0000000_25.get$arr$(9));
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZJ(j1 j1Var, List list, int i) {
        return LJ(j1Var, list, i, AFwS311S0000000_25.get$arr$(6));
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZLLL(j1 j1Var, List list, int i) {
        return LJI(j1Var, list, i, AFwS311S0000000_25.get$arr$(7));
    }

    @Override // X.InterfaceC20053113dB
    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
        InterfaceC1673370teB next;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ;
        InterfaceC1673370teB next2;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ2;
        InterfaceC1673370teB next3;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ3;
        InterfaceC1673370teB next4;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ4;
        int i;
        int i2;
        int iLJLLJ = interfaceC1689940u4u.LJLLJ(this.LIZLLL.LIZIZ());
        long jLIZ = C1682380tsi.LIZ(0, C1682380tsi.LJIIIIZZ(j), 0, C1682380tsi.LJII(j));
        Iterator<? extends InterfaceC1673370teB> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C1679030tnJ.LIZ(next), "Leading")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1673370teB interfaceC1673370teB = next;
        if (interfaceC1673370teB != null) {
            abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(jLIZ);
        } else {
            abstractC1686530tzPLJJJJZ = null;
        }
        int iLJ = C1678940tnA.LJ(abstractC1686530tzPLJJJJZ);
        Iterator<? extends InterfaceC1673370teB> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(C1679030tnJ.LIZ(next2), "Trailing")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        InterfaceC1673370teB interfaceC1673370teB2 = next2;
        if (interfaceC1673370teB2 != null) {
            abstractC1686530tzPLJJJJZ2 = interfaceC1673370teB2.LJJJJZ(C1682390tsj.LJIIIIZZ(-iLJ, 0, jLIZ));
        } else {
            abstractC1686530tzPLJJJJZ2 = null;
        }
        int iLJ2 = iLJ + C1678940tnA.LJ(abstractC1686530tzPLJJJJZ2);
        int iLJLLJ2 = interfaceC1689940u4u.LJLLJ(this.LIZLLL.LIZ(interfaceC1689940u4u.getLayoutDirection())) + interfaceC1689940u4u.LJLLJ(this.LIZLLL.LIZJ(interfaceC1689940u4u.getLayoutDirection()));
        int i3 = -iLJ2;
        int i4 = -iLJLLJ;
        long jLJIIIIZZ = C1682390tsj.LJIIIIZZ(C1677720tlC.LIZJ(this.LIZJ, i3 - iLJLLJ2, -iLJLLJ2), i4, jLIZ);
        Iterator<? extends InterfaceC1673370teB> it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                next3 = it4.next();
                if (Intrinsics.LJFF(C1679030tnJ.LIZ(next3), "Label")) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        InterfaceC1673370teB interfaceC1673370teB3 = next3;
        if (interfaceC1673370teB3 != null) {
            abstractC1686530tzPLJJJJZ3 = interfaceC1673370teB3.LJJJJZ(jLJIIIIZZ);
            if (abstractC1686530tzPLJJJJZ3 != null) {
                this.LIZ.invoke(new C1680770tq7(C1671580tbI.LIZ(abstractC1686530tzPLJJJJZ3.LL, abstractC1686530tzPLJJJJZ3.LLILLJJLI)));
            }
        } else {
            abstractC1686530tzPLJJJJZ3 = null;
        }
        long jLJIIIIZZ2 = C1682390tsj.LJIIIIZZ(i3, i4 - Math.max(C1678940tnA.LIZLLL(abstractC1686530tzPLJJJJZ3) / 2, interfaceC1689940u4u.LJLLJ(this.LIZLLL.LIZLLL())), j);
        long jLIZ2 = C1682380tsi.LIZ(C1682380tsi.LJIIJ(jLJIIIIZZ2), C1682380tsi.LJIIIIZZ(jLJIIIIZZ2), 0, C1682380tsi.LJII(jLJIIIIZZ2));
        for (InterfaceC1673370teB interfaceC1673370teB4 : list) {
            if (Intrinsics.LJFF(C1679030tnJ.LIZ(interfaceC1673370teB4), "TextField")) {
                AbstractC1686530tzP abstractC1686530tzPLJJJJZ5 = interfaceC1673370teB4.LJJJJZ(jLIZ2);
                long jLIZ3 = C1682380tsi.LIZ(0, C1682380tsi.LJIIIIZZ(jLIZ2), C1682380tsi.LJIIIZ(jLIZ2), C1682380tsi.LJII(jLIZ2));
                Iterator<? extends InterfaceC1673370teB> it5 = list.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next4 = it5.next();
                        if (Intrinsics.LJFF(C1679030tnJ.LIZ(next4), "Hint")) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                InterfaceC1673370teB interfaceC1673370teB5 = next4;
                if (interfaceC1673370teB5 != null) {
                    abstractC1686530tzPLJJJJZ4 = interfaceC1673370teB5.LJJJJZ(jLIZ3);
                } else {
                    abstractC1686530tzPLJJJJZ4 = null;
                }
                int iLIZLLL = C1679060tnM.LIZLLL(C1678940tnA.LJ(abstractC1686530tzPLJJJJZ), C1678940tnA.LJ(abstractC1686530tzPLJJJJZ2), abstractC1686530tzPLJJJJZ5.LL, C1678940tnA.LJ(abstractC1686530tzPLJJJJZ3), C1678940tnA.LJ(abstractC1686530tzPLJJJJZ4), this.LIZJ, j, interfaceC1689940u4u.getDensity(), this.LIZLLL);
                int iLIZJ = C1679060tnM.LIZJ(C1678940tnA.LIZLLL(abstractC1686530tzPLJJJJZ), C1678940tnA.LIZLLL(abstractC1686530tzPLJJJJZ2), abstractC1686530tzPLJJJJZ5.LLILLJJLI, C1678940tnA.LIZLLL(abstractC1686530tzPLJJJJZ3), C1678940tnA.LIZLLL(abstractC1686530tzPLJJJJZ4), this.LIZJ, j, interfaceC1689940u4u.getDensity(), this.LIZLLL);
                for (InterfaceC1673370teB interfaceC1673370teB6 : list) {
                    if (Intrinsics.LJFF(C1679030tnJ.LIZ(interfaceC1673370teB6), "border")) {
                        if (iLIZLLL != Integer.MAX_VALUE) {
                            i = iLIZLLL;
                        } else {
                            i = 0;
                        }
                        if (iLIZJ != Integer.MAX_VALUE) {
                            i2 = iLIZJ;
                        } else {
                            i2 = 0;
                        }
                        return interfaceC1689940u4u.LJLJJL(iLIZLLL, iLIZJ, C2097608Jq.LJ(), new C1679110tnR(iLIZJ, iLIZLLL, abstractC1686530tzPLJJJJZ, abstractC1686530tzPLJJJJZ2, abstractC1686530tzPLJJJJZ5, abstractC1686530tzPLJJJJZ3, abstractC1686530tzPLJJJJZ4, interfaceC1673370teB6.LJJJJZ(C1682390tsj.LIZ(i, iLIZLLL, i2, iLIZJ)), this, interfaceC1689940u4u));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1679080tnO(Function1<? super C1680770tq7, Unit> function1, boolean z, float f, InterfaceC1679150tnV interfaceC1679150tnV) {
        this.LIZ = function1;
        this.LIZIZ = z;
        this.LIZJ = f;
        this.LIZLLL = interfaceC1679150tnV;
    }

    public final int LJ(j1 j1Var, List list, int i, Function2 function2) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        for (Object obj : list) {
            if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) obj), "TextField")) {
                int iIntValue5 = ((Number) function2.invoke(obj, Integer.valueOf(i))).intValue();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next), "Label")) {
                        if (next != null) {
                            iIntValue = ((Number) function2.invoke(next, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue = 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next2), "Trailing")) {
                        if (next2 != null) {
                            iIntValue2 = ((Number) function2.invoke(next2, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue2 = 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next3 = it4.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next3), "Leading")) {
                        if (next3 != null) {
                            iIntValue3 = ((Number) function2.invoke(next3, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue3 = 0;
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next4 = it5.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next4), "Hint")) {
                        if (next4 != null) {
                            iIntValue4 = ((Number) function2.invoke(next4, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue4 = 0;
                return C1679060tnM.LIZJ(iIntValue3, iIntValue2, iIntValue5, iIntValue, iIntValue4, this.LIZJ, C1678940tnA.LIZ, j1Var.getDensity(), this.LIZLLL);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int LJI(j1 j1Var, List list, int i, Function2 function2) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        for (Object obj : list) {
            if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) obj), "TextField")) {
                int iIntValue5 = ((Number) function2.invoke(obj, Integer.valueOf(i))).intValue();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next), "Label")) {
                        if (next != null) {
                            iIntValue = ((Number) function2.invoke(next, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue = 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next2), "Trailing")) {
                        if (next2 != null) {
                            iIntValue2 = ((Number) function2.invoke(next2, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue2 = 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next3 = it4.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next3), "Leading")) {
                        if (next3 != null) {
                            iIntValue3 = ((Number) function2.invoke(next3, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue3 = 0;
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next4 = it5.next();
                    if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next4), "Hint")) {
                        if (next4 != null) {
                            iIntValue4 = ((Number) function2.invoke(next4, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                iIntValue4 = 0;
                return C1679060tnM.LIZLLL(iIntValue3, iIntValue2, iIntValue5, iIntValue, iIntValue4, this.LIZJ, C1678940tnA.LIZ, j1Var.getDensity(), this.LIZLLL);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.0tnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679100tnQ implements InterfaceC20053113dB {
    public final boolean LIZ;
    public final float LIZIZ;
    public final InterfaceC1679150tnV LIZJ;

    public C1679100tnQ(boolean z, float f, InterfaceC1679150tnV interfaceC1679150tnV) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = interfaceC1679150tnV;
    }

    public static int LJI(List list, int i, Function2 function2) {
        Object next;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        for (Object obj : list) {
            if (Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) obj), "TextField")) {
                int iIntValue4 = ((Number) function2.invoke(obj, Integer.valueOf(i))).intValue();
                Iterator it2 = list.iterator();
                do {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.LJFF(C1678940tnA.LIZJ((InterfaceC1676340tiy) next), "Label"));
                int iIntValue5 = 0;
                if (next != null) {
                    iIntValue = ((Number) function2.invoke(next, Integer.valueOf(i))).intValue();
                } else {
                    iIntValue = 0;
                }
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
                            iIntValue5 = ((Number) function2.invoke(next4, Integer.valueOf(i))).intValue();
                        }
                    }
                }
                return Math.max(iIntValue3 + Math.max(iIntValue4, Math.max(iIntValue, iIntValue5)) + iIntValue2, C1682380tsi.LJIIJ(C1678940tnA.LIZ));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZ(j1 j1Var, List list, int i) {
        return LJ(j1Var, list, i, AFwS311S0000000_25.get$arr$(12));
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZIZ(j1 j1Var, List list, int i) {
        return LJI(list, i, AFwS311S0000000_25.get$arr$(13));
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZJ(j1 j1Var, List list, int i) {
        return LJ(j1Var, list, i, AFwS311S0000000_25.get$arr$(10));
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZLLL(j1 j1Var, List list, int i) {
        return LJI(list, i, AFwS311S0000000_25.get$arr$(11));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    @Override // X.InterfaceC20053113dB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1690350u5Z LJFF(X.InterfaceC1689940u4u r34, java.util.List<? extends X.InterfaceC1673370teB> r35, long r36) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679100tnQ.LJFF(X.0u4u, java.util.List, long):X.0u5Z");
    }

    public final int LJ(j1 j1Var, List list, int i, Function2 function2) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        boolean z;
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
                if (iIntValue > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return C1679070tnN.LIZIZ(iIntValue5, z, iIntValue, iIntValue3, iIntValue2, iIntValue4, C1678940tnA.LIZ, j1Var.getDensity(), this.LIZJ);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

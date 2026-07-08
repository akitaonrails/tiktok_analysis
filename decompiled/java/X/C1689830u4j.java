package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0u4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689830u4j {
    public static final /* synthetic */ C1689830u4j LIZ = new C1689830u4j();
    public static final C1689950u4v LIZIZ = new InterfaceC1689840u4k() { // from class: X.0u4v
        @Override // X.InterfaceC1689840u4k
        public final C1688450u2V LIZ(int i, int i2, AbstractC1691450u7L abstractC1691450u7L) {
            int i3;
            if (i2 - i >= 0 && (i3 = abstractC1691450u7L.LIZIZ) != 0) {
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i3);
                int i4 = intRangeLJIILJJIL.LL;
                int i5 = intRangeLJIILJJIL.LLILLJJLI;
                int iLIZ = -1;
                if (i4 <= i5) {
                    while (abstractC1691450u7L.LIZ(i4) <= i) {
                        iLIZ = abstractC1691450u7L.LIZ(i4);
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                    if (iLIZ != -1) {
                        C1688450u2V c1688450u2V = C1689960u4w.LIZ;
                        C1688450u2V c1688450u2V2 = new C1688450u2V(1);
                        c1688450u2V2.LIZJ(iLIZ);
                        return c1688450u2V2;
                    }
                }
                return C1689960u4w.LIZ;
            }
            return C1689960u4w.LIZ;
        }

        @Override // X.InterfaceC1689840u4k
        public final int LIZIZ(List list, int i, int i2, int i3, int i4) {
            Object obj;
            int iLIZJ;
            int iMax;
            int size = ((ArrayList) list).size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    obj = ListProtector.get(list, i5);
                    if (((InterfaceC1689980u4y) obj).getIndex() != i) {
                        break;
                    }
                    i5++;
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC1689980u4y interfaceC1689980u4y = (InterfaceC1689980u4y) obj;
            if (interfaceC1689980u4y != null) {
                long jLJIIIZ = interfaceC1689980u4y.LJIIIZ(0);
                if (interfaceC1689980u4y.LJFF()) {
                    iLIZJ = C1676820tjk.LIZJ(jLJIIIZ);
                } else {
                    iLIZJ = (int) (jLJIIIZ >> 32);
                }
            } else {
                iLIZJ = Integer.MIN_VALUE;
            }
            if (i3 == Integer.MIN_VALUE) {
                iMax = -i4;
            } else {
                iMax = Math.max(-i4, i3);
            }
            if (iLIZJ != Integer.MIN_VALUE) {
                return Math.min(iMax, iLIZJ - i2);
            }
            return iMax;
        }
    };
}

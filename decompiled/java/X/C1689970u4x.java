package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689970u4x {
    public static final <T extends InterfaceC1689980u4y> List<T> LIZ(InterfaceC1689840u4k interfaceC1689840u4k, List<T> list, AbstractC1691450u7L abstractC1691450u7L, int i, int i2, int i3, int i4, Function1<? super Integer, ? extends T> function1) {
        T tInvoke;
        int iLIZJ;
        if (interfaceC1689840u4k != null) {
            ArrayList arrayList = (ArrayList) list;
            if ((!arrayList.isEmpty()) && abstractC1691450u7L.LIZIZ != 0) {
                C1688450u2V c1688450u2VLIZ = interfaceC1689840u4k.LIZ(((InterfaceC1689980u4y) C13LP.LJJJJZI(list)).getIndex(), ((InterfaceC1689980u4y) C13LP.LJJLIIIJJI(list)).getIndex(), abstractC1691450u7L);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj = ListProtector.get(list, i5);
                    int index = ((InterfaceC1689980u4y) obj).getIndex();
                    int[] iArr = abstractC1691450u7L.LIZ;
                    int i6 = abstractC1691450u7L.LIZIZ;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            break;
                        }
                        if (iArr[i7] == index) {
                            arrayList3.add(obj);
                            break;
                        }
                        i7++;
                    }
                }
                int[] iArr2 = c1688450u2VLIZ.LIZ;
                int i8 = c1688450u2VLIZ.LIZIZ;
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = iArr2[i9];
                    Iterator it2 = arrayList.iterator();
                    int i11 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (((InterfaceC1689980u4y) it2.next()).getIndex() == i10) {
                                if (i11 != -1) {
                                    tInvoke = (T) ListProtector.remove(list, i11);
                                }
                            } else {
                                i11++;
                            }
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    tInvoke = function1.invoke(Integer.valueOf(i10));
                    int iLJI = tInvoke.LJI();
                    if (i11 == -1) {
                        iLIZJ = Integer.MIN_VALUE;
                    } else {
                        long jLJIIIZ = tInvoke.LJIIIZ(0);
                        if (tInvoke.LJFF()) {
                            iLIZJ = C1676820tjk.LIZJ(jLJIIIZ);
                        } else {
                            iLIZJ = (int) (jLJIIIZ >> 32);
                        }
                    }
                    i = i;
                    int iLIZIZ = interfaceC1689840u4k.LIZIZ(arrayList3, i10, iLJI, iLIZJ, i);
                    tInvoke.LJIIJJI();
                    tInvoke.LIZJ(iLIZIZ, 0, i3, i4);
                    arrayList2.add(tInvoke);
                }
                return arrayList2;
            }
        }
        return C13BV.INSTANCE;
    }
}

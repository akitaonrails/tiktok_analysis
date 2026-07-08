package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.030W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C030W extends C1002203vw<OrderSubmitAssemViewModel> implements C034C {
    @Override // X.C034C
    public final void Z31() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    @Override // X.C034C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LK() {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C030W.LK():void");
    }

    public static C719202rO LIZIZ(List list) {
        C719202rO c719202rO;
        List<C723002s0> list2;
        if (list != null && (c719202rO = (C719202rO) C13LP.LJJJLL(list)) != null) {
            C719202rO c719202rOLIZIZ = C719202rO.LIZIZ(c719202rO, null, null, null, null, null, null, null, null, null, 1048575);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C719202rO c719202rO2 = (C719202rO) it2.next();
                if (c719202rO2 != null && (list2 = c719202rO2.LLJIJIL) != null) {
                    for (C723002s0 c723002s0 : list2) {
                        arrayList.add(c723002s0);
                        for (C719102rN c719102rN : c723002s0.LLJ) {
                            if (!c719102rN.LIZLLL() && C756302xN.LIZ(c719102rN.LLLLLJLJLL)) {
                                c719202rOLIZIZ.LLJLIL = true;
                            }
                        }
                    }
                }
            }
            if (c719202rOLIZIZ.LLJLIL) {
                C719202rO c719202rOLIZIZ2 = C719202rO.LIZIZ(c719202rOLIZIZ, null, null, null, null, null, arrayList, null, null, null, 1048543);
                c719202rOLIZIZ2.LLJLIL = true;
                return c719202rOLIZIZ2;
            }
            return null;
        }
        return null;
    }

    public static final List<InterfaceC1891350zJl> LIZJ(List<InterfaceC1891350zJl> list) {
        int iNextIndex;
        AbstractC756202xM abstractC756202xM;
        AbstractC756202xM abstractC756202xM2;
        int iIntValue;
        int iLIZ;
        AbstractC756202xM abstractC756202xM3;
        AbstractC756202xM abstractC756202xM4;
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Object obj = ListProtector.get(list, 0);
            if ((obj instanceof AbstractC756202xM) && (abstractC756202xM4 = (AbstractC756202xM) obj) != null) {
                iLIZ = abstractC756202xM4.LIZ();
            } else {
                iLIZ = -1;
            }
            arrayList2.add(ListProtector.get(list, 0));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(list, i);
                if ((interfaceC1891350zJl instanceof AbstractC756202xM) && (abstractC756202xM3 = (AbstractC756202xM) interfaceC1891350zJl) != null) {
                    if (abstractC756202xM3.LIZ() != iLIZ) {
                        if (!(interfaceC1891350zJl instanceof C757502xZ)) {
                            arrayList2.add(new C7811033h(8.0f, 0, 60, null, null, true));
                        }
                        iLIZ = abstractC756202xM3.LIZ();
                    }
                    arrayList2.add(interfaceC1891350zJl);
                }
            }
            list = arrayList2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : list) {
            if ((interfaceC1891350zJl2 instanceof AbstractC756202xM) && !(interfaceC1891350zJl2 instanceof C7811033h)) {
                AbstractC756202xM abstractC756202xM5 = (AbstractC756202xM) interfaceC1891350zJl2;
                Integer numValueOf = Integer.valueOf(abstractC756202xM5.LIZ());
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(abstractC756202xM5.LIZ()));
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                linkedHashMap.put(numValueOf, Integer.valueOf(iIntValue + 1));
            }
        }
        int i2 = 0;
        for (InterfaceC1891350zJl interfaceC1891350zJl3 : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                InterfaceC1891350zJl interfaceC1891350zJl4 = interfaceC1891350zJl3;
                if ((interfaceC1891350zJl4 instanceof AbstractC756202xM) && !(interfaceC1891350zJl4 instanceof C7811033h)) {
                    AbstractC756202xM abstractC756202xM6 = (AbstractC756202xM) interfaceC1891350zJl4;
                    int iLIZ2 = abstractC756202xM6.LIZ();
                    Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(iLIZ2));
                    if (num2 != null && num2.intValue() != 1) {
                        Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                InterfaceC1891350zJl next = it2.next();
                                if ((next instanceof AbstractC756202xM) && (abstractC756202xM2 = (AbstractC756202xM) next) != null && abstractC756202xM2.LIZ() == iLIZ2 && !(next instanceof C7811033h)) {
                                    break;
                                }
                                i4++;
                            } else {
                                i4 = -1;
                                break;
                            }
                        }
                        ListIterator<InterfaceC1891350zJl> listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                InterfaceC1891350zJl interfaceC1891350zJlPrevious = listIterator.previous();
                                if ((interfaceC1891350zJlPrevious instanceof AbstractC756202xM) && (abstractC756202xM = (AbstractC756202xM) interfaceC1891350zJlPrevious) != null && abstractC756202xM.LIZ() == iLIZ2 && !(interfaceC1891350zJlPrevious instanceof C7811033h)) {
                                    iNextIndex = listIterator.nextIndex();
                                    break;
                                }
                            } else {
                                iNextIndex = -1;
                                break;
                            }
                        }
                        if (i2 == i4) {
                            abstractC756202xM6.LLILZ = 1;
                        } else if (i2 == iNextIndex) {
                            abstractC756202xM6.LLILZ = 3;
                        } else {
                            abstractC756202xM6.LLILZ = 2;
                        }
                    } else {
                        abstractC756202xM6.LLILZ = 4;
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return list;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d9 A[PHI: r9
      0x03d9: PHI (r9v37 java.lang.String) = (r9v36 java.lang.String), (r9v39 java.lang.String), (r9v39 java.lang.String) binds: [B:220:0x03d6, B:214:0x03c3, B:216:0x03c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[PHI: r3 r6
      0x0051: PHI (r3v15 X.02rP) = (r3v13 X.02rP), (r3v20 X.02rP) binds: [B:435:0x07e4, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r6v7 X.02rO) = (r6v5 X.02rO), (r6v10 X.02rO) binds: [B:435:0x07e4, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x041c A[PHI: r9
      0x041c: PHI (r9v33 boolean) = (r9v34 boolean), (r9v35 boolean) binds: [B:232:0x041a, B:230:0x0412] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x072e  */
    @Override // X.C034C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> wA0(X.C7731030f r41) {
        /*
            Method dump skipped, instruction units count: 2282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C030W.wA0(X.030f):java.util.List");
    }
}

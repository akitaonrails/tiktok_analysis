package X;

import Y.AComparatorS36S0000000_17;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS226S0300000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1130980fXM {
    public static final List<Class<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>> LIZ = C1697810uHb.LJIIJJI(C1129840fVW.class, C293101Bp.class, C293301Br.class, C293201Bq.class, C2684012c.class, C01AY.class, C01AX.class);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList, EnumC1130940fXI enumC1130940fXI, List<Long> list, List<Long> list2, List<Long> list3) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        if (enumC1130940fXI == EnumC1130940fXI.DEFAULT) {
            return;
        }
        if ((!list.isEmpty()) && (!list2.isEmpty())) {
            return;
        }
        ArrayList<C1130990fXN> arrayList = new ArrayList();
        int i = 0;
        for (Object obj : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) obj;
                if (abstractC1126600fQI != null) {
                    Iterator<Class<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>> it2 = LIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Class<? extends AbstractC1126600fQI<? extends AnonymousClass0054>> next = it2.next();
                            if (Intrinsics.LJFF(abstractC1126600fQI.getClass(), next)) {
                                if (next != null) {
                                    arrayList.add(new C1130990fXN(i, abstractC1126600fQI));
                                }
                            }
                        }
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS36S0000000_17(24));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedList) {
            AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) obj2;
            if (abstractC1126600fQI2 != null) {
                lValueOf3 = Long.valueOf(abstractC1126600fQI2.LJI());
            } else {
                lValueOf3 = null;
            }
            if (C13LP.LJJJJ(lValueOf3, list)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : linkedList) {
            AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) obj3;
            if (abstractC1126600fQI3 != null) {
                lValueOf2 = Long.valueOf(abstractC1126600fQI3.LJI());
            } else {
                lValueOf2 = null;
            }
            if (C13LP.LJJJJ(lValueOf2, list2)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : linkedList) {
            AbstractC1126600fQI abstractC1126600fQI4 = (AbstractC1126600fQI) obj4;
            if (abstractC1126600fQI4 != null) {
                lValueOf = Long.valueOf(abstractC1126600fQI4.LJI());
            } else {
                lValueOf = null;
            }
            if (C13LP.LJJJJ(lValueOf, list3)) {
                arrayList4.add(obj4);
            }
        }
        C500260Jjc.LJJJLIIL(arrayList, new AwS226S0300000_17(arrayList2, (List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>) arrayList3, (List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>) arrayList4, (List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>) 15));
        C500260Jjc.LJJJLIIL(linkedList, new AwS596S0100000_17(arrayList, (List<C1145280fuQ>) 585));
        C500260Jjc.LJJJLIIL(linkedList, new AwS226S0300000_17(arrayList2, (List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>) arrayList3, (List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>) arrayList4, (List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>>) 16));
        ArrayList arrayList5 = new ArrayList();
        C500260Jjc.LJJJLIIL(linkedList, new AwS596S0100000_17(arrayList5, (List<C1145280fuQ>) 586));
        int i3 = C1130970fXL.LIZ[enumC1130940fXI.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    if (linkedList.size() > 1) {
                        C08XD.LJJ(linkedList, new AComparatorS36S0000000_17(26));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else if (linkedList.size() > 1) {
                C08XD.LJJ(linkedList, new AComparatorS36S0000000_17(25));
            }
        }
        linkedList.addAll(0, arrayList3);
        linkedList.addAll(0, arrayList2);
        Iterator it3 = C13LP.LJLJJLL(arrayList5).iterator();
        while (it3.hasNext()) {
            linkedList.addFirst(it3.next());
        }
        linkedList.addAll(0, arrayList4);
        for (C1130990fXN c1130990fXN : arrayList) {
            linkedList.add(Math.min(c1130990fXN.LIZ, linkedList.size()), c1130990fXN.LIZIZ);
        }
    }
}

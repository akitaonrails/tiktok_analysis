package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595390rcP {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC1595940rdI LIZ(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC1595940rdI) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC1595940rdI) it2.next()).LLIILZL().getUser().getUid());
        }
        if (arrayList2.contains(str)) {
            ArrayList<InterfaceC1595940rdI> arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof InterfaceC1595940rdI) {
                    arrayList3.add(obj2);
                }
            }
            for (InterfaceC1595940rdI interfaceC1595940rdI : arrayList3) {
                if (Intrinsics.LJFF(interfaceC1595940rdI.LLIILZL().getUser().getUid(), str)) {
                    return interfaceC1595940rdI;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return null;
    }

    public static boolean LIZIZ(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1596040rdS) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C1596040rdS) it2.next()).LL.getUser().getUid());
        }
        return arrayList2.contains(str);
    }

    public static void LIZJ(C1595260rcC c1595260rcC, C1595260rcC c1595260rcC2) {
        int i = C1595370rcN.LIZ[c1595260rcC.LIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new C1954807lC();
            }
            return;
        }
        T t = c1595260rcC.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : t) {
            if (obj instanceof C1596040rdS) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C1596040rdS c1596040rdS = (C1596040rdS) obj2;
            T t2 = c1595260rcC2.LIZIZ;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : t2) {
                if (obj3 instanceof InterfaceC1595240rcA) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(c1596040rdS.LL.getUser().getUid(), ((InterfaceC1595240rcA) it2.next()).getUid())) {
                        break;
                    }
                }
            }
            arrayList2.add(obj2);
        }
        if (!arrayList2.isEmpty()) {
            c1595260rcC2.LIZIZ.addAll(arrayList2);
        }
    }
}

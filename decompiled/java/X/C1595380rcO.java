package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595380rcO {
    public static final C1595380rcO LIZ = new C1595380rcO();

    public static void LIZ(C1595260rcC c1595260rcC, C1595260rcC c1595260rcC2) {
        boolean z;
        boolean z2;
        int i = C1595360rcM.LIZ[c1595260rcC.LIZ.ordinal()];
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
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            T t3 = c1595260rcC2.LIZIZ;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : t3) {
                if (obj4 instanceof C1596360rdy) {
                    arrayList4.add(obj4);
                }
            }
            if (!arrayList4.isEmpty()) {
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(c1596040rdS.LL.getUser().getUid(), C729510SjV.LJIIIZ(((C1596360rdy) it3.next()).LLILLJJLI))) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            c1595260rcC2.LIZIZ.addAll(arrayList2);
        }
    }
}

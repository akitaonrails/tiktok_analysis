package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0rdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595870rdB {
    public static final List<InterfaceC1891350zJl> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
        InterfaceC1595940rdI interfaceC1595940rdI;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
            if (!C0ACG.LIZ() || !(interfaceC1891350zJl2 instanceof InterfaceC1595940rdI) || (interfaceC1595940rdI = (InterfaceC1595940rdI) interfaceC1891350zJl2) == null || interfaceC1595940rdI.LLIILZL().getRelationType() != 4 || C10EU.LJIIL(((InterfaceC1595940rdI) interfaceC1891350zJl2).LLIILZL().getUser())) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        return arrayList;
    }

    public static final List<C1595600rck> LIZ(Context context, List<? extends InterfaceC1891350zJl> list, List<? extends InterfaceC1595940rdI> list2, List<C1596360rdy> list3, int i, C1595740rcy c1595740rcy, int i2) {
        boolean z;
        Object objLJJJLL = C13LP.LJJJLL(list2);
        InterfaceC1595940rdI interfaceC1595940rdI = c1595740rcy.LIZ;
        if (interfaceC1595940rdI != null) {
            objLJJJLL = interfaceC1595940rdI;
        }
        C1596360rdy c1596360rdy = (C1596360rdy) C13LP.LJJJLL(list3);
        if (objLJJJLL != null && c1596360rdy != null) {
            if (C1569180qw8.LIZ(i) && list.indexOf(objLJJJLL) >= list.indexOf(c1596360rdy)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return C1697810uHb.LJIIJJI(C1595920rdG.LIZ((InterfaceC1595940rdI) objLJJJLL, c1595740rcy), C1595920rdG.LIZIZ(context, c1596360rdy, i2));
            }
            return C1697810uHb.LJIIJJI(C1595920rdG.LIZIZ(context, c1596360rdy, i2), C1595920rdG.LIZ((InterfaceC1595940rdI) objLJJJLL, c1595740rcy));
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC1595940rdI interfaceC1595940rdI2 = (InterfaceC1595940rdI) objLJJJLL;
        if (interfaceC1595940rdI2 != null) {
            arrayList.add(C1595920rdG.LIZ(interfaceC1595940rdI2, c1595740rcy));
        }
        if (c1596360rdy != null) {
            arrayList.add(C1595920rdG.LIZIZ(context, c1596360rdy, i2));
        }
        return arrayList;
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0W1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816580W1o {
    public static void LIZ(InterfaceC816590W1p interfaceC816590W1p, List<C816670W1x> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C816640W1u c816640W1u = ((C816670W1x) it2.next()).LIZIZ;
            if (c816640W1u != null) {
                arrayList.add(c816640W1u);
            }
        }
        interfaceC816590W1p.LJFF(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C816650W1v c816650W1v = ((C816670W1x) it3.next()).LIZLLL;
            if (c816650W1v != null) {
                arrayList3.add(c816650W1v);
            }
        }
        interfaceC816590W1p.LJII(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            C816680W1y c816680W1y = ((C816670W1x) it4.next()).LIZJ;
            if (c816680W1y != null) {
                arrayList4.add(c816680W1y);
            }
        }
        interfaceC816590W1p.LIZIZ(arrayList4);
    }
}

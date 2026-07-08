package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20477715Ax {
    public static C20477615Aw LIZ(int i, List list) {
        C20477615Aw next;
        Iterator<C20477615Aw> it2 = C20477615Aw.LIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C20477615Aw c20477615Aw = next;
        if (c20477615Aw == null) {
            return null;
        }
        List<EnumC20476415Ak> list2 = c20477615Aw.LIZIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(c20477615Aw.LIZJ);
        return new C20477615Aw(i, list2, arrayList);
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08z4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2295608z4 {
    public static Set LIZ() {
        List<String> list = (List) C2295508z3.LIZIZ.getValue();
        if (list.isEmpty()) {
            list = C2295508z3.LIZ;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL(it2.next()).toString());
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static Set LIZIZ() {
        List<String> list = (List) C2295708z5.LIZIZ.getValue();
        if (list.isEmpty()) {
            list = C2295708z5.LIZ;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL(it2.next()).toString());
        }
        return C13LP.LLIIJI(arrayList);
    }
}

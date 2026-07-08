package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823750WTd {
    public static final C823750WTd LIZ = new C823750WTd();
    public static final ConcurrentHashMap<Integer, List<C0WT3>> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(int i, InterfaceC823460WSa interfaceC823460WSa) {
        List<C0WT3> arrayList = LIZIZ.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<C0WT3> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC823460WSa);
        }
    }
}

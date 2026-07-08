package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0r2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573330r2p {
    public static final C1573330r2p LIZIZ = new C1573330r2p();
    public final ConcurrentHashMap<String, C1573360r2s> LIZ = new ConcurrentHashMap<>();

    public final C1573360r2s LIZ(String str) {
        ArrayList arrayList;
        List<C1573150r2X> list;
        C1573360r2s c1573360r2s = this.LIZ.get(str);
        if (c1573360r2s != null) {
            C1573360r2s c1573360r2s2 = this.LIZ.get(str);
            if (c1573360r2s2 != null && (list = c1573360r2s2.LIZ) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1573150r2X> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LLILLJJLI.title);
                }
            } else {
                arrayList = null;
            }
            Objects.toString(arrayList);
        }
        return c1573360r2s;
    }

    public final void LIZIZ(String str, List<C1573150r2X> list, boolean z, String str2, boolean z2, List<C1573150r2X> list2, boolean z3) {
        boolean z4;
        ArrayList arrayList;
        List<C1573150r2X> list3;
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        C1573360r2s c1573360r2s = this.LIZ.get(str);
        if (c1573360r2s == null) {
            this.LIZ.put(str, new C1573360r2s(new ArrayList(list), str2, z, new ArrayList(list2), z3));
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (!z2) {
                arrayList2.addAll(c1573360r2s.LIZ);
            }
            arrayList2.addAll(list);
            ArrayList arrayList3 = new ArrayList();
            if (!z2) {
                arrayList3.addAll(c1573360r2s.LIZLLL);
            }
            arrayList3.addAll(list2);
            ConcurrentHashMap<String, C1573360r2s> concurrentHashMap = this.LIZ;
            if (!z3 && !c1573360r2s.LJ) {
                z4 = false;
            } else {
                z4 = true;
            }
            concurrentHashMap.put(str, new C1573360r2s(arrayList2, str2, z, arrayList3, z4));
        }
        C1573360r2s c1573360r2s2 = this.LIZ.get(str);
        if (c1573360r2s2 != null && (list3 = c1573360r2s2.LIZ) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<C1573150r2X> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LLILLJJLI.title);
            }
        } else {
            arrayList = null;
        }
        String.valueOf(arrayList);
    }
}

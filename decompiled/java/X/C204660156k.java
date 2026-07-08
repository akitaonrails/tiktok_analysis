package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.156k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204660156k {
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<C204664156o>> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(String str, String str2, C204664156o c204664156o) {
        int size;
        List<String> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('-');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = 1;
        if (this.LIZ.containsKey(strLIZIZ)) {
            CopyOnWriteArrayList<C204664156o> copyOnWriteArrayList = this.LIZ.get(strLIZIZ);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            }
            C204664156o c204664156o2 = (C204664156o) C13LP.LJJLIIIJL(copyOnWriteArrayList);
            int size2 = 0;
            if (c204664156o2 != null && (list = c204664156o2.LIZJ) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            List<String> list2 = c204664156o.LIZJ;
            if (list2 != null) {
                size2 = list2.size();
            }
            if (size != size2) {
                if (size < size2) {
                    i = 3;
                } else {
                    i = 2;
                }
            }
            c204664156o.LJ = i;
            copyOnWriteArrayList.add(c204664156o);
            return;
        }
        CopyOnWriteArrayList<C204664156o> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        c204664156o.LJ = 1;
        copyOnWriteArrayList2.add(c204664156o);
        this.LIZ.put(strLIZIZ, copyOnWriteArrayList2);
    }
}

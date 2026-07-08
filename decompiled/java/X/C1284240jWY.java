package X;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0jWY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284240jWY {
    public final Map<String, List<C1284260jWa>> LIZ = new ConcurrentHashMap(200);

    public final void LIZ(long j, long j2, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && j > 0 && j2 > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("put cache info : uri = ");
            sbLIZ.append(str);
            sbLIZ.append(", cacheKey = ");
            sbLIZ.append(str2);
            sbLIZ.append(", mediaSize = ");
            sbLIZ.append(j);
            sbLIZ.append(", cacheSize = ");
            sbLIZ.append(j2);
            C2188811AlT.LIZIZ(sbLIZ);
            C1475000oUE.LIZIZ().isDebug();
            if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
                List<C1284260jWa> list = (List) ((ConcurrentHashMap) this.LIZ).get(str);
                if (list.size() > 0) {
                    C1475000oUE.LIZIZ().isDebug();
                }
                for (C1284260jWa c1284260jWa : list) {
                    if (c1284260jWa != null && str2.equals(c1284260jWa.LIZ)) {
                        if (c1284260jWa.LIZIZ < j2) {
                            c1284260jWa.LIZIZ = j2;
                            return;
                        }
                        return;
                    }
                }
                list.add(new C1284260jWa(str2, j2));
                return;
            }
            C1284260jWa c1284260jWa2 = new C1284260jWa(str2, j2);
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.add(c1284260jWa2);
            ((ConcurrentHashMap) this.LIZ).put(str, copyOnWriteArrayList);
        }
    }
}

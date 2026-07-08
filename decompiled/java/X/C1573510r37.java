package X;

import com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0r37, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573510r37 {
    public final ConcurrentHashMap<String, C1573530r39> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(String str, String str2, List list, boolean z) {
        List<C1573160r2Y> list2;
        String str3;
        C1573530r39 c1573530r39 = this.LIZ.get(str);
        if (c1573530r39 == null) {
            this.LIZ.put(str, new C1573530r39(list, str2, z));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c1573530r39.LIZ);
            arrayList.addAll(list);
            this.LIZ.put(str, new C1573530r39(arrayList, str2, z));
        }
        C1573530r39 c1573530r392 = this.LIZ.get(str);
        ArrayList arrayList2 = null;
        if (c1573530r392 != null && (list2 = c1573530r392.LIZ) != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C1573160r2Y> it2 = list2.iterator();
            while (it2.hasNext()) {
                ShortDramaOverview shortDramaOverview = it2.next().LL;
                if (shortDramaOverview != null) {
                    str3 = shortDramaOverview.title;
                } else {
                    str3 = null;
                }
                arrayList3.add(str3);
            }
            arrayList2 = arrayList3;
        }
        String.valueOf(arrayList2);
    }
}

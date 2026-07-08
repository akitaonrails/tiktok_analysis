package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.05vc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1509805vc {
    public static final List LIZ(Aweme aweme, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String strLIZ = C1382800m5W.LIZ(aweme, (String) it2.next());
            if (strLIZ != null) {
                arrayList.add(strLIZ);
            }
        }
        return arrayList;
    }
}

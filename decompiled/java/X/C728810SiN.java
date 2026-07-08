package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0SiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728810SiN {
    public static final List LIZ(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            if (!C729510SjV.LJJII(aweme)) {
                arrayList.add(new C728820SiO(aweme, str));
            }
        }
        return arrayList;
    }
}

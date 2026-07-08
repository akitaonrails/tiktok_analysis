package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C208900rH {
    public static final List<Aweme> LIZ(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().m199clone());
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}

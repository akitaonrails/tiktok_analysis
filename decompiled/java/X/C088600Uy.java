package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.00Uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C088600Uy {
    public static final List<Aweme> LIZ(List<? extends Aweme> list, List<? extends Aweme> list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() == list2.size()) {
            return C13BV.INSTANCE;
        }
        Set setLLIIJI = C13LP.LLIIJI(list2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!setLLIIJI.contains(obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}

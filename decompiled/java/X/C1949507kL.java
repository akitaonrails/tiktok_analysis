package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07kL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1949507kL {
    public final ConcurrentHashMap<String, EnumC1843560y4g> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(List<? extends Aweme> list) {
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            String aid = it2.next().getAid();
            if (aid != null && aid.length() != 0) {
                this.LIZ.remove(aid);
            }
        }
    }
}

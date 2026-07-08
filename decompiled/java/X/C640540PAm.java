package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0PAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640540PAm {
    public final C0PN8 LIZ;
    public final C645130PSd LIZIZ;

    public C640540PAm(C0PN8 c0pn8, C645130PSd c645130PSd) {
        this.LIZ = c0pn8;
        this.LIZIZ = c645130PSd;
    }

    public static Integer LIZ(List list, SearchMixFeed searchMixFeed, SearchMixFeed searchMixFeed2) {
        if (list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((SearchMixFeed) it2.next()).retrieveIncrementalId() == searchMixFeed.retrieveIncrementalId()) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0) {
                ListProtector.set(list, numValueOf.intValue(), searchMixFeed2);
                return numValueOf;
            }
        }
        return null;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NMT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMT {
    public static String LIZJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene_search_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(int i, boolean z, boolean z2, SearchMixFeedList searchMixFeedList) {
        if (searchMixFeedList != null) {
            try {
                if (!searchMixFeedList.mItems.isEmpty()) {
                    LIZIZ(i, z, z2, searchMixFeedList.mItems);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZIZ(int i, boolean z, boolean z2, List list) {
        if (list == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SearchMixFeed) obj).getFeedType() == 65280) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((SearchMixFeed) it2.next()).getAweme());
            }
            C1483340ohg.LIZ(arrayList2, z, z2, LIZJ(i), false, "general_search");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: renamed from: X.0NMR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMR implements C0NMS {
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();
    public final C0NMX LIZ;
    public final C0PN8 LIZIZ;

    public static boolean LIZJ(SearchMixFeed searchMixFeed) {
        String aid;
        if (C0NMV.LIZ(searchMixFeed)) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = LIZJ;
            Aweme aweme = searchMixFeed.getAweme();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (copyOnWriteArraySet.contains(aid)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0NMS
    public final void LIZ(SearchMixFeedList searchMixFeedList) {
        ArrayList arrayList;
        if (searchMixFeedList != null) {
            List<SearchMixFeed> list = searchMixFeedList.mItems;
            if (list != null) {
                arrayList = new ArrayList();
                for (SearchMixFeed searchMixFeed : list) {
                    if (!LIZJ(searchMixFeed)) {
                        arrayList.add(searchMixFeed);
                    }
                }
            } else {
                arrayList = null;
            }
            searchMixFeedList.mItems = arrayList;
        }
    }

    @Override // X.C0NMS
    public final List<SearchMixFeed> LIZIZ(List<? extends SearchMixFeed> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        int i = this.LIZIZ.LLJJJJ;
        if (C0A0H.LIZ()) {
            Collection collection = (Collection) ((ConcurrentHashMap) C0PIR.LIZIZ.getValue()).remove(Integer.valueOf(i));
            if (collection != null) {
                arrayList.addAll(collection);
            }
        } else {
            Object objRemove = C0PIR.LIZJ().remove(Integer.valueOf(i));
            if (objRemove != null) {
                arrayList.add(objRemove);
            }
        }
        return this.LIZ.LIZ(arrayList, new AwS623S0100000_9(this, 197));
    }

    public C0NMR(LifecycleOwner lifecycleOwner, C0NMX c0nmx, C0PN8 c0pn8) {
        this.LIZ = c0nmx;
        this.LIZIZ = c0pn8;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C0NMP(null), 2);
    }
}

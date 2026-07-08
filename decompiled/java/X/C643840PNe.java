package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import com.ss.android.ugc.aweme.search.performance.core.model.CardStreamInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643840PNe {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(SearchMixFeedList searchMixFeedList) {
        ChunkPatch chunkPatch;
        List list;
        List<ChunkPatch> list2;
        String str = null;
        if (searchMixFeedList != null && (list2 = searchMixFeedList.patchs) != null) {
            chunkPatch = (ChunkPatch) C13LP.LJJJLZIJ(0, list2);
            if (chunkPatch != null) {
                str = chunkPatch.op;
            }
        } else {
            chunkPatch = null;
        }
        if (!Intrinsics.LJFF(str, "reorder")) {
            return false;
        }
        Object obj = chunkPatch.value;
        if (!(obj instanceof List) || (list = (List) obj) == null || !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static SearchMixFeed LIZIZ(int i, SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list;
        SearchMixFeed searchMixFeed = null;
        if (i < 0 || searchMixFeedList == null || (list = searchMixFeedList.mItems) == null) {
            return null;
        }
        Iterator<SearchMixFeed> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SearchMixFeed next = it2.next();
            if (next.getCardIndex() == i) {
                searchMixFeed = next;
                break;
            }
        }
        return searchMixFeed;
    }

    public static void LIZJ(SearchMixFeedList searchMixFeedList, SearchMixFeedList searchMixFeedList2) {
        List<CardStreamInfo> list;
        CardStreamInfo cardStreamInfo;
        int cardIndex;
        ArrayList arrayList;
        List listLL;
        if (searchMixFeedList2 != null && (list = searchMixFeedList2.cardStreamInfos) != null && (cardStreamInfo = (CardStreamInfo) C13LP.LJJLIIIJJI(list)) != null && (cardIndex = cardStreamInfo.getCardIndex()) >= 0 && searchMixFeedList != null) {
            List<SearchMixFeed> list2 = searchMixFeedList.mItems;
            if (list2 != null && (listLL = C13LP.LL(list2, cardIndex + 1)) != null) {
                arrayList = new ArrayList(listLL);
            } else {
                arrayList = null;
            }
            searchMixFeedList.mItems = arrayList;
        }
    }
}

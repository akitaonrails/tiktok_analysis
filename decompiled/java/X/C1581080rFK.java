package X;

import com.ss.android.ugc.aweme.feed.LiveAwemeData;
import com.ss.android.ugc.aweme.feed.LiveAwemeList;
import com.ss.android.ugc.aweme.feed.LogPb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.toptab.repo.LiveFeedApi;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0rFK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581080rFK implements InterfaceC736910SvR<InterfaceC1581090rFL> {
    public final C1601550rmL LL = new InterfaceC1581090rFL() { // from class: X.0rmL
        @Override // X.InterfaceC1581090rFL
        public final FeedItemList fetchLiveFeedList(String str) throws ExecutionException, InterruptedException {
            LiveAwemeList liveAwemeList;
            int i;
            String str2;
            LogPb logPb;
            LiveAwemeData liveAwemeData = LiveFeedApi.LIZIZ.fetchLiveFeedList(str).get();
            List<Aweme> list = null;
            if (liveAwemeData != null) {
                liveAwemeList = liveAwemeData.data;
            } else {
                liveAwemeList = null;
            }
            FeedItemList feedItemList = new FeedItemList();
            if (liveAwemeList != null) {
                list = liveAwemeList.items;
            }
            feedItemList.setItems(list);
            if (liveAwemeList != null) {
                i = liveAwemeList.hasMore;
            } else {
                i = 0;
            }
            feedItemList.hasMore = i;
            if (liveAwemeList == null || (logPb = liveAwemeList.logPb) == null || (str2 = logPb.imprId) == null) {
                str2 = "";
            }
            feedItemList.setRequestId(str2);
            return feedItemList;
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}

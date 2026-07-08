package Y;

import X.C09JN;
import X.C13BV;
import X.C1587310rPN;
import X.C15UL;
import X.C15UV;
import X.C1C7U;
import X.C2153908cD;
import X.C5182020e;
import X.EnumC1779750wPl;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTopicMonitorManager;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitorTopic;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootManager;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import com.ss.android.ugc.aweme.explore.monitor.net.ExploreCustomApiManager;
import com.ss.android.ugc.aweme.explore.monitor.net.ExploreCustomApiMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS221S0000000_31;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public class AfS8S0000100_31 implements C09JN {
    public final int $t;
    public long j0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS8S0000100_31(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS8S0000100_31 afS8S0000100_31, Object obj) {
        C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryRelatedExploreAwemeList$2");
        Throwable th = (Throwable) obj;
        C15UV.LIZ.getClass();
        C15UV.LIZIZ(th, true);
        long j = afS8S0000100_31.j0;
        String message = th.getMessage();
        if (message == null) {
            message = "unknown error";
        }
        C15UV.LJFF(j, message, false);
        C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.queryRelatedExploreAwemeList$2");
    }

    public static final void accept$1(AfS8S0000100_31 afS8S0000100_31, Object obj) throws JSONException {
        C1C7U.LIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$1");
        Map<String, String> mapLIZ = C1587310rPN.LIZ("/tiktok/feed/explore/custom/feed/v1", (Throwable) obj);
        C2153908cD c2153908cD = C2153908cD.LIZ;
        C5182020e c5182020e = new C5182020e(mapLIZ, (Map<String, String>) 444);
        c2153908cD.getClass();
        C2153908cD.LIZ("ExploreTopicFeedApi", c5182020e);
        ExploreCustomApiMonitor exploreCustomApiMonitorIsSuccess = ExploreCustomApiManager.INSTANCE.isSuccess(Long.valueOf(afS8S0000100_31.j0), false);
        if (exploreCustomApiMonitorIsSuccess != null) {
            exploreCustomApiMonitorIsSuccess.errorMsg(mapLIZ);
            exploreCustomApiMonitorIsSuccess.end();
        }
        Explore0VVTrackerMonitorTopic explore0VVTrackerMonitorTopicMonitorFor = Explore0VVTopicMonitorManager.INSTANCE.monitorFor(afS8S0000100_31.j0);
        explore0VVTrackerMonitorTopicMonitorFor.dataStatus(C15UL.REQUEST_FAILED);
        explore0VVTrackerMonitorTopicMonitorFor.errorExtra(mapLIZ);
        ExploreLCPTracker.INSTANCE.markFailure$explore_release(Long.valueOf(afS8S0000100_31.j0), EnumC1779750wPl.DATA_LOAD);
        C1C7U.LIZIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$1");
    }

    public static final void accept$2(AfS8S0000100_31 afS8S0000100_31, Object obj) throws JSONException {
        C15UL c15ul;
        C1C7U.LIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$2");
        ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = (ExploreTopicAwemeListResponse) obj;
        C2153908cD c2153908cD = C2153908cD.LIZ;
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(447);
        c2153908cD.getClass();
        C2153908cD.LIZIZ("ExploreTopicFeedApi", aFwS221S0000000_31);
        ExploreCustomApiMonitor exploreCustomApiMonitorIsSuccess = ExploreCustomApiManager.INSTANCE.isSuccess(Long.valueOf(afS8S0000100_31.j0), true);
        if (exploreCustomApiMonitorIsSuccess != null) {
            List list = exploreTopicAwemeListResponse.items;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            exploreCustomApiMonitorIsSuccess.itemCount(list.size());
            exploreCustomApiMonitorIsSuccess.end();
        }
        ExploreLCPTracker.INSTANCE.markDataLoadSuccess$explore_release(Long.valueOf(afS8S0000100_31.j0));
        ExploreCustomFeedColdBootManager exploreCustomFeedColdBootManager = ExploreCustomFeedColdBootManager.LIZ;
        Long lValueOf = Long.valueOf(afS8S0000100_31.j0);
        exploreCustomFeedColdBootManager.getClass();
        ExploreCustomFeedColdBootManager.LIZJ(lValueOf);
        List<Aweme> list2 = exploreTopicAwemeListResponse.items;
        if (list2 != null && !list2.isEmpty()) {
            c15ul = C15UL.REQUEST_SUCCESS_NOT_RENDERED;
        } else {
            c15ul = C15UL.REQUEST_SUCCESS_EMPTY;
        }
        Explore0VVTopicMonitorManager.INSTANCE.monitorFor(afS8S0000100_31.j0).dataStatus(c15ul);
        C1C7U.LIZIZ("ExploreTopicFeedApi@fc3e.queryCustomFeedWithChunk$2");
    }
}

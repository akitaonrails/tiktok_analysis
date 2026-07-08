package X;

import com.ss.android.ugc.aweme.explore.api.ExploreTopicFeedRetrofit;
import com.ss.android.ugc.aweme.explore.api.ExploreTopicRequestParams;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicUpdateResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0y1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841780y1o {
    public static final C1841780y1o LIZ = new C1841780y1o();
    public static final ConcurrentHashMap<Long, String> LIZIZ = new ConcurrentHashMap<>();

    public static C11JN LIZ(List list) {
        C15O7<ExploreCustomTopicUpdateResponse> c15o7UpdateCustomTopics;
        final Object obj = null;
        new Object(obj) { // from class: X.0y1r
            public List<ExploreCustomTopicResponse> LIZ = null;
        };
        ExploreTopicRequestParams exploreTopicRequestParams = new ExploreTopicRequestParams(list);
        ExploreTopicFeedRetrofit.LIZ.getClass();
        ExploreTopicFeedRetrofit value = C1841820y1s.LIZIZ.getValue();
        if (value == null || (c15o7UpdateCustomTopics = value.updateCustomTopics(exploreTopicRequestParams)) == null) {
            return null;
        }
        return C11NZ.LJIJJLI(new C2502409rK(c15o7UpdateCustomTopics, 5)).LJL(C11S5.LIZ()).LJJIJIIJI(new C09JN() { // from class: X.0y1p
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("ExploreTopicFeedApi@fc3e.updateCustomTopics$1");
                Map<String, String> mapLIZ = C1587310rPN.LIZ("/tiktok/feed/explore/custom/topic/update/v1", (Throwable) obj2);
                C2153908cD c2153908cD = C2153908cD.LIZ;
                C5182020e c5182020e = new C5182020e(mapLIZ, (Map<String, String>) 445);
                c2153908cD.getClass();
                C2153908cD.LIZ("ExploreTopicFeedApi", c5182020e);
                C1C7U.LIZIZ("ExploreTopicFeedApi@fc3e.updateCustomTopics$1");
            }
        }).LJJIJIIJIL(new C09JN() { // from class: X.0y1q
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("ExploreTopicFeedApi@fc3e.updateCustomTopics$2");
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(302);
                c2153908cD.getClass();
                C2153908cD.LIZIZ("ExploreTopicFeedApi", aFwS216S0000000_27);
                C1C7U.LIZIZ("ExploreTopicFeedApi@fc3e.updateCustomTopics$2");
            }
        });
    }
}

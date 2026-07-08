package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedMultiSceneComponentsData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703940RjM extends C09AY implements Function0<FeedMultiSceneComponentsData> {
    public C703940RjM() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final FeedMultiSceneComponentsData invoke() {
        Object c098200Yq;
        C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
        Object objLJJII = c2277711EDh.LJJII();
        boolean z = objLJJII instanceof FeedMultiSceneComponentsData;
        FeedMultiSceneComponentsData feedMultiSceneComponentsData = objLJJII;
        if (!z) {
            feedMultiSceneComponentsData = 0;
        }
        if (feedMultiSceneComponentsData == 0) {
            C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
            try {
                c098200Yq = (FeedMultiSceneComponentsData) C7740030o.LIZ().getGson().LJII(c2277711EDh.LJJJIL(), FeedMultiSceneComponentsData.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            feedMultiSceneComponentsData = (FeedMultiSceneComponentsData) c098200Yq;
            if (feedMultiSceneComponentsData != 0) {
                feedMultiSceneComponentsData.LIZ = true;
            }
            try {
                FeedMultiSceneComponentsData feedMultiSceneComponentsData2 = (FeedMultiSceneComponentsData) C08JS.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("multi_scene_feed_components", "{}"), FeedMultiSceneComponentsData.class);
                FeedMultiSceneComponentsData feedMultiSceneComponentsData3 = feedMultiSceneComponentsData2;
                if (feedMultiSceneComponentsData2 == null) {
                    feedMultiSceneComponentsData3 = feedMultiSceneComponentsData;
                }
                if ((feedMultiSceneComponentsData3 != null ? feedMultiSceneComponentsData3.globalContainerMap : null) == null) {
                    C12862051o.LIZ("empty_container_map");
                    return feedMultiSceneComponentsData;
                }
                if (feedMultiSceneComponentsData3.globalComponentMap == null) {
                    C12862051o.LIZ("empty_component_list");
                    return feedMultiSceneComponentsData;
                }
                if (feedMultiSceneComponentsData3.multiSceneComponentPriorityData != null) {
                    return feedMultiSceneComponentsData3;
                }
                C12862051o.LIZ("empty_scene_list");
                return feedMultiSceneComponentsData;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return feedMultiSceneComponentsData;
    }
}

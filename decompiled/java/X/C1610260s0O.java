package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0s0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610260s0O {
    public final C1610270s0P LIZ = new AbstractC1610280s0Q() { // from class: X.0s0P
        @Override // X.AbstractC1610280s0Q
        public final C2230608oa<Long> LIZIZ() {
            return SharePrefCache.inst().getLastFeedTime();
        }
    };
    public final C2230608oa<Long> LIZIZ;
    public volatile long LIZJ;
    public int LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0s0P] */
    public C1610260s0O() {
        C2230608oa<Long> lastFeedCount = SharePrefCache.inst().getLastFeedCount();
        this.LIZIZ = lastFeedCount;
        this.LIZJ = lastFeedCount.LIZ().longValue();
        EventBus.LIZLLL().LJIJJ(this);
        SharePrefCache.inst().getLastFeedTime().LIZ().longValue();
    }

    public final void LIZ(FeedItemList feedItemList) {
        try {
            C797930VRv.LIZIZ("updateFetchOtherFeed");
            if (!C590410NDr.LJ) {
                C590410NDr.LJ = true;
                C590410NDr.LJFF = System.currentTimeMillis();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (LIZ(jCurrentTimeMillis)) {
                this.LIZJ = -1L;
                this.LIZIZ.LJ(Long.valueOf(this.LIZJ));
            }
            this.LIZJ++;
            this.LIZIZ.LJ(Long.valueOf(this.LIZJ));
            LIZIZ().LJ(Long.valueOf(jCurrentTimeMillis));
            long j = this.LIZJ;
            if (feedItemList != null && feedItemList.getItems() != null) {
                Iterator<Aweme> it2 = feedItemList.getItems().iterator();
                while (it2.hasNext()) {
                    AwemeBizExtKt.setFeedCount(it2.next(), j);
                }
            }
            this.LIZLLL++;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @C14EU(sticky = true)
    public void onQueryUserFinishedEvent(C848430XQb c848430XQb) {
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Cr();
        this.LIZJ = -1L;
        this.LIZIZ.LJ(Long.valueOf(this.LIZJ));
    }
}

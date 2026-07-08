package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;

/* JADX INFO: renamed from: X.09Da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2335209Da implements Runnable {
    public static final RunnableC2335209Da LL = new RunnableC2335209Da();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchGsonOptV3Exp@8e01.doGsonPrefetch$1");
        try {
            C2333109Cf c2333109Cf = C2333109Cf.LIZ;
            RunnableC2335309Db runnableC2335309Db = new Runnable() { // from class: X.09Db
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ2;
                    C1C7U.LIZ("SearchGsonOptV3Exp@8e01.doGsonPrefetch$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ2) {
                        }
                    }
                    C1C7U.LIZIZ("SearchGsonOptV3Exp@8e01.doGsonPrefetch$1$1");
                }

                public static void LIZ() {
                    try {
                        Gson gson = C7740030o.LIZ().getGson();
                        gson.LJIIJ(SearchMixFeedList.class);
                        gson.LJIIJ(SearchMixFeed.class);
                        gson.LJIIJ(Aweme.class);
                        gson.LJIIJ(GlobalDoodleConfig.class);
                        gson.LJIIJ(Video.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C688420QzQ.LIZIZ.LJII(e);
                    }
                }
            };
            c2333109Cf.getClass();
            C2333109Cf.LIZ(runnableC2335309Db);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchGsonOptV3Exp@8e01.doGsonPrefetch$1");
    }
}

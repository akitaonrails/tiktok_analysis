package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2335409Dc extends C09AY implements Function0<Unit> {
    public C2335409Dc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (((Number) C2335509Dd.LIZ.getValue()).intValue() == 1) {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.09DY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchGsonOptV2Exp@261.doGsonPrefetch$1");
                    try {
                        C2333109Cf c2333109Cf = C2333109Cf.LIZ;
                        C09DZ c09dz = new Runnable() { // from class: X.09DZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ2;
                                C1C7U.LIZ("SearchGsonOptV2Exp@261.doGsonPrefetch$1$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ2) {
                                    }
                                }
                                C1C7U.LIZIZ("SearchGsonOptV2Exp@261.doGsonPrefetch$1$1");
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
                        C2333109Cf.LIZ(c09dz);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchGsonOptV2Exp@261.doGsonPrefetch$1");
                }
            });
        }
        return Unit.LIZ;
    }
}

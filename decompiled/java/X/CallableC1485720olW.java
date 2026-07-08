package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0olW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class CallableC1485720olW implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        String string2;
        List<FeedLoadMorePlan> plans;
        C1C7U.LIZ("FeedExperimentUtils@71ab.checkAndInitAddPreloadResultListener$1L");
        SmartFeedPreloadService.instance().addResultListener(C303210BuZ.LIZJ);
        String smartPreloadStrategyV2ExperimentJsonString = SmartFeedPreloadService.instance().getSmartPreloadStrategyV2ExperimentJsonString();
        if (!TextUtils.isEmpty(smartPreloadStrategyV2ExperimentJsonString)) {
            C1478160oZK.LIZ().LJJIJIIJIL(smartPreloadStrategyV2ExperimentJsonString);
        }
        if (!C1485710olV.LIZ) {
            C1485710olV.LIZ = true;
            C1485710olV.LIZIZ = (n) C0C64.LJIILLIIL().LJJII(n.class, null, "video_smart_range_request_v1", true);
        }
        if (C1485710olV.LIZIZ == null) {
            string = null;
        } else {
            n nVar = new n();
            nVar.LJJIFFI("video_smart_range_request_v1", C1485710olV.LIZIZ);
            string = nVar.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            C1478160oZK.LIZ().LJJJJLI(string);
        }
        h hVar = new h();
        h hVar2 = new h();
        SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfigLIZ = C1485730olX.LIZ();
        if (smartFeedLoadMoreStrategyConfigLIZ != null && (plans = smartFeedLoadMoreStrategyConfigLIZ.getPlans()) != null) {
            boolean z = false;
            for (FeedLoadMorePlan feedLoadMorePlan : plans) {
                if (feedLoadMorePlan.getPreloadPlan() != null) {
                    n nVar2 = new n();
                    nVar2.LJJIII(Integer.valueOf(feedLoadMorePlan.getPreloadDuration()), "preload_duration");
                    nVar2.LJJIFFI("preload_plan", GsonProtectorUtils.toJsonTree(new Gson(), feedLoadMorePlan.getPreloadPlan()));
                    hVar2.LJJIFFI(nVar2);
                    boolean preload = feedLoadMorePlan.getPreload();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loadmore-");
                    sbLIZ.append(preload);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    hVar.LJJIII(strLIZIZ);
                    if (C1485730olX.LIZLLL == null) {
                        C1485730olX.LIZLLL = new HashMap<>();
                    }
                    HashMap<Boolean, String> map = C1485730olX.LIZLLL;
                    if (map != null) {
                        map.put(Boolean.valueOf(feedLoadMorePlan.getPreload()), strLIZIZ);
                    }
                    z = true;
                }
            }
            C1485730olX.LIZJ = z;
        }
        if (hVar.size() <= 0 || hVar2.size() <= 0) {
            string2 = null;
        } else {
            n nVar3 = new n();
            nVar3.LJJIFFI("lable_index_mapping", hVar);
            nVar3.LJJIFFI("plan", hVar2);
            n nVar4 = new n();
            nVar4.LJJIFFI("timeliness_preload_config", nVar3);
            string2 = nVar4.toString();
        }
        if (!TextUtils.isEmpty(string2)) {
            C1478160oZK.LIZ().LJJJZ(string2);
        }
        C1C7U.LIZIZ("FeedExperimentUtils@71ab.checkAndInitAddPreloadResultListener$1L");
        return null;
    }
}

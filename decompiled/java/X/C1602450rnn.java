package X;

import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.DeletedLiveInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602450rnn extends C09AY implements Function0<InterfaceC1564100qnw> {
    public final /* synthetic */ FeedLiveStatusManagerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602450rnn(FeedLiveStatusManagerComponent feedLiveStatusManagerComponent) {
        super(0);
        this.LL = feedLiveStatusManagerComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0rnW] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1564100qnw invoke() {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        final FeedLiveStatusManagerComponent feedLiveStatusManagerComponent = this.LL;
        return iLiveOuterService.s3(new InterfaceC1602420rnk() { // from class: X.0rnW
            @Override // X.InterfaceC1602420rnk
            public final long LIZ() {
                return feedLiveStatusManagerComponent.lo(0L, false);
            }

            @Override // X.InterfaceC1602420rnk
            public final void LIZJ() {
                FeedLiveStatusManagerComponent feedLiveStatusManagerComponent2 = feedLiveStatusManagerComponent;
                if (feedLiveStatusManagerComponent2.mo()) {
                    Hox hox = (Hox) feedLiveStatusManagerComponent2.LLJILJILJ.getValue();
                    if (hox == null || !hox.KQ2("For You")) {
                        feedLiveStatusManagerComponent2.uo("timed_trigger_rule_end", new JSONObject());
                    } else {
                        feedLiveStatusManagerComponent2.uo("timed_trigger_rule_start", new JSONObject());
                    }
                }
            }

            @Override // X.InterfaceC1602420rnk
            public final List<Aweme> getAwemeList() {
                return feedLiveStatusManagerComponent.getAwemeList();
            }

            @Override // X.InterfaceC1602420rnk
            public final void LIZIZ(JSONObject jSONObject, Map<String, String> map, List<String> list, List<String> list2, List<String> list3) {
                C1602310rnZ c1602310rnZFo = feedLiveStatusManagerComponent.fo();
                c1602310rnZFo.getClass();
                AbstractC827810Wdf.LIZ("LiveCardUpdateManager", "handleHotReloadWithCep: start");
                int iOptInt = jSONObject.optInt("delete_index", -1);
                c1602310rnZFo.LJIIJ(list3, jSONObject.optInt("hot_reload_type"), list, list2, (List) GsonProtectorUtils.fromJson(C09C2.LIZ(), jSONObject.optString("deleteIndexArray"), new TypeToken<List<DeletedLiveInfo>>() { // from class: X.02yB
                }.getType()), C120100cx.LIZ(C1602440rnm.LIZ(jSONObject.optString("load_more_origin_list"))), iOptInt, map);
            }
        });
    }
}

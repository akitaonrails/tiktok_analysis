package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1789306zb extends C09AY implements Function0<Integer> {
    public C1789306zb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF() ? -1 : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("lego_request_opt", 0));
    }
}

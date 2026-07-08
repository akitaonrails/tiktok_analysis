package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0721, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0721 extends C09AY implements Function0<Integer> {
    public AnonymousClass0721() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("appflyer_opt", 0);
        return Integer.valueOf((((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF() && (i == 7 || i == 0)) ? 8 : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("appflyer_opt", 0));
    }
}

package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0736, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0736 extends C09AY implements Function0<Integer> {
    public AnonymousClass0736() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i;
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF()) {
            i = -1;
        } else {
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            AnonymousClass0737.LIZ.getClass();
            i = repo.getInt("notification_show_opt", 0);
        }
        return Integer.valueOf(i);
    }
}

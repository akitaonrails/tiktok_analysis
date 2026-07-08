package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CNH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNH extends C09AY implements Function0<Integer> {
    public C0CNH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i;
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF()) {
            i = -1;
        } else {
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            C2187951Ak5.LIZ.getClass();
            i = repo.getInt("java_threadpriority", 0);
        }
        return Integer.valueOf(i);
    }
}

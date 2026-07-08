package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1854407Oc extends C09AY implements Function0<Integer> {
    public C1854407Oc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i;
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF()) {
            C1854507Od.LIZ.getClass();
            i = C1854507Od.LIZIZ;
        } else {
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            C1854507Od.LIZ.getClass();
            i = repo.getInt("apm_downgrade_v2", 0);
        }
        return Integer.valueOf(i);
    }
}

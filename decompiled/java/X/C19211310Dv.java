package X;

import Y.ACallableS431S0100000_28;
import Y.ARunnableS101S0000000_28;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.api.FeedStatsApi;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.10Dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19211310Dv extends AbstractC666100QAu<PrivateUrlModel> {
    public static FeedStatsApi LL;

    public static void LJIIJ() {
        if ((Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("cold_boot_mainAct_degradation", 0) & 32) == 0) {
            LL = (FeedStatsApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(FeedStatsApi.class);
        }
    }

    public C19211310Dv() {
        LJIIJ();
    }

    public C19211310Dv(long j) {
        if (j != -1) {
            C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS101S0000000_28(3));
        } else {
            LJIIJ();
        }
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS431S0100000_28(objArr, 35), 0);
        return true;
    }
}

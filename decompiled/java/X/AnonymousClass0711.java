package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0711, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0711 extends C09AY implements Function0<Boolean> {
    public AnonymousClass0711() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("optimize_corehandler", false));
    }
}

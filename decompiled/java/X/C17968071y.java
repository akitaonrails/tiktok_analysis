package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperimentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.071y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C17968071y extends C09AY implements Function0<Boolean> {
    public C17968071y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ViewStubOptExperimentV2.Companion.getClass();
        if (!ViewStubOptExperimentV2.hasInit) {
            ViewStubOptExperimentV2.hasInit = true;
            ViewStubOptExperimentV2.expVal = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean(ViewStubOptExperimentV2.KEY, false);
        }
        return Boolean.valueOf(ViewStubOptExperimentV2.expVal);
    }
}

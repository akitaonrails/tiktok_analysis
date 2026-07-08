package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206281BWo extends C09AY implements Function0<Integer> {
    public C2206281BWo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C2206291BWp.LIZ.getClass();
        return Integer.valueOf(repo.getInt("is_downgrade_opt", C2206291BWp.LJIIL));
    }
}

package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310270CEf extends C09AY implements Function0<Keva> {
    public C310270CEf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
    }
}

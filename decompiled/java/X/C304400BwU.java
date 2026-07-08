package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304400BwU extends C09AY implements Function0<C1519810peV> {
    public C304400BwU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1519810peV invoke() {
        return new C1519810peV(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME));
    }
}

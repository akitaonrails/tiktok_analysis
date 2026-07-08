package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C6W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C6W extends C09AY implements Function0<Float> {
    public C0C6W() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getFloat("max_cache_proportion", 0.33f));
    }
}

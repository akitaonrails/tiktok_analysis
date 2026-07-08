package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.071K, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C071K extends C09AY implements Function0<Integer> {
    public C071K() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("optimize_endlesslooper", -1));
    }
}

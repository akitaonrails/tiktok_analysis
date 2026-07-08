package X;

import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1783806yi extends C09AY implements Function0<Boolean> {
    public C1783806yi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        FollowFeedViewStubExperiment.Companion.getClass();
        if (!FollowFeedViewStubExperiment.hasInit) {
            FollowFeedViewStubExperiment.hasInit = true;
            FollowFeedViewStubExperiment.expVal = C1827607Du.LJIIIZ(new C1783606yg(), C1785606z0.LIZ());
        }
        return Boolean.valueOf(FollowFeedViewStubExperiment.expVal);
    }
}

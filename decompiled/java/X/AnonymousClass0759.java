package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0759, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0759 extends C09AY implements Function0<Integer> {
    public AnonymousClass0759() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i = -100;
        try {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("set_main_thread_priority", -100);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(i);
    }
}

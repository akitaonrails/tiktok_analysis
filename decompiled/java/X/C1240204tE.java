package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1240204tE extends C09AY implements Function0<Boolean> {
    public C1240204tE() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool;
        try {
            Boolean boolValueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("open_bdtracker_event_priority", false));
            C189200o6.m2constructorimpl(boolValueOf);
            bool = boolValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            bool = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(bool) != null ? Boolean.FALSE : bool;
    }
}

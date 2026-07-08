package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04tH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1240504tH extends C09AY implements Function0<Integer> {
    public C1240504tH() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Object obj;
        try {
            Integer numValueOf = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("ultimate_inflater_layout_preload_for_fyp_at_lest_2880", 0));
            C189200o6.m2constructorimpl(numValueOf);
            obj = numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Integer num = obj;
        if (thM5exceptionOrNullimpl != null) {
            num = 0;
        }
        num.intValue();
        return num;
    }
}

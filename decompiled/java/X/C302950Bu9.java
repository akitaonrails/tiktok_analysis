package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.0Bu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302950Bu9 {
    public static final boolean LIZ() {
        Boolean boolValueOf;
        return (C1867110ygf.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("spark_enable_e2e_tracing") && (boolValueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("spark_enable_e2e_tracing", false))) != null) ? boolValueOf.booleanValue() : C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "spark_enable_e2e_tracing", true, false);
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1252504vD extends C09AY implements Function0<Boolean> {
    public C1252504vD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("casting_experiment_precise", 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

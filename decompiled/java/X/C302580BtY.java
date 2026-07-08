package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302580BtY extends C09AY implements Function0<Boolean> {
    public C302580BtY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("apm_terminal_monitor_opt", false));
    }
}

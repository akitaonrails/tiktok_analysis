package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.071H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C071H extends C09AY implements Function0<Boolean> {
    public C071H() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("coldboot_commerce_logic_opt_enable", false));
    }
}

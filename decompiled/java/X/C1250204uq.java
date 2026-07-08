package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1250204uq extends C09AY implements Function0<Boolean> {
    public C1250204uq() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C08Q0.LJ(C1BWL.LIZ(), "optimize_kevasp", false) ? Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("ttk_a11y_system_setting_track_enabled", false) : C0C64.LJIILLIIL().LJIIIZ(31744, "ttk_a11y_system_setting_track_enabled", true, false));
    }
}

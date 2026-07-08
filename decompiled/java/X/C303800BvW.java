package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303800BvW extends C09AY implements Function0<Boolean> {
    public C303800BvW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        if (!C293840BfS.LIZIZ && (!((Boolean) C303880Bve.LJIIIZ.getValue()).booleanValue() ? C0C64.LJIILLIIL().LJIJ(31744, 0, "big_screen_bottom_height", true) == 0 : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("big_screen_bottom_height", 0) == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

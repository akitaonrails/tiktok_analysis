package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1856407Ow extends C09AY implements Function0<Boolean> {
    public C1856407Ow() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("live_setting_solidify_new_user_flag", false) ? true : C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(442)));
    }
}

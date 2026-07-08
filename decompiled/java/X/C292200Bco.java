package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292200Bco extends C09AY implements Function0<Long> {
    public C292200Bco() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_boot_config", 0L));
    }
}

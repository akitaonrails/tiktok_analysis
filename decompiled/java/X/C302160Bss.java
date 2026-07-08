package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302160Bss extends C09AY implements Function0<Boolean> {
    public C302160Bss() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C2187451AjH.LJIIJ() ? false : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("first_feed_preloadnetvideocover_v2", false));
    }
}

package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Buz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303470Buz extends C09AY implements Function0<Long> {
    public C303470Buz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("optimize_asyncinflateprofiledelaytime", -1L));
    }
}

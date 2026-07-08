package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302170Bst extends C09AY implements Function0<Boolean> {
    public C302170Bst() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C2187451AjH.LJIIJ() ? true : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("first_feed_usecachedcoverbitmap_v2", false));
    }
}

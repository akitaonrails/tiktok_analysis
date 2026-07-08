package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C291780Bc8 extends C09AY implements Function0<Boolean> {
    public C291780Bc8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("key_jato_hwui_opt", 0) > 0);
    }
}

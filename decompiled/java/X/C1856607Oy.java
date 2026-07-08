package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.07Oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1856607Oy {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        SettingsManager.LIZLLL().getClass();
        repo.storeBoolean("enable_vboost_settings", SettingsManager.LIZ("enable_vboost_settings", false));
    }
}

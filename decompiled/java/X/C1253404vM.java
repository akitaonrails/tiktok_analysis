package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.04vM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253404vM {
    public static final String LIZ() {
        String string;
        if (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("spark_hide_loading_js") && (string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("spark_hide_loading_js", "")) != null) {
            return string;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("spark_hide_loading_js", "");
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.0BtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302560BtW {
    public static String LIZ() {
        String string;
        if (C1867110ygf.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("spark_i18n_starling_prefix") && (string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("spark_i18n_starling_prefix", "")) != null) {
            return string;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJI("spark_i18n_starling_prefix", "10/starling/resource");
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.TiktokInterceptIllegalBundleConfigModel;

/* JADX INFO: renamed from: X.080v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20487080v {
    public static final TiktokInterceptIllegalBundleConfigModel LIZ;

    static {
        new C20487080v();
        LIZ = new TiktokInterceptIllegalBundleConfigModel(true, true, C1697810uHb.LJIILJJIL(".."));
    }

    public static final TiktokInterceptIllegalBundleConfigModel LIZ() {
        TiktokInterceptIllegalBundleConfigModel tiktokInterceptIllegalBundleConfigModel;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("tiktok_intercept_illegal_bundle_config") || (tiktokInterceptIllegalBundleConfigModel = (TiktokInterceptIllegalBundleConfigModel) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("tiktok_intercept_illegal_bundle_config", ""), TiktokInterceptIllegalBundleConfigModel.class)) == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            TiktokInterceptIllegalBundleConfigModel tiktokInterceptIllegalBundleConfigModel2 = LIZ;
            tiktokInterceptIllegalBundleConfigModel = (TiktokInterceptIllegalBundleConfigModel) settingsManagerLIZLLL.LJIIIIZZ("tiktok_intercept_illegal_bundle_config", TiktokInterceptIllegalBundleConfigModel.class, tiktokInterceptIllegalBundleConfigModel2);
            if (tiktokInterceptIllegalBundleConfigModel == null) {
                return tiktokInterceptIllegalBundleConfigModel2;
            }
        }
        return tiktokInterceptIllegalBundleConfigModel;
    }
}

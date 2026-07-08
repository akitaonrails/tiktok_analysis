package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.settings.TiktokInterceptThirdPartyCdnResourceConfigModel;

/* JADX INFO: renamed from: X.04vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253804vQ {
    public static final TiktokInterceptThirdPartyCdnResourceConfigModel LIZ;

    static {
        new C1253804vQ();
        LIZ = new TiktokInterceptThirdPartyCdnResourceConfigModel(false, false, null, Boolean.TRUE);
    }

    public static final TiktokInterceptThirdPartyCdnResourceConfigModel LIZ() {
        TiktokInterceptThirdPartyCdnResourceConfigModel tiktokInterceptThirdPartyCdnResourceConfigModel;
        if (!C1253204vK.LIZ() || !Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("tiktok_intercept_third_party_cdn_resource_config") || (tiktokInterceptThirdPartyCdnResourceConfigModel = (TiktokInterceptThirdPartyCdnResourceConfigModel) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("tiktok_intercept_third_party_cdn_resource_config", ""), TiktokInterceptThirdPartyCdnResourceConfigModel.class)) == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            TiktokInterceptThirdPartyCdnResourceConfigModel tiktokInterceptThirdPartyCdnResourceConfigModel2 = LIZ;
            tiktokInterceptThirdPartyCdnResourceConfigModel = (TiktokInterceptThirdPartyCdnResourceConfigModel) settingsManagerLIZLLL.LJIIIIZZ("tiktok_intercept_third_party_cdn_resource_config", TiktokInterceptThirdPartyCdnResourceConfigModel.class, tiktokInterceptThirdPartyCdnResourceConfigModel2);
            if (tiktokInterceptThirdPartyCdnResourceConfigModel == null) {
                return tiktokInterceptThirdPartyCdnResourceConfigModel2;
            }
        }
        return tiktokInterceptThirdPartyCdnResourceConfigModel;
    }
}

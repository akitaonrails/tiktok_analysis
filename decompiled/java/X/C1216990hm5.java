package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.profile.business.profile.experiment.FrequencyData;
import com.ss.android.ugc.profile.business.profile.experiment.OptimizeTheEditingProfileProcessBannerConfigModel;

/* JADX INFO: renamed from: X.0hm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216990hm5 {
    public static final OptimizeTheEditingProfileProcessBannerConfigModel LIZ = new OptimizeTheEditingProfileProcessBannerConfigModel(new FrequencyData(21, 2, null, null, null), 2);

    public static final OptimizeTheEditingProfileProcessBannerConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OptimizeTheEditingProfileProcessBannerConfigModel optimizeTheEditingProfileProcessBannerConfigModel = LIZ;
        OptimizeTheEditingProfileProcessBannerConfigModel optimizeTheEditingProfileProcessBannerConfigModel2 = (OptimizeTheEditingProfileProcessBannerConfigModel) settingsManagerLIZLLL.LJIIIIZZ("optimize_the_editing_profile_process_banner_config", OptimizeTheEditingProfileProcessBannerConfigModel.class, optimizeTheEditingProfileProcessBannerConfigModel);
        return optimizeTheEditingProfileProcessBannerConfigModel2 != null ? optimizeTheEditingProfileProcessBannerConfigModel2 : optimizeTheEditingProfileProcessBannerConfigModel;
    }
}

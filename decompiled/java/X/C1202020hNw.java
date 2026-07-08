package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiCommonSettingsConfig;

/* JADX INFO: renamed from: X.0hNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202020hNw {
    public static final PoiCommonSettingsConfig LIZ = new PoiCommonSettingsConfig(null);

    public static final PoiCommonSettingsConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PoiCommonSettingsConfig poiCommonSettingsConfig = LIZ;
        PoiCommonSettingsConfig poiCommonSettingsConfig2 = (PoiCommonSettingsConfig) settingsManagerLIZLLL.LJIIIIZZ("poi_common_settings", PoiCommonSettingsConfig.class, poiCommonSettingsConfig);
        return poiCommonSettingsConfig2 != null ? poiCommonSettingsConfig2 : poiCommonSettingsConfig;
    }
}

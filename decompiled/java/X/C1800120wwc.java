package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.location_api.service.experiment.LocationRegionsConfigModel;

/* JADX INFO: renamed from: X.0wwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800120wwc {
    public static final LocationRegionsConfigModel LIZ = new LocationRegionsConfigModel(null, null, null, 7, null);

    public static LocationRegionsConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LocationRegionsConfigModel locationRegionsConfigModel = LIZ;
        LocationRegionsConfigModel locationRegionsConfigModel2 = (LocationRegionsConfigModel) settingsManagerLIZLLL.LJIIIIZZ("location_regions_config", LocationRegionsConfigModel.class, locationRegionsConfigModel);
        return locationRegionsConfigModel2 != null ? locationRegionsConfigModel2 : locationRegionsConfigModel;
    }
}

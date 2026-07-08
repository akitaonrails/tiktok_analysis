package X;

import com.bytedance.ies.abmock.SettingsManager;
import defpackage.PoiRetagEducationPanelFrequencyControlSettings;

/* JADX INFO: renamed from: X.0hNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201970hNr extends AbstractC1201410hMx {
    public static final C1201970hNr LIZIZ = new C1201970hNr();

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "poi_retag_panel_frequency_control";
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel poiRetagEducationPanelFrequencyControlModel = PoiRetagEducationPanelFrequencyControlSettings.LIZ;
        PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel poiRetagEducationPanelFrequencyControlModel2 = (PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel) settingsManagerLIZLLL.LJIIIIZZ("poi_retag_education_panel_frequency_control", PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel.class, poiRetagEducationPanelFrequencyControlModel);
        if (poiRetagEducationPanelFrequencyControlModel2 != null) {
            poiRetagEducationPanelFrequencyControlModel = poiRetagEducationPanelFrequencyControlModel2;
        }
        Integer num = poiRetagEducationPanelFrequencyControlModel.cumulativeNumberOfClosures;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // X.AbstractC1201410hMx
    public final int LJII() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel poiRetagEducationPanelFrequencyControlModel = PoiRetagEducationPanelFrequencyControlSettings.LIZ;
        PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel poiRetagEducationPanelFrequencyControlModel2 = (PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel) settingsManagerLIZLLL.LJIIIIZZ("poi_retag_education_panel_frequency_control", PoiRetagEducationPanelFrequencyControlSettings.PoiRetagEducationPanelFrequencyControlModel.class, poiRetagEducationPanelFrequencyControlModel);
        if (poiRetagEducationPanelFrequencyControlModel2 != null) {
            poiRetagEducationPanelFrequencyControlModel = poiRetagEducationPanelFrequencyControlModel2;
        }
        Integer num = poiRetagEducationPanelFrequencyControlModel.remakeDays;
        if (num != null) {
            return num.intValue();
        }
        return 30;
    }
}

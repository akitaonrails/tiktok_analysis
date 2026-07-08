package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.expriment.AnchorMonitorSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868960yje extends C09AY implements Function0<AnchorMonitorSettings.AnchorMonitorSettingsModel> {
    public C1868960yje() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnchorMonitorSettings.AnchorMonitorSettingsModel invoke() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AnchorMonitorSettings.AnchorMonitorSettingsModel anchorMonitorSettingsModel = AnchorMonitorSettings.LIZ;
            AnchorMonitorSettings.AnchorMonitorSettingsModel anchorMonitorSettingsModel2 = (AnchorMonitorSettings.AnchorMonitorSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("anchor_monitor_settings", AnchorMonitorSettings.AnchorMonitorSettingsModel.class, anchorMonitorSettingsModel);
            return anchorMonitorSettingsModel2 != null ? anchorMonitorSettingsModel2 : anchorMonitorSettingsModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return AnchorMonitorSettings.LIZ;
        }
    }
}

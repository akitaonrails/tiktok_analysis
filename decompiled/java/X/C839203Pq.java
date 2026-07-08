package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcAddOnPanelConfigModel;

/* JADX INFO: renamed from: X.03Pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C839203Pq {
    public static final EcAddOnPanelConfigModel LIZ = new EcAddOnPanelConfigModel(false, false);

    public static final EcAddOnPanelConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcAddOnPanelConfigModel ecAddOnPanelConfigModel = LIZ;
        EcAddOnPanelConfigModel ecAddOnPanelConfigModel2 = (EcAddOnPanelConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_add_on_panel_config", EcAddOnPanelConfigModel.class, ecAddOnPanelConfigModel);
        return ecAddOnPanelConfigModel2 != null ? ecAddOnPanelConfigModel2 : ecAddOnPanelConfigModel;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.stellar.base.ab.PipoStellarPageSettingsModel;

/* JADX INFO: renamed from: X.07Mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1849907Mj {
    public static final PipoStellarPageSettingsModel LIZ = new PipoStellarPageSettingsModel(null, 1, null);

    public static boolean LIZ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoStellarPageSettingsModel pipoStellarPageSettingsModel = LIZ;
        PipoStellarPageSettingsModel pipoStellarPageSettingsModel2 = (PipoStellarPageSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_stellar_page_settings", PipoStellarPageSettingsModel.class, pipoStellarPageSettingsModel);
        if (pipoStellarPageSettingsModel2 != null) {
            pipoStellarPageSettingsModel = pipoStellarPageSettingsModel2;
        }
        return C13LP.LJJJJ(str, pipoStellarPageSettingsModel.disableRecreateTargets);
    }
}

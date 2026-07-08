package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoGeckoConfigModel;

/* JADX INFO: renamed from: X.0qNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547620qNM {
    public static final PipoGeckoConfigModel LIZ = new PipoGeckoConfigModel(Boolean.FALSE, null, null);

    public static final PipoGeckoConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoGeckoConfigModel pipoGeckoConfigModel = LIZ;
        PipoGeckoConfigModel pipoGeckoConfigModel2 = (PipoGeckoConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_container_gecko_config", PipoGeckoConfigModel.class, pipoGeckoConfigModel);
        return pipoGeckoConfigModel2 != null ? pipoGeckoConfigModel2 : pipoGeckoConfigModel;
    }
}

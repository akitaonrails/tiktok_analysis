package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.ab.PipoAutoFillConfigModel;

/* JADX INFO: renamed from: X.0ucs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711000ucs {
    public static final PipoAutoFillConfigModel LIZ = new PipoAutoFillConfigModel(1, 3, 0, 600000);

    public static final PipoAutoFillConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoAutoFillConfigModel pipoAutoFillConfigModel = LIZ;
        PipoAutoFillConfigModel pipoAutoFillConfigModel2 = (PipoAutoFillConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_auto_fill_config", PipoAutoFillConfigModel.class, pipoAutoFillConfigModel);
        return pipoAutoFillConfigModel2 != null ? pipoAutoFillConfigModel2 : pipoAutoFillConfigModel;
    }
}

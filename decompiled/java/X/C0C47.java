package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.preview.experiment.PreviewConfiguration;

/* JADX INFO: renamed from: X.0C47, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C47 {
    public static final PreviewConfiguration LIZ = new PreviewConfiguration(2000, 20);

    public static PreviewConfiguration LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PreviewConfiguration previewConfiguration = LIZ;
            PreviewConfiguration previewConfiguration2 = (PreviewConfiguration) settingsManagerLIZLLL.LJIIIIZZ("ads_preview_configuration", PreviewConfiguration.class, previewConfiguration);
            return previewConfiguration2 != null ? previewConfiguration2 : previewConfiguration;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return LIZ;
        }
    }
}

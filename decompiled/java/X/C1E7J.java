package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.relation.auth.experiment.FrequencyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E7J, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E7J extends C09AY implements Function0<FrequencyConfig> {
    public C1E7J() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.relation.auth.experiment.FrequencyConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FrequencyConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FrequencyConfig frequencyConfig = C1E7I.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("social_auth_dialog_mono_freq_control", FrequencyConfig.class, frequencyConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : frequencyConfig;
    }
}

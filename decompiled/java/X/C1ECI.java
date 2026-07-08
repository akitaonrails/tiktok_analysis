package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.ams.adapter.experiment.AppMeasurementOptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ECI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ECI extends C09AY implements Function0<AppMeasurementOptConfig> {
    public C1ECI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.ams.adapter.experiment.AppMeasurementOptConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppMeasurementOptConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AppMeasurementOptConfig appMeasurementOptConfig = C1ECJ.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("app_measurement_perf", AppMeasurementOptConfig.class, appMeasurementOptConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : appMeasurementOptConfig;
    }
}

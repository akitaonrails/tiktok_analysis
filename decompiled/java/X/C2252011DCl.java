package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.consumption.FeedConsumeParamsWithRequestConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252011DCl extends C09AY implements Function0<FeedConsumeParamsWithRequestConfig> {
    public C2252011DCl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.consumption.FeedConsumeParamsWithRequestConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedConsumeParamsWithRequestConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FeedConsumeParamsWithRequestConfig feedConsumeParamsWithRequestConfig = C2252021DCm.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("use_real_time_feed_consume_info_settings", FeedConsumeParamsWithRequestConfig.class, feedConsumeParamsWithRequestConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : feedConsumeParamsWithRequestConfig;
    }
}

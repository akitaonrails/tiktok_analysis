package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusPerformanceConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E8I, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E8I extends C09AY implements Function0<ActivityStatusPerformanceConfig> {
    public C1E8I() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.common.setting.ActivityStatusPerformanceConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityStatusPerformanceConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ActivityStatusPerformanceConfig activityStatusPerformanceConfig = C1E8G.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_show_activity_status_performance_config", ActivityStatusPerformanceConfig.class, activityStatusPerformanceConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : activityStatusPerformanceConfig;
    }
}

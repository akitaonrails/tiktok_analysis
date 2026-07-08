package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E8H, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E8H extends C09AY implements Function0<ActivityStatusConfig> {
    public C1E8H() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.common.setting.ActivityStatusConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityStatusConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ActivityStatusConfig activityStatusConfig = C1E8F.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_show_activity_status_config", ActivityStatusConfig.class, activityStatusConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : activityStatusConfig;
    }
}

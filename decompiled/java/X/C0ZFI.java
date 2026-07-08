package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusInAppPushCTROptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZFI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFI extends C09AY implements Function0<ActivityStatusInAppPushCTROptConfig> {
    public C0ZFI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.common.setting.ActivityStatusInAppPushCTROptConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityStatusInAppPushCTROptConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("activity_status_in_app_push_ctr_opt_settings", ActivityStatusInAppPushCTROptConfig.class, C0ZFH.LIZ);
        return LJIIIIZZ == 0 ? new ActivityStatusInAppPushCTROptConfig(false, false, false, 600000L, 3, 3, 3, 3, 0L) : LJIIIIZZ;
    }
}

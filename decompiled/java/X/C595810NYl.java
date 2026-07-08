package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusSDKConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595810NYl extends C09AY implements Function0<ActivityStatusSDKConfig> {
    public C595810NYl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.common.setting.ActivityStatusSDKConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityStatusSDKConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ActivityStatusSDKConfig activityStatusSDKConfig = C595800NYk.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_activity_status_sdk_config", ActivityStatusSDKConfig.class, activityStatusSDKConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : activityStatusSDKConfig;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.feed.task.detect.AppAdsDetectAppConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187311Aj3 extends C09AY implements Function0<AppAdsDetectAppConfig> {
    public C2187311Aj3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.feed.task.detect.AppAdsDetectAppConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AppAdsDetectAppConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AppAdsDetectAppConfig appAdsDetectAppConfig = C2187271Aiz.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("app_ads_detect_app_config", AppAdsDetectAppConfig.class, appAdsDetectAppConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : appAdsDetectAppConfig;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.experiment.OpenTikTokOnMuteConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ohs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483460ohs extends C09AY implements Function0<OpenTikTokOnMuteConfig> {
    public C1483460ohs() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.experiment.OpenTikTokOnMuteConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final OpenTikTokOnMuteConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OpenTikTokOnMuteConfig openTikTokOnMuteConfig = C1483450ohr.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("open_tiktok_on_mute_settings", OpenTikTokOnMuteConfig.class, openTikTokOnMuteConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : openTikTokOnMuteConfig;
    }
}

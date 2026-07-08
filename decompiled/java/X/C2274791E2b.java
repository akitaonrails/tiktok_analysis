package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.image.experiment.TTIMImageRefreshConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274791E2b extends C09AY implements Function0<TTIMImageRefreshConfig> {
    public C2274791E2b() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.image.experiment.TTIMImageRefreshConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final TTIMImageRefreshConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TTIMImageRefreshConfig tTIMImageRefreshConfig = C1E2X.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tt_im_expire_image_refresh_config", TTIMImageRefreshConfig.class, tTIMImageRefreshConfig);
        return LJIIIIZZ != 0 ? LJIIIIZZ : tTIMImageRefreshConfig;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.setting.CaptionConfig;

/* JADX INFO: renamed from: X.0CHF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CHF {
    public static final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_auto_captions", true, false) && C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ() && SettingsManager.LIZLLL().LJIIIIZZ("tool_caption_config", CaptionConfig.class, null) != null;
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.stemfeed.settings.StemFeedConfig;
import com.ss.android.ugc.aweme.stemfeed.settings.WelcomePopup;

/* JADX INFO: renamed from: X.0rRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588910rRx {
    public static final StemFeedConfig LIZ = new StemFeedConfig(new WelcomePopup("", "", ""), null, null);

    public static final StemFeedConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        StemFeedConfig stemFeedConfig = LIZ;
        StemFeedConfig stemFeedConfig2 = (StemFeedConfig) settingsManagerLIZLLL.LJIIIIZZ("stem_feed", StemFeedConfig.class, stemFeedConfig);
        return stemFeedConfig2 != null ? stemFeedConfig2 : stemFeedConfig;
    }
}

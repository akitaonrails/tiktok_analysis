package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.experiment.DMTypingRecommendationConfig;

/* JADX INFO: renamed from: X.0Hoh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452450Hoh {
    public static final DMTypingRecommendationConfig LIZ = new DMTypingRecommendationConfig(100, 200, 3, 5, 20, 0.815f, 50, 4, 400, 50, 50, 10, 1);

    public static DMTypingRecommendationConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DMTypingRecommendationConfig dMTypingRecommendationConfig = LIZ;
        DMTypingRecommendationConfig dMTypingRecommendationConfig2 = (DMTypingRecommendationConfig) settingsManagerLIZLLL.LJIIIIZZ("dm_typing_recommendation_config", DMTypingRecommendationConfig.class, dMTypingRecommendationConfig);
        return dMTypingRecommendationConfig2 != null ? dMTypingRecommendationConfig2 : dMTypingRecommendationConfig;
    }
}

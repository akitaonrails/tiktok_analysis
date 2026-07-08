package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarNeutralExpressionConfig;

/* JADX INFO: renamed from: X.0HLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439570HLn {
    public static final SocialAvatarNeutralExpressionConfig LIZ = new SocialAvatarNeutralExpressionConfig(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);

    public static SocialAvatarNeutralExpressionConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SocialAvatarNeutralExpressionConfig socialAvatarNeutralExpressionConfig = LIZ;
        SocialAvatarNeutralExpressionConfig socialAvatarNeutralExpressionConfig2 = (SocialAvatarNeutralExpressionConfig) settingsManagerLIZLLL.LJIIIIZZ("social_avatar_neutral_expression", SocialAvatarNeutralExpressionConfig.class, socialAvatarNeutralExpressionConfig);
        return socialAvatarNeutralExpressionConfig2 != null ? socialAvatarNeutralExpressionConfig2 : socialAvatarNeutralExpressionConfig;
    }
}

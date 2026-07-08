package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.login.trustedfriends.TrustedFriendsRecoverySettingsModel;

/* JADX INFO: renamed from: X.0XRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848760XRi {
    public static final TrustedFriendsRecoverySettingsModel LIZ = new TrustedFriendsRecoverySettingsModel(false, 0, 0, null, null, false, 63, null);

    public static final TrustedFriendsRecoverySettingsModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TrustedFriendsRecoverySettingsModel trustedFriendsRecoverySettingsModel = LIZ;
        TrustedFriendsRecoverySettingsModel trustedFriendsRecoverySettingsModel2 = (TrustedFriendsRecoverySettingsModel) settingsManagerLIZLLL.LJIIIIZZ("android_trust_friend_account_recovery_config", TrustedFriendsRecoverySettingsModel.class, trustedFriendsRecoverySettingsModel);
        return trustedFriendsRecoverySettingsModel2 != null ? trustedFriendsRecoverySettingsModel2 : trustedFriendsRecoverySettingsModel;
    }
}

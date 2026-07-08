package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabFypGuideCardFrequencyControlModel;

/* JADX INFO: renamed from: X.1E1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274671E1p {
    public static final FriendsTabFypGuideCardFrequencyControlModel LIZ = new FriendsTabFypGuideCardFrequencyControlModel(14, 3, 5);

    public static final FriendsTabFypGuideCardFrequencyControlModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        FriendsTabFypGuideCardFrequencyControlModel friendsTabFypGuideCardFrequencyControlModel = LIZ;
        FriendsTabFypGuideCardFrequencyControlModel friendsTabFypGuideCardFrequencyControlModel2 = (FriendsTabFypGuideCardFrequencyControlModel) settingsManagerLIZLLL.LJIIIIZZ("tt_friends_add_fyp_guide_card_frequency_control", FriendsTabFypGuideCardFrequencyControlModel.class, friendsTabFypGuideCardFrequencyControlModel);
        return friendsTabFypGuideCardFrequencyControlModel2 != null ? friendsTabFypGuideCardFrequencyControlModel2 : friendsTabFypGuideCardFrequencyControlModel;
    }
}

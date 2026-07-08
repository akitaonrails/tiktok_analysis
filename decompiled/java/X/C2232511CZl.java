package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* JADX INFO: renamed from: X.1CZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232511CZl {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC2232491CZj LIZ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        boolean z;
        if (multiLiveAnchorPanelSettings != null) {
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 4 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                return EnumC2232491CZj.FriendsOffFollowersOffOthersOff;
            }
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (multiLiveAnchorPanelSettings != null) {
                    if (multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 3) {
                        return EnumC2232491CZj.FriendsOffFollowersOffOthersOn;
                    }
                    if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 4 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                        return EnumC2232491CZj.FriendsOffFollowersOnOthersOff;
                    }
                    if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 4 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 3) {
                        return EnumC2232491CZj.FriendsOffFollowersOnOthersOn;
                    }
                    if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 3 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                        return EnumC2232491CZj.FriendsOnFollowersOffOthersOff;
                    }
                    if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 3 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 3) {
                        return EnumC2232491CZj.FriendsOnFollowersOffOthersOn;
                    }
                    if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 3 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                        return EnumC2232491CZj.FriendsOnFollowersOnOthersOff;
                    }
                    if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 3) {
                        return EnumC2232491CZj.FriendsOnFollowersOnOthersOn;
                    }
                }
            } else if (multiLiveAnchorPanelSettings != null) {
                if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 4) {
                }
                if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 4) {
                }
                if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 3) {
                }
                if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 3) {
                }
                if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 3) {
                }
                if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 3) {
                    return EnumC2232491CZj.FriendsOnFollowersOnOthersOn;
                }
            }
        }
        return EnumC2232491CZj.None;
    }
}

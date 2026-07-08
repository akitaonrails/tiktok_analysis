package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232491CZj {
    FriendsOffFollowersOffOthersOff,
    FriendsOffFollowersOffOthersOn,
    FriendsOffFollowersOnOthersOff,
    FriendsOffFollowersOnOthersOn,
    FriendsOnFollowersOffOthersOff,
    FriendsOnFollowersOffOthersOn,
    FriendsOnFollowersOnOthersOff,
    FriendsOnFollowersOnOthersOn,
    None;

    public static final C2232521CZm Companion = new Object() { // from class: X.1CZm
    };

    public static EnumC2232491CZj valueOf(String str) {
        return (EnumC2232491CZj) C08FF.LIZ(EnumC2232491CZj.class, str);
    }

    public final C1CXG into() {
        switch (C2232501CZk.LIZ[ordinal()]) {
            case 1:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_OFF;
            case 2:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_ON;
            case 3:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_ON_OTHERS_OFF;
            case 4:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_ON_OTHERS_ON;
            case 5:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_OFF_OTHERS_OFF;
            case 6:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_OFF_OTHERS_ON;
            case 7:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_ON_OTHERS_OFF;
            case 8:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_ON_FOLLOWERS_ON_OTHERS_ON;
            case BdTuring.TYPE_ECAF /* 9 */:
                return C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_NONE;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2232501CZk.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 8;
            default:
                throw new C1954807lC();
        }
    }
}

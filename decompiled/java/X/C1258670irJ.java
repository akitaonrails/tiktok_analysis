package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.ui.v2.UserProfileAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0irJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258670irJ {
    public static final boolean LIZ(Fragment fragment) {
        C1252220igu otherParams;
        String str = null;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserProfileAbility.class, null);
        if (userProfileAbility != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
            str = otherParams.LJIJJ;
        }
        if (!Intrinsics.LJFF(str, "live") && !C736460Sui.LIZIZ(LIZIZ(fragment))) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(Fragment fragment) {
        C1252220igu otherParams;
        Aweme aweme;
        User author;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserProfileAbility.class, null);
        if (userProfileAbility != null && (otherParams = userProfileAbility.getOtherParams()) != null && (aweme = otherParams.LIZJ) != null) {
            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt == null) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (roomFeedCellStruct != null) {
                    newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData();
                } else {
                    newLiveRoomDataExt = null;
                }
            }
            if (aweme != null) {
                if (AwemeSaaSExtKt.isLive(aweme) && newLiveRoomDataExt != null) {
                    return "live_card";
                }
                if (aweme != null && (author = aweme.getAuthor()) != null && author.roomId > 0) {
                    return "live_head";
                }
            }
        }
        return null;
    }

    public static final String LIZJ(Fragment fragment) {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        String str;
        if (fragment != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserProfileAbility.class, null)) != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
            C1252480ihK c1252480ihK = otherParams.LJIJI;
            if (c1252480ihK != null && (str = c1252480ihK.roomRequestId) != null) {
                return str;
            }
            Aweme aweme = otherParams.LIZJ;
            if (aweme != null) {
                return aweme.getRequestId();
            }
        }
        return null;
    }

    public static final String LIZLLL(Fragment fragment) {
        UserProfileAbility userProfileAbility;
        C1252220igu otherParams;
        User author;
        long j;
        LiveRoomStruct newLiveRoomDataExt;
        String str;
        if (fragment != null && (userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserProfileAbility.class, null)) != null && (otherParams = userProfileAbility.getOtherParams()) != null) {
            C1252480ihK c1252480ihK = otherParams.LJIJI;
            if (c1252480ihK != null && (str = c1252480ihK.fromRoomId) != null) {
                return str;
            }
            Aweme aweme = otherParams.LIZJ;
            if (aweme != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null) {
                j = newLiveRoomDataExt.id;
            } else {
                Aweme aweme2 = otherParams.LIZJ;
                if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                    j = author.roomId;
                }
            }
            return Long.valueOf(j).toString();
        }
        return null;
    }

    public static final String LJ(Fragment fragment) {
        C1252220igu otherParams;
        C1252480ihK c1252480ihK;
        UserProfileAbility userProfileAbility = (UserProfileAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), UserProfileAbility.class, null);
        if (userProfileAbility == null || (otherParams = userProfileAbility.getOtherParams()) == null || (c1252480ihK = otherParams.LJIJI) == null) {
            return null;
        }
        return c1252480ihK.liveEnterModule;
    }
}

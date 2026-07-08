package X;

import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0ccu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019100ccu {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJFF() {
        C1019110ccv.LIZIZ.LJIIJ();
    }

    public static boolean LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLive adLive;
        User redirectLiveAuthor;
        Long lValueOf;
        if (!AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adLive = awemeRawAd.getAdLive()) == null || (redirectLiveAuthor = adLive.getRedirectLiveAuthor()) == null || (lValueOf = Long.valueOf(redirectLiveAuthor.roomId)) == null || lValueOf.longValue() == 0) {
            return false;
        }
        return true;
    }

    public static final String LIZLLL(Aweme aweme) {
        User author;
        String uid;
        User author2;
        RoomFeedCellStruct roomFeedCellStruct;
        if (aweme == null) {
            return null;
        }
        if (AwemeSaaSExtKt.isLive(aweme)) {
            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt == null && ((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return null;
            }
            return Long.valueOf(newLiveRoomDataExt.getAnchorId()).toString();
        }
        if ((!LIZIZ(aweme) && ((author2 = aweme.getAuthor()) == null || !author2.isLive())) || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            return null;
        }
        return uid;
    }

    public static final String LJ(Aweme aweme) {
        User author;
        AdLive adLive;
        User redirectLiveAuthor;
        RoomFeedCellStruct roomFeedCellStruct;
        if (aweme == null) {
            return null;
        }
        if (AwemeSaaSExtKt.isLive(aweme)) {
            LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt == null && ((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                return null;
            }
            return Long.valueOf(newLiveRoomDataExt.id).toString();
        }
        if (LIZIZ(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || (adLive = awemeRawAd.getAdLive()) == null || (redirectLiveAuthor = adLive.getRedirectLiveAuthor()) == null) {
                return null;
            }
            return Long.valueOf(redirectLiveAuthor.roomId).toString();
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || !author2.isLive() || (author = aweme.getAuthor()) == null) {
            return null;
        }
        return Long.valueOf(author.roomId).toString();
    }

    public static final boolean LJI(Aweme aweme) {
        return C1019110ccv.LIZIZ.LJ(aweme);
    }

    public static final AdLiveEnterRoomConfig LIZJ(Aweme aweme, AwemeRawAd awemeRawAd) {
        return C1019110ccv.LIZIZ.LJFF(aweme, awemeRawAd, 12, "");
    }

    public static void LIZ(Aweme aweme, EnterRoomConfig enterRoomConfig, int i) {
        String value = C0IJD.EMPTY.getValue();
        if (aweme != null) {
            C1019110ccv.LIZIZ.LJIILJJIL(aweme, enterRoomConfig, i, value);
        }
    }
}

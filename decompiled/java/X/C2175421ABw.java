package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipRewardsFypTagSetting;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* JADX INFO: renamed from: X.1ABw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175421ABw {
    public static boolean LIZ(C1ACA c1aca) {
        if (C999000c6U.LIZ(c1aca)) {
            return false;
        }
        C1124870fNV.LIZJ().getClass();
        C1124870fNV.LIZIZ("ttlive_gameLiveFyf_rewardsLabel");
        C1124870fNV.LIZJ().getClass();
        C1124870fNV.LIZIZ("ttlive_gameLiveFyf_rewards2");
        if (!GameLivePartnershipRewardsFypTagSetting.INSTANCE.isInvolve() || LIZIZ(c1aca).length() == 0 || C999380c76.LIZ(c1aca) || c1aca == null || !C1ABT.LJIIIIZZ(c1aca)) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(C1ACA c1aca) {
        Integer numValueOf;
        String str;
        LiveRoomStruct liveRoomStruct;
        GameTagDetail gameTagDetail;
        LiveRoomStruct liveRoomStruct2;
        GameTagDetail gameTagDetail2;
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null && (gameTagDetail2 = liveRoomStruct2.gameTagDetail) != null) {
            numValueOf = Integer.valueOf(gameTagDetail2.gameTagId);
        } else {
            numValueOf = null;
        }
        if (c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null || (gameTagDetail = liveRoomStruct.gameTagDetail) == null || (str = gameTagDetail.displayName) == null) {
            str = "";
        }
        if (numValueOf == null || numValueOf.intValue() == -1) {
            return "";
        }
        return str;
    }
}

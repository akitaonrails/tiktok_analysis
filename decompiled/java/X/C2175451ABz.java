package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipRewardsFypTagSetting;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.model.live.GameTagDetail;
import com.ss.android.ugc.aweme.feed.model.live.GuessRound;
import com.ss.android.ugc.aweme.feed.model.live.GuessText;
import com.ss.android.ugc.aweme.feed.model.live.GuessWidget;
import com.ss.android.ugc.aweme.feed.model.live.GuessWidgets;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1ABz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175451ABz {
    public static boolean LIZ(C1ACA c1aca) {
        C1AC0 c1ac0;
        boolean z;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        if ((c1aca != null && C1ABT.LJIIIIZZ(c1aca) && GameLivePartnershipRewardsFypTagSetting.INSTANCE.isInvolve()) || (c1ac0 = PreviewGameGuessingWidget.LLJJJ) == null) {
            return false;
        }
        boolean zLIZ = C999380c76.LIZ(c1aca);
        PreviewGameRewardsWidget.LLJJJIL.getClass();
        boolean zLIZ2 = C2175421ABw.LIZ(c1aca);
        if (c1aca != null && (((liveRoomStruct = c1aca.LIZJ) != null && liveRoomStruct.liveRoomMode == 4) || (((liveRoomStruct2 = c1aca.LIZJ) != null && liveRoomStruct2.liveRoomMode == 6) || ((liveRoomStruct3 = c1aca.LIZJ) != null && liveRoomStruct3.liveRoomMode == 1)))) {
            z = true;
        } else {
            z = false;
        }
        if (!zLIZ && !zLIZ2 && z && c1ac0.LIZIZ() && LIZLLL(c1aca, c1ac0) != null && (!c1ac0.LIZJ() || !TextUtils.isEmpty(LIZIZ(c1aca)))) {
            return true;
        }
        return false;
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

    public static String LIZJ(GuessRound guessRound) {
        GuessText guessText;
        Long lValueOf;
        GuessText guessText2;
        String str = null;
        if (guessRound == null || (guessText = guessRound.title) == null || (lValueOf = Long.valueOf(guessText.type)) == null) {
            return null;
        }
        if (lValueOf.longValue() == 1) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            GuessText guessText3 = guessRound.title;
            if (guessText3 != null) {
                str = guessText3.key;
            }
            c1124870fNVLIZJ.getClass();
            String strLIZIZ = C1124870fNV.LIZIZ(str);
            if (strLIZIZ == null) {
                return "Will I win the game?";
            }
            return strLIZIZ;
        }
        if (lValueOf.longValue() != 2 || (guessText2 = guessRound.title) == null) {
            return null;
        }
        return guessText2.desc;
    }

    public static GuessRound LIZLLL(C1ACA c1aca, C1AC0 c1ac0) {
        LiveRoomStruct liveRoomStruct;
        GuessWidgets guessWidgets;
        List<GuessWidget> list;
        GuessRound guessRound;
        if (c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null || (guessWidgets = liveRoomStruct.guessWidgets) == null || (list = guessWidgets.guessWidgets) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (GuessWidget guessWidget : list) {
            GuessWidget guessWidget2 = guessWidget;
            GuessRound guessRound2 = guessWidget2.guessRound;
            if (guessRound2 != null && guessRound2.guessStatus == 0 && guessRound2.endTime >= guessRound2.serverTime + c1ac0.LJ()) {
                if (c1ac0.LIZ()) {
                    C2175451ABz c2175451ABz = PreviewGameGuessingWidget.LLJJIJIL;
                    GuessRound guessRound3 = guessWidget2.guessRound;
                    c2175451ABz.getClass();
                    if (TextUtils.isEmpty(LIZJ(guessRound3))) {
                    }
                }
                if (!c1ac0.LIZLLL() || ((guessRound = guessWidget2.guessRound) != null && guessRound.guessRoundStats != null)) {
                    arrayList.add(guessWidget);
                }
            }
        }
        GuessWidget guessWidget3 = (GuessWidget) C13LP.LJJJLZIJ(0, arrayList);
        if (guessWidget3 == null) {
            return null;
        }
        return guessWidget3.guessRound;
    }
}

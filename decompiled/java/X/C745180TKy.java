package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.feed.model.live.BoardUsingInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveAiSummary;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* JADX INFO: renamed from: X.0TKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745180TKy {
    public static boolean LIZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        LiveAiSummary liveAiSummary;
        String str;
        LiveRoomStruct liveRoomStruct2;
        BoardUsingInfo boardUsingInfo;
        if (!C0TL6.LIZ().enable || c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null || (liveAiSummary = liveRoomStruct.getLiveAiSummary()) == null || (str = liveAiSummary.roomLlmTitle) == null || str.length() == 0) {
            return false;
        }
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null && (boardUsingInfo = liveRoomStruct2.boardUsingInfo) != null && boardUsingInfo.usingBoard == 1) {
            return false;
        }
        boolean zLIZ = C999380c76.LIZ(c1aca);
        PreviewGameGuessingWidget.LLJJIJIL.getClass();
        boolean zLIZ2 = C2175451ABz.LIZ(c1aca);
        PreviewGameRewardsWidget.LLJJJIL.getClass();
        boolean zLIZ3 = C2175421ABw.LIZ(c1aca);
        PreviewHotCommentWidget.LLJJLIIIJLLLLLLLZ.getClass();
        boolean zLIZ4 = C1AC4.LIZ(c1aca);
        if (C0TL6.LIZ().style == 0 && (zLIZ || zLIZ2 || zLIZ3 || zLIZ4)) {
            return false;
        }
        return true;
    }
}

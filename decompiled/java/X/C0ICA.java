package X;

import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;

/* JADX INFO: renamed from: X.0ICA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICA {
    public static GameMainFlowEventParameters LIZ(String str, String str2, String str3, GameChallengeCardTemplate gameChallengeCardTemplate) {
        int i;
        String conversationId;
        boolean z;
        Integer numValueOf;
        Double dValueOf;
        String string;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        boolean z2 = true;
        if (c0y8tLIZ != null && AbstractC1711506n3.LIZIZ == c0y8tLIZ.getConversationType()) {
            i = 3;
        } else {
            i = 0;
        }
        if (c0y8tLIZ == null || (conversationId = c0y8tLIZ.getConversationId()) == null) {
            conversationId = "";
        }
        GameInfoComponent gameInfoComponent = gameChallengeCardTemplate.gameInfo;
        String str4 = gameInfoComponent.resId;
        String str5 = gameInfoComponent.gameId;
        if (((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(gameChallengeCardTemplate.creatorId)) {
            z = true;
        } else {
            z = false;
        }
        if (c0y8tLIZ == null || !c0y8tLIZ.isGroupChat()) {
            z2 = false;
        }
        if (z2) {
            numValueOf = Integer.valueOf(c0y8tLIZ.getMemberCount());
        } else {
            numValueOf = null;
        }
        int i2 = gameChallengeCardTemplate.playedUserCount;
        GameParticipantScoreComponent gameParticipantScoreComponent = (GameParticipantScoreComponent) C13LP.LJJJLL(gameChallengeCardTemplate.scores);
        if (gameParticipantScoreComponent != null) {
            dValueOf = Double.valueOf(gameParticipantScoreComponent.score);
        } else {
            dValueOf = null;
        }
        GameParticipantScoreComponent gameParticipantScoreComponent2 = (GameParticipantScoreComponent) C13LP.LJJJLL(gameChallengeCardTemplate.scores);
        if (gameParticipantScoreComponent2 != null) {
            string = Long.valueOf(gameParticipantScoreComponent2.userId).toString();
        } else {
            string = null;
        }
        return new GameMainFlowEventParameters(conversationId, i, str4, str5, str2, str3, Boolean.valueOf(z), gameChallengeCardTemplate.taskId, numValueOf, Integer.valueOf(i2), dValueOf, string, null);
    }
}

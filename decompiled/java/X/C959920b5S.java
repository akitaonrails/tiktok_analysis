package X;

import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import webcast.im.CohostContent;
import webcast.im.ListChangeBizContent;

/* JADX INFO: renamed from: X.0b5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959920b5S {
    public static final BattleGamePlayContent LIZ(C954930axP c954930axP) {
        CohostContent cohostContent;
        ListChangeBizContent listChangeBizContent;
        GamePlayContent gamePlayContent;
        BusinessContent businessContent = c954930axP.LJI;
        if (businessContent != null && (cohostContent = businessContent.cohostContent) != null && (listChangeBizContent = cohostContent.listChangeBizContent) != null && (gamePlayContent = listChangeBizContent.gameplayContent) != null) {
            return gamePlayContent.battleGameplayContent;
        }
        return null;
    }

    public static final boolean LIZIZ(C954930axP c954930axP) {
        BattleGamePlayContent battleGamePlayContentLIZ = LIZ(c954930axP);
        if (battleGamePlayContentLIZ == null || battleGamePlayContentLIZ.battleId <= 0 || battleGamePlayContentLIZ.groupChannelId <= 0 || !(!battleGamePlayContentLIZ.teamMember.isEmpty())) {
            return false;
        }
        return true;
    }
}

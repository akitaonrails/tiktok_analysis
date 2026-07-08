package X;

import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: renamed from: X.001Z, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C001Z {
    public static LinkLayerMessage LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkLayerMessage linkLayerMessage = new LinkLayerMessage(0, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.createTime = jCurrentTimeMillis;
        linkLayerMessage.baseMessage = commonMessageData;
        linkLayerMessage.timestamp = jCurrentTimeMillis;
        return linkLayerMessage;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage LIZIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel r9) {
        /*
            java.util.List r0 = X.C001J.LIZ(r9)
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent$TeamUser$UserInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent.TeamUser.UserInfo) r0
            r4 = 0
            if (r0 == 0) goto L78
            long r2 = r0.userId
            long r0 = r0.roomId
        L12:
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r7 = LIZ()
            tikcast.linkmic.common.GroupPlayer r6 = new tikcast.linkmic.common.GroupPlayer
            r6.<init>()
            r6.channelId = r4
            com.bytedance.android.livesdk.model.message.linkcore.Player r4 = new com.bytedance.android.livesdk.model.message.linkcore.Player
            r4.<init>(r0, r2)
            r6.user = r4
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r0 = r9.businessContent
            if (r0 == 0) goto L76
            webcast.im.CohostContent r0 = r0.cohostContent
            if (r0 == 0) goto L76
            webcast.im.JoinGroupDirectBizContent r9 = r0.joinGroupDirectBizContent
        L2e:
            r8 = 0
            if (r9 == 0) goto L74
            com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent r0 = r9.gameplayContent
            if (r0 == 0) goto L40
            com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent r0 = r0.battleGameplayContent
            if (r0 == 0) goto L40
            long r0 = r0.sourceType
            int r5 = (int) r0
            if (r5 != 0) goto L47
            if (r9 == 0) goto L74
        L40:
            com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent r0 = r9.randomMatchContent
            if (r0 == 0) goto L74
            long r0 = r0.sourceType
            int r5 = (int) r0
        L47:
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r4 = new com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent
            r2 = 0
            r0 = 0
            r4.<init>(r0, r2, r2)
            webcast.im.CohostContent r3 = new webcast.im.CohostContent
            r3.<init>()
            webcast.im.PermitJoinGroupBizContent r2 = new webcast.im.PermitJoinGroupBizContent
            r2.<init>()
            r2.sourceType = r5
            r1 = 1
            r2.replyStatus = r1
            if (r9 == 0) goto L66
            com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent r0 = r9.randomMatchContent
            if (r0 == 0) goto L66
            int r8 = r0.matchedPreferenceTag
        L66:
            r2.matchedPreferenceTag = r8
            r3.permitJoinGroupBizContent = r2
            r3.joinGroupDirectBizContent = r9
            r4.cohostContent = r3
            com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage r0 = new com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage
            r0.<init>(r7, r1, r6, r4)
            return r0
        L74:
            r5 = 0
            goto L47
        L76:
            r9 = 0
            goto L2e
        L78:
            r2 = 0
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001Z.LIZIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel):com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage");
    }
}

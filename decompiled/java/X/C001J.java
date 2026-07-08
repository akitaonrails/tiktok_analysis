package X;

import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.GamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.im.CohostContent;
import webcast.im.JoinGroupDirectBizContent;

/* JADX INFO: renamed from: X.001J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C001J {
    public static final List<BattleGamePlayContent.TeamUser.UserInfo> LIZ(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        List list;
        List list2;
        CohostContent cohostContent;
        JoinGroupDirectBizContent joinGroupDirectBizContent;
        RandomMatchContent randomMatchContent;
        CohostContent cohostContent2;
        JoinGroupDirectBizContent joinGroupDirectBizContent2;
        GamePlayContent gamePlayContent;
        BattleGamePlayContent battleGamePlayContent;
        ArrayList arrayList = new ArrayList();
        BusinessContent businessContent = joinGroupDirectIMModel.businessContent;
        if (businessContent == null || (cohostContent2 = businessContent.cohostContent) == null || (joinGroupDirectBizContent2 = cohostContent2.joinGroupDirectBizContent) == null || (gamePlayContent = joinGroupDirectBizContent2.gameplayContent) == null || (battleGamePlayContent = gamePlayContent.battleGameplayContent) == null || (list = battleGamePlayContent.teamMember) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (BattleGamePlayContent.TeamUser.UserInfo userInfo : ((BattleGamePlayContent.TeamUser) it2.next()).userInfoList) {
                if (userInfo.invitationRole == 2) {
                    arrayList.add(userInfo);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        BusinessContent businessContent2 = joinGroupDirectIMModel.businessContent;
        if (businessContent2 == null || (cohostContent = businessContent2.cohostContent) == null || (joinGroupDirectBizContent = cohostContent.joinGroupDirectBizContent) == null || (randomMatchContent = joinGroupDirectBizContent.randomMatchContent) == null || (list2 = randomMatchContent.pairedGroupList) == null) {
            list2 = C13BV.INSTANCE;
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            for (RandomMatchContent.UserGroup.UserInfo userInfo2 : ((RandomMatchContent.UserGroup) it3.next()).userInfo) {
                if (userInfo2.invitationRoleType == 2) {
                    BattleGamePlayContent.TeamUser.UserInfo userInfo3 = new BattleGamePlayContent.TeamUser.UserInfo();
                    userInfo3.userId = userInfo2.userId;
                    userInfo3.roomId = userInfo2.roomId;
                    userInfo3.invitationRole = userInfo2.invitationRoleType;
                    arrayList.add(userInfo3);
                }
            }
        }
        return arrayList;
    }

    public static final List<BattleGamePlayContent.TeamUser.UserInfo> LIZIZ(JoinGroupDirectIMModel joinGroupDirectIMModel) {
        List list;
        List list2;
        CohostContent cohostContent;
        JoinGroupDirectBizContent joinGroupDirectBizContent;
        RandomMatchContent randomMatchContent;
        CohostContent cohostContent2;
        JoinGroupDirectBizContent joinGroupDirectBizContent2;
        GamePlayContent gamePlayContent;
        BattleGamePlayContent battleGamePlayContent;
        ArrayList arrayList = new ArrayList();
        BusinessContent businessContent = joinGroupDirectIMModel.businessContent;
        if (businessContent == null || (cohostContent2 = businessContent.cohostContent) == null || (joinGroupDirectBizContent2 = cohostContent2.joinGroupDirectBizContent) == null || (gamePlayContent = joinGroupDirectBizContent2.gameplayContent) == null || (battleGamePlayContent = gamePlayContent.battleGameplayContent) == null || (list = battleGamePlayContent.teamMember) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (BattleGamePlayContent.TeamUser.UserInfo userInfo : ((BattleGamePlayContent.TeamUser) it2.next()).userInfoList) {
                if (userInfo.invitationRole == 1) {
                    arrayList.add(userInfo);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        BusinessContent businessContent2 = joinGroupDirectIMModel.businessContent;
        if (businessContent2 == null || (cohostContent = businessContent2.cohostContent) == null || (joinGroupDirectBizContent = cohostContent.joinGroupDirectBizContent) == null || (randomMatchContent = joinGroupDirectBizContent.randomMatchContent) == null || (list2 = randomMatchContent.pairedGroupList) == null) {
            list2 = C13BV.INSTANCE;
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            for (RandomMatchContent.UserGroup.UserInfo userInfo2 : ((RandomMatchContent.UserGroup) it3.next()).userInfo) {
                if (userInfo2.invitationRoleType == 1) {
                    BattleGamePlayContent.TeamUser.UserInfo userInfo3 = new BattleGamePlayContent.TeamUser.UserInfo();
                    userInfo3.userId = userInfo2.userId;
                    userInfo3.roomId = userInfo2.roomId;
                    userInfo3.invitationRole = userInfo2.invitationRoleType;
                    arrayList.add(userInfo3);
                }
            }
        }
        return arrayList;
    }
}

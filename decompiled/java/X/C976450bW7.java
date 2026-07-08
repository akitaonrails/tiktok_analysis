package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976450bW7 {
    public static final void LIZ(C976460bW8 c976460bW8, boolean z) {
        Integer numValueOf;
        Long lValueOf;
        List<TeamUsersInfo> list;
        long j;
        BattleSetting battleSetting;
        LinkMicBattleMessage linkMicBattleMessage = c976460bW8.LJFF;
        Map<Long, GiftGalleryBadgeInfo> map = null;
        if (linkMicBattleMessage != null && (battleSetting = linkMicBattleMessage.battleSetting) != null) {
            numValueOf = Integer.valueOf(battleSetting.inviteType);
        } else {
            numValueOf = null;
        }
        boolean zLIZ = C959180b4G.LIZ(numValueOf);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        LinkMicBattleMessage linkMicBattleMessage2 = c976460bW8.LJFF;
        if (linkMicBattleMessage2 != null) {
            lValueOf = Long.valueOf(linkMicBattleMessage2.actionByUserId);
        } else {
            lValueOf = null;
        }
        LinkMicBattleMessage linkMicBattleMessage3 = c976460bW8.LJFF;
        if (linkMicBattleMessage3 != null) {
            list = linkMicBattleMessage3.teamUsers;
            j = linkMicBattleMessage3.battleId;
            map = linkMicBattleMessage3.leagueInfoMap;
        } else {
            list = null;
            j = 0;
        }
        C973660bRc.LIZ.LJJLI(z, true, lValueOf, list, j, map, zLIZ, null, null);
    }
}

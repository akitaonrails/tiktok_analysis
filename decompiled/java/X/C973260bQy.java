package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973260bQy {
    public static final void LIZ(C974910bTd c974910bTd, EnumC919170a1j enumC919170a1j) {
        Integer numValueOf;
        Long lValueOf;
        List<TeamUsersInfo> list;
        long j;
        Map<Long, GiftGalleryBadgeInfo> map;
        BattleSetting battleSetting;
        BattleSetting battleSetting2;
        LinkMicBattleMessage linkMicBattleMessage = c974910bTd.LJI;
        Integer numValueOf2 = null;
        if (linkMicBattleMessage != null && (battleSetting2 = linkMicBattleMessage.battleSetting) != null) {
            numValueOf = Integer.valueOf(battleSetting2.inviteType);
        } else {
            numValueOf = null;
        }
        boolean zLIZ = C959180b4G.LIZ(numValueOf);
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        C973660bRc c973660bRc = C973660bRc.LIZ;
        LinkMicBattleMessage linkMicBattleMessage2 = c974910bTd.LJI;
        if (linkMicBattleMessage2 != null) {
            lValueOf = Long.valueOf(linkMicBattleMessage2.actionByUserId);
        } else {
            lValueOf = null;
        }
        LinkMicBattleMessage linkMicBattleMessage3 = c974910bTd.LJI;
        if (linkMicBattleMessage3 != null) {
            list = linkMicBattleMessage3.teamUsers;
            j = linkMicBattleMessage3.battleId;
            map = linkMicBattleMessage3.leagueInfoMap;
        } else {
            list = null;
            j = 0;
            map = null;
        }
        EnumC919170a1j.Companion.getClass();
        String strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1j, size);
        LinkMicBattleMessage linkMicBattleMessage4 = c974910bTd.LJI;
        if (linkMicBattleMessage4 != null && (battleSetting = linkMicBattleMessage4.battleSetting) != null) {
            numValueOf2 = Integer.valueOf(battleSetting.inviteType);
        }
        C973660bRc.LJJJJZI(lValueOf, true, list, j, map, zLIZ, strLIZIZ, numValueOf2, null, 576);
    }
}

package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0bAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963300bAu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA) {
        Long lValueOf;
        Object obj;
        Object objValueOf;
        long jLongValue;
        User owner;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        Object objValueOf2 = null;
        if (roomLJJLI != null && (owner = roomLJJLI.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        if (C915980Zwa.LIZLLL().J8()) {
            obj = "anchor";
        } else {
            obj = "user";
        }
        c474500IjA.LJJII(obj, "user_type");
        c474500IjA.LJJII(C915980Zwa.LJFF().my(), "sub_match_type");
        c474500IjA.LJJII(lValueOf, "current_anchor_id");
        if (roomLJJLI != null) {
            objValueOf = Long.valueOf(roomLJJLI.getId());
        } else {
            objValueOf = null;
        }
        c474500IjA.LJJII(objValueOf, "current_room_id");
        c474500IjA.LJJII(Long.valueOf(C915980Zwa.LIZLLL().getChannelId()), "current_channel_id");
        c474500IjA.LJJII(Long.valueOf(C915980Zwa.LIZLLL().getBattleId()), "current_pk_id");
        IInteractService iInteractServiceLIZLLL = C915980Zwa.LIZLLL();
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        TeamUsersInfo teamUsersInfoDY0 = iInteractServiceLIZLLL.dY0(jLongValue);
        if (teamUsersInfoDY0 != null) {
            objValueOf2 = Long.valueOf(teamUsersInfoDY0.teamId);
        }
        c474500IjA.LJJII(objValueOf2, "anchor_team_id");
    }

    public static void LIZIZ(C474500IjA c474500IjA, BattleComboInfo battleComboInfo, boolean z) {
        String str;
        String str2;
        User owner;
        String strValueOf;
        if (z) {
            long j = battleComboInfo.comboCount;
            if (j > 99) {
                strValueOf = "99+";
            } else {
                strValueOf = String.valueOf(j);
            }
            c474500IjA.LJJII(strValueOf, "win_times");
            str = "win";
        } else {
            str = "lose";
        }
        c474500IjA.LJJII(str, "streak_type");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null && (owner = roomLJJLI.getOwner()) != null && battleComboInfo.userId == owner.getId()) {
            str2 = "current_anchor";
        } else {
            str2 = "other_anchor";
        }
        c474500IjA.LJJII(str2, "anchor_type");
        c474500IjA.LJJII(Long.valueOf(battleComboInfo.userId), "streak_anchor_id");
        LIZ(c474500IjA);
    }
}

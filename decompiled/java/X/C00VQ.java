package X;

import com.bytedance.android.live.liveinteract.competition.model.BeansInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.TakeTheStageInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.List;

/* JADX INFO: renamed from: X.00VQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00VQ {
    public static final String LIZ(Room room) {
        long jLongValue;
        String str;
        CompetitionCommon competitionCommon;
        int i;
        BattleInfoResponse battleInfoResponse;
        BattleSetting battleSetting;
        int i2;
        Long l;
        if (room != null && room.getLinkMicInfo() != null) {
            RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
            if (linkMicInfo.channelId > 0 && linkMicInfo.rivalAnchorId > 0) {
                BattleInfoResponse battleInfoResponse2 = linkMicInfo.battleInfo;
                if (battleInfoResponse2 != null && (l = battleInfoResponse2.battleId) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue <= 0 || (battleInfoResponse = linkMicInfo.battleInfo) == null || (battleSetting = battleInfoResponse.setting) == null || ((i2 = battleSetting.status) != 1 && i2 != 3)) {
                    str = "anchor";
                } else {
                    str = "manual_pk";
                }
                CompetitionInfo competitionInfo = linkMicInfo.competitionInfo;
                if (competitionInfo != null && (competitionCommon = competitionInfo.bizCommon) != null && competitionCommon.competitionId > 0 && competitionInfo != null) {
                    TakeTheStageInfo takeTheStageInfo = competitionInfo.takeTheStageInfo;
                    if (takeTheStageInfo != null) {
                        int i3 = takeTheStageInfo.takeTheStageStatus;
                        if (i3 >= 3 && i3 < 6) {
                            str = "take_stage";
                        }
                        if (competitionInfo == null) {
                            return str;
                        }
                    }
                    BeansInfo beansInfo = competitionInfo.beansInfo;
                    if (beansInfo != null && (i = beansInfo.status) >= 3 && i < 5) {
                        return "catch_bean";
                    }
                    return str;
                }
                return str;
            }
            List<Long> list = linkMicInfo.audienceIdList;
            if (list != null && list.size() > 0) {
                return "audience";
            }
            return "normal";
        }
        return "normal";
    }
}

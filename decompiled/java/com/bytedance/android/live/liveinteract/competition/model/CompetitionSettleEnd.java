package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishExtraInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionSettleEnd {

    @C09CT("leave_user")
    public CompetitionUserBase leaveUser;

    @C09CT("match_punish_extra_info")
    public MatchPunishExtraInfo matchPunishExtraInfo;

    @C09CT("planned_finish_time")
    public long plannedFinishTime;

    @C09CT("reason")
    public int reason;

    @C09CT("take_the_stage_biz")
    public TakeTheStageBiz takeTheStageBiz;

    @C09CT("team_infos")
    public List<CompetitionResultsTeamInfo> teamInfos = new ArrayList();

    @C09CT("mvp_user_id")
    public String mvpUserId = "";

    @C09CT("combo_info_map")
    public Map<String, BattleComboInfo> comboInfoMap = new LinkedHashMap();

    public static final class TakeTheStageBiz {

        @C09CT("take_the_stage_status")
        public int takeTheStageStatus;
    }
}

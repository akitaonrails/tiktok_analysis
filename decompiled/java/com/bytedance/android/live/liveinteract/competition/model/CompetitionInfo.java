package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionInfo {

    @C09CT("battle_task")
    public BattleTask battleTask;

    @C09CT("beans_info")
    public BeansInfo beansInfo;

    @C09CT("biz_common")
    public CompetitionCommon bizCommon;

    @C09CT("effect_infos")
    public BattleEffectInfos effectInfos;

    @C09CT("gameplay_option")
    public int gameplayOption;

    @C09CT("group_rank_list_info")
    public GroupRankListInfo groupRankListInfo;

    @C09CT("group_show_info")
    public GroupShowInfo groupShowInfo;

    @C09CT("take_the_stage_info")
    public TakeTheStageInfo takeTheStageInfo;

    @C09CT("team_infos")
    public List<CompetitionResultsTeamInfo> teamInfos = new ArrayList();

    @C09CT("ab_infos")
    public Map<Long, CompetitionABInfo> abInfos = new LinkedHashMap();

    @C09CT("mvp_user_id")
    public String mvpUserId = "";

    @C09CT("combo_info_map")
    public Map<String, BattleComboInfo> comboInfoMap = new LinkedHashMap();

    public static final class GroupRankListInfo {

        @C09CT("end_timestamp")
        public long endTimestamp;

        @C09CT("member_rank_info")
        public List<MemberRankInfo> memberRankInfo = new ArrayList();

        @C09CT("start_timestamp")
        public long startTimestamp;
    }

    public static final class GroupShowInfo {

        @C09CT("actual_end_timestamp")
        public long actualEndTimestamp;

        @C09CT("end_timestamp")
        public long endTimestamp;

        @C09CT("start_timestamp")
        public long startTimestamp;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}

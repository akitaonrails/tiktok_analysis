package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionInitiateInfo {

    @C09CT("beans_biz")
    public BeansBiz beansBiz;

    @C09CT("initiate_type")
    public int initiateType;

    @C09CT("initiator")
    public CompetitionUserBase initiator;

    @C09CT("take_the_stage_biz")
    public TakeTheStageBiz takeTheStageBiz;

    @C09CT("teams")
    public List<CompetitionTeamBase> teams = new ArrayList();

    @C09CT("ab_infos")
    public Map<Long, CompetitionABInfo> abInfos = new LinkedHashMap();

    public static final class BeansBiz {

        @C09CT("game_version")
        public long gameVersion;
    }

    public static final class TakeTheStageBiz {

        @C09CT("anchors")
        public List<AnchorInfo> anchors = new ArrayList();

        @C09CT("performance_duration")
        public long performanceDuration;

        @C09CT("take_the_stage_version")
        public long takeTheStageVersion;

        public static final class AnchorInfo {

            @C09CT("default_order")
            public long defaultOrder;

            @C09CT("user_id")
            public long userId;
        }
    }
}

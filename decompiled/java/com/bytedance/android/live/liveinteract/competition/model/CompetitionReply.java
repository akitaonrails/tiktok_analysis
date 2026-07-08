package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionReply {

    @C09CT("ab_info")
    public Map<Long, CompetitionABInfo> abInfo = new LinkedHashMap();

    @C09CT("beans_biz")
    public BeansBiz beansBiz;

    @C09CT("initiate")
    public CompetitionInitiate initiate;

    @C09CT("replier")
    public CompetitionUserBase replier;

    @C09CT("reply_source")
    public int replySource;

    @C09CT("reply_type")
    public int replyType;

    @C09CT("take_the_stage_biz")
    public TakeTheStageBiz takeTheStageBiz;

    public static final class BeansBiz {

        @C09CT("reject_reason")
        public int rejectReason;
    }

    public static final class TakeTheStageBiz {

        @C09CT("anchors")
        public List<AnchorInfo> anchors = new ArrayList();

        @C09CT("performance_start_time")
        public long performanceStartTime;

        @C09CT("planned_performance_end_time")
        public long plannedPerformanceEndTime;

        @C09CT("take_the_stage_status")
        public int takeTheStageStatus;

        public static final class AnchorInfo {

            @C09CT("default_order")
            public long defaultOrder;

            @C09CT("user_id")
            public long userId;
        }
    }
}

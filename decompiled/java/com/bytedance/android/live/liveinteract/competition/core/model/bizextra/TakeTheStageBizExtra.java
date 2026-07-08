package com.bytedance.android.live.liveinteract.competition.core.model.bizextra;

import X.AbstractC983970biF;
import X.C09CT;
import X.C982710bgD;
import X.EnumC974260bSa;
import X.EnumC982900bgW;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeTheStageBizExtra extends AbstractC983970biF {

    @C09CT("final_call_info")
    public FinalCallInfo finalCallInfo;

    @C09CT("initiator")
    public C982710bgD initiator;

    @C09CT("performance_duration")
    public long performanceDuration;

    @C09CT("started_info")
    public StartedInfo startedInfo;

    @C09CT("take_the_stage_start_time")
    public long takeTheStageStartTime;

    @C09CT("take_the_stage_version")
    public long takeTheStageVersion;

    @C09CT("victory_lap_info")
    public VictoryLapInfo victoryLapInfo;

    @C09CT("take_the_stage_status")
    public EnumC974260bSa takeTheStageStatus = EnumC974260bSa.NONE;

    @C09CT("switch_turn_reason")
    public EnumC982900bgW switchTurnReason = EnumC982900bgW.UNKNOWN;
    public List<PerformAnchor> LIZ = new ArrayList();

    @C09CT("default_orders")
    public Map<Long, Long> defaultOrders = new LinkedHashMap();

    public static final class FinalCallInfo {

        @C09CT("extra_time_interval")
        public long extraTimeInterval;

        @C09CT("planned_settlement_end_time")
        public long plannedSettlementEndTime;
    }

    public static final class PerformAnchor {

        @C09CT("default_order")
        public long defaultOrder;

        @C09CT("user_id")
        public long userId;
    }

    public static final class StartedInfo {

        @C09CT("performance_start_time")
        public long performanceStartTime;
    }

    public static final class VictoryLapInfo {

        @C09CT("planned_finish_time")
        public long plannedFinishTime;
    }
}

package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TakeTheStageInfo {

    @C09CT("default_orders")
    public Map<Long, Long> defaultOrders = new LinkedHashMap();

    @C09CT("final_call_info")
    public FinalCallInfo finalCallInfo;

    @C09CT("started_info")
    public StartedInfo startedInfo;

    @C09CT("take_the_stage_start_time")
    public long takeTheStageStartTime;

    @C09CT("take_the_stage_status")
    public int takeTheStageStatus;

    @C09CT("take_the_stage_version")
    public long takeTheStageVersion;

    @C09CT("victory_lap_info")
    public VictoryLapInfo victoryLapInfo;

    public static final class FinalCallInfo {

        @C09CT("extra_time_interval")
        public long extraTimeInterval;

        @C09CT("planned_settlement_end_time")
        public long plannedSettlementEndTime;
    }

    public static final class StartedInfo {

        @C09CT("initiate_auto_final_call")
        public boolean initiateAutoFinalCall;

        @C09CT("order_info")
        public TakeTheStageOrderInfo orderInfo;

        @C09CT("performance_start_time")
        public long performanceStartTime;

        @C09CT("planned_performance_end_time")
        public long plannedPerformanceEndTime;
    }

    public static final class VictoryLapInfo {

        @C09CT("planned_finish_time")
        public long plannedFinishTime;
    }
}

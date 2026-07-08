package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class HistoryRecord {

        @C09CT("competition_id")
        public long competitionId;

        @C09CT("duration_sec")
        public long durationSec;

        @C09CT("start_timestamp_sec")
        public long startTimestampSec;

        @C09CT("competition_id_str")
        public String competitionIdStr = "";

        @C09CT("teams")
        public List<CompetitionResultsTeamInfo> teams = new ArrayList();
    }

    public static final class ResponseData {

        @C09CT("records")
        public List<HistoryRecord> records = new ArrayList();
    }
}

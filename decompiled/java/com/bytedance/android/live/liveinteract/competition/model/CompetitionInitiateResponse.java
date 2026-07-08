package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionInitiateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("actual_end_timestamp_sec")
        public long actualEndTimestampSec;

        @C09CT("actual_take_the_stage_version")
        public long actualTakeTheStageVersion;

        @C09CT("biz_common")
        public CompetitionCommon bizCommon;

        @C09CT("end_timestamp_sec")
        public long endTimestampSec;

        @C09CT("gameplay_option")
        public int gameplayOption;

        @C09CT("inviter_gift_permission_type")
        public int inviterGiftPermissionType;

        @C09CT("teams")
        public List<CompetitionTeamBase> teams = new ArrayList();
    }
}

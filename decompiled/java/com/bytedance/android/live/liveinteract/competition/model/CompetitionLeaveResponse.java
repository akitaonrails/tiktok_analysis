package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionLeaveResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("biz_common")
        public CompetitionCommon bizCommon;

        @C09CT("team_infos")
        public List<CompetitionResultsTeamInfo> teamInfos = new ArrayList();
    }
}

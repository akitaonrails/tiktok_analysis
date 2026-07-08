package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionResultsTeamInfo {

    @C09CT("rank")
    public long rank;

    @C09CT("result")
    public int result;

    @C09CT("score")
    public long score;

    @C09CT("self_contributor")
    public CompetitionContributorInfo selfContributor;

    @C09CT("team_id")
    public long teamId;

    @C09CT("contributors")
    public List<CompetitionContributorInfo> contributors = new ArrayList();

    @C09CT("members")
    public List<CompetitionTeamMemberInfo> members = new ArrayList();

    @C09CT("team_id_str")
    public String teamIdStr = "";

    @C09CT("formatted_score")
    public String formattedScore = "";
}

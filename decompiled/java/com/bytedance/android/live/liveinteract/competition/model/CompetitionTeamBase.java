package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionTeamBase {

    @C09CT("team_id")
    public long teamId;

    @C09CT("users")
    public List<CompetitionUserBase> users = new ArrayList();
}

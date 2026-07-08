package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class BeansUpdateScoreParams {

    @C09CT("biz_common")
    public CompetitionCommon bizCommon;

    @C09CT("drops_caught")
    public List<DropCaught> dropsCaught = new ArrayList();

    @C09CT("request_version")
    public long requestVersion;

    @C09CT("score")
    public long score;

    public static final class DropCaught {

        @C09CT("drop_type")
        public int dropType;

        @C09CT("score")
        public long score;

        @C09CT("source")
        public int source;

        @C09CT("total_score_gain")
        public long totalScoreGain;
    }
}

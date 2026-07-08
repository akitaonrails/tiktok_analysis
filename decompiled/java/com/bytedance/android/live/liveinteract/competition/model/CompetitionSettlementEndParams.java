package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class CompetitionSettlementEndParams {

    @C09CT("beans_biz")
    public BeansBiz beansBiz;

    @C09CT("biz_common")
    public CompetitionCommon bizCommon;

    @C09CT("end_reason")
    public int endReason;

    public static final class BeansBiz {

        @C09CT("anchors_info")
        public List<AnchorInfo> anchorsInfo = new ArrayList();

        public static final class AnchorInfo {

            @C09CT("anchor_id")
            public long anchorId;

            @C09CT("max_combo")
            public long maxCombo;

            @C09CT("score")
            public long score;
        }
    }
}

package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReply;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionReplyResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("ab_infos")
        public Map<Long, CompetitionABInfo> abInfos = new LinkedHashMap();

        @C09CT("beans_biz")
        public BeansBiz beansBiz;

        @C09CT("biz_common")
        public CompetitionCommon bizCommon;

        @C09CT("take_the_stage_biz")
        public CompetitionReply.TakeTheStageBiz takeTheStageBiz;

        public static final class BeansBiz {

            @C09CT("beans_status")
            public int beansStatus;
        }
    }
}

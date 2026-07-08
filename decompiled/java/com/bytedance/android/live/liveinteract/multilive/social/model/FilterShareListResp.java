package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FilterShareListResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("filtered_candidate_list")
        public List<Long> filteredCandidateList = new ArrayList();
    }
}

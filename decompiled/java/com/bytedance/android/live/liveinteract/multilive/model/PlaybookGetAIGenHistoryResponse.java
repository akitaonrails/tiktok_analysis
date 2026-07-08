package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookGetAIGenHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("ai_gen_playbooks")
        public List<AiPlaybookSummary> aiGenPlaybooks = new ArrayList();
    }
}

package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardTemplateFetchListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("create_num_limit")
        public long createNumLimit;

        @C09CT("is_official_user")
        public boolean isOfficialUser;

        @C09CT("my_templates")
        public List<NoticeboardTemplate> myTemplates = new ArrayList();

        @C09CT("recommended_templates")
        public List<NoticeboardTemplate> recommendedTemplates = new ArrayList();
    }
}

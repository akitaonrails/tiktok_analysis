package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookFetchListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("current_recommended_first_level_tag_type")
        public int currentRecommendedFirstLevelTagType;

        @C09CT("current_recommended_tag_type")
        public int currentRecommendedTagType;

        @C09CT("is_official_user")
        public boolean isOfficialUser;

        @C09CT("latest_used_playbook_id")
        public long latestUsedPlaybookId;

        @C09CT("my_playbooks")
        public List<Playbook> myPlaybooks = new ArrayList();

        @C09CT("favorite_playbooks")
        public List<Playbook> favoritePlaybooks = new ArrayList();

        @C09CT("recommended_playbooks")
        public List<Playbook> recommendedPlaybooks = new ArrayList();

        @C09CT("all_tags")
        public List<PlaybookTagInfo> allTags = new ArrayList();

        @C09CT("tag_aggregations")
        public List<PlaybookTagAggregation> tagAggregations = new ArrayList();
    }
}

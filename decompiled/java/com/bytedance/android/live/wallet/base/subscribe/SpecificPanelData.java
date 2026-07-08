package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.api.sub.GiftSubTemplateInfo;
import webcast.api.sub.RecommendedUsers;

/* JADX INFO: loaded from: classes.dex */
public final class SpecificPanelData {

    @C09CT("active_viewer_info")
    public ActiveViewerInfo activeViewerInfo;

    @C09CT("friend_info")
    public FriendInfo friendInfo;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("selected_user")
    public User selectedUser;

    @C09CT("templates")
    public List<GiftSubTemplateInfo> templates = new ArrayList();

    @C09CT("active_viewer_infos")
    public List<ActiveViewerInfo> activeViewerInfos = new ArrayList();

    @C09CT("recommend_types")
    public List<String> recommendTypes = new ArrayList();

    @C09CT("recommended_users_group")
    public Map<String, RecommendedUsersGroup> recommendedUsersGroup = new LinkedHashMap();

    public static final class RecommendedUsersGroup {

        @C09CT("recommended_users_list")
        public List<RecommendedUsers> recommendedUsersList = new ArrayList();
    }
}

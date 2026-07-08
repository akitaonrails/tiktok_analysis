package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GuestInvitePanelResp {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ListUser {

        @C09CT("invited")
        public boolean invited;

        @C09CT("online_status")
        public int onlineStatus;

        @C09CT("user")
        public User user;

        @C09CT("tag_list")
        public List<String> tagList = new ArrayList();

        @C09CT("tag_text_list")
        public List<String> tagTextList = new ArrayList();

        @C09CT("recommend_tag_list")
        public List<String> recommendTagList = new ArrayList();

        @C09CT("recommend_tag_text_list")
        public List<String> recommendTagTextList = new ArrayList();

        @C09CT("track_map")
        public Map<String, String> trackMap = new LinkedHashMap();
    }

    public static final class ResponseData {

        @C09CT("anchor_region")
        public String anchorRegion = "";

        @C09CT("guest_invite_friends")
        public List<ListUser> guestInviteFriends = new ArrayList();

        @C09CT("guest_invite_suggest_users")
        public List<ListUser> guestInviteSuggestUsers = new ArrayList();
    }
}

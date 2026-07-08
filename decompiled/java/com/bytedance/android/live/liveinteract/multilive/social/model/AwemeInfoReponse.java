package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.LinkedUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class AwemeInfoReponse {

    @C09CT("data")
    public ResponseData data;

    public static final class AwemeInfo {

        @C09CT("card_style")
        public int cardStyle;

        @C09CT("room")
        public Room room;

        @C09CT("linked_users")
        public List<LinkedUserInfo> linkedUsers = new ArrayList();

        @C09CT("ai_summary")
        public String aiSummary = "";

        @C09CT("extra_info")
        public Map<String, String> extraInfo = new LinkedHashMap();
    }

    public static final class ResponseData {

        @C09CT("aweme_info")
        public AwemeInfo awemeInfo;
    }
}

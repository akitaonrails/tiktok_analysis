package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_social_data.Song;

/* JADX INFO: loaded from: classes16.dex */
public final class GameResourceGetResp {

    @C09CT("data")
    public ResponseData data;

    public static final class JustDanceOption {

        @C09CT("dance_song")
        public Song danceSong;

        @C09CT("danced_total")
        public long dancedTotal;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("is_default")
        public boolean isDefault;

        @C09CT("loki_resource_id")
        public String lokiResourceId = "";

        @C09CT("loki_panel_name")
        public String lokiPanelName = "";
    }

    public static final class JustDanceResource {

        @C09CT("options")
        public List<JustDanceOption> options = new ArrayList();
    }

    public static final class ResponseData {

        @C09CT("just_dance_resource")
        public JustDanceResource justDanceResource;
    }
}

package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.AvatarImageSelectTips;
import webcast.data.multi_guest_social_data.AvatarStyle;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarListResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("can_customize")
        public boolean canCustomize;

        @C09CT("custom_max")
        public long customMax;

        @C09CT("image_select_tips")
        public AvatarImageSelectTips imageSelectTips;

        @C09CT("avatars")
        public List<Avatar> avatars = new ArrayList();

        @C09CT("styles")
        public List<AvatarStyle> styles = new ArrayList();
    }
}

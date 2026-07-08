package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyGuideResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("apply_user")
        public User applyUser;

        @C09CT("display_strategy")
        public int displayStrategy;

        @C09CT("is_display")
        public boolean isDisplay;

        @C09CT("trigger_again")
        public boolean triggerAgain;
    }
}

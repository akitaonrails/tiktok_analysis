package com.bytedance.android.live.programmedlive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowCard {

    @C09CT("display_duration")
    public final Long duration;

    @C09CT("follow_card_id")
    public final Long id;

    @C09CT("multi_user_list")
    public final List<User> multiUserList;

    @C09CT("user")
    public final User user;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowCard(Long l, User user, List<? extends User> list, Long l2) {
        this.id = l;
        this.user = user;
        this.multiUserList = list;
        this.duration = l2;
    }
}

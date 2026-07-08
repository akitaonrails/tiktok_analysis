package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FriendInfo {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("friends")
    public List<User> friends = new ArrayList();

    @C09CT("online_friends")
    public List<Long> onlineFriends = new ArrayList();
}

package com.bytedance.android.live.share.response;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BatchShareUsersResult {

    @C09CT("recently_shared_users")
    public final List<User> recentlySharedUsers;

    @C09CT("rank_users")
    public final List<User> topRankUsers;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchShareUsersResult(List<? extends User> list, List<? extends User> list2) {
        this.topRankUsers = list;
        this.recentlySharedUsers = list2;
    }
}

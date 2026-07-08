package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftSubFriendsListData {

    @C09CT("friends")
    public List<User> friends = new ArrayList();

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("total_count")
    public long totalCount;
}

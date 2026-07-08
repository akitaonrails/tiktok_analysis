package X;

import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;

/* JADX INFO: renamed from: X.0VjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805940VjU extends Exception {
    public final FriendsFeedResponse LL;

    public final FriendsFeedResponse getResponse() {
        return this.LL;
    }

    public C805940VjU(FriendsFeedResponse friendsFeedResponse, String str) {
        super(str);
        this.LL = friendsFeedResponse;
    }
}

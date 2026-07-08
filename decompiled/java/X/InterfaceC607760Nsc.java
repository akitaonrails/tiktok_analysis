package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;

/* JADX INFO: renamed from: X.0Nsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC607760Nsc {
    @InterfaceC1501240pAY("/aweme/v1/follow/feed/recommend/")
    @InterfaceC1485505rh
    ListenableFuture<FollowFeedList> LIZ(@InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("pull_type") int i2, @InterfaceC1501100pAK("feed_style") int i3, @InterfaceC1501100pAK("enter_time") long j, @InterfaceC1501100pAK("impression_ids") String str, @InterfaceC1501100pAK("last_feed_ids") String str2);
}

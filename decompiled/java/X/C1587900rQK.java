package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource;

/* JADX INFO: renamed from: X.0rQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource", f = "FriendsV3FeedNetworkSource.kt", l = {679}, m = "handleEmptyRetryAgain-Y5yfBNE")
public final class C1587900rQK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendsV3FeedNetworkSource LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587900rQK(FriendsV3FeedNetworkSource friendsV3FeedNetworkSource, InterfaceC1364105Vn<? super C1587900rQK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3FeedNetworkSource;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedNetworkSource@b4c8.handleEmptyRetryAgain$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objM208handleEmptyRetryAgainY5yfBNE = this.LLILLJJLI.m208handleEmptyRetryAgainY5yfBNE(null, null, 0, 0, null, null, null, 0, null, null, null, null, null, null, null, this);
        if (objM208handleEmptyRetryAgainY5yfBNE == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.handleEmptyRetryAgain$1");
            return objM208handleEmptyRetryAgainY5yfBNE;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objM208handleEmptyRetryAgainY5yfBNE);
        C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.handleEmptyRetryAgain$1");
        return c189200o6M1boximpl;
    }
}

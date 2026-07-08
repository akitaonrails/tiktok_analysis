package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource;

/* JADX INFO: renamed from: X.0rQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource", f = "FriendsV3FeedNetworkSource.kt", l = {422, 444, 475}, m = "requestTextHistoryInner-BWLJW6A")
public final class C1587940rQO extends AbstractC23140094w {
    public AbstractC1588120rQg LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ FriendsV3FeedNetworkSource LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587940rQO(FriendsV3FeedNetworkSource friendsV3FeedNetworkSource, InterfaceC1364105Vn<? super C1587940rQO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = friendsV3FeedNetworkSource;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedNetworkSource@b4c8.requestTextHistoryInner$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objM215requestTextHistoryInnerBWLJW6A = this.LLILZLL.m215requestTextHistoryInnerBWLJW6A(null, null, 0, this);
        if (objM215requestTextHistoryInnerBWLJW6A == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.requestTextHistoryInner$1");
            return objM215requestTextHistoryInnerBWLJW6A;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objM215requestTextHistoryInnerBWLJW6A);
        C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.requestTextHistoryInner$1");
        return c189200o6M1boximpl;
    }
}

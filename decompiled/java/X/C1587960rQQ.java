package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource;

/* JADX INFO: renamed from: X.0rQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource", f = "FriendsV3FeedNetworkSource.kt", l = {341, 357, 370}, m = "requestTextDetailInner-BWLJW6A")
public final class C1587960rQQ extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ FriendsV3FeedNetworkSource LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587960rQQ(FriendsV3FeedNetworkSource friendsV3FeedNetworkSource, InterfaceC1364105Vn<? super C1587960rQQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = friendsV3FeedNetworkSource;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedNetworkSource@b4c8.requestTextDetailInner$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objM213requestTextDetailInnerBWLJW6A = this.LLILZIL.m213requestTextDetailInnerBWLJW6A(null, null, 0, this);
        if (objM213requestTextDetailInnerBWLJW6A == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.requestTextDetailInner$1");
            return objM213requestTextDetailInnerBWLJW6A;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objM213requestTextDetailInnerBWLJW6A);
        C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.requestTextDetailInner$1");
        return c189200o6M1boximpl;
    }
}

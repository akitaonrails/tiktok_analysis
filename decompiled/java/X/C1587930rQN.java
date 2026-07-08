package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource;

/* JADX INFO: renamed from: X.0rQN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource", f = "FriendsV3FeedNetworkSource.kt", l = {150}, m = "request-jLovISM")
public final class C1587930rQN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendsV3FeedNetworkSource LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587930rQN(FriendsV3FeedNetworkSource friendsV3FeedNetworkSource, InterfaceC1364105Vn<? super C1587930rQN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3FeedNetworkSource;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedNetworkSource@b4c8.request$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objM210requestjLovISM = this.LLILLJJLI.m210requestjLovISM(null, 0, 0, null, null, null, null, null, null, null, null, this);
        if (objM210requestjLovISM == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.request$1");
            return objM210requestjLovISM;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objM210requestjLovISM);
        C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.request$1");
        return c189200o6M1boximpl;
    }
}

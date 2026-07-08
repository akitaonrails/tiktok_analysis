package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;

/* JADX INFO: renamed from: X.0rQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository", f = "FriendsV3FeedRepository.kt", l = {494}, m = "loadMore-BWLJW6A")
public final class C1587970rQR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendsV3FeedRepository LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587970rQR(FriendsV3FeedRepository friendsV3FeedRepository, InterfaceC1364105Vn<? super C1587970rQR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3FeedRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedRepository@1744.loadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(null, null, null, this);
        if (objLJII == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedRepository@1744.loadMore$1");
            return objLJII;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("FriendsV3FeedRepository@1744.loadMore$1");
        return c189200o6M1boximpl;
    }
}

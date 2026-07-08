package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;

/* JADX INFO: renamed from: X.0rQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository", f = "FriendsV3FeedRepository.kt", l = {351, 404}, m = "fetchRefresh-eH_QyT8")
public final class C1587950rQP extends AbstractC23140094w {
    public boolean LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ FriendsV3FeedRepository LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587950rQP(FriendsV3FeedRepository friendsV3FeedRepository, InterfaceC1364105Vn<? super C1587950rQP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = friendsV3FeedRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("FriendsV3FeedRepository@1744.fetchRefresh$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, null, false, null, 0, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedRepository@1744.fetchRefresh$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("FriendsV3FeedRepository@1744.fetchRefresh$1");
        return c189200o6M1boximpl;
    }
}

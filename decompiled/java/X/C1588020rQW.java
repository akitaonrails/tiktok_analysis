package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;

/* JADX INFO: renamed from: X.0rQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository", f = "FriendsV3FeedRepository.kt", l = {590}, m = "refreshTextDetail-0E7RQCE")
public final class C1588020rQW extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendsV3FeedRepository LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588020rQW(FriendsV3FeedRepository friendsV3FeedRepository, InterfaceC1364105Vn<? super C1588020rQW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3FeedRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedRepository@1744.refreshTextDetail$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objM217refreshTextDetail0E7RQCE = this.LLILLJJLI.m217refreshTextDetail0E7RQCE(null, null, this);
        if (objM217refreshTextDetail0E7RQCE == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedRepository@1744.refreshTextDetail$1");
            return objM217refreshTextDetail0E7RQCE;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objM217refreshTextDetail0E7RQCE);
        C1C7U.LIZIZ("FriendsV3FeedRepository@1744.refreshTextDetail$1");
        return c189200o6M1boximpl;
    }
}

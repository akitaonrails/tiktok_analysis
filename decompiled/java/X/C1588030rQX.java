package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository;

/* JADX INFO: renamed from: X.0rQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedRepository", f = "FriendsV3FeedRepository.kt", l = {601}, m = "refreshTextHistory-gIAlu-s")
public final class C1588030rQX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendsV3FeedRepository LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588030rQX(FriendsV3FeedRepository friendsV3FeedRepository, InterfaceC1364105Vn<? super C1588030rQX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3FeedRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedRepository@1744.refreshTextHistory$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objM218refreshTextHistorygIAlus = this.LLILLJJLI.m218refreshTextHistorygIAlus(null, this);
        if (objM218refreshTextHistorygIAlus == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedRepository@1744.refreshTextHistory$1");
            return objM218refreshTextHistorygIAlus;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objM218refreshTextHistorygIAlus);
        C1C7U.LIZIZ("FriendsV3FeedRepository@1744.refreshTextHistory$1");
        return c189200o6M1boximpl;
    }
}

package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource;

/* JADX INFO: renamed from: X.0rQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedNetworkSource", f = "FriendsV3FeedNetworkSource.kt", l = {195, 247, 275}, m = "requestInner-p3iPjrY")
public final class C1587890rQJ extends AbstractC23140094w {
    public AbstractC1588120rQg LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public EnumC1587000rOs LLILZLL;
    public EnumC1586970rOp LLIZ;
    public C1581400rFq LLIZLLLIL;
    public C1588150rQj LLJ;
    public Object LLJI;
    public Object LLJIJIL;
    public Object LLJILJIL;
    public Object LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public /* synthetic */ Object LLJJIII;
    public final /* synthetic */ FriendsV3FeedNetworkSource LLJJIJI;
    public int LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1587890rQJ(FriendsV3FeedNetworkSource friendsV3FeedNetworkSource, InterfaceC1364105Vn<? super C1587890rQJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJJIJI = friendsV3FeedNetworkSource;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedNetworkSource@b4c8.requestInner$1");
        this.LLJJIII = obj;
        this.LLJJIJIIJIL |= Integer.MIN_VALUE;
        Object objM211requestInnerp3iPjrY = this.LLJJIJI.m211requestInnerp3iPjrY(null, 0, 0, null, null, null, 0, null, null, null, null, null, null, null, this);
        if (objM211requestInnerp3iPjrY == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.requestInner$1");
            return objM211requestInnerp3iPjrY;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objM211requestInnerp3iPjrY);
        C1C7U.LIZIZ("FriendsV3FeedNetworkSource@b4c8.requestInner$1");
        return c189200o6M1boximpl;
    }
}

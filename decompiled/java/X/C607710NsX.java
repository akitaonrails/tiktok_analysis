package X;

import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;

/* JADX INFO: renamed from: X.0NsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM", f = "FollowInnerFeedVM.kt", l = {166}, m = "onLoadMore")
public final class C607710NsX extends AbstractC23140094w {
    public C607740Nsa LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ FollowInnerFeedVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607710NsX(FollowInnerFeedVM followInnerFeedVM, InterfaceC1364105Vn<? super C607710NsX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = followInnerFeedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowInnerFeedVM@437f.onLoadMore$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILZ.onLoadMore(null, this);
        C1C7U.LIZIZ("FollowInnerFeedVM@437f.onLoadMore$1");
        return objCQ2;
    }
}

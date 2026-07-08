package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;

/* JADX INFO: renamed from: X.0Clk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM", f = "FriendNewVideoSharedVM.kt", l = {105}, m = "onLoadMore")
public final class C323220Clk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendNewVideoSharedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323220Clk(FriendNewVideoSharedVM friendNewVideoSharedVM, InterfaceC1364105Vn<? super C323220Clk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendNewVideoSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendNewVideoSharedVM@8e4.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("FriendNewVideoSharedVM@8e4.onLoadMore$1");
        return objCQ2;
    }
}

package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM;

/* JADX INFO: renamed from: X.0Cll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.videoplayer.FriendNewVideoSharedVM", f = "FriendNewVideoSharedVM.kt", l = {119}, m = "onRefresh")
public final class C323230Cll extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendNewVideoSharedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323230Cll(FriendNewVideoSharedVM friendNewVideoSharedVM, InterfaceC1364105Vn<? super C323230Cll> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendNewVideoSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendNewVideoSharedVM@8e4.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("FriendNewVideoSharedVM@8e4.onRefresh$1");
        return objOnRefresh;
    }
}

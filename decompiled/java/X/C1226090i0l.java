package X;

/* JADX INFO: renamed from: X.0i0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.collection.collaborative.invitepanel.CollectionInviteFriendCTDSProtocol", f = "CollectionInviteFriendCTDSProtocol.kt", l = {78, 83}, m = "onRefresh")
public final class C1226090i0l extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1226080i0k LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226090i0l(C1226080i0k c1226080i0k, InterfaceC1364105Vn<? super C1226090i0l> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1226080i0k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollectionInviteFriendCTDSProtocol@ed9a.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILLJJLI.LJJIL(this);
        C1C7U.LIZIZ("CollectionInviteFriendCTDSProtocol@ed9a.onRefresh$1");
        return objLJJIL;
    }
}

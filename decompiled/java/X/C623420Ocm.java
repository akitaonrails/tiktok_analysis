package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel;

/* JADX INFO: renamed from: X.0Ocm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel", f = "BulletinMemberListViewModel.kt", l = {91}, m = "onLoadMore")
public final class C623420Ocm extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinMemberListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623420Ocm(BulletinMemberListViewModel bulletinMemberListViewModel, InterfaceC1364105Vn<? super C623420Ocm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinMemberListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinMemberListViewModel@c198.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("BulletinMemberListViewModel@c198.onLoadMore$1");
        return objVQ2;
    }
}

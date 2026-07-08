package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel;

/* JADX INFO: renamed from: X.0Ocl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel", f = "BulletinMemberListViewModel.kt", l = {52}, m = "onRefresh")
public final class C623410Ocl extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinMemberListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623410Ocl(BulletinMemberListViewModel bulletinMemberListViewModel, InterfaceC1364105Vn<? super C623410Ocl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinMemberListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinMemberListViewModel@c198.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("BulletinMemberListViewModel@c198.onRefresh$1");
        return objOnRefresh;
    }
}

package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;

/* JADX INFO: renamed from: X.0OJI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {298, 309}, m = "onRefreshWithDC")
public final class C0OJI extends AbstractC23140094w {
    public Object LL;
    public C0OI4 LLILLJJLI;
    public C605530Np1 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ BulletinListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJI(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.onRefreshWithDC$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objSQ2 = this.LLILZIL.SQ2(null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.onRefreshWithDC$1");
        return objSQ2;
    }
}

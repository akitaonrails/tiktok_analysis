package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;

/* JADX INFO: renamed from: X.0OJN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {511, 511}, m = "onRefreshLegacy")
public final class C0OJN extends AbstractC23140094w {
    public Object LL;
    public BulletinListViewModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BulletinListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJN(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.onRefreshLegacy$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objRQ2 = this.LLILZ.RQ2(null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.onRefreshLegacy$1");
        return objRQ2;
    }
}

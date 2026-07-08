package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;

/* JADX INFO: renamed from: X.0OJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {532, 532, 534}, m = "processRefreshResultLegacy")
public final class C0OJJ extends AbstractC23140094w {
    public C616870OHl LL;
    public C0OK3 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BulletinListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJJ(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.processRefreshResultLegacy$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.VQ2(null, null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.processRefreshResultLegacy$1");
        return objVQ2;
    }
}

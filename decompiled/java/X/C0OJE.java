package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;

/* JADX INFO: renamed from: X.0OJE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {865, 873}, m = "onLoadMoreResult")
public final class C0OJE extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public BulletinListResponse LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ BulletinListViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJE(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.onLoadMoreResult$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objQQ2 = this.LLIZ.QQ2(null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.onLoadMoreResult$1");
        return objQQ2;
    }
}

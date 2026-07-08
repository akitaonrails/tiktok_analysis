package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;

/* JADX INFO: renamed from: X.0OJF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {568, 580, 586}, m = "getBulletinResultWrapper")
public final class C0OJF extends AbstractC23140094w {
    public Object LL;
    public C259800zU LLILLJJLI;
    public BulletinListResponse LLILLL;
    public C259800zU LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ BulletinListViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJF(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.getBulletinResultWrapper$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILZLL.AQ2(this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.getBulletinResultWrapper$1");
        return objAQ2;
    }
}

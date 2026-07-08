package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;

/* JADX INFO: renamed from: X.0OJL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {489}, m = "performNetworkMerge")
public final class C0OJL extends AbstractC23140094w {
    public BulletinListResponse LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BulletinListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJL(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.performNetworkMerge$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objTQ2 = this.LLILLL.TQ2(null, null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.performNetworkMerge$1");
        return objTQ2;
    }
}

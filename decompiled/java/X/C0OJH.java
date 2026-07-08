package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;

/* JADX INFO: renamed from: X.0OJH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {441}, m = "buildFirstPageResult")
public final class C0OJH extends AbstractC23140094w {
    public BulletinListResponse LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BulletinListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJH(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.buildFirstPageResult$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZ.xQ2(null, null, null, false, null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.buildFirstPageResult$1");
        return objXQ2;
    }
}

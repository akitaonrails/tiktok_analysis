package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import kotlin.jvm.internal.AwS83S0100100_9;

/* JADX INFO: renamed from: X.0OJD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {351, 375}, m = "processListResponse")
public final class C0OJD extends AbstractC23140094w {
    public BulletinListResponse LL;
    public Object LLILLJJLI;
    public C0OKA LLILLL;
    public AwS83S0100100_9 LLILZ;
    public boolean LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ BulletinListViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJD(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.processListResponse$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objUQ2 = this.LLIZ.UQ2(null, null, this, false);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.processListResponse$1");
        return objUQ2;
    }
}

package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;

/* JADX INFO: renamed from: X.0OJG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel", f = "BulletinListViewModel.kt", l = {806, 806}, m = "mergeLocalNotSendResult")
public final class C0OJG extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ BulletinListViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OJG(BulletinListViewModel bulletinListViewModel, InterfaceC1364105Vn<? super C0OJG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = bulletinListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinListViewModel@dbe7.mergeLocalNotSendResult$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objKQ2 = this.LLILZLL.KQ2(null, null, null, null, null, this);
        C1C7U.LIZIZ("BulletinListViewModel@dbe7.mergeLocalNotSendResult$1");
        return objKQ2;
    }
}

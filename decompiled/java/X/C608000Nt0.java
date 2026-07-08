package X;

import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;

/* JADX INFO: renamed from: X.0Nt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM", f = "OfflineModeListVM.kt", l = {229}, m = "onLoadMore")
public final class C608000Nt0 extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ OfflineModeListVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608000Nt0(OfflineModeListVM offlineModeListVM, InterfaceC1364105Vn<? super C608000Nt0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = offlineModeListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeListVM@46f2.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0, this);
        C1C7U.LIZIZ("OfflineModeListVM@46f2.onLoadMore$1");
        return objOnLoadMore;
    }
}

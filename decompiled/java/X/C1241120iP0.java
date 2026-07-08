package X;

import com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM;

/* JADX INFO: renamed from: X.0iP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM", f = "HistorySearchResultListVM.kt", l = {84}, m = "onRefresh")
public final class C1241120iP0 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ HistorySearchResultVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241120iP0(HistorySearchResultVM historySearchResultVM, InterfaceC1364105Vn<? super C1241120iP0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = historySearchResultVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HistorySearchResultVM@87a6.onRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLL.onRefresh(this);
        C1C7U.LIZIZ("HistorySearchResultVM@87a6.onRefresh$1");
        return objOnRefresh;
    }
}

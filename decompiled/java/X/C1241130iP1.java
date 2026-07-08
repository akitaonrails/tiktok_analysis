package X;

import com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM;

/* JADX INFO: renamed from: X.0iP1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM", f = "HistorySearchResultListVM.kt", l = {163}, m = "realLoad")
public final class C1241130iP1 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ HistorySearchResultVM LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241130iP1(HistorySearchResultVM historySearchResultVM, InterfaceC1364105Vn<? super C1241130iP1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = historySearchResultVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HistorySearchResultVM@87a6.realLoad$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZLL.vQ2(0, null, null, null, this);
        C1C7U.LIZIZ("HistorySearchResultVM@87a6.realLoad$1");
        return objVQ2;
    }
}

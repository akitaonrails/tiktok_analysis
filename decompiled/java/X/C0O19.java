package X;

import com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM;

/* JADX INFO: renamed from: X.0O19, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM", f = "BookVideoListVM.kt", l = {97}, m = "onLoadMore")
public final class C0O19 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BookVideoListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O19(BookVideoListVM bookVideoListVM, InterfaceC1364105Vn<? super C0O19> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bookVideoListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BookVideoListVM@dff.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("BookVideoListVM@dff.onLoadMore$1");
        return objBQ2;
    }
}

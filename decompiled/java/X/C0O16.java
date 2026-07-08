package X;

import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM;

/* JADX INFO: renamed from: X.0O16, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM", f = "MovieVideoListVM.kt", l = {108}, m = "onLoadMore")
public final class C0O16 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MovieVideoListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O16(MovieVideoListVM movieVideoListVM, InterfaceC1364105Vn<? super C0O16> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = movieVideoListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MovieVideoListVM@88f6.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("MovieVideoListVM@88f6.onLoadMore$1");
        return objBQ2;
    }
}

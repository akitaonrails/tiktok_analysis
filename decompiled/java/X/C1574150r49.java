package X;

import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;

/* JADX INFO: renamed from: X.0r49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM", f = "SeriesFeedVM.kt", l = {777}, m = "whenLoadMore")
public final class C1574150r49 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeriesFeedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574150r49(SeriesFeedVM seriesFeedVM, InterfaceC1364105Vn<? super C1574150r49> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seriesFeedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesFeedVM@726f.whenLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(0L, this);
        C1C7U.LIZIZ("SeriesFeedVM@726f.whenLoadMore$1");
        return objBQ2;
    }
}

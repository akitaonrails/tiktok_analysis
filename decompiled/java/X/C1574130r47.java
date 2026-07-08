package X;

import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;

/* JADX INFO: renamed from: X.0r47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM", f = "SeriesFeedVM.kt", l = {806}, m = "loadMoreData")
public final class C1574130r47 extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeriesFeedVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574130r47(SeriesFeedVM seriesFeedVM, InterfaceC1364105Vn<? super C1574130r47> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = seriesFeedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesFeedVM@726f.loadMoreData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZ.xQ2(this);
        C1C7U.LIZIZ("SeriesFeedVM@726f.loadMoreData$1");
        return objXQ2;
    }
}

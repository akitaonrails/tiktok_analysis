package X;

import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;

/* JADX INFO: renamed from: X.0hJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM", f = "PoiSearchVM.kt", l = {163}, m = "onLoadMore")
public final class C1199230hJR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiSearchVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199230hJR(PoiSearchVM poiSearchVM, InterfaceC1364105Vn<? super C1199230hJR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiSearchVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchVM@b8c3.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiSearchVM@b8c3.onLoadMore$1");
        return objOnLoadMore;
    }
}

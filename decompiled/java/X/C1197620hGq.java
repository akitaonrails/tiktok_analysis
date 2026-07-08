package X;

import com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM;

/* JADX INFO: renamed from: X.0hGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM", f = "PoiCreatorVM.kt", l = {172}, m = "onLoadMore")
public final class C1197620hGq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiCreatorVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1197620hGq(PoiCreatorVM poiCreatorVM, InterfaceC1364105Vn<? super C1197620hGq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiCreatorVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCreatorVM@a397.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiCreatorVM@a397.onLoadMore$1");
        return objOnLoadMore;
    }
}

package X;

import com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM;

/* JADX INFO: renamed from: X.0Cqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM", f = "SearchEDMVideoDetailSharedVM.kt", l = {178}, m = "requestSearchFeedList")
public final class C326250Cqd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchEDMVideoDetailSharedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326250Cqd(SearchEDMVideoDetailSharedVM searchEDMVideoDetailSharedVM, InterfaceC1364105Vn<? super C326250Cqd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchEDMVideoDetailSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchEDMVideoDetailSharedVM@b342.requestSearchFeedList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(0L, this);
        C1C7U.LIZIZ("SearchEDMVideoDetailSharedVM@b342.requestSearchFeedList$1");
        return objBQ2;
    }
}

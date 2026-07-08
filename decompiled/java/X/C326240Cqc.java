package X;

import com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM;

/* JADX INFO: renamed from: X.0Cqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM", f = "SearchEDMVideoDetailSharedVM.kt", l = {115, 132, 135}, m = "onRefresh")
public final class C326240Cqc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchEDMVideoDetailSharedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326240Cqc(SearchEDMVideoDetailSharedVM searchEDMVideoDetailSharedVM, InterfaceC1364105Vn<? super C326240Cqc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchEDMVideoDetailSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchEDMVideoDetailSharedVM@b342.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("SearchEDMVideoDetailSharedVM@b342.onRefresh$1");
        return objOnRefresh;
    }
}

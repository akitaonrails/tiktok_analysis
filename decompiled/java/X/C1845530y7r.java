package X;

import com.ss.android.ugc.aweme.footnote.detail.viewmodel.FootNoteFeedListVM;

/* JADX INFO: renamed from: X.0y7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.footnote.detail.viewmodel.FootNoteFeedListVM", f = "FootNoteFeedListVM.kt", l = {47}, m = "onRefresh")
public final class C1845530y7r extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FootNoteFeedListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845530y7r(FootNoteFeedListVM footNoteFeedListVM, InterfaceC1364105Vn<? super C1845530y7r> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = footNoteFeedListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FootNoteFeedListVM@6156.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("FootNoteFeedListVM@6156.onRefresh$1");
        return objOnRefresh;
    }
}

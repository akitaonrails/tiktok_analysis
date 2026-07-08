package X;

import com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM;

/* JADX INFO: renamed from: X.0hGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.creator.PoiCreatorVM", f = "PoiCreatorVM.kt", l = {135}, m = "onRefresh")
public final class C1197590hGn extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiCreatorVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1197590hGn(PoiCreatorVM poiCreatorVM, InterfaceC1364105Vn<? super C1197590hGn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiCreatorVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCreatorVM@a397.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("PoiCreatorVM@a397.onRefresh$1");
        return objOnRefresh;
    }
}

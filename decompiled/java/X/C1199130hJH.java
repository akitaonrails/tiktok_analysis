package X;

import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;

/* JADX INFO: renamed from: X.0hJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM", f = "PoiSearchVM.kt", l = {184}, m = "onRefresh")
public final class C1199130hJH extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiSearchVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199130hJH(PoiSearchVM poiSearchVM, InterfaceC1364105Vn<? super C1199130hJH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiSearchVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchVM@b8c3.onRefresh$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILZ.onRefresh(this);
        C1C7U.LIZIZ("PoiSearchVM@b8c3.onRefresh$1");
        return objOnRefresh;
    }
}

package X;

import com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListVM;

/* JADX INFO: renamed from: X.0ClY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListVM", f = "PoiLimitedVideoListVM.kt", l = {127}, m = "onLoadMore")
public final class C323100ClY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiLimitedVideoListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323100ClY(PoiLimitedVideoListVM poiLimitedVideoListVM, InterfaceC1364105Vn<? super C323100ClY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiLimitedVideoListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiLimitedVideoListVM@6ffe.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiLimitedVideoListVM@6ffe.onLoadMore$1");
        return objDQ2;
    }
}

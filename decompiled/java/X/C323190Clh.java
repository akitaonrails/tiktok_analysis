package X;

import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;

/* JADX INFO: renamed from: X.0Clh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel", f = "PoiHeaderTopVideosSharedViewModel.kt", l = {197, 211}, m = "onLoadMore")
public final class C323190Clh extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiHeaderTopVideosSharedViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323190Clh(PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModel, InterfaceC1364105Vn<? super C323190Clh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = poiHeaderTopVideosSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiHeaderTopVideosSharedViewModel@aafc.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiHeaderTopVideosSharedViewModel@aafc.onLoadMore$1");
        return objOnLoadMore;
    }
}

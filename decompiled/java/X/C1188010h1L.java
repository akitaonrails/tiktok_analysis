package X;

import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;

/* JADX INFO: renamed from: X.0h1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel", f = "PoiVideoListSharedViewModel.kt", l = {222}, m = "onLoadMore")
public final class C1188010h1L extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiVideoListSharedViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188010h1L(PoiVideoListSharedViewModel poiVideoListSharedViewModel, InterfaceC1364105Vn<? super C1188010h1L> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiVideoListSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiVideoListSharedViewModel@19b1.onLoadMore$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILZ.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiVideoListSharedViewModel@19b1.onLoadMore$1");
        return objOnLoadMore;
    }
}

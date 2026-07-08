package X;

import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;

/* JADX INFO: renamed from: X.0h1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel", f = "PoiVideoListSharedViewModel.kt", l = {474}, m = "innerLoadMore")
public final class C1188080h1S extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiVideoListSharedViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188080h1S(PoiVideoListSharedViewModel poiVideoListSharedViewModel, InterfaceC1364105Vn<? super C1188080h1S> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiVideoListSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiVideoListSharedViewModel@19b1.innerLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(null, null, null, null, this);
        C1C7U.LIZIZ("PoiVideoListSharedViewModel@19b1.innerLoadMore$1");
        return objCQ2;
    }
}

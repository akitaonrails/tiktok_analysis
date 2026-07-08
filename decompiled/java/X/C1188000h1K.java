package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;

/* JADX INFO: renamed from: X.0h1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel", f = "PoiVideoListSharedViewModel.kt", l = {388, 399}, m = "tryLoadMoreByTag")
public final class C1188000h1K extends AbstractC23140094w {
    public PoiListApi.PostTag LL;
    public PoiVideoListSharedViewModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiVideoListSharedViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188000h1K(PoiVideoListSharedViewModel poiVideoListSharedViewModel, InterfaceC1364105Vn<? super C1188000h1K> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiVideoListSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiVideoListSharedViewModel@19b1.tryLoadMoreByTag$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objMQ2 = this.LLILZ.MQ2(null, null, this);
        C1C7U.LIZIZ("PoiVideoListSharedViewModel@19b1.tryLoadMoreByTag$1");
        return objMQ2;
    }
}

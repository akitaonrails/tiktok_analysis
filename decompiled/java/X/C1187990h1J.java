package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;

/* JADX INFO: renamed from: X.0h1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel", f = "PoiVideoListSharedViewModel.kt", l = {421, 440}, m = "tryLoadMoreByTab")
public final class C1187990h1J extends AbstractC23140094w {
    public PoiListApi.PostTab LL;
    public PoiVideoListSharedViewModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiVideoListSharedViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187990h1J(PoiVideoListSharedViewModel poiVideoListSharedViewModel, InterfaceC1364105Vn<? super C1187990h1J> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiVideoListSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiVideoListSharedViewModel@19b1.tryLoadMoreByTab$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLQ2 = this.LLILZ.LQ2(null, null, this);
        C1C7U.LIZIZ("PoiVideoListSharedViewModel@19b1.tryLoadMoreByTab$1");
        return objLQ2;
    }
}

package X;

import com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListVM;

/* JADX INFO: renamed from: X.0ClX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListVM", f = "PoiLimitedVideoListVM.kt", l = {188}, m = "loadVideoList")
public final class C323090ClX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiLimitedVideoListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323090ClX(PoiLimitedVideoListVM poiLimitedVideoListVM, InterfaceC1364105Vn<? super C323090ClX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiLimitedVideoListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiLimitedVideoListVM@6ffe.loadVideoList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(null, this);
        C1C7U.LIZIZ("PoiLimitedVideoListVM@6ffe.loadVideoList$1");
        return objCQ2;
    }
}

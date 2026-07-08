package X;

import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;

/* JADX INFO: renamed from: X.0ggK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM", f = "PoiMapModePageVM.kt", l = {390}, m = "loadPoiListData")
public final class C1174980ggK extends AbstractC23140094w {
    public C1174650gfn LL;
    public C1174450gfT LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ PoiMapModePageVM LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1174980ggK(PoiMapModePageVM poiMapModePageVM, InterfaceC1364105Vn<? super C1174980ggK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = poiMapModePageVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapModePageVM@49e4.loadPoiListData$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLIZ.zQ2(null, false, this);
        C1C7U.LIZIZ("PoiMapModePageVM@49e4.loadPoiListData$1");
        return objZQ2;
    }
}

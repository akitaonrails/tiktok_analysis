package X;

import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;

/* JADX INFO: renamed from: X.0gk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent", f = "PoiBackgroundMapComponent.kt", l = {690}, m = "generatePopView")
public final class C1177290gk3 extends AbstractC23140094w {
    public PoiGeneralCard LL;
    public PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 LLILLJJLI;
    public C1177360gkA LLILLL;
    public C1177360gkA LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ PoiBackgroundMapComponent LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177290gk3(PoiBackgroundMapComponent poiBackgroundMapComponent, InterfaceC1364105Vn<? super C1177290gk3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = poiBackgroundMapComponent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiBackgroundMapComponent@79e4.generatePopView$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objSp = this.LLILZLL.sp(null, null, null, this);
        C1C7U.LIZIZ("PoiBackgroundMapComponent@79e4.generatePopView$1");
        return objSp;
    }
}

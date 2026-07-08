package X;

/* JADX INFO: renamed from: X.0gjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.marker.PoiMapDetailMarkerRender", f = "PoiMapDetailMarkerRender.kt", l = {312}, m = "asyncCreateMarker")
public final class C1176950gjV extends AbstractC23140094w {
    public C1176630giz LL;
    public C1177390gkD LLILLJJLI;
    public boolean LLILLL;
    public float LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1176900gjQ LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176950gjV(C1176900gjQ c1176900gjQ, InterfaceC1364105Vn<? super C1176950gjV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1176900gjQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapDetailMarkerRender@7f86.asyncCreateMarker$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(null, false, 0.0f, this);
        C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.asyncCreateMarker$1");
        return objLIZJ;
    }
}

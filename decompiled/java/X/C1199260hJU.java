package X;

/* JADX INFO: renamed from: X.0hJU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.api.PoiSearchApi$Companion", f = "PoiSearchApi.kt", l = {547}, m = "searchPoiAsyncCoroutine")
public final class C1199260hJU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1199160hJK LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199260hJU(C1199160hJK c1199160hJK, InterfaceC1364105Vn<? super C1199260hJU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1199160hJK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchApi$Companion@bc2d.searchPoiAsyncCoroutine$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, null, this);
        C1C7U.LIZIZ("PoiSearchApi$Companion@bc2d.searchPoiAsyncCoroutine$1");
        return objLJI;
    }
}

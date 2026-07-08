package X;

import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;

/* JADX INFO: renamed from: X.0hJG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchVM", f = "PoiSearchVM.kt", l = {612, 615, 629}, m = "sendRequest")
public final class C1199120hJG extends AbstractC23140094w {
    public C1199490hJr LL;
    public C1197720hH0 LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ PoiSearchVM LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199120hJG(PoiSearchVM poiSearchVM, InterfaceC1364105Vn<? super C1199120hJG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = poiSearchVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchVM@b8c3.sendRequest$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLIZ.EQ2(null, this);
        C1C7U.LIZIZ("PoiSearchVM@b8c3.sendRequest$1");
        return objEQ2;
    }
}

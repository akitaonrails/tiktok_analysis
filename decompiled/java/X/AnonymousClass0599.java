package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0599, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.search.PoiSearchCacheResponseHandler$handelResponse$result$1$2", f = "PoiSearchCacheResponseHandler.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0599 extends C09AX implements Function2<PoiSearchApi.PoiSearchResultWrapper, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper>, Object> {
    public /* synthetic */ Object LL;

    public AnonymousClass0599(InterfaceC1364105Vn<? super AnonymousClass0599> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0599 anonymousClass0599 = new AnonymousClass0599(interfaceC1364105Vn);
        anonymousClass0599.LL = obj;
        return anonymousClass0599;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiSearchCacheResponseHandler@c11c.handelResponse$result$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        C1C7U.LIZIZ("PoiSearchCacheResponseHandler@c11c.handelResponse$result$1$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        return ((a) create(poiSearchResultWrapper, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
